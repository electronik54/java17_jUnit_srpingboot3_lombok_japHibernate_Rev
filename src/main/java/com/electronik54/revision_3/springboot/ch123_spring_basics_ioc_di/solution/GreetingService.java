package com.electronik54.revision_3.springboot.ch123_spring_basics_ioc_di.solution;

import org.springframework.stereotype.Service;

/** A bean managed by the Spring IoC container. */
@Service
public class GreetingService {

    public String greet(String name) {
        return "Hello from GreetingService (injected by Spring): " + name;
    }
}