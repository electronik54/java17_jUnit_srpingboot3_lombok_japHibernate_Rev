package com.electronik54.revision_3.corejava.ch23_abstract_classes.solution;

public class CardPayment extends Payment {
    private final String last4;

    public CardPayment(String last4) {
        this.last4 = last4;
    }

    @Override
    public void pay(double amount) {
        this.amount = amount;
        System.out.println("Paid " + amount + " via Credit Card ending " + last4);
    }

    @Override
    protected String describe() {
        return "Credit Card ending " + last4;
    }
}