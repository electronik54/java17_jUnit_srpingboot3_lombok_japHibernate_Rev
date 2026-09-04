package com.electronik54.revision_3.corejava.ch226_spring_security.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 226: Advanced Spring Security ===\n");
        System.out.println("SecurityFilterChain: Multiple chains for different URL patterns");
        System.out.println("Custom AuthProvider: implement AuthenticationProvider interface");
        System.out.println("Method security: @PreAuthorize, @PostAuthorize, @Secured");
        System.out.println("  @PreAuthorize('hasRole(\"ADMIN\") and #id == authentication.principal.id')");
        System.out.println("OAuth2 resource server: oauth2ResourceServer().jwt()");
        System.out.println("Reactive security: @EnableWebFluxSecurity, SecurityWebFilterChain");
    }
}