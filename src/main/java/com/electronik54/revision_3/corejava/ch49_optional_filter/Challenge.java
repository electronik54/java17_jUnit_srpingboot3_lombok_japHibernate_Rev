package com.electronik54.revision_3.corejava.ch49_optional_filter;

import java.util.Optional;

/**
 * Challenge 49: Optional filter()
 *
 * Problem:
 * Validate values inside an Optional with filter(): keep only strings
 * longer than 3 chars, only even numbers, and chain filter + map for a
 * conditional transformation pipeline.
 *
 * Hint:
 * - filter(predicate) returns the SAME optional if the test passes, empty otherwise
 * - filter on an empty Optional is a no-op (stays empty)
 * - Chaining: optional.filter(...).map(...) replaces nested if-checks
 *
 * Expected Output:
 * filter("Hello", len>3): Optional[Hello]
 * filter("Hi", len>3): Optional.empty
 * filter(4, even): Optional[4] -> mapped: Optional[8]
 * filter(3, even): Optional.empty
 * filter on empty is a no-op: Optional.empty
 *
 * TODO:
 * 1. filter a string by length and print both a passing and failing case
 * 2. filter an even number, then map it (double it)
 * 3. Show filter on an already-empty Optional stays empty
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 49: Optional filter ===");
        System.out.println("Sample: " + Optional.of("Hello").filter(s -> s.length() > 3));
    }
}