package com.electronik54.revision_3.corejava.ch104_builder_pattern;

/**
 * Challenge 104: Builder Pattern
 *
 * Problem:
 * Create a Pizza builder that lets you assemble a Pizza step by step:
 * choose size, add cheese, add pepperoni, add mushrooms. The build() method
 * produces an immutable Pizza. This avoids the "telescoping constructor"
 * anti-pattern.
 *
 * Hint:
 * - Builder holds the same fields as the product and returns 'this' from each setter
 * - build() validates and returns a new Pizza
 * - Optional steps (addMushrooms) may be omitted
 *
 * Expected Output:
 * Pizza[size=Large, cheese=true, pepperoni=true, mushrooms=false]
 *
 * TODO:
 * 1. Create PizzaBlu (immutable, package-private ctor)
 * 2. Create PizzaBuilder with setSize, addCheese, addPepperoni, addMushrooms, build()
 * 3. Chain the builder steps and print the pizza
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 104: Builder Pattern ===");
    }
}