package com.electronik54.revision_3.corejava.ch78_thread_methods.solution;

/**
 * Solution for Challenge 78: Thread Methods
 *
 * Demonstrates: start vs run, sleep, interrupt (cooperative), join with timeout.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        // 1. run() directly - executes on the CALLER thread (main), no new thread
        Thread direct = new Thread(() ->
                System.out.println("run() directly executed on: "
                        + Thread.currentThread().getName()));
        direct.run();          // NOT start()!

        // 2. interrupt a sleeping thread
        Thread sleepy = new Thread(() -> {
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                // interruption is cooperative: clean up and exit
                System.out.println("Sleepy thread interrupted: " + Thread.currentThread().isInterrupted());
            }
        }, "sleepy");
        sleepy.start();
        Thread.sleep(50);
        sleepy.interrupt();
        sleepy.join();

        // 3. join with timeout
        Thread quick = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "quick");
        quick.start();
        quick.join(500);                       // waits at most 500ms
        System.out.println("Worker finished, isAlive after join: " + quick.isAlive());
    }
}