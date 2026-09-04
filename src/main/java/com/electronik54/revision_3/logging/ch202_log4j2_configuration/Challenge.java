package com.electronik54.revision_3.logging.ch202_log4j2_configuration;

/**
 * Challenge 202: Log4J2 Configuration
 *
 * Problem:
 * Understand the log4j2.xml configuration used by this project: appenders
 * (Console, RollingFile), layout PatternLayout, and loggers. Add a distinct
 * logger category and route it to its own file named "custom".
 *
 * Hint:
 * - <Console> writes to stdout; <RollingFile> rotates by time/size
 * - <Logger name="com.example"> routes that category to specific appenders
 * - <Root> is the catch-all; children can override level/additivity
 * - Pattern %d{...} %-5level %logger{36} - %msg%n controls the format
 *
 * Expected Output:
 * A logger for package '...custom' prints to a separate 'logs/custom.log'
 *
 * TODO:
 * 1. Review log4j2.xml in src/main/resources
 * 2. Add a RollingFile appender 'custom.log' for a custom logger category
 * 3. Log from that category and verify it lands in custom.log
 *
 * Reference config is at src/main/resources/log4j2.xml.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 202: Log4J2 Configuration ===");
    }
}