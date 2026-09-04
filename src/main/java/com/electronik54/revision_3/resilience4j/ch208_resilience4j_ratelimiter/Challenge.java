package com.electronik54.revision_3.resilience4j.ch208_resilience4j_ratelimiter;

/**
 * Challenge 208: Rate Limiter
 * 
 * Challenge Statement:
 * Implement a RateLimiter that limits requests to 3 calls per second.
 * Simulate a client that makes 10 rapid calls and observe which ones
 * are permitted and which are rate-limited. Use a RateLimiterConfig
 * with a reasonable timeout for waiting permits.
 * 
 * Hint:
 * - Use RateLimiterConfig.custom().limitForPeriod(3).limitRefreshPeriod(Duration.ofSeconds(1))
 * - RateLimiter.decorateSupplier() wraps a supplier with rate limiting
 * - RateLimiter.waitForPermission() can block until a permit is available
 * - Track PERMITTED and DENIED requests
 * 
 * Expected Output (Solution):
 * Request 1-3: PERMITTED (burst)
 * Request 4: DENIED (rate limit exceeded)
 * After 1 second wait...
 * Request 5-7: PERMITTED (new window)
 * Request 8+: DENIED
 */
public class Challenge {

}