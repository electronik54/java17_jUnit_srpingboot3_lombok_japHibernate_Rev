package com.electronik54.revision_3.corejava.ch69_functional_interfaces;

/**
 * Challenge 69: Functional Interfaces
 *
 * Problem:
 * Understand what makes an interface "functional" (exactly ONE abstract
 * method), write your own with @FunctionalInterface, implement it with a
 * lambda, and compose behavior by passing lambdas as method arguments.
 *
 * Hint:
 * - @FunctionalInterface is optional but enforces the single-abstract-method rule
 * - Default/static methods do NOT count against the limit
 * - Lambdas are instances of functional interfaces: the heart of Java 8+ FP
 *
 * Expected Output:
 * Custom calculator: 5 + 3 = 8, 5 * 3 = 15
 * Validator: "hello" valid=true, "" valid=false
 * Chained: processed(HELLO)
 *
 * TODO:
 * 1. Define @FunctionalInterface Calculator { int calc(int a, int b); }
 * 2. Instantiate as lambdas for + and *; call both
 * 3. Define Validator { boolean test(String s); } - implement as lambda for non-empty
 * 4. Write process(String, Function<String,String>) taking a lambda transformation
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 69: Functional Interfaces ===");
    }
}