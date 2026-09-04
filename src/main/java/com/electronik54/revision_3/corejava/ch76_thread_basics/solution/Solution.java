package com.electronik54.revision_3.corejava.ch76_thread_basics.solution;

/**
 * Solution for Challenge 76: Thread Basics
 *
 * Demonstrates: Thread subclass, Runnable, lambda Runnable, start vs run, join.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        // 1. Extend Thread
        Thread t1 = new MyThread();

        // 2. Implement Runnable
        Thread t2 = new Thread(new MyRunnable(), "my-runnable");

        // 3. Lambda Runnable
        Thread t3 = new Thread(() ->
                System.out.println("lambda-worker ran on " + Thread.currentThread().getName()), "lambda-worker");

        t1.start();
        t2.start();
        t3.start();

        // start() vs run() - run() would execute on the CURRENT thread, no new thread!
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Main waited for all threads to finish");
    }
}