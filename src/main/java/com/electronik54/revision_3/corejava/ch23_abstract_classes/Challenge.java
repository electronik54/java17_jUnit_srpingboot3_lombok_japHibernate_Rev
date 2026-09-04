package com.electronik54.revision_3.corejava.ch23_abstract_classes;

/**
 * Challenge 23: Abstract Class vs Interface
 *
 * Problem:
 * Create an abstract 'Payment' class with a concrete method receipt() and
 * abstract method pay(double amount). Implement CardPayment and UpiPayment.
 * Show why an abstract class (shared state + partial implementation) differs
 * from an interface (pure contract).
 *
 * Hint:
 * - Abstract classes CANNOT be instantiated but can have constructors and state
 * - Abstract methods force subclasses to provide an implementation
 * - Rule of thumb: abstract class = "is-a" with shared state; interface = "can-do"
 *
 * Expected Output:
 * Paid 250.0 via Credit Card ending 1234
 * Paid 99.5 via UPI id alice@bank
 * ------------------
 * Paid 250.0 via Credit Card ending 1234
 * Paid 99.5 via UPI id alice@bank
 *
 * TODO:
 * 1. Abstract Payment: protected double amount; abstract void pay(double amount)
 * 2. Payment: concrete method receipt() printing a separator line and pay result
 * 3. CardPayment: stores last4 digits; pay() prints card payment message
 * 4. UpiPayment: stores upi id; pay() prints UPI message
 * 5. In main, call pay() directly and then receipt() on both implementations
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 23: Abstract Class vs Interface ===");
    }
}