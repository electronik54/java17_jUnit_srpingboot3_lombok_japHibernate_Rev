package com.electronik54.revision_3.corejava.ch20_nested_classes;

/**
 * Challenge 20: Nested Classes
 *
 * Problem:
 * Demonstrate all four types of nested classes: static nested class,
 * inner (non-static) class, local class (inside a method), and
 * anonymous class (implementing Runnable).
 *
 * Hint:
 * - Static nested class: does NOT need an instance of the outer class
 * - Inner class: requires an outer instance, created via outerInstance.new Inner()
 * - Anonymous class: an expression that declares and instantiates a class at once
 *
 * Expected Output:
 * Static nested: 10
 * Inner: 20
 * Local class: 30
 * Anonymous: Running anonymous task!
 *
 * TODO:
 * 1. Create Outer class with a static field and an instance field
 * 2. Add a static nested class with a method returning the static field
 * 3. Add an inner class with a method returning the instance field
 * 4. In a method, define a local class and use it
 * 5. Create an anonymous class implementing Runnable and run it
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 20: Nested Classes ===");
    }
}