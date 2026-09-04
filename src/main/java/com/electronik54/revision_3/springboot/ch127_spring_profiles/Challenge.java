package com.electronik54.revision_3.springboot.ch127_spring_profiles;

/**
 * Challenge 127: Spring Profiles
 *
 * Problem:
 * Show how Spring Profiles switch configuration per environment. Define two
 * beans of type DataSourceConfig - one @Profile("dev") and one
 * @Profile("prod") - and a client that displays the active one. Active
 * profile is "dev" by default (see application.yaml), can be overridden with
 * SPRING_PROFILES_ACTIVE=prod.
 *
 * Hint:
 * - @Profile("dev") / @Profile("prod") activate a bean only when that profile runs
 * - Set active profile via application.yaml or env var SPRING_PROFILES_ACTIVE
 * - Use @Value("${...}") or @ConfigurationProperties for profile-specific values
 *
 * Expected Output (dev profile):
 * Active data source -> jdbc:h2:mem:testdb
 * (with prod)         -> jdbc:mysql://localhost:3306/proddb
 *
 * TODO:
 * 1. Create DataSourceConfig bean per profile (dev/prod) with a url property
 * 2. Create a runner that prints ctx.getEnvironment().getActiveProfiles()
 *    and the resolved DataSourceConfig.url
 * 3. Switch profile and observe the bean changes
 *
 * The solution package wires a standalone context with profile-specific beans.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 127: Spring Profiles ===");
    }
}