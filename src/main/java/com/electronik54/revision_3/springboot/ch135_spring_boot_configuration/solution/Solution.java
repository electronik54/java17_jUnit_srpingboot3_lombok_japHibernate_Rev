package com.electronik54.revision_3.springboot.ch135_spring_boot_configuration.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Solution 135: Spring Boot Configuration
 *
 * Demonstrates:
 * - @ConfigurationProperties for type-safe configuration binding
 * - @Value for simple property injection
 * - @EnableConfigurationProperties
 */
@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class Solution {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(ConfigurationDemo.class).run();
        ctx.close();
    }
}

@ConfigurationProperties(prefix = "app")
@Component
class AppConfig {
    private String name;
    private String version;
    private List<String> features;
    private Contact contact = new Contact();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }
    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public static class Contact {
        private String email;
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }
}

@Component
class ConfigurationDemo implements CommandLineRunner {

    private final AppConfig appConfig;

    @Value("${app.description:Default description}")
    private String description;

    public ConfigurationDemo(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Solution 135: Spring Boot Configuration ===\n");
        System.out.println("Application Name: " + appConfig.getName());
        System.out.println("Version: " + appConfig.getVersion());
        System.out.println("Features: " + appConfig.getFeatures());
        System.out.println("Contact: " + appConfig.getContact().getEmail());
        System.out.println("Description (@Value): " + description);
    }
}