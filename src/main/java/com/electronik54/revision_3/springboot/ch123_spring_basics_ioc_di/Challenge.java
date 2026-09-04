package com.electronik54.revision_3.springboot.ch123_spring_basics_ioc_di;

/**
 * Challenge 123: Spring Basics - IoC & DI
 *
 * Problem:
 * Demonstrate Inversion of Control (IoC) and Dependency Injection (DI) in
 * Spring. Create a GreetingService bean and a Runner that injects it via a
 * constructor. Show that Spring (the container) wires the dependency - the
 * Runner never news-up the service itself.
 *
 * Hint:
 * - @Service / @Component register a bean in the ApplicationContext
 * - Constructor injection: the container passes the dependency when it creates the bean
 * - ApplicationContext is the IoC container that manages beans & their lifecycle
 *
 * Expected Output (console):
 * Hello from GreetingService (injected by Spring)
 *
 * TODO:
 * 1. Create a GreetingService class
 * 2. Create a Runner depending on it via constructor
 * 3. Wire manually with AnnotationConfigApplicationContext OR run from a @SpringBootTest
 * 4. Observe the service is provided by the container
 *
 * This is annotated so the Spring context can manage it. See the solution
 * package for a self-contained wiring demo.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 123: IoC & DI ===");
    }
}