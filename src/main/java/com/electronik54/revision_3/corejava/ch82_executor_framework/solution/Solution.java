package com.electronik54.revision_3.corejava.ch82_executor_framework.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Solution for Challenge 82: Executor Framework
 *
 * Demonstrates: Runnable vs Callable, Future.get, result collection,
 * and orderly shutdown.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 1. execute(Runnable) - fire and forget
        pool.execute(() -> System.out.println("Runnable executed"));

        // 2. submit(Callable) -> Future
        Future<Integer> sum = pool.submit(() -> {
            int total = 0;
            for (int i = 1; i <= 10; i++) {
                total += i;
            }
            return total;
        });
        System.out.println("Callable result: " + sum.get());

        // 3. Multiple futures
        List<Future<Integer>> futures = new ArrayList<>();
        for (int n : new int[]{10, 20, 30}) {
            futures.add(pool.submit(() -> n * n));
        }
        List<Integer> squares = new ArrayList<>();
        for (Future<Integer> f : futures) {
            squares.add(f.get());
        }
        System.out.println("Squares: " + squares);

        // 4. Orderly shutdown
        pool.shutdown();
        boolean terminated = pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Pool shut down cleanly: " + terminated);
    }
}