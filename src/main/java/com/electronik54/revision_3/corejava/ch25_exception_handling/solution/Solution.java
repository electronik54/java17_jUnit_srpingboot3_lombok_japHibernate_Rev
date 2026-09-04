package com.electronik54.revision_3.corejava.ch25_exception_handling.solution;

/**
 * Solution for Challenge 25: Exception Handling
 *
 * Demonstrates: custom checked exception, try-catch-finally, multi-catch,
 * and try-with-resources.
 */
public class Solution {

    private static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        System.out.println("Withdrew " + amount + ", remaining " + (balance - amount));
    }

    public static void main(String[] args) {
        // 1. try-catch-finally with custom exception
        try {
            withdraw(1000.0, 1500.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
        }

        // 2. Multi-catch
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Multi-catch caught: " + e);
        }

        // 3. try-with-resources - close() runs automatically (even on exception)
        try (Resource r = new Resource("Resource")) {
            r.use();
        }
        try (Resource r = new Resource("Resource")) {
            r.use();
            throw new IllegalStateException("boom");  // still closes
        } catch (IllegalStateException ignored) {
        }
    }
}