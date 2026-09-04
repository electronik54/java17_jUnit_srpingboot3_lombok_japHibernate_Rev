package com.electronik54.revision_3.corejava.ch84_concurrent_collections;

import java.util.Map;

/**
 * Challenge 84: Concurrent Collections
 *
 * Problem:
 * Use ConcurrentHashMap (atomic putIfAbsent/compute, no lock on reads),
 * CopyOnWriteArrayList (snapshot iteration, cheap reads, costly writes),
 * and ArrayBlockingQueue (blocking producer-consumer without wait/notify).
 *
 * Hint:
 * - ConcurrentHashMap: thread-safe WITHOUT synchronizing the whole map; never locks reads
 * - CopyOnWriteArrayList: copies the array on EVERY write - great for read-heavy, rarely-changing data
 * - BlockingQueue.put/take block automatically - no manual wait/notify needed
 *
 * Expected Output:
 * Concurrent map word counts: {a=2, b=1}
 * CopyOnWrite snapshot iteration safe: [x, y]
 * BlockingQueue: produced 3, consumed 3
 *
 * TODO:
 * 1. Merge word counts into a ConcurrentHashMap from 2 threads
 * 2. Iterate a CopyOnWriteArrayList while another thread adds to it
 * 3. Producer/consumer over an ArrayBlockingQueue(2)
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 84: Concurrent Collections ===");
        System.out.println("Sample map: " + Map.of("a", 1));
    }
}