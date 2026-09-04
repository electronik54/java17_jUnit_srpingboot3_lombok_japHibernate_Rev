package com.electronik54.revision_3.corejava.ch120_test_driven_development;

/**
 * Challenge 120: Test-Driven Development (TDD)
 *
 * Problem:
 * Practice the Red-Green-Refactor cycle. Write a failing test first for a
 * FizzBuzz function, then implement the minimum code to make it pass, then
 * refactor. TDD workflow: write test -> see it fail (RED) -> implement
 * (GREEN) -> clean up (REFACTOR).
 *
 * Hint:
 * - FizzBuzz: multiples of 3 -> "Fizz", of 5 -> "Buzz", of both -> "FizzBuzz"
 * - Write the test FIRST, run it, watch it fail, then implement
 * - Keep tests focused on behavior
 *
 * Expected Output (test run):
 * FizzBuzzTest: 5 cases pass after implementation
 *
 * TODO:
 * 1. Write FizzBuzzTest first (RED) for 1,3,5,15,7
 * 2. Create FizzBuzz.generate(n) and make tests green (GREEN)
 * 3. Refactor the implementation to be concise (REFACTOR)
 * 4. Run mvn -Dtest=FizzBuzzTest test
 *
 * The solution package holds FizzBuzz. The TEST lives under src/test/java.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 120: Test-Driven Development ===");
    }
}