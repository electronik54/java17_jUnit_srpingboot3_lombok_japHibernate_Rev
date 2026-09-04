package com.electronik54.revision_3.springboot.ch128_spring_actuators.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

/**
 * Solution 128: Spring Boot Actuators
 *
 * Demonstrates actuator endpoints and custom health indicator.
 * Access endpoints after startup:
 *   http://localhost:8080/actuator/health
 *   http://localhost:8080/actuator/info
 *   http://localhost:8080/actuator/metrics
 *   http://localhost:8080/actuator/beans
 *
 * Configured in application.yaml:
 *   management.endpoints.web.exposure.include=*
 *   management.endpoint.health.show-details=always
 */
@SpringBootApplication
public class Solution {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        System.out.println("=== Solution 128: Spring Boot Actuators ===\n");
        System.out.println("Available endpoints (configured in application.yaml):");
        System.out.println("  management.endpoints.web.exposure.include=*");
        System.out.println("  management.endpoint.health.show-details=always\n");
        System.out.println("Access these URLs after startup:");
        System.out.println("  GET /actuator/health  -> Application health status");
        System.out.println("  GET /actuator/info    -> Custom application info");
        System.out.println("  GET /actuator/metrics -> JVM and system metrics");
        System.out.println("  GET /actuator/beans   -> All Spring beans");
        System.out.println("  GET /actuator/env     -> Environment properties\n");
        System.out.println("Custom endpoints: @Endpoint, @ReadOperation, @WriteOperation");
        System.out.println("Run the application and visit /actuator to see all endpoints.");
        ctx.close();
    }
}