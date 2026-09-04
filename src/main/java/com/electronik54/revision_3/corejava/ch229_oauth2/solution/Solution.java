package com.electronik54.revision_3.corejava.ch229_oauth2.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 229: Advanced OAuth2 ===\n");
        System.out.println("PKCE: Proof Key for Code Exchange (mobile/SPA)");
        System.out.println("  code_verifier: Random string, code_challenge = SHA256(code_verifier)");
        System.out.println("Client Credentials: Machine-to-machine, no user");
        System.out.println("Resource server: Validate JWT, extract authorities");
        System.out.println("Token introspection: /introspect endpoint for opaque tokens");
        System.out.println("Scope: Fine-grained permissions (read:orders, write:orders)");
        System.out.println("Keycloak: Custom realm, clients, users, roles, and scopes");
    }
}