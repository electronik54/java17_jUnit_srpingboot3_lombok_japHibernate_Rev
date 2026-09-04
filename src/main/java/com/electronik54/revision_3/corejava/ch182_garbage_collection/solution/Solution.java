package com.electronik54.revision_3.corejava.ch182_garbage_collection.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 182: Garbage Collection ===\n");
        System.out.println("Serial: Single-thread, young+old gen, stop-the-world");
        System.out.println("Parallel: Multi-thread, throughput-oriented (default in Java 8)");
        System.out.println("G1GC: Default in Java 17, region-based, low pause time target");
        System.out.println("ZGC: Sub-millisecond pauses, concurrent, handles up to 16TB heaps");
        System.out.println("Shenandoah: Concurrent compaction, low pauses, similar to ZGC");
        System.out.println("\nJVM flags: -XX:+UseZGC -XX:MaxGCPauseMillis=100");
    }
}