package com.electronik54.revision_3.corejava.ch73_lambda_expressions;

import java.util.List;

/**
 * Challenge 73: Lambda Expressions
 *
 * Problem:
 * Practice lambda syntax variants: zero/one/multi parameters, expression
 * vs block bodies, effectively-final variable capture (closures), and
 * replacing anonymous classes with lambdas.
 *
 * Hint:
 * - (params) -> expression  OR  (params) -> { statements; return x; }
 * - Lambdas can only capture EFFECTIVELY FINAL local variables
 * - 'this' inside a lambda = the ENCLOSING instance (unlike anonymous classes)
 *
 * Expected Output:
 * Zero-arg: 42 / One-arg: HELLO / Two-arg: 8 / Block: 5
 * Captured factor=3, product=12 (x2 still uses factor=3)
 * Runnable as lambda vs anonymous class both work
 *
 * TODO:
 * 1. Supplier with zero args; Function one-arg WITHOUT parentheses; BiFunction with them
 * 2. Multi-statement block body with explicit return
 * 3. Capture an effectively-final variable inside a lambda; try reassigning it (compile error in comment)
 * 4. Replace a Runnable anonymous class with a lambda
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 73: Lambda Expressions ===");
        System.out.println("Sample input: " + List.of(1, 2, 3));
    }
}