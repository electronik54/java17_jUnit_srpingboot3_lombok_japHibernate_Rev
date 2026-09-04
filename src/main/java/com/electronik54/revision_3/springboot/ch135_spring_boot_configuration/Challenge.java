package com.electronik54.revision_3.springboot.ch135_spring_boot_configuration;

/**
 * Challenge 135: Spring Boot Configuration
 * 
 * Challenge Statement:
 * Create a Spring Boot configuration system using @ConfigurationProperties 
 * and @Value annotations. Bind properties from application.yaml to a 
 * properties class using @ConfigurationProperties(prefix = "app").
 * Show both field-level @Value and type-safe @ConfigurationProperties.
 * Create a REST controller that exposes the configuration values.
 * 
 * Hint:
 * - Use @ConfigurationProperties(prefix = "app.config") with @EnableConfigurationProperties
 * - Use @Value("${app.name}") for simple property injection
 * - Add app.name, app.version, app.features, app.contact.email to application.yaml
 * - Create a ConfigProperties record/class with validation annotations
 * 
 * Expected Output (Solution):
 * Application Name: Revision3
 * Version: 1.0.0
 * Features: [aop, resilience4j, logging]
 * Contact: admin@example.com
 */
public class Challenge {

}