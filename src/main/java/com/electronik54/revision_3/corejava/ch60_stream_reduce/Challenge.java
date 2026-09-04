package com.electronik54.revision_3.corejava.ch60_stream_reduce;

import java.util.List;

/**
 * Challenge 60: Stream reduce()
 *
 * Problem:
 * Fold a stream into one value with the three reduce variants: with
 * identity, without identity (returns Optional), and the 3-arg version
 * for parallel-safe accumulation. Also use max/min via reduce thinking.
 *
 * Hint:
 * - reduce(identity, accumulator): folds left; identity is the seed
 * - reduce(accumulator): returns Optional - empty for an empty stream
 * - reduce(identity, accumulator, combiner): the combiner merges partial results in parallel
 * - min/max/count are specialized reductions
 *
 * Expected Output:
 * Sum with identity: 15
 * Sum without identity: Optional[15]
 * Product: 120
 * Max: Optional[5]
 * Parallel-safe sum: 15
 *
 * TODO:
 * 1. Sum 1..5 with identity 0
 * 2. Sum without identity -> Optional
 * 3. Multiply 1..5 with identity 1
 * 4. Find max with reduce and with max()
 * 5. Three-arg reduce on a parallel stream
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 60: Stream reduce ===");
        System.out.println("Source: " + List.of(1, 2, 3, 4, 5));
    }
}