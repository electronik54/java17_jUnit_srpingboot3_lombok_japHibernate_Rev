package com.electronik54.revision_3.corejava.ch107_strategy_pattern.solution;

/**
 * Solution for Challenge 107: Strategy Pattern
 */
public class Solution {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.pay(100.0);

        // Swap strategy at runtime
        processor.setStrategy(new PayPalPayment());
        processor.pay(250.0);
    }
}