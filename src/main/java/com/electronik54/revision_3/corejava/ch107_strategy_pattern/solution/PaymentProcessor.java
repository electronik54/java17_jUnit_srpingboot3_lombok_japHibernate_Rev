package com.electronik54.revision_3.corejava.ch107_strategy_pattern.solution;

/**
 * Context: delegates to the currently selected strategy. Strategy is
 * swappable at runtime.
 */
public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}