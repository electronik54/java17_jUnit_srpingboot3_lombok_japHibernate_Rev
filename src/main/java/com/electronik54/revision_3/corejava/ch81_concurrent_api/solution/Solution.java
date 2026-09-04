package com.electronik54.revision_3.corejava.ch81_concurrent_api.solution;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Solution for Challenge 81: Concurrency Utilities
 *
 * Demonstrates: CountDownLatch, CyclicBarrier, Semaphore.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        // 1. CountDownLatch - main waits for 3 workers
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                try {
                    Thread.sleep(id * 30);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                latch.countDown();
            }, "worker-" + i).start();
        }
        latch.await();
        System.out.println("All workers ready -> latch released");

        // 2. CyclicBarrier - 3 threads rendezvous before proceeding
        CyclicBarrier barrier = new CyclicBarrier(3,
                () -> System.out.println("All 3 threads reached the barrier"));
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                try {
                    barrier.await();
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            }, "barrier-" + i).start();
        }
        Thread.sleep(100);

        // 3. Semaphore - max 2 concurrent sections
        Semaphore semaphore = new Semaphore(2);
        AtomicInteger current = new AtomicInteger();
        AtomicInteger maxObserved = new AtomicInteger();
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    int now = current.incrementAndGet();
                    maxObserved.accumulateAndGet(now, Math::max);
                    Thread.sleep(50);
                    current.decrementAndGet();
                    semaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }
        Thread.sleep(300);
        System.out.println("Semaphore allowed max concurrent = " + maxObserved.get() + " (limit 2)");
    }
}