package com.electronik54.revision_3.corejava.ch66_stream_performance;

import java.util.List;

/**
 * Challenge 66: Stream Performance (lazy evaluation, short-circuiting)
 *
 * Problem:
 * Prove lazy evaluation: expensive operations never run when a
 * short-circuit terminal (findFirst/limit/anyMatch) ends the pipeline
 * early. Compare the cost of ordered vs unordered streams and see how
 * filter-then-map beats map-then-filter.
 *
 * Hint:
 * - Each element moves through the WHOLE pipeline one at a time (vertical processing)
 * - Short-circuit ops (findFirst, anyMatch, limit) stop pulling elements early
 * - Filtering EARLY reduces work for downstream operations
 * - unordered() can speed up limit() on parallel streams
 *
 * Expected Output:
 * Expensive op executed only 1 time(s) before findFirst stopped
 * map-then-filter processed 6 elements; filter-then-map processed 3
 * anyMatch stopped at element: 3
 *
 * TODO:
 * 1. Count invocations of an expensive map over 1..100 with findFirst - observe it stops early
 * 2. Compare element counts processed by map-then-filter vs filter-then-map
 * 3. Show anyMatch short-circuiting with a peek
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 66: Stream Performance ===");
        System.out.println("Source: 1..100 with short-circuit terminal");
    }
}