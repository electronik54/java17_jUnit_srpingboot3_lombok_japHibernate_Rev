package com.electronik54.revision_3.resilience4j.ch206_resilience4j_basics.solution;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;

import java.time.Duration;
import java.util.function.Supplier;

/**
 * Solution 206: Resilience4J Basics - CircuitBreaker Introduction
 *
 * Demonstrates:
 * - CircuitBreaker state machine: CLOSED -> OPEN -> HALF_OPEN
 * - Configuring failure threshold, wait duration, ring buffer size
 * - Decorating a Supplier with CircuitBreaker.decorateSupplier()
 * - Observing CircuitBreaker state transitions
 */
public class Solution {

    private static int callCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Solution 206: Resilience4J - CircuitBreaker Basics ===\n");

        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
                .failureRateThreshold(50)
                .slidingWindowSize(5)
                .permittedNumberOfCallsInHalfOpenState(3)
                .waitDurationInOpenState(Duration.ofMillis(500))
                .build();

        CircuitBreakerRegistry registry = CircuitBreakerRegistry.of(config);
        CircuitBreaker cb = registry.circuitBreaker("unstableService");

        cb.getEventPublisher()
                .onStateTransition(e ->
                        System.out.println("  [EVENT] State -> " + e.getStateTransition()));

        Supplier<String> unstableSupplier = () -> {
            callCounter++;
            if (callCounter % 2 == 0) {
                throw new RuntimeException("Simulated failure #" + callCounter);
            }
            return "Success #" + callCounter;
        };

        Supplier<String> decorated = CircuitBreaker.decorateSupplier(cb, unstableSupplier);

        for (int i = 1; i <= 8; i++) {
            try {
                String result = decorated.get();
                System.out.printf("Call %d: %-30s -> Circuit: %s%n", i, result, cb.getState());
            } catch (RuntimeException e) {
                System.out.printf("Call %d: FAILURE (%s)  -> Circuit: %s%n", i, e.getMessage(), cb.getState());
            }
        }

        System.out.println("\nWaiting for CircuitBreaker to transition to HALF_OPEN...");
        Thread.sleep(700);

        for (int i = 9; i <= 12; i++) {
            try {
                String result = decorated.get();
                System.out.printf("Call %d: %-30s -> Circuit: %s%n", i, result, cb.getState());
            } catch (RuntimeException e) {
                System.out.printf("Call %d: FAILURE (%s)  -> Circuit: %s%n", i, e.getMessage(), cb.getState());
            }
        }

        System.out.println("\n=== Key Takeaways ===");
        System.out.println("- CLOSED: normal operation, calls pass through");
        System.out.println("- OPEN: failures exceed threshold, calls blocked (CALL_NOT_PERMITTED)");
        System.out.println("- HALF_OPEN: limited test calls to check if service recovered");
        System.out.println("- Resilience4J is library-based (not proxy-based like Hystrix)");
        System.out.println("- Lightweight, modular: use only the patterns you need");
    }
}