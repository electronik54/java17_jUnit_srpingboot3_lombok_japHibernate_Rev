package com.electronik54.revision_3.corejava.ch107_strategy_pattern.solution;

/** Concrete strategy A. */
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}