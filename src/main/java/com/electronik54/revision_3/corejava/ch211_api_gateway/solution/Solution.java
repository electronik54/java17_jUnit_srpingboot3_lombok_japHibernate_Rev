package com.electronik54.revision_3.corejava.ch211_api_gateway.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 211: API Gateway Pattern ===\n");
        System.out.println("Spring Cloud Gateway: Route requests, filters, predicates");
        System.out.println("Routing: Route incoming requests to appropriate services");
        System.out.println("Filters: Modify request/response (add headers, rate limit)");
        System.out.println("Rate limiting: RequestRateLimiter filter (Redis-backed)");
        System.out.println("Security: Authentication at gateway level (single entry point)");
        System.out.println("Example: /api/users/** -> user-service, /api/orders/** -> order-service");
    }
}