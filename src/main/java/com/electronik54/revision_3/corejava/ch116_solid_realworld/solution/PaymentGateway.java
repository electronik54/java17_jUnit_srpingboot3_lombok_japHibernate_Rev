package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** DIP: the abstraction the service depends on. */
public interface PaymentGateway {
    void pay(String employeeName, double amount);
}