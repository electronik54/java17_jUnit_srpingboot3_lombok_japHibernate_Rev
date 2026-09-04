package com.electronik54.revision_3.corejava.ch55_stream_filter;

import java.util.List;

/**
 * Challenge 55: Stream filter()
 *
 * Problem:
 * Filter with simple and compound predicates: evens, strings starting
 * with a letter, combined conditions with predicate.and()/or(), and
 * distinct after filtering.
 *
 * Hint:
 * - filter takes a Predicate<T>: one boolean test per element
 * - Combine predicates: p1.and(p2), p1.or(p2), p1.negate() - reusable logic!
 * - filter chains compose: .filter(a).filter(b) == .filter(a && b)
 *
 * Expected Output:
 * Evens: [2, 4, 6]
 * Starts with 'a' and length>2: [apple, avocado]
 * Combined via predicate and(): [2, 4]
 * Distinct evens: [2, 4, 6]
 *
 * TODO:
 * 1. Filter evens from 1..6
 * 2. Filter strings starting with 'a' AND length > 2
 * 3. Build reusable Predicates and combine with .and()
 * 4. Add duplicates and apply distinct after filtering
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 55: Stream filter ===");
        System.out.println("Source: " + List.of(1, 2, 3, 4, 5, 6));
    }
}