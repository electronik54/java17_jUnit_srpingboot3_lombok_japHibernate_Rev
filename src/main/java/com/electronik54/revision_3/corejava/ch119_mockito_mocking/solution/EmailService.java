package com.electronik54.revision_3.corejava.ch119_mockito_mocking.solution;

/** Dependency A for OrderService. */
public class EmailService {

    public void sendOrderConfirmation(String customerEmail, long orderId) {
        System.out.println("Email sent to " + customerEmail + " for order " + orderId);
    }
}