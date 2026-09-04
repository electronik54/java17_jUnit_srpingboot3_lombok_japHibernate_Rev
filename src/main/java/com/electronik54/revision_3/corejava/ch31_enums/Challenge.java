package com.electronik54.revision_3.corejava.ch31_enums;

/**
 * Challenge 31: Enums
 *
 * Problem:
 * Create an 'OrderStatus' enum with fields (code, description), a
 * constructor, a method, and use it in a switch expression. Demonstrate
 * values(), valueOf(), ordinal(), and name().
 *
 * Hint:
 * - Enum constants are implicit public static final instances
 * - The constructor is implicitly private - you cannot create new constants
 * - Enums work perfectly with switch (no default needed if exhaustive)
 *
 * Expected Output:
 * NEW(100): Order received
 * SHIPPED(300): Order on the way
 * Can transition from NEW to SHIPPED: true
 * SHIPPED is ordinal 2 of 4 constants
 *
 * TODO:
 * 1. OrderStatus: NEW(100), PAID(200), SHIPPED(300), DELIVERED(400)
 * 2. Fields code and description with constructor and getters
 * 3. Method canTransitionTo(OrderStatus next) - only forward transitions
 * 4. Use switch expression on the enum to print a shipping message
 * 5. Demonstrate values(), valueOf("PAID"), ordinal() and name()
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 31: Enums ===");
    }
}