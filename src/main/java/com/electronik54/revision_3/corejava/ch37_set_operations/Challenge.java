package com.electronik54.revision_3.corejava.ch37_set_operations;

/**
 * Challenge 37: Set Operations (HashSet vs LinkedHashSet vs TreeSet)
 *
 * Problem:
 * Add duplicates to the three main Set implementations and observe the
 * differences: HashSet (no order), LinkedHashSet (insertion order),
 * TreeSet (sorted). Then perform union, intersection and difference.
 *
 * Hint:
 * - No duplicates allowed in ANY Set (add() returns false)
 * - TreeSet sorts by natural ordering (or a Comparator)
 * - Set math: retainAll = intersection, addAll = union, removeAll = difference
 *
 * Expected Output:
 * HashSet:       [c, a, b]        (unordered)
 * LinkedHashSet: [a, b, c]        (insertion order)
 * TreeSet:       [a, b, c]        (sorted)
 * Duplicate add returned false
 * Union: [a, b, c, d]  Intersection: [b, c]  Difference: [a]
 *
 * TODO:
 * 1. Insert c, a, b, a, c into all three Set types and print each
 * 2. Show add() return value when inserting a duplicate
 * 3. Compute union, intersection, difference of {a,b,c} and {b,c,d}
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 37: Set Operations ===");
    }
}