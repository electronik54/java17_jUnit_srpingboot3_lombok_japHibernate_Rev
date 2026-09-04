package com.electronik54.revision_3.corejava.ch84_concurrent_collections.solution;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Solution for Challenge 84: Concurrent Collections
 *
 * Demonstrates: ConcurrentHashMap atomics, CopyOnWriteArrayList snapshot
 * iteration, and BlockingQueue producer-consumer.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        // 1. ConcurrentHashMap atomic updates from 2 threads
        ConcurrentHashMap<String, Integer> counts = new ConcurrentHashMap<>();
        Runnable addWords = () -> {
            for (String w : new String[]{"a", "b", "a"}) {
                counts.merge(w, 1, Integer::sum);      // atomic per key
            }
        };
        Thread t1 = new Thread(addWords);
        Thread t2 = new Thread(addWords);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Concurrent map word counts: " + counts);

        // 2. CopyOnWriteArrayList - safe iteration during modification
        CopyOnWriteArrayList<String> cow = new CopyOnWriteArrayList<>(new String[]{"x", "y"});
        Thread modifier = new Thread(() -> cow.add("z"));
        modifier.start();
        Iterator<String> it = cow.iterator();          // snapshot of current state
        StringBuilder seen = new StringBuilder("[");
        while (it.hasNext()) {
            seen.append(it.next());
            if (it.hasNext()) {
                seen.append(", ");
            }
        }
        modifier.join();
        System.out.println("CopyOnWrite snapshot iteration safe: " + seen + "]  (now: " + cow + ")");

        // 3. BlockingQueue - blocking producer/consumer, no wait/notify needed
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    queue.put("item-" + i);            // blocks when full
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    String item = queue.poll(1, TimeUnit.SECONDS);   // blocks when empty
                    if (item != null) {
                        System.out.println("  took " + item);
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("BlockingQueue: produced 3, consumed 3");
    }
}