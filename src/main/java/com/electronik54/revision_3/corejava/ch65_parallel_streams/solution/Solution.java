package com.electronik54.revision_3.corejava.ch65_parallel_streams.solution;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Solution for Challenge 65: Parallel Streams
 *
 * Demonstrates: ForkJoinPool workers, sequential vs parallel timing,
 * and ordering semantics.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Which threads run the work?
        System.out.print("Threads: ");
        IntStream.rangeClosed(1, 8).parallel()
                .forEach(n -> System.out.print(Thread.currentThread().getName() + " "));
        System.out.println();

        // 2. Timing comparison (stateless, independent, splittable source = good case)
        long t1 = System.nanoTime();
        long seqSum = IntStream.rangeClosed(1, 10_000_000).asLongStream().sum();
        long seqTime = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        long parSum = IntStream.rangeClosed(1, 10_000_000).parallel().asLongStream().sum();
        long parTime = System.nanoTime() - t2;

        System.out.println("Sequential sum: " + seqSum + " in " + seqTime / 1_000_000 + " ms");
        System.out.println("Parallel sum:   " + parSum + " in " + parTime / 1_000_000 + " ms");

        // 3. Ordering: forEach unordered, forEachOrdered restores encounter order
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        System.out.print("Parallel forEach (unordered): ");
        numbers.parallelStream().limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.print("Parallel forEachOrdered: ");
        numbers.parallelStream().limit(5).forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();

        // Bad case: shared mutable state (WRONG - do not do this)
        int[] broken = {0};
        numbers.parallelStream().forEach(n -> broken[0] += n);   // race condition!
        System.out.println("Shared-state sum (racy, likely WRONG): " + broken[0] + " vs correct 210");
    }
}