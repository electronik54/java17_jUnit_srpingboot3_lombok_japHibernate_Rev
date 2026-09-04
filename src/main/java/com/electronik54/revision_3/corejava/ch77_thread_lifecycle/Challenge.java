package com.electronik54.revision_3.corejava.ch77_thread_lifecycle;

/**
 * Challenge 77: Thread Lifecycle
 *
 * Problem:
 * Observe thread states: NEW before start(), RUNNABLE while executing,
 * TIMED_WAITING during sleep(), WAITING during join(), and TERMINATED
 * after finishing. Print getState() at each stage.
 *
 * Hint:
 * - NEW -> start() -> RUNNABLE -> (sleep: TIMED_WAITING) -> ... -> TERMINATED
 * - BLOCKED: waiting for a monitor lock; WAITING: wait()/join() no timeout
 * - getState() is a snapshot - timing matters!
 *
 * Expected Output:
 * Before start: NEW
 * While sleeping: TIMED_WAITING
 * After join: TERMINATED
 * Main during join of sleeping thread: WAITING or RUNNABLE
 *
 * TODO:
 * 1. Create a thread, print its state (NEW)
 * 2. Start it; inside run() sleep 200ms; from main, print state (TIMED_WAITING)
 * 3. join() and print final state (TERMINATED)
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 77: Thread Lifecycle ===");
    }
}