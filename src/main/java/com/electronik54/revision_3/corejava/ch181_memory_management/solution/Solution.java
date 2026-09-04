package com.electronik54.revision_3.corejava.ch181_memory_management.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 181: Memory Management ===\n");
        System.out.println("Heap: Objects, arrays (managed by GC)");
        System.out.println("Stack: Method calls, local primitives, references");
        System.out.println("Metaspace: Class metadata (replaced PermGen in Java 8)");
        System.out.println("String pool: Literal strings cached in heap");
        System.out.println("References: Strong > Soft > Weak > Phantom");
        System.out.println("Memory leak: Objects reachable but no longer used (e.g. static HashMap growing unbounded)");
    }
}