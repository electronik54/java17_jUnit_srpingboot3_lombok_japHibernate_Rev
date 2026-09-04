package com.electronik54.revision_3.corejava.ch23_abstract_classes.solution;

public class UpiPayment extends Payment {
    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        this.amount = amount;
        System.out.println("Paid " + amount + " via UPI id " + upiId);
    }

    @Override
    protected String describe() {
        return "UPI id " + upiId;
    }
}