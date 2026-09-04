package com.electronik54.revision_3.springboot.ch138_spring_boot_properties;

/**
 * Challenge 138: Spring Boot Properties & External Configuration
 * 
 * Challenge Statement:
 * Demonstrate Spring Boot's property resolution order:
 * - application.yaml (defaults)
 * - application-{profile}.yaml (profile-specific)
 * - Environment variables (override)
 * - Command line arguments (--server.port=9090)
 * - @TestPropertySource in tests
 * Show how to access properties with @Value, Environment,
 * and @ConfigurationProperties with validation (JSR-380).
 * 
 * Hint:
 * - Property resolution: Command line > Env vars > Profile > Application
 * - @ConfigurationProperties supports @Validated for validation
 * - Use spring.config.import for additional config files
 * - Random values: ${random.int}, ${random.uuid}
 * - Placeholder resolution: ${app.name:Default}
 * 
 * Expected Output (Solution):
 * Property resolution order demonstration:
 * 1. Command line args (--server.port=9090)
 * 2. Environment variables (SERVER_PORT=8080)
 * 3. Profile-specific (application-dev.yaml)
 * 4. Application defaults (application.yaml)
 * Final port: 9090 (highest priority wins)
 */
public class Challenge {

}