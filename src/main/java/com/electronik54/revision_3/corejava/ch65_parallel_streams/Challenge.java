package com.electronik54.revision_3.corejava.ch65_parallel_streams;

import java.util.List;

/**
 * Challenge 65: Parallel Streams
 *
 * Problem:
 * Use parallelStream() and .parallel(): observe which thread pool runs the
 * work (ForkJoinPool.commonPool), compare sequential vs parallel timing,
 * and see why forEach ordering is not guaranteed in parallel.
 *
 * Hint:
 * - Parallel streams split the source into chunks processed by ForkJoinPool.commonPool
 * - Good for: large datasets, stateless+independent ops, cheap splitting (ArrayList)
 * - BAD for: small data, shared mutable state, order-dependent work, I/O
 * - Default pool size = CPU cores - 1
 *
 * Expected Output (example):
 * Threads used include: main, ForkJoinPool.commonPool-worker-1, ...
 * Sequential sum: 4999995000 in X ms
 * Parallel sum:   4999995000 in Y ms (often faster for big data)
 * Parallel forEach order differs from encounter order!
 *
 * TODO:
 * 1. Run a parallel stream and print the current thread name per element
 * 2. Time sum over 1..10_000_000 sequential vs parallel
 * 3. Show forEach vs forEachOrdered on a parallel stream
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 65: Parallel Streams ===");
        System.out.println("CPU cores: " + Runtime.getRuntime().availableProcessors());
    }
}