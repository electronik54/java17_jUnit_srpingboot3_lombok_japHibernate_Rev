package com.electronik54.revision_3.corejava.ch186_spring_security.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 186: Spring Security Basics ===\n");
        System.out.println("SecurityFilterChain: Defines which requests need auth");
        System.out.println("AuthenticationProvider: Validates credentials");
        System.out.println("UserDetailsService: Loads user from DB");
        System.out.println("PasswordEncoder: BCryptPasswordEncoder (recommended)");
        System.out.println("@EnableMethodSecurity: @PreAuthorize, @PostAuthorize");
        System.out.println("\nConfig example:");
        System.out.println("  http.authorizeHttpRequests(auth -> auth");
        System.out.println("    .requestMatchers(\"/api/admin/**\").hasRole(\"ADMIN\")");
        System.out.println("    .anyRequest().authenticated()");
        System.out.println("  ).formLogin();");
    }
}