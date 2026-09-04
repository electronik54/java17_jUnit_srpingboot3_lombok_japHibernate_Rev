package com.electronik54.revision_3.corejava.ch222_garbage_collection.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 222: Advanced Garbage Collection ===\n");
        System.out.println("G1GC tuning: -XX:G1HeapRegionSize=4m, -XX:InitiatingHeapOccupancyPercent=45");
        System.out.println("ZGC: -XX:+UseZGC -XX:ZAllocationSpikeTolerance=2.0");
        System.out.println("GC log analysis: gc.log -> GCViewer, gceasy.io");
        System.out.println("Concurrent marking: G1 marks live objects concurrently with application");
        System.out.println("Young GC: Minor GC (eden -> survivor -> old)");
        System.out.println("Full GC: Major GC (entire heap, stop-the-world, avoid this)");
    }
}