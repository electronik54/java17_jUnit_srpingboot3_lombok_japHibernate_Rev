package com.electronik54.revision_3.corejava.ch79_synchronization.solution;

/** Thread-safe via the object monitor (synchronized). */
public class SafeCounter {
    private int count;

    public synchronized void increment() {
        count++;               // only one thread inside at a time
    }

    public synchronized int getCount() {
        return count;
    }
}