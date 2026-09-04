package com.electronik54.revision_3.resilience4j.ch210_resilience4j_integration;

/**
 * Challenge 210: Resilience4J - Spring Boot Integration
 * 
 * Challenge Statement:
 * Use Resilience4J annotations with Spring Boot (@CircuitBreaker, @RateLimiter, @Retry).
 * Create a Service class that calls an unstable remote API. Annotate the method with
 * @CircuitBreaker(name = "remoteService", fallbackMethod = "fallback").
 * Also demonstrate @Retry and @RateLimiter annotations together.
 * Configure the circuit breaker and retry properties in application.yaml.
 * 
 * Hint:
 * - Enable Resilience4J with @EnableCircuitBreaker (or spring-cloud-starter-circuitbreaker-resilience4j)
 * - Use @CircuitBreaker(name = "serviceA", fallbackMethod = "fallbackResponse")
 * - Fallback method must have the same signature + Throwable parameter
 * - Configure properties: resilience4j.circuitbreaker.configs.default.slidingWindowSize
 * - Order annotations: @Retry(name = "...") @CircuitBreaker(name = "...")
 * 
 * Expected Output (Solution):
 * Calling remote service... (fails)
 * CircuitBreaker: CALL_NOT_PERMITTED (circuit open)
 * Fallback method returns cached/default response
 * Metrics show number of successful/failed calls
 */
public class Challenge {

}