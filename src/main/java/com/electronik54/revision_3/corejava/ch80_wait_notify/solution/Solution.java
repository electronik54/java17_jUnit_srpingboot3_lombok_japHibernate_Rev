package com.electronik54.revision_3.corejava.ch80_wait_notify.solution;

/**
 * Solution for Challenge 80: wait/notify
 *
 * Demonstrates: the classic producer-consumer with wait/notifyAll.
 */
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        SingleSlotBuffer buffer = new SingleSlotBuffer();
        final int items = 5;

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= items; i++) {
                    String item = "item-" + i;
                    buffer.put(item);
                    System.out.println("Produced: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= items; i++) {
                    String item = buffer.take();
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "consumer");

        producer.start();
        Thread.sleep(50);            // let the consumer start waiting first
        consumer.start();

        producer.join();
        consumer.join();
        System.out.println("Done - no items lost, no busy waiting");
    }
}