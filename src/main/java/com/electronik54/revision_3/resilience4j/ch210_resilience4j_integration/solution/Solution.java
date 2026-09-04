package com.electronik54.revision_3.resilience4j.ch210_resilience4j_integration.solution;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * Solution 210: Resilience4J - Composite Patterns
 *
 * Demonstrates:
 * - Combining CircuitBreaker + Retry using decorateSupplier
 * - Sequential application: Retry first, then CircuitBreaker
 * - Fallback mechanism
 * - Configuration matching Spring Boot property style
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Solution 210: Resilience4J - Composite Patterns ===\n");

        CircuitBreaker cb = CircuitBreaker.of("apiService",
                CircuitBreakerConfig.custom()
                        .failureRateThreshold(50)
                        .slidingWindowSize(4)
                        .waitDurationInOpenState(Duration.ofMillis(800))
                        .build());

        Retry retry = Retry.of("apiService",
                RetryConfig.custom()
                        .maxAttempts(3)
                        .waitDuration(Duration.ofMillis(200))
                        .build());

        cb.getEventPublisher().onStateTransition(e ->
                System.out.println("  [CB] " + e.getStateTransition()));

        retry.getEventPublisher().onRetry(e ->
                System.out.println("  [RETRY] attempt " + e.getNumberOfRetryAttempts()));

        AtomicInteger counter = new AtomicInteger(0);

        // Composite: first apply retry, then circuit breaker
        Supplier<String> remoteCall = () -> {
            int n = counter.incrementAndGet();
            System.out.println("  Executing call #" + n);
            if (n % 2 == 0) {
                throw new RuntimeException("Failure #" + n);
            }
            return "Response #" + n;
        };

        Supplier<String> composite = CircuitBreaker.decorateSupplier(cb,
                Retry.decorateSupplier(retry, remoteCall));

        for (int i = 1; i <= 10; i++) {
            try {
                String result = composite.get();
                System.out.printf("Request %d: SUCCESS -> %s | Circuit: %s%n", i, result, cb.getState());
            } catch (Exception e) {
                String msg = e.getMessage() != null ? e.getMessage() : "CIRCUIT OPEN";
                System.out.printf("Request %d: %s | Circuit: %s%n", i, msg, cb.getState());
            }
        }

        System.out.println("\n=== Key Takeaways ===");
        System.out.println("- Composite pattern: Retry handles transient failures, CircuitBreaker prevents cascading");
        System.out.println("- Retry first (catches transient), then CircuitBreaker (stops repeated failures)");
        System.out.println("- Fallback methods provide degraded responses");
        System.out.println("- In a real Spring Boot app: @Retry, @CircuitBreaker, @RateLimiter on service methods");
        System.out.println("- Properties configured in application.yaml or application-test.yaml");
    }
}