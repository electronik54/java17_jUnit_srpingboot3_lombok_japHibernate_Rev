package com.electronik54.revision_3.corejava.ch227_authn_authz.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 227: Advanced AuthN/AuthZ ===\n");
        System.out.println("MFA: Multi-factor authentication (password + TOTP/SMS)");
        System.out.println("SSO: Single Sign-On (SAML, OIDC)");
        System.out.println("SAML: Security Assertion Markup Language (XML-based)");
        System.out.println("OIDC: OpenID Connect (JWT-based, simpler than SAML)");
        System.out.println("ABAC: Attribute-Based Access Control");
        System.out.println("  Policy: user.department == 'Engineering' AND resource.type == 'Code'");
        System.out.println("Permission hierarchy: READ -> WRITE -> DELETE -> ADMIN");
    }
}