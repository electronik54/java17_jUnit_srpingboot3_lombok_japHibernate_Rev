package com.electronik54.revision_3.corejava.ch79_synchronization;

/**
 * Challenge 79: Synchronization
 *
 * Problem:
 * Show a race condition: two threads increment an unsynchronized counter
 * 10,000 times each (wrong result!), then fix it with a synchronized
 * method, then with an AtomicLong, and compare.
 *
 * Hint:
 * - count++ is three operations (read, add, write) - threads interleave
 * - synchronized = mutual exclusion via the object's monitor/lock
 * - AtomicLong uses lock-free CAS - usually faster than synchronized
 *
 * Expected Output (counts may vary):
 * Racy result (expected 20000): 12345
 * Synchronized result (expected 20000): 20000
 * Atomic result (expected 20000): 20000
 *
 * TODO:
 * 1. RacyCounter with plain int increment; run 2 threads x 10,000 increments
 * 2. SafeCounter with synchronized increment; rerun
 * 3. AtomicCounter with AtomicLong.incrementAndGet(); rerun
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 79: Synchronization ===");
    }
}