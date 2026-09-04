package com.electronik54.revision_3.springboot.ch124_spring_annotations_core;

/**
 * Challenge 124: Spring Annotations - Core (@Component/@Service/@Repository)
 *
 * Problem:
 * Distinguish the stereotype annotations and how they're used. Create:
 * - CustomerRepository (@Repository) wrapping data access
 * - CustomerService (@Service) containing business logic, depending on the repo
 * - A configuration class using @Configuration + @Bean to define a bean manually
 *
 * Hint:
 * - @Component: generic bean; @Service: business layer; @Repository: data layer
 * - @Configuration + @Bean defines beans via Java methods (not component scanning)
 * - All are @Component sub-types - stereotype conveys layer intent
 *
 * Expected Output (console from tests):
 * Service using repository: Found customers: [A, B]
 * Bean from @Configuration: ConfigBean
 *
 * TODO:
 * 1. Create CustomerRepository, CustomerService, and a ManualConfig with @Bean
 * 2. Let Spring wire them via component scanning
 * 3. Verify via a small context test or console runner
 *
 * The solution package holds the wiring. Spring managed beans - run via
 * a @SpringBootTest or the standalone context to observe wiring.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 124: Spring Core Annotations ===");
    }
}