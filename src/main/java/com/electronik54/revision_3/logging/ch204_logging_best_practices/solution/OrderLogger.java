package com.electronik54.revision_3.logging.ch204_logging_best_practices.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Model of good logging practices.
 */
public class OrderLogger {

    private static final Logger log = LoggerFactory.getLogger(OrderLogger.class);

    public void process(long orderId, long userId) {
        log.info("Processing order {} for user {}", orderId, userId);

        long gatewayMs = 1200L;
        log.warn("Payment gateway slow (took {}ms) for order {}", gatewayMs, orderId);

        try {
            if (orderId % 5 == 0) {
                throw new IllegalStateException("simulated failure");
            }
        } catch (RuntimeException ex) {
            log.error("Failed processing order {} for user {}", orderId, userId, ex);
        }
    }
}