package com.electronik54.revision_3.corejava.ch28_wrapper_classes;

/**
 * Challenge 28: Wrapper Classes
 *
 * Problem:
 * Demonstrate the 8 wrapper classes: parsing strings, converting values,
 * constants like MAX_VALUE, and useful methods (compareTo, valueOf).
 *
 * Hint:
 * - Wrappers are immutable objects wrapping primitives (Integer, Double, ...)
 * - Integer.parseInt returns a primitive; Integer.valueOf returns an object
 * - Wrappers are immutable - operations like Integer.valueOf never modify the original
 *
 * Expected Output:
 * parseInt("42") = 42 (primitive int)
 * valueOf("42") = 42 (Integer object)
 * Integer.MAX_VALUE = 2147483647, MIN_VALUE = -2147483648
 * Integer.compare(5, 3) = 1
 * Double.parseDouble("3.14") = 3.14
 *
 * TODO:
 * 1. Parse a String to primitive int via Integer.parseInt
 * 2. Parse a String to Integer object via Integer.valueOf
 * 3. Print Integer.MAX_VALUE and MIN_VALUE
 * 4. Use Integer.compare, Integer.max, and Double.parseDouble
 * 5. Convert an Integer back to int and to String
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 28: Wrapper Classes ===");
    }
}