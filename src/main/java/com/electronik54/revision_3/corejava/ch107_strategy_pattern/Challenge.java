package com.electronik54.revision_3.corejava.ch107_strategy_pattern;

/**
 * Challenge 107: Strategy Pattern
 *
 * Problem:
 * Create a PaymentProcessor that uses interchangeable payment strategies
 * (CreditCard and PayPal). The strategy is chosen at runtime without
 * changing the processor. This is the Strategy pattern - encapsulate an
 * algorithm so it is interchangeable.
 *
 * Hint:
 * - Define PaymentStrategy interface with pay(double)
 * - CreditCardPayment and PayPalPayment implement it
 * - PaymentProcessor holds a PaymentStrategy and delegates pay()
 * - Set the strategy via constructor or setter (runtime swap)
 *
 * Expected Output:
 * Paid 100.0 using Credit Card
 * Paid 250.0 using PayPal
 *
 * TODO:
 * 1. Create PaymentStrategy interface with pay(double)
 * 2. Create CreditCardPayment and PayPalPayment
 * 3. Create PaymentProcessor with setStrategy / pay
 * 4. Pay with credit card, then switch to PayPal
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 107: Strategy Pattern ===");
    }
}