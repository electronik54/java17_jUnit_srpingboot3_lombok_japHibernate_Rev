package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/**
 * Solution for Challenge 116: SOLID Real-World Example
 */
public class Solution {

    public static void main(String[] args) {
        Employee alice = new Employee(1, "Alice", 5000.0, 0.0);
        Employee bob = new Employee(2, "Bob", 6000.0, 0.05);

        EmployeePaymentService service = new EmployeePaymentService(new BankTransferGateway());
        service.pay(alice);

        service = new EmployeePaymentService(new PayPalGateway());
        service.pay(bob);
    }
}