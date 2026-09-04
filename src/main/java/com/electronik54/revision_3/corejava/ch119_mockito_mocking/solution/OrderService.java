package com.electronik54.revision_3.corejava.ch119_mockito_mocking.solution;

/** Class under test - orchestrates payment + email. */
public class OrderService {

    private final PaymentService paymentService;
    private final EmailService emailService;

    public OrderService(PaymentService paymentService, EmailService emailService) {
        this.paymentService = paymentService;
        this.emailService = emailService;
    }

    public boolean placeOrder(String customerEmail, double amount) {
        boolean paid = paymentService.charge(customerEmail, amount);
        if (paid) {
            emailService.sendOrderConfirmation(customerEmail, 42L);
            return true;
        }
        return false;
    }
}