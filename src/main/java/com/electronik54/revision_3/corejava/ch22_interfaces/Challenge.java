package com.electronik54.revision_3.corejava.ch22_interfaces;

/**
 * Challenge 22: Interfaces
 *
 * Problem:
 * Create a 'Drawable' interface with an abstract method draw(), a default
 * method info(), and a static method category(). Implement it in Circle
 * and Square classes. Demonstrate polymorphism through the interface.
 *
 * Hint:
 * - Interface methods are public abstract by default
 * - default methods give shared behavior without forcing every implementer to override
 * - static interface methods are called on the INTERFACE, not the implementing class
 *
 * Expected Output:
 * Drawing Circle with radius 3.0
 * Drawing Square with side 4.0
 * I am a drawable shape (Circle)
 * Category: 2D Shapes
 *
 * TODO:
 * 1. Drawable interface: void draw(); default void info() prints message with getClass().getSimpleName()
 * 2. Drawable: static String category() returning "2D Shapes"
 * 3. Circle implements Drawable: field radius, draw() prints "Drawing Circle with radius X"
 * 4. Square implements Drawable: field side, draw() prints "Drawing Square with side X"
 * 5. In main, store both in a Drawable[] and invoke draw() polymorphically
 * 6. Call info() on Circle and category() on the interface
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 22: Interfaces ===");
    }
}