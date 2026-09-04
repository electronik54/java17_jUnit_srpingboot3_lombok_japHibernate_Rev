package com.electronik54.revision_3.corejava.ch14_encapsulation.solution;

/**
 * BankAccount class demonstrating encapsulation:
 * - Private fields with public getters/setters
 * - Validation in methods
 * - Controlled access to object state
 */
public class BankAccount {
    // Private fields - cannot be accessed directly
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Getter for accountNumber (no setter - immutable)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    
    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit: Amount must be positive");
        }
    }
    
    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal: Amount must be positive");
        } else if (amount > balance) {
            System.out.println("Invalid withdrawal: Insufficient funds");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f%n", amount);
        }
    }
}