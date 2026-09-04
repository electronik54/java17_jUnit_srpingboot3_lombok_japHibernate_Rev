package com.electronik54.revision_3.logging.ch201_logging_basics.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution for Challenge 201 - logging levels through SLF4J/Log4J2.
 */
public class Solution {

    private static final Logger log = LoggerFactory.getLogger(Solution.class);

    public static void main(String[] args) {
        log.trace("trace: only when trace is enabled");
        log.debug("debug: debug level message");
        log.info("info: hello {}!", "world");
        log.warn("warn: nearing threshold");
        log.error("error: something failed");
    }
}