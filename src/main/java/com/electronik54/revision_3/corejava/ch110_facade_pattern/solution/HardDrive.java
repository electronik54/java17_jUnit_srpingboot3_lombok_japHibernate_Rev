package com.electronik54.revision_3.corejava.ch110_facade_pattern.solution;

/** Subsystem component. */
public class HardDrive {
    public void read() {
        System.out.println("HardDrive reading");
    }

    public void close() {
        System.out.println("HardDrive closed");
    }
}