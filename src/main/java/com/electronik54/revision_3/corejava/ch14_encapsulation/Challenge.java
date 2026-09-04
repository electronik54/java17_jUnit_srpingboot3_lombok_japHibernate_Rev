package com.electronik54.revision_3.corejava.ch14_encapsulation;

/**
 * Challenge 14: Encapsulation
 * 
 * Problem:
 * Create a class 'BankAccount' with private fields (accountNumber, balance), 
 * public getters/setters with validation, and methods (deposit, withdraw).
 * Demonstrate encapsulation by preventing direct field access.
 * 
 * Hint:
 * - Use private access for fields
 * - Add validation logic in setters
 * - Withdraw should check for sufficient balance
 * - Deposit should accept only positive amounts
 * 
 * Expected Output:
 * === Bank Account ===
 * Account: 12345, Balance: $1000.00
 * After deposit: $1500.00
 * After withdrawal: $1200.00
 * Invalid withdrawal: Insufficient funds
 * Invalid deposit: Amount must be positive
 * 
 * TODO:
 * 1. Create BankAccount class with private fields: accountNumber, balance
 * 2. Create constructor to initialize account
 * 3. Add getter for accountNumber (no setter - immutable)
 * 4. Add getter for balance
 * 5. Add deposit(double amount) method with validation (amount > 0)
 * 6. Add withdraw(double amount) method with validation (amount > 0 && amount <= balance)
 * 7. Demonstrate valid and invalid operations
 * 
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 14: Encapsulation ===");
        
    }
}