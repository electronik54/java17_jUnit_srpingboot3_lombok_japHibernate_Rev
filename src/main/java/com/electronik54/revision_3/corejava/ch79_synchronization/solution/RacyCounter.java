package com.electronik54.revision_3.corejava.ch79_synchronization.solution;

/** NOT thread-safe: count++ interleaves between threads. */
public class RacyCounter {
    private int count;

    public void increment() {
        count++;               // read + add + write = 3 separate steps
    }

    public int getCount() {
        return count;
    }
}