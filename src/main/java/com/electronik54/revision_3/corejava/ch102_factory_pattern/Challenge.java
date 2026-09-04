package com.electronik54.revision_3.corejava.ch102_factory_pattern;

/**
 * Challenge 102: Factory Method Pattern
 *
 * Problem:
 * Create a ShapeFactory with a factory method createShape(type) that returns
 * Circle or Square based on the type string. This encapsulates object creation
 * logic behind one method.
 *
 * Hint:
 * - Define a Shape interface with a draw() method
 * - Circle and Square implement Shape
 * - The factory returns the concrete type based on the input, but the caller
 *   only depends on the Shape interface (loose coupling)
 *
 * Expected Output:
 * Drawing a Circle with radius 5.0
 * Drawing a Square with side 4.0
 *
 * TODO:
 * 1. Create Shape interface with draw() method
 * 2. Create Circle and Square implementing Shape
 * 3. Create ShapeFactory.createShape(String type, double param)
 * 4. Use the factory to get shapes and call draw()
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 102: Factory Method Pattern ===");
    }
}