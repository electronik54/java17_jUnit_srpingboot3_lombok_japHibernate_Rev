package com.electronik54.revision_3.corejava.ch76_thread_basics;

/**
 * Challenge 76: Thread Basics
 *
 * Problem:
 * Create threads three ways: extend Thread, implement Runnable (preferred),
 * and use a lambda Runnable. Start each, print names, and use join() to
 * wait for completion.
 *
 * Hint:
 * - call start(), NEVER run() directly - run() executes on the CURRENT thread
 * - Runnable is preferred: separates the task from the thread; a class can still extend something
 * - join() blocks the caller until the target thread dies
 *
 * Expected Output (interleaving may vary):
 * Thread-0 / my-runnable / lambda-worker all ran
 * Main waited for all threads to finish
 *
 * TODO:
 * 1. Extend Thread, override run(), start it
 * 2. Implement Runnable, pass to a Thread, start it
 * 3. Pass a lambda Runnable to a Thread, start it
 * 4. join() all three from main
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 76: Thread Basics ===");
    }
}