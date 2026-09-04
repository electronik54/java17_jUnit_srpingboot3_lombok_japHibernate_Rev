package com.electronik54.revision_3.corejava.ch183_jvm_tuning.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 183: JVM Tuning ===\n");
        System.out.println("Heap sizing: -Xms512m (initial) -Xmx4g (maximum)");
        System.out.println("Young gen: -Xmn256m or -XX:NewRatio=2 (old:young = 2:1)");
        System.out.println("Metaspace: -XX:MaxMetaspaceSize=256m");
        System.out.println("GC tuning: -XX:MaxGCPauseMillis=200 -XX:GCTimeRatio=9");
        System.out.println("Thread stack: -Xss1m (default, reduce for many threads)");
        System.out.println("GC logging: -Xlog:gc*:file=gc.log");
        System.out.println("\nExample: java -Xms512m -Xmx2g -XX:+UseZGC -jar app.jar");
    }
}