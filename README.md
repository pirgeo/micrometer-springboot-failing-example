# micrometer-springboot-failing-example
A reproduction repository containing a failing Micrometer/Spring boot combination

stack trace: 

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::       (v3.0.0-SNAPSHOT)

2022-08-09T13:26:44.304+02:00  INFO 45372 --- [           main] org.example.MySpringBootApp              : Starting MySpringBootApp using Java 17 on -redacted-
2022-08-09T13:26:44.306+02:00  INFO 45372 --- [           main] org.example.MySpringBootApp              : No active profile set, falling back to 1 default profile: "default"
2022-08-09T13:26:45.091+02:00  INFO 45372 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-08-09T13:26:45.097+02:00  INFO 45372 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-08-09T13:26:45.097+02:00  INFO 45372 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/10.0.22]
2022-08-09T13:26:45.167+02:00  INFO 45372 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-08-09T13:26:45.167+02:00  INFO 45372 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 820 ms
2022-08-09T13:26:45.564+02:00  WARN 45372 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'observationRegistry' defined in class path resource [org/springframework/boot/actuate/autoconfigure/observation/ObservationAutoConfiguration.class]: io/micrometer/core/instrument/observation/TimerObservationHandler
2022-08-09T13:26:45.568+02:00  INFO 45372 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2022-08-09T13:26:45.580+02:00  INFO 45372 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2022-08-09T13:26:45.597+02:00 ERROR 45372 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'observationRegistry' defined in class path resource [org/springframework/boot/actuate/autoconfigure/observation/ObservationAutoConfiguration.class]: io/micrometer/core/instrument/observation/TimerObservationHandler
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:612) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:527) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:930) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:926) ~[spring-context-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:592) ~[spring-context-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:430) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.builder.SpringApplicationBuilder.run(SpringApplicationBuilder.java:150) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.example.MySpringBootApp.main(MySpringBootApp.java:9) ~[main/:na]
Caused by: java.lang.NoClassDefFoundError: io/micrometer/core/instrument/observation/TimerObservationHandler
	at org.springframework.boot.actuate.autoconfigure.observation.TimerObservationHandlerObservationRegistryCustomizer.customize(TimerObservationHandlerObservationRegistryCustomizer.java:39) ~[spring-boot-actuator-autoconfigure-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.actuate.autoconfigure.observation.ObservationRegistryConfigurer.lambda$customize$2(ObservationRegistryConfigurer.java:88) ~[spring-boot-actuator-autoconfigure-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.util.LambdaSafe$Callbacks.lambda$invoke$0(LambdaSafe.java:287) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.util.LambdaSafe$LambdaSafeCallback.invoke(LambdaSafe.java:159) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.util.LambdaSafe$Callbacks.lambda$invoke$1(LambdaSafe.java:286) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at java.base/java.lang.Iterable.forEach(Iterable.java:75) ~[na:na]
	at org.springframework.boot.util.LambdaSafe$Callbacks.invoke(LambdaSafe.java:286) ~[spring-boot-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.actuate.autoconfigure.observation.ObservationRegistryConfigurer.customize(ObservationRegistryConfigurer.java:88) ~[spring-boot-actuator-autoconfigure-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.actuate.autoconfigure.observation.ObservationRegistryConfigurer.configure(ObservationRegistryConfigurer.java:67) ~[spring-boot-actuator-autoconfigure-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.boot.actuate.autoconfigure.observation.ObservationRegistryPostProcessor.postProcessAfterInitialization(ObservationRegistryPostProcessor.java:64) ~[spring-boot-actuator-autoconfigure-3.0.0-SNAPSHOT.jar:3.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:441) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1757) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:605) ~[spring-beans-6.0.0-SNAPSHOT.jar:6.0.0-SNAPSHOT]
	... 14 common frames omitted
Caused by: java.lang.ClassNotFoundException: io.micrometer.core.instrument.observation.TimerObservationHandler
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	... 27 common frames omitted


Process finished with exit code 1
```
