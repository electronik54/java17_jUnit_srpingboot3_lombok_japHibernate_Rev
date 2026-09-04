package com.electronik54.revision_3.corejava.ch60_stream_reduce.solution;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Solution for Challenge 60: Stream reduce
 *
 * Demonstrates: all three reduce variants and specialized reductions.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // 1. With identity
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum with identity: " + sum);

        // 2. Without identity -> Optional
        Optional<Integer> sumOpt = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum without identity: " + sumOpt);

        // 3. Product
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // 4. Max via reduce and via max()
        Optional<Integer> maxReduce = numbers.stream().reduce(Integer::max);
        Optional<Integer> maxBuiltIn = numbers.stream().max(Comparator.naturalOrder());
        System.out.println("Max: " + maxReduce + " / " + maxBuiltIn);

        // 5. Parallel-safe: combiner merges partial sums
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum, Integer::sum);
        System.out.println("Parallel-safe sum: " + parallelSum);
    }
}