package com.electronik54.revision_3.springboot.ch200_spring_aop_advanced;

/**
 * Challenge 200: AOP Advanced (@Order, multiple aspects)
 *
 * Problem:
 * Apply TWO aspects to the same method and control their execution order
 * with @Order. A LoggingAspect (@Order(2)) and a SecurityAspect (@Order(1))
 * - lower @Order value = higher precedence = runs FIRST on entry.
 *
 * Hint:
 * - @Order on the @Aspect class controls advice ordering
 * - On entry, lowest order runs first; on exit (Around), reverse
 * - Useful for: authenticate BEFORE logging, or transaction-before-metric
 *
 * Expected Output:
 * [Security] checking access...
 * [Logging] entering execute
 * [Security] access granted
 * executing core logic
 *
 * TODO:
 * 1. Create CoreService.execute() and two aspects with @Order
 * 2. The SecurityAspect prints before, LoggingAspect prints "entering"
 * 3. Observe ordering driven by @Order values
 *
 * solution package holds the service and both aspects.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 200: AOP Advanced Ordering ===");
    }
}