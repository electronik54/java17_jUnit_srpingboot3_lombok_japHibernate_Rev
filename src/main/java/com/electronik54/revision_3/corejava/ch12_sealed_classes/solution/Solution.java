package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * Challenge 12 Solution: Sealed Classes
 * Demonstrates a sealed class hierarchy with final, non-sealed and sealed
 * subclasses, plus exhaustive pattern-matching in switch.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("--- Solution 12: Sealed Classes ---");

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4),
                new RightTriangle(3, 4)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s -> area = %.2f%n", describe(shape), shape.area());
        }

        // Sealed hierarchies enable EXHAUSTIVE type checks.
        // NOTE: pattern-matching switch is only a preview feature in Java 17
        // (finalized in Java 21), so we use instanceof pattern matching here.
        System.out.println("\n=== Pattern Matching ===");
        for (Shape shape : shapes) {
            String category;
            if (shape instanceof Circle c) {
                category = "Processing Circle (radius " + c.getRadius() + ")";
            } else if (shape instanceof Rectangle r) {
                category = "Processing Rectangle (" + r.getLength() + " x " + r.getWidth() + ")";
            } else if (shape instanceof RightTriangle rt) {
                category = "Processing RightTriangle (hypotenuse "
                        + String.format("%.2f", rt.hypotenuse()) + ")";
            } else if (shape instanceof Triangle t) {
                category = "Processing Triangle (base " + t.getBase() + ")";
            } else {
                category = "Unknown shape";
            }
            System.out.println(category);
        }
    }

    /**
     * Pattern matching for instanceof (Java 16+) - no explicit cast needed.
     */
    private static String describe(Shape shape) {
        if (shape instanceof Circle c) return c.getName() + " (radius " + c.getRadius() + ")";
        if (shape instanceof Rectangle r) return r.getName() + " (" + r.getLength() + " x " + r.getWidth() + ")";
        if (shape instanceof RightTriangle rt) return rt.getName() + " (right-angled)";
        if (shape instanceof Triangle t) return t.getName() + " (base " + t.getBase() + ")";
        return shape.getName();
    }
}
