package com.electronik54.revision_3.springboot.ch123_spring_basics_ioc_di.solution;

import org.springframework.stereotype.Component;

/**
 * Depends on GreetingService via constructor injection. Spring provides the
 * dependency (DI) - this class does NOT instantiate it (IoC).
 */
@Component
public class GreetingRunner {

    private final GreetingService greetingService;

    public GreetingRunner(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void run() {
        System.out.println(greetingService.greet("Alice"));
    }
}