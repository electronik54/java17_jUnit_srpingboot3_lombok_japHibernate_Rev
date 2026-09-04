package com.electronik54.revision_3.corejava.ch112_open_closed;

/**
 * Challenge 112: Open/Closed Principle (OCP)
 *
 * Problem:
 * Classes should be open for extension but closed for modification.
 * Implement an AreaCalculator that computes areas of shapes WITHOUT being
 * modified when a new shape is added. Use polymorphism (each Shape computes
 * its own area).
 *
 * Hint:
 * - Shape interface with double area()
 * - Circle, Rectangle, Triangle implement area()
 * - AreaCalculator takes Iterable<Shape> and sums area() - no if/else needed
 * - Adding a shape = adding a class, not editing AreaCalculator
 *
 * Expected Output:
 * Total area: 61.6
 *
 * TODO:
 * 1. Create Shape interface with area()
 * 2. Create Circle(radius), Rectangle(w,h), Triangle(b,h)
 * 3. AreaCalculator.sum(List<Shape>)
 * 4. Add a new shape (e.g. Square) WITHOUT touching AreaCalculator
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 112: Open/Closed Principle ===");
    }
}