package com.electronik54.revision_3.corejava.ch228_jwt_tokens.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 228: Advanced JWT ===\n");
        System.out.println("Signing algorithms: HS256 (HMAC), RS256 (RSA), ES256 (ECDSA)");
        System.out.println("Token rotation: Issue new access token + refresh token together");
        System.out.println("Revocation: Blacklist, short expiry, rotation (no server-side session)");
        System.out.println("Claims validation: iss (issuer), aud (audience), exp (expiry), nbf (not before)");
        System.out.println("Stateless: No session storage, all info in token");
        System.out.println("Stateful: Store token hash in Redis, allows revocation");
        System.out.println("Best practice: Use asymmetric keys (RS256), rotate signing keys regularly");
    }
}