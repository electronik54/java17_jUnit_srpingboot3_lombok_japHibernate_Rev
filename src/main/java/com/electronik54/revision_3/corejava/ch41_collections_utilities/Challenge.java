package com.electronik54.revision_3.corejava.ch41_collections_utilities;

/**
 * Challenge 41: Collections Utilities
 *
 * Problem:
 * Use the java.util.Collections helper methods: sort, reverse, shuffle,
 * swap, binarySearch, frequency, min, max, and the unmodifiable wrapper.
 *
 * Hint:
 * - binarySearch REQUIRES a sorted list, otherwise results are undefined
 * - Collections.unmodifiableList returns a VIEW - the backing list can still change
 * - List.of is a truly immutable alternative (no backing-list mutations)
 *
 * Expected Output:
 * Sorted: [1, 2, 3, 5, 8]
 * Reversed: [8, 5, 3, 2, 1]
 * binarySearch for 5: index 1 (in sorted copy)
 * frequency of 2: 2
 * min=1 max=8
 * Unmodifiable list rejects add
 *
 * TODO:
 * 1. Sort, reverse and shuffle a list of integers
 * 2. binarySearch for a value in a SORTED copy
 * 3. frequency, min, max
 * 4. Wrap with unmodifiableList and attempt an add inside try-catch
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 41: Collections Utilities ===");
    }
}