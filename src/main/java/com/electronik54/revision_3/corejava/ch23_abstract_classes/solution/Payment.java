package com.electronik54.revision_3.corejava.ch23_abstract_classes.solution;

/**
 * Abstract class: shared state (amount) + partial implementation (receipt).
 */
public abstract class Payment {

    protected double amount;

    // Abstract - each payment type MUST define how it pays
    public abstract void pay(double amount);

    // Concrete - shared behavior for all subclasses
    public void receipt() {
        System.out.println("------------------");
        System.out.println("Paid " + amount + " via " + describe());
    }

    protected abstract String describe();
}