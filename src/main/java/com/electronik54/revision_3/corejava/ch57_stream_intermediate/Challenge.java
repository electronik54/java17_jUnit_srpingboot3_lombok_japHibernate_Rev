package com.electronik54.revision_3.corejava.ch57_stream_intermediate;

import java.util.List;

/**
 * Challenge 57: Intermediate Operations (distinct, sorted, limit, skip, peek)
 *
 * Problem:
 * Master the remaining intermediate ops: distinct(), sorted() with and
 * without Comparator, limit()/skip() for paging, and peek() for observing
 * the pipeline without changing it.
 *
 * Hint:
 * - sorted() natural order; sorted(Comparator) custom order; .reversed() flips
 * - skip(n).limit(m) = page m items starting at position n
 * - peek is for DEBUGGING - side effects in it are not recommended in production
 * - limit() on an infinite stream makes it finite (short-circuits)
 *
 * Expected Output:
 * Sorted desc: [6, 5, 4, 3, 2, 1]
 * Page 2 (skip 2 limit 2): [3, 4]
 * Peeking element: 10 / 20 / 30 -> result [10, 20, 30]
 *
 * TODO:
 * 1. Sort numbers descending with a Comparator
 * 2. skip(2).limit(2) to take a "page" from sorted data
 * 3. Use peek to log elements passing through a pipeline
 * 4. Combine distinct + sorted on duplicates
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 57: Intermediate Operations ===");
        System.out.println("Source: " + List.of(3, 1, 2, 6, 4, 5));
    }
}