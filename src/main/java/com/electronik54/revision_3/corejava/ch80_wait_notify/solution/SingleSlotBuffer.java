package com.electronik54.revision_3.corejava.ch80_wait_notify.solution;

/**
 * Single-slot buffer for the producer-consumer pattern using wait/notify.
 */
public class SingleSlotBuffer {

    private String slot;
    private boolean full = false;

    public synchronized String take() throws InterruptedException {
        while (!full) {              // while-loop idiom, never if
            wait();                  // releases the lock and sleeps
        }
        full = false;
        String item = slot;
        slot = null;
        notifyAll();                 // wake the producer
        return item;
    }

    public synchronized void put(String item) throws InterruptedException {
        while (full) {
            wait();
        }
        slot = item;
        full = true;
        notifyAll();                 // wake the consumer
    }
}