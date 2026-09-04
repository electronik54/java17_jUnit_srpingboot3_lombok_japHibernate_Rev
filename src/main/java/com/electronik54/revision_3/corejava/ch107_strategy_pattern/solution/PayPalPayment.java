package com.electronik54.revision_3.corejava.ch107_strategy_pattern.solution;

/** Concrete strategy B. */
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}