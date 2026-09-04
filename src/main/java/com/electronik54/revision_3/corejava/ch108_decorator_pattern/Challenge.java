package com.electronik54.revision_3.corejava.ch108_decorator_pattern;

/**
 * Challenge 108: Decorator Pattern
 *
 * Problem:
 * Create a Coffee with decorators that dynamically add behavior (cost and
 * description). Start with a Base Coffee, wrap with MilkDecorator and
 * SugarDecorator. Decorator pattern adds behavior without modifying the
 * original class.
 *
 * Hint:
 * - Coffee interface: double cost(), String description()
 * - BaseCoffee is the concrete component
 * - CoffeeDecorator holds a wrapped Coffee and forwards; subclasses add cost/desc
 * - Wrap order matters: new MilkDecorator(new SugarDecorator(new BaseCoffee()))
 *
 * Expected Output:
 * Base coffee, Milk, Sugar : 3.6
 *
 * TODO:
 * 1. Create Coffee interface (cost, description) and BaseCoffee
 * 2. Create abstract CoffeeDecorator wrapping a Coffee
 * 3. Create MilkDecorator and SugarDecorator that add 0.5 each
 * 4. Build a coffee with milk + sugar and print cost & description
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 108: Decorator Pattern ===");
    }
}