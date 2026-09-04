package com.electronik54.revision_3.corejava.ch79_synchronization.solution;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Solution for Challenge 79: Synchronization
 *
 * Demonstrates: race condition, synchronized fix, atomic fix.
 */
public class Solution {

    private static void runTwoThreads(Runnable task) throws InterruptedException {
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        final int iterations = 10_000;

        // 1. RACY - result is likely less than 20000
        RacyCounter racy = new RacyCounter();
        runTwoThreads(() -> {
            for (int i = 0; i < iterations; i++) {
                racy.increment();
            }
        });
        System.out.println("Racy result (expected 20000): " + racy.getCount());

        // 2. synchronized - correct
        SafeCounter safe = new SafeCounter();
        runTwoThreads(() -> {
            for (int i = 0; i < iterations; i++) {
                safe.increment();
            }
        });
        System.out.println("Synchronized result (expected 20000): " + safe.getCount());

        // 3. atomic - correct, lock-free
        AtomicLong atomic = new AtomicLong();
        runTwoThreads(() -> {
            for (int i = 0; i < iterations; i++) {
                atomic.incrementAndGet();
            }
        });
        System.out.println("Atomic result (expected 20000): " + atomic.get());
    }
}