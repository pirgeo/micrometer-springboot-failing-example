package org.example;

import io.micrometer.core.instrument.MeterRegistry;

@org.springframework.web.bind.annotation.RestController
public class MyRestController {
    public MyRestController() {
    }

    public MyRestController(MeterRegistry registry) {
        // I first thought that this causes the error, but even if this is not here the error persists
    }
}
