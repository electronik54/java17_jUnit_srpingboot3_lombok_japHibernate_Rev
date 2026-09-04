package com.electronik54.revision_3.logging.ch201_logging_basics;

/**
 * Challenge 201: Logging Basics (SLF4J + Log4J2 levels)
 *
 * Problem:
 * Use SLF4J's Logger API (through Log4J2 here) to log at every level and
 * observe the hierarchy. Levels: TRACE < DEBUG < INFO < WARN < ERROR.
 * Show that INFO+ are emitted while DEBUG/TRACE may be filtered by config.
 *
 * Hint:
 * - LoggerFactory.getLogger(Class) returns an SLF4J logger
 * - Parameters {} are placeholders - always use {} NOT string concatenation
 * - The threshold is set in log4j2.xml <Root level="info">
 * - Logging costs only when the level is enabled - gate expensive calls with isDebugEnabled()
 *
 * Expected Output (console, from log4j2.xml):
 * [INFO ] - info message
 * [WARN ] - warn message
 * [ERROR] - error message
 * (TRACE/DEBUG suppressed by Root level=info)
 *
 * TODO:
 * 1. Get a Logger in a class via LoggerFactory.getLogger(YourClass.class)
 * 2. Log trace/debug/info/warn/error
 * 3. Observe which appear based on Root level in log4j2.xml
 * 4. Use {} placeholders instead of concatenation
 *
 * The solution package has a runnable sample. logs are written per log4j2.xml.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 201: Logging Basics ===");
    }
}