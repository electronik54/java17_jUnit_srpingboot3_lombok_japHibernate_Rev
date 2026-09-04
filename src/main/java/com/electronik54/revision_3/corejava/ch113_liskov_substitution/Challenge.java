package com.electronik54.revision_3.corejava.ch113_liskov_substitution;

/**
 * Challenge 113: Liskov Substitution Principle (LSP)
 *
 * Problem:
 * Subtypes must be substitutable for their base type WITHOUT breaking the
 * program. The classic anti-example: a Square extends Rectangle and overrides
 * setWidth/setHeight inconsistently, so code that treats a Square as a
 * Rectangle computes a wrong area. Fix it by NOT inheriting Square from
 * Rectangle (favor composition / separate types).
 *
 * Hint:
 * - Rectangle.setDimensions(w,h); area = w*h
 * - A Square subclass breaking setDimensions violates LSP
 * - Fix: don't model Square as Rectangle subclass - use an interface Shape
 *   with area(), implemented independently
 *
 * Expected Output:
 * Rectangle area: 24.0
 * Square area: 25.0
 * Both usable as Shape -> LSP satisfied
 *
 * TODO:
 * 1. Create Shape interface with area()
 * 2. Rectangle(w,h) and Square(side) implement it independently
 * 3. Use both polymorphically as Shape - no broken behavior
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 113: Liskov Substitution Principle ===");
    }
}