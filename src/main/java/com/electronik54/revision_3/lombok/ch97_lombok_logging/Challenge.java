package com.electronik54.revision_3.lombok.ch97_lombok_logging;

/**
 * Challenge 97: Lombok Logging (@Slf4j)
 *
 * Problem:
 * Create a 'PaymentService' class using @Slf4j. Add methods process() and
 * refund() that log at debug/info/warn levels. Call them from main and
 * observe how @Slf4j injects a 'log' field (SLF4J Logger).
 *
 * Hint:
 * - @Slf4j adds: private static final Logger log = LoggerFactory.getLogger(Class)
 * - Typical levels: trace < debug < info < warn < error
 * - Log4J2 is configured in this project (log4j2.xml), so output includes the pattern
 *
 * Expected Output (log lines, actual prefix depends on log4j2 config):
 * [INFO ] PaymentService - Processing payment 100.00
 * [DEBUG] PaymentService - Validated payment 100.00
 * [WARN ] PaymentService - BasicPlan limit 100.0 exceeded
 * [INFO ] PaymentService - Refunded 25.00
 *
 * TODO:
 * 1. Create PaymentService annotated with @Slf4j
 * 2. Add process(double amount) - log info, debug validation, warn if amount > 100
 * 3. Add refund(double amount) - log info
 * 4. Call both from main
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 97: Lombok Logging (@Slf4j) ===");
    }
}