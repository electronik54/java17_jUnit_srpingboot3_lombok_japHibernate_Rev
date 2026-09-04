package com.electronik54.revision_3.springboot.ch199_spring_aop_realworld;

/**
 * Challenge 199: AOP Real-World (Execution-Time & Transaction Aspects)
 *
 * Problem:
 * Build a @Timed method-performance aspect that measures and logs the
 * execution time of any method annotated with @Timed. This is a real
 * cross-cutting concern (performance monitoring) applied without touching
 * the business code.
 *
 * Hint:
 * - @Around measures System.nanoTime() before/after proceed()
 * - Combine with a custom @Timed method annotation
 * - Real-world AOP uses: logging, transaction management, security, caching,
 *   performance metrics - all without polluting business classes
 *
 * Expected Output (console):
 * TIMED reportCustomer: 0.012 ms
 *
 * TODO:
 * 1. Create @Timed annotation
 * 2. Create ReportService with a @Timed method
 * 3. Create TimingAspect with @Around that logs duration
 *
 * solution package holds annotation + service + aspect.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 199: AOP Real-World ===");
    }
}