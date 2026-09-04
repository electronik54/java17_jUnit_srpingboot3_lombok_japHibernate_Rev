package com.electronik54.revision_3.corejava.ch116_solid_realworld;

/**
 * Challenge 116: SOLID Real-World Examples
 *
 * Problem:
 * Refactor a real-world style code smell. Create an EmployeePaymentService
 * that pays employee salaries via different payment strategies while
 * following SRP (payment computes amount) + OCP (add new payment types
 * without editing the service) + DIP (depends on PaymentGateway abstraction).
 *
 * Hint:
 * - SRP: Employee holds data; SalaryCalculator computes salary; PaymentGateway sends money
 * - OCP: add new gateways without changing EmployeePaymentService
 * - DIP: service depends on PaymentGateway interface
 *
 * Expected Output:
 * employee=Alice gross=5000.0 -> paid via BankTransfer
 * employee=Bob gross=6500.0 -> paid via PayPal
 *
 * TODO:
 * 1. Employee(id, name, baseSalary, bonusPct)
 * 2. SalaryCalculator.gross(employee)
 * 3. PaymentGateway interface; BankTransferGateway, PayPalGateway
 * 4. EmployeePaymentService(pay(employee)) using injected gateway
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 116: SOLID Real-World Examples ===");
    }
}