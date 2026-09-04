package com.electronik54.revision_3.corejava.ch25_exception_handling;

/**
 * Challenge 25: Exception Handling
 *
 * Problem:
 * Create a custom exception 'InsufficientFundsException'. Write a withdraw
 * method that throws it when the amount exceeds the balance. Demonstrate
 * try-catch-finally, multi-catch, and try-with-resources.
 *
 * Hint:
 * - Checked exceptions extend Exception; unchecked extend RuntimeException
 * - finally runs whether or not an exception occurred
 * - try-with-resources auto-closes any object implementing AutoCloseable
 *
 * Expected Output:
 * Error: Need 500.0 more to withdraw 1500.0 (balance 1000.0)
 * Finally block always runs
 * Multi-catch caught: java.lang.NumberFormatException: For input string: "abc"
 * Resource closed
 * Resource closed
 *
 * TODO:
 * 1. InsufficientFundsException extends Exception, carries shortfall info in getMessage()
 * 2. withdraw(balance, amount) throws the exception when amount > balance
 * 3. Call withdraw inside try-catch-finally; print error and finally messages
 * 4. Multi-catch one block for NumberFormatException | ArithmeticException
 * 5. Create an AutoCloseable resource; use it in try-with-resources twice (one throwing)
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 25: Exception Handling ===");
    }
}