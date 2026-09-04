package com.electronik54.revision_3.corejava.ch80_wait_notify;

/**
 * Challenge 80: wait(), notify(), notifyAll() (Producer-Consumer)
 *
 * Problem:
 * Build a classic single-slot producer-consumer: the producer waits when
 * the slot is full, the consumer waits when it's empty, and each notifies
 * the other after working. Use the WAIT loop idiom (while, not if).
 *
 * Hint:
 * - wait()/notify() must be called INSIDE a synchronized block on the SAME lock object
 * - Always wait in a while-loop: guards against spurious wakeups
 * - wait() RELEASES the lock (sleep() does not)
 * - notify() wakes one waiter; notifyAll() wakes all (usually safer)
 *
 * Expected Output:
 * Produced: item-1 / Consumed: item-1
 * Produced: item-2 / Consumed: item-2
 * ... (order interleaved, no lost items)
 *
 * TODO:
 * 1. SingleSlotBuffer with take() and put(String) synchronized methods
 * 2. take() waits while empty; put() waits while full
 * 3. After put/take, call notifyAll()
 * 4. Producer thread puts 5 items; consumer thread takes 5 items
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 80: wait/notify ===");
    }
}