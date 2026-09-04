package com.electronik54.revision_3.corejava.ch120_test_driven_development.solution;

/**
 * Implemented AFTER the test was written (TDD GREEN phase).
 */
public class FizzBuzz {

    public static String generate(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}