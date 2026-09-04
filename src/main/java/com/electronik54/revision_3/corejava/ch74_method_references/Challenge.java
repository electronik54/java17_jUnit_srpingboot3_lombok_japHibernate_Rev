package com.electronik54.revision_3.corejava.ch74_method_references;

import java.util.List;

/**
 * Challenge 74: Method References (::)
 *
 * Problem:
 * Use all four method reference types: static (Math::abs), instance-of-
 * object (str::length), instance-of-class (String::toUpperCase), and
 * constructor (ArrayList::new). Convert equivalent lambdas to references.
 *
 * Hint:
 * - Static: ClassName::staticMethod
 * - Bound: instance::method (already has its receiver)
 * - Unbound: ClassName::instanceMethod (first param becomes the receiver)
 * - Constructor: ClassName::new
 *
 * Expected Output:
 * Static: [-1, 2]  Bound: 5  Unbound: [HELLO, WORLD]
 * Constructor: empty list []
 * Lambda vs reference equivalents: true
 *
 * TODO:
 * 1. Map abs over negatives with Math::abs
 * 2. Bound reference to a specific string's length
 * 3. Unbound reference mapping String::toUpperCase
 * 4. Constructor reference collecting into ArrayList
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 74: Method References ===");
        System.out.println("Sample: " + List.of("hello", "world"));
    }
}