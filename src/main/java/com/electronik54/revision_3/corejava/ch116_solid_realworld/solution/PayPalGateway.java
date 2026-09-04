package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** OCP: another new gateway. */
public class PayPalGateway implements PaymentGateway {
    @Override
    public void pay(String employeeName, double amount) {
        System.out.printf("employee=%s gross=%.1f -> paid via PayPal%n", employeeName, amount);
    }
}