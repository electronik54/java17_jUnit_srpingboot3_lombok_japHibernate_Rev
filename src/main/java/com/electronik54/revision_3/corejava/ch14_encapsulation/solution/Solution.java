package com.electronik54.revision_3.corejava.ch14_encapsulation.solution;

/**
 * Solution for Challenge 14: Encapsulation
 * 
 * This solution demonstrates:
 * - Private fields with public getters/setters
 * - Validation in setter methods
 * - Controlled access to object state
 * - Data integrity through encapsulation
 */
public class Solution {

    /**
     * Independent entry point - run this class directly to see the
     * expected end result of Challenge 14.
     */
    public static void main(String[] args) {
        // Create bank account
        BankAccount account = new BankAccount("12345", 1000.0);
        
        System.out.println("=== Bank Account ===");
        System.out.printf("Account: %s, Balance: $%.2f%n", 
            account.getAccountNumber(), account.getBalance());
        
        // Valid deposit
        account.deposit(500.0);
        System.out.printf("After deposit: $%.2f%n", account.getBalance());
        
        // Valid withdrawal
        account.withdraw(300.0);
        System.out.printf("After withdrawal: $%.2f%n", account.getBalance());
        
        // Invalid withdrawal (insufficient funds)
        account.withdraw(2000.0);
        
        // Invalid deposit (negative amount)
        account.deposit(-100.0);
    }
}