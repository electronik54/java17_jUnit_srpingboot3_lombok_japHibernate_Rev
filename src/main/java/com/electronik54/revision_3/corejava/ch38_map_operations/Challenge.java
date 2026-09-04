package com.electronik54.revision_3.corejava.ch38_map_operations;

/**
 * Challenge 38: Map Operations (HashMap vs LinkedHashMap vs TreeMap)
 *
 * Problem:
 * Count word frequency using a HashMap with getOrDefault/merge, then
 * demonstrate the ordering behavior of the three main Map types and
 * null-key handling.
 *
 * Hint:
 * - HashMap allows ONE null key; TreeMap throws NPE for null keys
 * - LinkedHashMap preserves insertion order; TreeMap sorts by key
 * - merge(key, 1, Integer::sum) is the idiomatic frequency counter
 *
 * Expected Output:
 * Frequencies: {java=2, is=1, fun=1}
 * LinkedHashMap order preserved, TreeMap sorted by key
 * getOrDefault(missing) = 0
 *
 * TODO:
 * 1. Count frequency of words in "java is fun java" using merge
 * 2. Build the same map with LinkedHashMap and TreeMap; print each
 * 3. Use getOrDefault for a missing key
 * 4. Show HashMap allows a null key; note TreeMap does not
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 38: Map Operations ===");
    }
}