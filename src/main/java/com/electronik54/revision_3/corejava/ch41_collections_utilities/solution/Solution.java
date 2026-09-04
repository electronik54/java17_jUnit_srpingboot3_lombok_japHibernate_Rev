package com.electronik54.revision_3.corejava.ch41_collections_utilities.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for Challenge 41: Collections Utilities
 *
 * Demonstrates: sort, reverse, shuffle, binarySearch, frequency,
 * min/max, and unmodifiable views.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1, 3, 2));

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled (random order): " + numbers);

        List<Integer> sorted = new ArrayList<>(List.of(1, 2, 3, 5, 8));
        System.out.println("binarySearch for 5: index " + Collections.binarySearch(sorted, 5)
                + " (in sorted copy)");

        System.out.println("frequency of 2: " + Collections.frequency(numbers, 2));
        System.out.println("min=" + Collections.min(numbers) + " max=" + Collections.max(numbers));

        Collections.swap(numbers, 0, 1);
        System.out.println("After swap(0,1): " + numbers);

        List<Integer> readOnly = Collections.unmodifiableList(numbers);
        try {
            readOnly.add(99);
        } catch (UnsupportedOperationException e) {
            System.out.println("Unmodifiable list rejects add");
        }
    }
}