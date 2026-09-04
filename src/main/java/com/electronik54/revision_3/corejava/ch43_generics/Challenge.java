package com.electronik54.revision_3.corejava.ch43_generics;

/**
 * Challenge 43: Generics
 *
 * Problem:
 * Create a generic class 'Box<T>' with a value and a get/put API, a
 * bounded generic method that sums numbers, and a generic static method
 * that swaps two elements in a list.
 *
 * Hint:
 * - Class type parameter: class Box<T>; method type parameter: <T> T method(...)
 * - Bounded type: <T extends Number> allows calling numberValue() on T
 * - Generics exist at compile time only (erasure) - they prevent ClassCastException
 *
 * Expected Output:
 * Box holds: Hello
 * Sum of [1, 2.5, 3] = 6.5
 * Before swap: [A, B]  After swap: [B, A]
 *
 * TODO:
 * 1. Generic class Box<T> with put(T), get(), isEmpty()
 * 2. Generic method <T extends Number> double sumOf(List<T>) using doubleValue()
 * 3. Generic method <T> void swap(List<T>, int i, int j)
 * 4. Exercise all three in main
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 43: Generics ===");
    }
}