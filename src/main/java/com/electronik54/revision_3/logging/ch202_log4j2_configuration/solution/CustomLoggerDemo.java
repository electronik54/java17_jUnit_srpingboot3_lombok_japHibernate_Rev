package com.electronik54.revision_3.logging.ch202_log4j2_configuration.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Uses a dedicated logger category so it could be routed to its own appender
 * by adding a matching <Logger> in log4j2.xml.
 */
public class CustomLoggerDemo {

    private static final Logger log = LoggerFactory.getLogger("com.electronik54.revision_3.logging.ch202_log4j2_configuration.solution.custom");

    public static void logSomething() {
        log.info("custom category message");
    }
}