package com.electronik54.revision_3.corejava.ch166_interview_prep.solution;

/**
 * Solution 166: System Design Basics
 *
 * URL Shortener Design:
 * - API: POST /shorten (originalUrl → shortCode)
 * - API: GET /{shortCode} (redirect to original)
 * - Storage: MySQL (original_url, short_code, created_at, user_id)
 * - Encoding: Base62 (a-z, A-Z, 0-9) for short codes
 * - Cache: Redis/LRU caching recent URLs
 * - Load balancer: Round-robin + health checks
 * - Sharding: By user_id (range-based)
 * - Rate limiting: Token bucket per API key
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 166: System Design Basics ===\n");
        System.out.println("URL Shortening Service Design:");
        System.out.println("  Functional: POST/GET endpoints for URL management");
        System.out.println("  Storage: RDBMS sharded by user_id");
        System.out.println("  Cache: Redis with LRU eviction (TTL: 24h)");
        System.out.println("  Encoding: Base62 (7 chars = 62^7 combinations)");
        System.out.println("  Scaling: Read replicas for GET, master for writes");
        System.out.println("  Rate Limit: 100 req/min per user");
        System.out.println("\nKey trade-offs:");
        System.out.println("  Availability > Consistency (eventual consistency)");
        System.out.println("  Cache miss = DB hit (accept latency)");
    }
}