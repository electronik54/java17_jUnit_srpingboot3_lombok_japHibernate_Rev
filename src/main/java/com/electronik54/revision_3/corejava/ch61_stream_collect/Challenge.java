package com.electronik54.revision_3.corejava.ch61_stream_collect;

import java.util.List;

/**
 * Challenge 61: Collectors - toList, toSet, toMap
 *
 * Problem:
 * Collect streams into different containers: toList, toUnmodifiableList,
 * toSet, toCollection(TreeSet), and toMap - including toMap with duplicate
 * keys and a merge function.
 *
 * Hint:
 * - toMap throws IllegalStateException on DUPLICATE keys unless you pass a merge function
 * - toMap(keyFn, valueFn): both are extracted from the element
 * - toUnmodifiableList returns a truly immutable list
 *
 * Expected Output:
 * List: [apple, banana]  Set: [apple, banana]
 * Sorted set: [apple, banana]
 * Map by length: {5=apple, 6=banana}
 * Merge on duplicate: {A=2}
 *
 * TODO:
 * 1. Collect fruits to List, Set, and TreeSet
 * 2. toMap: name -> its length
 * 3. toMap with duplicate keys: merge with Integer::sum
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 61: Collectors toList/toSet/toMap ===");
        System.out.println("Source: " + List.of("apple", "banana"));
    }
}