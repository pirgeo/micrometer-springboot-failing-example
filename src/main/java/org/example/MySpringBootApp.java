package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackageClasses = MyRestController.class)
public class MySpringBootApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MySpringBootApp.class).run(args);
    }
}