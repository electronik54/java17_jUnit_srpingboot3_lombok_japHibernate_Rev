package com.electronik54.revision_3.corejava.ch107_strategy_pattern.solution;

/** Strategy interface: the interchangeable algorithm. */
public interface PaymentStrategy {
    void pay(double amount);
}