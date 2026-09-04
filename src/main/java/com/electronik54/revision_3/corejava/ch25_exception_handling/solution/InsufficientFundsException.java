package com.electronik54.revision_3.corejava.ch25_exception_handling.solution;

/** Checked exception thrown when a withdrawal exceeds the balance. */
public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(double balance, double amount) {
        super("Need " + (amount - balance) + " more to withdraw " + amount
                + " (balance " + balance + ")");
    }
}