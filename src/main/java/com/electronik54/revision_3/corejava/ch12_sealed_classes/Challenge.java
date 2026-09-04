package com.electronik54.revision_3.corejava.ch12_sealed_classes;

import com.electronik54.revision_3.corejava.ch12_sealed_classes.solution.Solution;

/**
 * Challenge 12: Sealed Classes (Java 17+)
 * 
 * Problem:
 * Create sealed class hierarchy for Shape (Circle, Rectangle, Triangle). 
 * Demonstrate permits clause and pattern matching with sealed classes.
 * 
 * Hint:
 * - Sealed classes restrict inheritance
 * - All permitted subclasses must be final, sealed, or non-sealed
 * - Enables exhaustive pattern matching
 * 
 * Expected Output:
 * === Sealed Shape Hierarchy ===
 * Circle with radius 5.0, area: 78.54
 * Rectangle 4.0 x 6.0, area: 24.0
 * Triangle base: 3.0, height: 4.0, area: 6.0
 * 
 * === Pattern Matching ===
 * Processing Circle
 * Processing Rectangle
 * Processing Triangle
 * 
 * TODO:
 * 1. Create sealed Shape class with permits for Circle, Rectangle, Triangle
 * 2. Create final Circle class extending Shape
 * 3. Create final Rectangle class extending Shape
 * 4. Create final Triangle class extending Shape
 * 5. Add abstract area() method to Shape
 * 6. Implement area() in each subclass
 * 7. Demonstrate exhaustive pattern matching
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 12: Sealed Classes ===");
        
    }
}