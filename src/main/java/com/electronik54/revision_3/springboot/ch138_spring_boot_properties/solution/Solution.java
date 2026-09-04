package com.electronik54.revision_3.springboot.ch138_spring_boot_properties.solution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * Solution 138: Spring Boot Properties & External Configuration
 *
 * Demonstrates:
 * - @Value injection with defaults and random values
 * - Environment abstraction for accessing properties
 * - Property resolution order
 * - Placeholder resolution
 */
@SpringBootApplication
public class Solution {

    @Value("${server.port:8080}")
    private String serverPort;

    @Value("${random.int(1,100)}")
    private int randomNumber;

    @Value("${random.uuid}")
    private String uuid;

    @Value("${app.name:Revision3}")
    private String appName;

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(PropertyDemo.class).run();
        ctx.close();
    }

    @Bean
    PropertyDemo propertyDemo(Environment env, Solution solution) {
        return new PropertyDemo(env, solution);
    }

    static class PropertyDemo implements CommandLineRunner {
        private final Environment env;
        private final Solution solution;

        PropertyDemo(Environment env, Solution solution) {
            this.env = env;
            this.solution = solution;
        }

        @Override
        public void run(String... args) {
            System.out.println("=== Solution 138: Spring Boot Properties ===\n");
            System.out.println("@Value injection:");
            System.out.println("  server.port = " + solution.serverPort);
            System.out.println("  random.int(1,100) = " + solution.randomNumber);
            System.out.println("  random.uuid = " + solution.uuid);
            System.out.println("  app.name (with default) = " + solution.appName);

            System.out.println("\nEnvironment API:");
            System.out.println("  java.version = " + env.getProperty("java.version"));
            System.out.println("  user.dir = " + env.getProperty("user.dir"));
            System.out.println("  spring.profiles.active = " + 
                String.join(",", env.getActiveProfiles().length > 0 ? env.getActiveProfiles() : new String[]{"default"}));

            System.out.println("\nProperty resolution order:");
            System.out.println("1. @TestPropertySource (test only)");
            System.out.println("2. Command line arguments (--server.port=9090)");
            System.out.println("3. Environment variables (SERVER_PORT)");
            System.out.println("4. Profile-specific (application-{profile}.yaml)");
            System.out.println("5. Application defaults (application.yaml)");
            System.out.println("6. @PropertySource on configuration classes");
        }
    }
}