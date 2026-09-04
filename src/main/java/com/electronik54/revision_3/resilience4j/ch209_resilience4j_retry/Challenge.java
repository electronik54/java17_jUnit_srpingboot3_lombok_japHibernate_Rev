package com.electronik54.revision_3.resilience4j.ch209_resilience4j_retry;

/**
 * Challenge 209: Retry Pattern
 * 
 * Challenge Statement:
 * Implement a Retry mechanism that retries a flaky service call up to 3 times
 * with exponential backoff (100ms, 200ms, 400ms). The service succeeds on the
 * 3rd attempt. Track the number of attempts and the total time taken.
 * 
 * Hint:
 * - Use RetryConfig.custom().maxAttempts(3).waitDuration(Duration.ofMillis(100))
 * - Retry.decorateSupplier() wraps a supplier with retry logic
 * - Use RetryConfig.custom().intervalFunction(IntervalFunction.ofExponentialBackoff())
 * - Retry.EventPublisher to track onRetry events
 * - A simple counter in the supplier can track how many times it's been called
 * 
 * Expected Output (Solution):
 * Attempt 1: FAILED
 * Attempt 2: FAILED (after 100ms wait)
 * Attempt 3: SUCCESS (after 200ms wait)
 * Total attempts: 3, Total time: ~400ms
 */
public class Challenge {

}