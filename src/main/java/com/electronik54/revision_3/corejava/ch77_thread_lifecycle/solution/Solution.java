package com.electronik54.revision_3.corejava.ch77_thread_lifecycle.solution;

/**
 * Solution for Challenge 77: Thread Lifecycle
 *
 * Demonstrates: NEW, RUNNABLE, TIMED_WAITING, TERMINATED snapshots.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(200);                    // TIMED_WAITING while here
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "worker");

        System.out.println("Before start: " + worker.getState());      // NEW

        worker.start();
        System.out.println("Right after start: " + worker.getState()); // RUNNABLE (usually)

        Thread.sleep(50);                          // give worker time to enter sleep
        System.out.println("While sleeping: " + worker.getState());    // TIMED_WAITING

        worker.join();
        System.out.println("After join: " + worker.getState());        // TERMINATED
    }
}