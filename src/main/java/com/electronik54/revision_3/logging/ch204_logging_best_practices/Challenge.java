package com.electronik54.revision_3.logging.ch204_logging_best_practices;

/**
 * Challenge 204: Logging Best Practices
 *
 * Problem:
 * Write 'good' logging in a service: use placeholders ({}), never log
 * secrets/PII, log the exception with its stack trace, at appropriate
 * levels, and avoid log message duplication/spam.
 *
 * Hint:
 * - logger.error("Failed {}", id, ex) passes the exception for the stack trace
 * - Never log passwords, tokens, emails, credit cards
 * - Use warn for recoverable, error for failures, info for lifecycle
 * - Include contextual ids (userId, orderId) so logs are searchable
 *
 * Expected Output:
 * INFO  - Processing order 42 for user 7
 * WARN  - Payment gateway slow (took 1200ms)
 * ERROR - Failed processing order 42 : <java.lang.IllegalStateException>
 *
 * TODO:
 * 1. Add userId/orderId to the log message
 * 2. Use {} placeholder + pass the exception object
 * 3. Avoid logging secrets
 *
 * See solution package for a model service.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 204: Logging Best Practices ===");
    }
}