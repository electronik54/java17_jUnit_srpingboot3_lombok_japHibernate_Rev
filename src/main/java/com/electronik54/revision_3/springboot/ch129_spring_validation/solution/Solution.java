package com.electronik54.revision_3.springboot.ch129_spring_validation.solution;

import jakarta.validation.*;
import jakarta.validation.constraints.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Solution 129: Spring Boot Validation
 *
 * Demonstrates JSR-380 Bean Validation with @Valid, @NotBlank,
 * @Min, @Max, @Email, @Size, and custom validation.
 */
@SpringBootApplication
public class Solution {

    static class User {
        @NotBlank(message = "Name is required")
        private String name;

        @Email(message = "Invalid email format")
        @NotBlank
        private String email;

        @Min(18) @Max(120)
        private int age;

        @Size(min = 6, max = 20, message = "Password must be 6-20 chars")
        private String password;

        public User(String name, String email, int age, String password) {
            this.name = name; this.email = email; this.age = age;
            this.password = password;
        }
    }

    @Service
    static class ValidationService {
        public void validate(User user) {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<User>> violations = validator.validate(user);
            if (violations.isEmpty()) {
                System.out.println("  User " + user.name + " is VALID");
            } else {
                System.out.println("  User " + user.name + " has ERRORS:");
                violations.forEach(v ->
                    System.out.println("    - " + v.getPropertyPath() + ": " + v.getMessage()));
            }
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ValidationService svc = ctx.getBean(ValidationService.class);

        System.out.println("=== Solution 129: Spring Boot Validation ===\n");
        svc.validate(new User("Alice", "alice@example.com", 25, "pass123"));
        svc.validate(new User("", "bad-email", 15, "abc"));
        ctx.close();
    }
}