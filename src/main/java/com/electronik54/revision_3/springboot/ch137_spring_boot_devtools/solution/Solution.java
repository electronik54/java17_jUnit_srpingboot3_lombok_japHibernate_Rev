package com.electronik54.revision_3.springboot.ch137_spring_boot_devtools.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

/**
 * Solution 137: Spring Boot DevTools
 *
 * Demonstrates:
 * - Checking if DevTools is active
 * - DevTools restart classloader behavior
 * - Key DevTools properties for development
 *
 * Note: DevTools restart + LiveReload work in actual running app.
 * This demo validates the DevTools configuration.
 */
@SpringBootApplication
public class Solution {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(DevToolsDemo.class).run();
        ctx.close();
    }

    @Bean
    DevToolsDemo devToolsDemo() {
        return new DevToolsDemo();
    }

    static class DevToolsDemo implements CommandLineRunner {
        @Override
        public void run(String... args) {
            System.out.println("=== Solution 137: Spring Boot DevTools ===\n");
            System.out.println("DevTools active: " + isDevToolsPresent());
            System.out.println("Restart ClassLoader: LiveReloadServer enabled (auto)");
            System.out.println("Auto-restart triggers on classpath changes");
            System.out.println("Template cache: false (dev default)");
            System.out.println("Server started at: " + LocalDateTime.now());
            System.out.println("\nKey properties for application-dev.yaml:");
            System.out.println("  spring.devtools.restart.enabled=true");
            System.out.println("  spring.devtools.livereload.enabled=true");
        }

        private boolean isDevToolsPresent() {
            try {
                Class.forName("org.springframework.boot.devtools.Restarter");
                return true;
            } catch (ClassNotFoundException e) {
                return false;
            }
        }
    }
}