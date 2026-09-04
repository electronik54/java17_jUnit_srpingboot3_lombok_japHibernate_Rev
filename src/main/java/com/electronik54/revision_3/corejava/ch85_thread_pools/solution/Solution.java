package com.electronik54.revision_3.corejava.ch85_thread_pools.solution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Solution for Challenge 85: Thread Pools
 *
 * Demonstrates: fixed, single-thread, cached, and scheduled pools.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        // 1. Fixed pool - bounded workers, tasks queue up
        ExecutorService fixed = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 4; i++) {
            final int id = i;
            fixed.submit(() -> System.out.println("Fixed pool task " + id
                    + " on " + Thread.currentThread().getName()));
        }
        fixed.shutdown();
        fixed.awaitTermination(5, TimeUnit.SECONDS);

        // 2. Single-thread executor - strict ordering
        ExecutorService single = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            single.submit(() -> System.out.println("Single executor sequential task " + id));
        }
        single.shutdown();
        single.awaitTermination(5, TimeUnit.SECONDS);

        // 3. Cached pool - creates threads on demand
        ExecutorService cached = Executors.newCachedThreadPool();
        cached.submit(() -> System.out.println("Cached pool task on " + Thread.currentThread().getName()));
        cached.shutdown();
        cached.awaitTermination(5, TimeUnit.SECONDS);

        // 4. Scheduled pool - delayed task
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        long start = System.nanoTime();
        scheduler.schedule(() ->
                        System.out.println("Scheduled task ran after ~"
                                + (System.nanoTime() - start) / 1_000_000 + "ms delay"),
                200, TimeUnit.MILLISECONDS);
        scheduler.shutdown();
        scheduler.awaitTermination(5, TimeUnit.SECONDS);
    }
}