package com.electronik54.revision_3.corejava.ch119_mockito_mocking.solution;

/** Dependency B for OrderService. */
public class PaymentService {

    public boolean charge(String customerEmail, double amount) {
        // Real impl would hit a gateway
        return true;
    }
}