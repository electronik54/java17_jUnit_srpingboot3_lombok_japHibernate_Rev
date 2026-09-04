package com.electronik54.revision_3.logging.ch203_log4j2_advanced.solution;

import org.slf4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution for Challenge 203 - MDC correlation ids + formatting.
 */
public class Solution {

    private static final Logger log = LoggerFactory.getLogger(Solution.class);

    public static void main(String[] args) {
        // Simulate one request with a correlation id
        String correlationId = "req-" + System.nanoTime();
        MDC.put("correlationId", correlationId);

        log.info("Request started");
        log.info("Calling external service for {}", "order-api");
        log.info("Request finished");

        MDC.remove("correlationId");
    }
}