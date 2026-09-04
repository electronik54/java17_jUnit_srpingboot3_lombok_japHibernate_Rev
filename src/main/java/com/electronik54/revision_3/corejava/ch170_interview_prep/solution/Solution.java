package com.electronik54.revision_3.corejava.ch170_interview_prep.solution;

/**
 * Solution 170: Performance Optimization
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 170: Performance Optimization ===\n");
        System.out.println("JVM Memory Model:");
        System.out.println("  Heap (-Xms, -Xmx): Objects, arrays");
        System.out.println("  Stack (-Xss): Method calls, local primitives");
        System.out.println("  Metaspace: Class metadata (unbounded)");
        System.out.println("\nGC Algorithms:");
        System.out.println("  G1GC: Default, low pause time, region-based");
        System.out.println("  ZGC: Sub-millisecond pauses, large heaps");
        System.out.println("  Shenandoah: Concurrent compaction");
        System.out.println("\nCommon fixes:");
        System.out.println("  String+ in loop → StringBuilder");
        System.out.println("  HashMap without bounds → WeakHashMap / cache with TTL");
        System.out.println("  Wide synchronized → ReadWriteLock / Concurrent collections");
        System.out.println("  N+1 queries → JOIN FETCH / batch fetch");
        System.out.println("\nJVM flags: -Xms512m -Xmx2g -XX:+UseZGC -XX:MaxGCPauseMillis=100");
    }
}