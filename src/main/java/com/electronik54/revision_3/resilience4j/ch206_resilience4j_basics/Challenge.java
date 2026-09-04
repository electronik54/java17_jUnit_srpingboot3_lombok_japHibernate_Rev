package com.electronik54.revision_3.resilience4j.ch206_resilience4j_basics;

/**
 * Challenge 206: Resilience4J Basics
 * 
 * Challenge Statement:
 * Learn the core concepts of Resilience4J library: Circuit Breaker, Rate Limiter,
 * Retry, Bulkhead, and TimeLimiter. Create a simple demo that simulates an unstable
 * remote service call and uses a CircuitBreaker to handle failures gracefully.
 * The CircuitBreaker should trip to OPEN state after 3 failures and allow a
 * HALF_OPEN test after a configured wait duration.
 * 
 * Hint:
 * - Use Resilience4j's CircuitBreaker and its state machine (CLOSED → OPEN → HALF_OPEN)
 * - CircuitBreakerConfig.custom().failureRateThreshold(50).waitDurationInOpenState(Duration.ofMillis(1000))
 * - Decorate a supplier with CircuitBreaker.decorateSupplier()
 * - Track call results: SUCCESS, FAILURE, or CALL_NOT_PERMITTED (when circuit is open)
 * - A simple counter-based "remote service" that fails every other call works well
 * 
 * Expected Output (Solution):
 * Call 1: SUCCESS (Circuit: CLOSED)
 * Call 2: FAILURE (Circuit: CLOSED)
 * Call 3: FAILURE (Circuit: OPEN → CALL_NOT_PERMITTED)
 * After wait... Circuit: HALF_OPEN
 * Final state demonstrates circuit breaker recovering
 */
public class Challenge {

}