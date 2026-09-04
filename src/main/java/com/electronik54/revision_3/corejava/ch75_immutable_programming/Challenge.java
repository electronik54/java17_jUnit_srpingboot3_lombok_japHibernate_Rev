package com.electronik54.revision_3.corejava.ch75_immutable_programming;

import java.util.List;

/**
 * Challenge 75: Immutable Programming
 *
 * Problem:
 * Build an immutable class (final fields, no setters, defensive copies),
 * show unmodifiable views vs true immutability, and transform collections
 * functionally (create new lists instead of mutating).
 *
 * Hint:
 * - Immutability recipe: final class, final fields, no setters, defensive copies
 * - Collections.unmodifiableList(list) is a VIEW - the backing list can still change!
 * - List.of() and List.copyOf() are truly immutable
 * - Functional update: list.stream()...toList() returns a NEW list
 *
 * Expected Output:
 * Unmodifiable view reflects backing list change: true  <- leak!
 * List.of is truly immutable: threw UnsupportedOperationException
 * Transformation returns NEW list: [A, B, C] (original untouched)
 *
 * TODO:
 * 1. Create a mutable list, wrap it unmodifiable, mutate the BACKING list, observe the view change
 * 2. Show List.of throwing UnsupportedOperationException on add
 * 3. Build an immutable Money record-like class (amount) with a 'plus' method returning new instance
 * 4. Transform a list into a new list instead of sorting in place
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 75: Immutable Programming ===");
        System.out.println("Source: " + List.of("a", "b"));
    }
}