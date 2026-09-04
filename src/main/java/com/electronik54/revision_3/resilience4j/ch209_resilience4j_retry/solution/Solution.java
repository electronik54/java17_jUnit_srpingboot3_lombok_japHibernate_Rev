package com.electronik54.revision_3.resilience4j.ch209_resilience4j_retry.solution;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * Solution 209: Retry Pattern
 *
 * Demonstrates:
 * - RetryConfig with maxAttempts and waitDuration
 * - Exponential backoff using IntervalFunction.ofExponentialBackoff()
 * - Retry.decorateSupplier() to wrap a supplier
 * - Retry.EventPublisher.onRetry() listener
 * - Fail-then-succeed scenario
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== Solution 209: Retry Pattern ===\n");

        RetryConfig config = RetryConfig.custom()
                .maxAttempts(5)
                .waitDuration(Duration.ofMillis(100))
                .intervalFunction(
                        io.github.resilience4j.core.IntervalFunction.ofExponentialBackoff(
                                Duration.ofMillis(100), 2.0))
                .build();

        Retry retry = Retry.of("flakyService", config);

        retry.getEventPublisher().onRetry(e ->
                System.out.println("  [RETRY] Attempt " + e.getNumberOfRetryAttempts()
                        + " failed, waiting " + e.getWaitInterval().toMillis() + "ms"));

        AtomicInteger attemptCounter = new AtomicInteger(0);
        Instant start = Instant.now();

        Supplier<String> flakySupplier = () -> {
            int attempt = attemptCounter.incrementAndGet();
            System.out.println("  Attempt " + attempt + "...");
            if (attempt <= 3) {
                throw new RuntimeException("Error on attempt " + attempt);
            }
            return "Success on attempt " + attempt;
        };

        Supplier<String> decorated = Retry.decorateSupplier(retry, flakySupplier);

        try {
            String result = decorated.get();
            long elapsed = Duration.between(start, Instant.now()).toMillis();
            System.out.println("\nResult: " + result);
            System.out.println("Total attempts: " + attemptCounter.get());
            System.out.println("Total time: ~" + elapsed + "ms");
        } catch (Exception e) {
            System.out.println("\nAll retries exhausted: " + e.getMessage());
        }

        System.out.println("\n=== Key Takeaways ===");
        System.out.println("- Retry is for transient failures (network hiccups, timeouts)");
        System.out.println("- NOT for permanent failures (404, 400) - those waste resources");
        System.out.println("- Exponential backoff prevents thundering herd problem");
        System.out.println("- Works well with CircuitBreaker: retry first, circuit break if still failing");
        System.out.println("- MaxAttempts: total attempts = 1 initial + N-1 retries");
    }
}