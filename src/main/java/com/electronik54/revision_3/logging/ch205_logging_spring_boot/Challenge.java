package com.electronik54.revision_3.logging.ch205_logging_spring_boot;

/**
 * Challenge 205: Spring Boot Logging
 *
 * Problem:
 * Configure logging levels for Spring Boot packages and your own app through
 * application.yaml, and use @Slf4j (Lombok) in a Spring component. Explain
 * why spring-boot-starter-logging was excluded in pom (custom Log4J2).
 *
 * Hint:
 * - application.yaml: logging.level.<logger>=<level> per category
 * - @Slf4j (Lombok) generates 'log' for Spring components
 * - With custom log4j2.xml, log4j2 is the backend; Spring Boot delegates via SLF4J
 *
 * Expected Output (console):
 * BankService.logSomething -> 'info' from a Spring bean using Lombok @Slf4j
 *
 * TODO:
 * 1. Create a Spring @Service with @Slf4j
 * 2. Log at info in a method
 * 3. Adjust logging.level in application.yaml and observe
 *
 * The solution package has the Spring component.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 205: Spring Boot Logging ===");
    }
}