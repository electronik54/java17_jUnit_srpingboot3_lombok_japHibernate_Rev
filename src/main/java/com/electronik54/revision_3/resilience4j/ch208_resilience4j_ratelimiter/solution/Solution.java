package com.electronik54.revision_3.resilience4j.ch208_resilience4j_ratelimiter.solution;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;

import java.time.Duration;
import java.util.function.Supplier;

/**
 * Solution 208: RateLimiter
 *
 * Demonstrates:
 * - RateLimiterConfig with limitForPeriod and limitRefreshPeriod
 * - Decorating a Supplier with RateLimiter.decorateSupplier()
 * - Burst vs steady-state behavior
 * - Timeout for waiting permits
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 208: RateLimiter ===\n");

        RateLimiterConfig config = RateLimiterConfig.custom()
                .limitForPeriod(3)                         // 3 permits per period
                .limitRefreshPeriod(Duration.ofSeconds(1))  // refresh every 1 second
                .timeoutDuration(Duration.ofMillis(100))    // wait at most 100ms
                .build();

        RateLimiter rl = RateLimiter.of("apiLimiter", config);

        Supplier<String> limitedSupplier = RateLimiter.decorateSupplier(rl, () -> "Request OK");

        System.out.println("--- Phase 1: Rapid-fire 8 requests ---");
        for (int i = 1; i <= 8; i++) {
            try {
                String result = limitedSupplier.get();
                System.out.printf("Request %d: PERMITTED (%s)%n", i, result);
            } catch (Exception e) {
                System.out.printf("Request %d: DENIED (RateLimitExceeded)%n", i);
            }
        }

        System.out.println("\n--- Waiting 1.5 seconds for refresh... ---");
        try { Thread.sleep(1500); } catch (InterruptedException ignored) {}

        System.out.println("--- Phase 2: After refresh ---");
        for (int i = 9; i <= 14; i++) {
            try {
                String result = limitedSupplier.get();
                System.out.printf("Request %d: PERMITTED (%s)%n", i, result);
            } catch (Exception e) {
                System.out.printf("Request %d: DENIED (RateLimitExceeded)%n", i);
            }
        }

        System.out.println("\n=== Key Takeaways ===");
        System.out.println("- RateLimiter uses a token-bucket-like algorithm");
        System.out.println("- limitForPeriod: max permits per refresh period");
        System.out.println("- limitRefreshPeriod: how often permits are replenished");
        System.out.println("- Common use: API rate limiting, throttling external calls");
        System.out.println("- Differs from CircuitBreaker: no failure tracking, purely rate-based");
    }
}