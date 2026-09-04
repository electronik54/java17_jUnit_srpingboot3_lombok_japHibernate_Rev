package com.electronik54.revision_3.corejava.ch187_authentication_authorization.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 187: Authentication & Authorization ===\n");
        System.out.println("Authentication: WHO you are (verify identity)");
        System.out.println("Authorization: WHAT you can access (permissions)");
        System.out.println("RBAC: Role-Based Access Control (roles -> permissions)");
        System.out.println("ABAC: Attribute-Based Access Control (fine-grained)");
        System.out.println("Method security: @PreAuthorize('hasRole(\"ADMIN\")')");
        System.out.println("JWT: Stateless auth, token contains claims");
        System.out.println("OAuth2: Delegated authorization (Google, GitHub login)");
    }
}