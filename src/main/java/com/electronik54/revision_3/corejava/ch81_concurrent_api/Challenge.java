package com.electronik54.revision_3.corejava.ch81_concurrent_api;

/**
 * Challenge 81: Concurrency Utilities (CountDownLatch, CyclicBarrier, Semaphore)
 *
 * Problem:
 * Coordinate threads with CountDownLatch (one-shot gate), CyclicBarrier
 * (reusable rendezvous), and Semaphore (limit concurrent access to 2).
 *
 * Hint:
 * - CountDownLatch: await() blocks until count reaches 0 - NOT reusable
 * - CyclicBarrier: parties wait for each other; reusable, optional barrier action
 * - Semaphore(n): at most n permits - a thread pool / resource limiter
 *
 * Expected Output:
 * All workers ready -> latch released
 * All 3 threads reached the barrier
 * Semaphore allowed 2 concurrent at a time: max observed = 2
 *
 * TODO:
 * 1. Start 3 worker threads; main waits on a CountDownLatch they count down
 * 2. Make 3 threads wait at a CyclicBarrier before proceeding
 * 3. Acquire/Release a Semaphore(2) and track max concurrent inside the section
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 81: Concurrent API ===");
    }
}