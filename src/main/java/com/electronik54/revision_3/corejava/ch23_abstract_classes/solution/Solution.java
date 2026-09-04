package com.electronik54.revision_3.corejava.ch23_abstract_classes.solution;

/**
 * Solution for Challenge 23: Abstract Class vs Interface
 *
 * Demonstrates: abstract class with shared state, abstract vs concrete
 * methods, and polymorphic usage via the abstract type.
 */
public class Solution {

    public static void main(String[] args) {
        Payment card = new CardPayment("1234");
        Payment upi = new UpiPayment("alice@bank");

        // Direct calls
        card.pay(250.0);
        upi.pay(99.5);

        // Shared concrete method from the abstract class
        card.receipt();
        upi.receipt();
    }
}