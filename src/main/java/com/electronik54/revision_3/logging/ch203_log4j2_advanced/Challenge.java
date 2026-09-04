package com.electronik54.revision_3.logging.ch203_log4j2_advanced;

/**
 * Challenge 203: Log4J2 Advanced (RollingFile, markers, MDC)
 *
 * Problem:
 * Use MDC (Mapped Diagnostic Context) to attach a request/correlation ID to
 * every log line, then retrieve it. Also demonstrate log message formatting
 * with {} parameters and reference the RollingFile appender already defined.
 *
 * Hint:
 * - org.slf4j.MDC.put("key", "value") / MDC.remove("key")
 * - Show correlation IDs for concurrent request tracing
 * - log4j2.xml's <Property name="LOG_PATTERN"> can include %X{key} for MDC
 * - RollingFile rotates daily/size (see revision_3.log)
 *
 * Expected Output:
 * logs/requests.log lines all carry the same correlation id for one request
 *
 * TODO:
 * 1. Put a correlation id into MDC before logging
 * 2. Log several messages, all tagged with that id
 * 3. Remove the MDC entry after the request completes
 *
 * The solution uses SLF4J MDC (supported by log4j2).
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 203: Log4J2 Advanced ===");
    }
}