package com.electronik54.revision_3.corejava.ch190_security_best_practices.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 190: Security Best Practices ===\n");
        System.out.println("SQL Injection: Use parameterized queries (JPA, PreparedStatement)");
        System.out.println("XSS: Sanitize user input, Content-Security-Policy header");
        System.out.println("CSRF: Enable CSRF protection (Spring Security default)");
        System.out.println("CORS: Configure allowed origins (not *)");
        System.out.println("Password hashing: BCrypt, Argon2 (not MD5, SHA-1)");
        System.out.println("HTTPS: Enforce TLS in production");
        System.out.println("Secrets: Use Vault or environment variables, not in code");
        System.out.println("OWASP Top 10: Familiarize with the current list");
    }
}