package com.electronik54.revision_3.corejava.ch224_profiling_tools.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 224: Advanced Profiling ===\n");
        System.out.println("JFR: -XX:StartFlightRecording=filename=recording.jfr,duration=60s");
        System.out.println("async-profiler: ./profiler.sh -e cpu -d 30 -f flamegraph.html <pid>");
        System.out.println("Flame graph: X-axis = call stack, Y-axis = stack depth, width = time");
        System.out.println("Heap dump: jmap -dump:format=b,file=heap.hprof <pid>");
        System.out.println("Eclipse MAT: Leak Suspects Report, Dominator Tree, Path to GC Roots");
        System.out.println("JMH: Java Microbenchmark Harness for performance testing");
    }
}