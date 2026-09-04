package com.electronik54.revision_3.corejava.ch189_oauth2.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 189: OAuth 2.0 ===\n");
        System.out.println("Roles: Resource Owner (user), Client (app), Auth Server, Resource Server");
        System.out.println("Grant Types:");
        System.out.println("  Authorization Code: Web apps, most secure, PKCE for mobile/SPA");
        System.out.println("  Client Credentials: Server-to-server, no user involved");
        System.out.println("  Implicit: Deprecated (use PKCE instead)");
        System.out.println("  Refresh Token: Get new access tokens without re-authentication");
        System.out.println("Spring Security: oauth2ResourceServer() + @EnableWebSecurity");
        System.out.println("Keycloak: Popular open-source OAuth2/OIDC provider");
    }
}