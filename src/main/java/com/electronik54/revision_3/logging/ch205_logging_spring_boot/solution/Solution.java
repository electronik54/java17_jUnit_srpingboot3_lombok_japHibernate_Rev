package com.electronik54.revision_3.logging.ch205_logging_spring_boot.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Solution 205: Logging in Spring Boot
 *
 * Demonstrates SLF4J logging with Log4J2 in a Spring Boot application.
 * Configures different log levels per package using application.yaml.
 *
 * Configuration in application.yaml:
 *   logging:
 *     level:
 *       root: INFO
 *       com.electronik54.revision_3: DEBUG
 *       org.springframework: WARN
 *     pattern:
 *       console: "%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"
 */
@SpringBootApplication
public class Solution {

    private static final Logger log = LoggerFactory.getLogger(Solution.class);

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);

        System.out.println("=== Solution 205: Logging in Spring Boot ===\n");

        log.trace("TRACE message (usually suppressed in production)");
        log.debug("DEBUG message (visible in dev profile)");
        log.info("INFO message: Application started successfully");
        log.warn("WARN message: Low disk space warning");
        log.error("ERROR message: Database connection failed (simulated)");

        System.out.println("\nCheck the console for colored log output.");
        System.out.println("Log files are written to logs/revision3.log (rolled daily).");
        System.out.println("\nKey configuration in application.yaml:");
        System.out.println("  logging.level.root=INFO");
        System.out.println("  logging.level.com.electronik54.revision_3=DEBUG");
        System.out.println("  logging.pattern.console=<pattern>");
        System.out.println("  log4j2.xml handles file appenders (rolling files)");
        ctx.close();
    }
}