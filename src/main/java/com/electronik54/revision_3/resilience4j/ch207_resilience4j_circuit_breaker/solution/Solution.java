package com.electronik54.revision_3.resilience4j.ch207_resilience4j_circuit_breaker.solution;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

import java.time.Duration;

/**
 * Solution 207: CircuitBreaker Deep Dive
 *
 * Demonstrates:
 * - Failure-rate and slow-call-rate thresholds
 * - Sliding-window ring buffer for evaluation
 * - Full state lifecycle cycle: CLOSED -> OPEN -> HALF_OPEN -> CLOSED
 * - CircuitBreaker metrics (failure rate, buffered calls)
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Solution 207: CircuitBreaker - Full Lifecycle ===\n");

        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
                .failureRateThreshold(40)
                .slowCallRateThreshold(30)
                .slowCallDurationThreshold(Duration.ofMillis(800))
                .slidingWindowSize(6)
                .permittedNumberOfCallsInHalfOpenState(4)
                .waitDurationInOpenState(Duration.ofMillis(1200))
                .build();

        CircuitBreaker cb = CircuitBreakerRegistry.of(config).circuitBreaker("deepCB");
        cb.getEventPublisher().onStateTransition(e ->
                System.out.println("  [EVENT] " + e.getStateTransition()));

        System.out.println("--- Phase 1: Mostly good calls ---");
        for (int i = 1; i <= 6; i++) {
            callService(cb, i, false, 100);
        }
        printMetrics(cb);

        System.out.println("--- Phase 2: Triggering failures ---");
        for (int i = 7; i <= 12; i++) {
            boolean fail = i % 2 == 0 || i == 11;
            callService(cb, i, fail, 50);
        }
        printMetrics(cb);

        System.out.println("--- Waiting for OPEN -> HALF_OPEN ---");
        Thread.sleep(1500);
        printMetrics(cb);

        System.out.println("--- Phase 3: Recovery in HALF_OPEN ---");
        for (int i = 13; i <= 16; i++) {
            callService(cb, i, false, 50);
        }
        System.out.println("Final state: " + cb.getState());
        printMetrics(cb);

        System.out.println("\n=== Key Takeaways ===");
        System.out.println("- Sliding-window ring buffer tracks the most recent N calls");
        System.out.println("- Both failure rate AND slow call rate can trigger OPEN");
        System.out.println("- Circuit transitions back to CLOSED after successful test calls in HALF_OPEN");
    }

    private static void callService(CircuitBreaker cb, int id, boolean fail, long delayMs) {
        try { Thread.sleep(delayMs); } catch (InterruptedException ignored) {}
        try {
            String res = cb.decorateSupplier(() -> {
                if (fail) throw new RuntimeException("Fail #" + id);
                return "OK #" + id;
            }).get();
            System.out.printf("Call %2d: SUCCESS (%s)  -> %s%n", id, res, cb.getState());
        } catch (Exception e) {
            System.out.printf("Call %2d: %s  -> %s%n", id,
                    e.getMessage() != null ? "FAILURE " + e.getMessage() : "BLOCKED",
                    cb.getState());
        }
    }

    private static void printMetrics(CircuitBreaker cb) {
        var m = cb.getMetrics();
        System.out.printf("  [Metrics] failureRate=%.1f%%, bufferedCalls=%d, state=%s%n%n",
                m.getFailureRate(), m.getNumberOfBufferedCalls(), cb.getState());
    }
}