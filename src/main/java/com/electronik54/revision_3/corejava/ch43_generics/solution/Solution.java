package com.electronik54.revision_3.corejava.ch43_generics.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Challenge 43: Generics
 *
 * Demonstrates: generic class, bounded generic method, and a generic swap.
 */
public class Solution {

    // Bounded type parameter: T must be a Number subclass
    static <T extends Number> double sumOf(List<T> items) {
        double sum = 0;
        for (T item : items) {
            sum += item.doubleValue();
        }
        return sum;
    }

    // Generic method to swap two positions
    static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        // Generic class
        Box<String> box = new Box<>();
        System.out.println("Box empty? " + box.isEmpty());
        box.put("Hello");
        System.out.println("Box holds: " + box.get());

        // Bounded method
        List<Integer> ints = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println("Sum of ints = " + sumOf(ints));
        System.out.println("Sum of doubles = " + sumOf(doubles));

        // Mixed list: Integer and Double share the Number bound
        List<Number> mixed = new ArrayList<>(List.of(1, 2.5, 3));
        System.out.println("Sum of [1, 2.5, 3] = " + sumOf(mixed));

        // Swap
        List<String> letters = new ArrayList<>(List.of("A", "B"));
        System.out.print("Before swap: " + letters);
        swap(letters, 0, 1);
        System.out.println("  After swap: " + letters);
    }
}