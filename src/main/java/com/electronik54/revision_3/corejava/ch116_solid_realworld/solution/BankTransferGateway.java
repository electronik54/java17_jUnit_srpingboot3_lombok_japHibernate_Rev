package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** OCP: new gateway, no changes to the service. */
public class BankTransferGateway implements PaymentGateway {
    @Override
    public void pay(String employeeName, double amount) {
        System.out.printf("employee=%s gross=%.1f -> paid via BankTransfer%n", employeeName, amount);
    }
}