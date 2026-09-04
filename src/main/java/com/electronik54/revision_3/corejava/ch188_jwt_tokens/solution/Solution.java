package com.electronik54.revision_3.corejava.ch188_jwt_tokens.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 188: JWT Tokens ===\n");
        System.out.println("JWT Structure: header.payload.signature (Base64 encoded)");
        System.out.println("Header: { 'alg': 'HS256', 'typ': 'JWT' }");
        System.out.println("Payload: { 'sub': 'user123', 'roles': ['ADMIN'], 'exp': 1700000000 }");
        System.out.println("Signature: HMAC-SHA256(base64(header) + '.' + base64(payload), secret)");
        System.out.println("Access Token: Short-lived (15 min), sent in Authorization header");
        System.out.println("Refresh Token: Long-lived (7 days), used to get new access tokens");
        System.out.println("Algorithm: HMAC (symmetric) vs RSA/EC (asymmetric)");
    }
}