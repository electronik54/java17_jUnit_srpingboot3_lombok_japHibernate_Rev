package com.electronik54.revision_3.corejava.ch78_thread_methods;

/**
 * Challenge 78: Thread Methods (start, run, join, sleep, yield, interrupt)
 *
 * Problem:
 * Exercise the core Thread methods: sleep() (pauses), join(timeout),
 * interrupt() (cooperative cancellation via isInterrupted), and observe
 * that calling run() directly does NOT create a new thread.
 *
 * Hint:
 * - interrupt() sets a flag; sleeping threads get InterruptedException - it is COOPERATIVE
 * - Thread.sleep does NOT release locks; wait() does
 * - start() allocates a new thread; run() is just a method call
 *
 * Expected Output:
 * run() directly executed on: main   <- no new thread!
 * Sleepy thread interrupted: true
 * Worker finished before/after timeout
 *
 * TODO:
 * 1. Call run() on a Thread object and print the current thread name (main!)
 * 2. Start a sleeping thread, interrupt it, catch InterruptedException in run()
 * 3. join(500) with a timeout and check isAlive() after
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 78: Thread Methods ===");
    }
}