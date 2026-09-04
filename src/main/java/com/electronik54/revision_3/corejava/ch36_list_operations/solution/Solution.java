package com.electronik54.revision_3.corejava.ch36_list_operations.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution for Challenge 36: List Operations
 *
 * Demonstrates: ArrayList core operations, subList view, and
 * immutable List.of behavior.
 */
public class Solution {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("apple", "banana", "cherry"));
        System.out.println(fruits);

        fruits.add(1, "avocado");                       // insert at index
        System.out.println("After insert: " + fruits);

        fruits.remove("cherry");                        // remove by value
        System.out.println("After remove: " + fruits);

        System.out.println("subList: " + fruits.subList(0, 1)
                + "  contains banana: " + fruits.contains("banana"));

        fruits.set(0, "apricot");
        System.out.println("After set: " + fruits);
        System.out.println("indexOf banana: " + fruits.indexOf("banana"));

        String[] array = fruits.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        // Immutable list
        try {
            List.of("a", "b").add("c");
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of is immutable: UnsupportedOperationException");
        }
    }
}