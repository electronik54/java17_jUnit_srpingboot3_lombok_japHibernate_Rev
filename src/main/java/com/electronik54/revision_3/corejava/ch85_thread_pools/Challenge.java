package com.electronik54.revision_3.corejava.ch85_thread_pools;

/**
 * Challenge 85: Thread Pools (Fixed, Cached, Single, Scheduled)
 *
 * Problem:
 * Compare the main ExecutorService factories: newFixedThreadPool (bounded
 * workers), newCachedThreadPool (grows, reuses idle), newSingleThreadExecutor
 * (ordered execution), and newScheduledThreadPool (delayed/periodic tasks).
 *
 * Hint:
 * - Fixed: bounded threads, unbounded queue - the safe default for CPU work
 * - Cached: creates threads on demand, kills idle ones after 60s - risk of thread explosion
 * - Single: ONE worker guarantees sequential execution
 * - Scheduled: schedule() delays, scheduleAtFixedRate() repeats
 *
 * Expected Output:
 * Fixed pool: 4 tasks on 2 threads
 * Single thread executor ran tasks in submission order
 * Scheduled task ran after ~200ms delay
 *
 * TODO:
 * 1. Fixed pool of 2: submit 4 tasks printing thread names; note thread reuse
 * 2. Single-thread executor: submit 3 tasks, observe order
 * 3. Scheduled pool: run a task after 200ms delay
 * 4. Always shut down pools
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 85: Thread Pools ===");
    }
}