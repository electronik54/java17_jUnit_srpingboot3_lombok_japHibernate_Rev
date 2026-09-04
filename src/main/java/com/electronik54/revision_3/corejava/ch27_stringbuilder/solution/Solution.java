package com.electronik54.revision_3.corejava.ch27_stringbuilder.solution;

/**
 * Solution for Challenge 27: StringBuilder and StringBuffer
 *
 * Demonstrates: why StringBuilder beats String concatenation in loops,
 * and the core StringBuilder mutation methods.
 */
public class Solution {

    public static void main(String[] args) {
        int rows = 10_000;

        long t1 = System.nanoTime();
        String viaConcat = "";
        for (int i = 0; i < rows; i++) {
            viaConcat += "row" + i + (i < rows - 1 ? "," : "");
        }
        long timeConcat = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("row").append(i);
            if (i < rows - 1) {
                sb.append(',');
            }
        }
        String viaBuilder = sb.toString();
        long timeBuilder = System.nanoTime() - t2;

        System.out.println("Both outputs match: " + viaConcat.equals(viaBuilder));
        System.out.printf("String concat: %,d ns | StringBuilder: %,d ns%n", timeConcat, timeBuilder);

        // Core mutation methods
        StringBuilder demo = new StringBuilder("Hello World");
        demo.insert(5, "-");                    // Hello-- World? -> "Hello- World"
        demo.replace(6, 11, "World!");          // "Hello-World!"
        demo.reverse();                          // reversed
        demo.reverse();                          // back
        demo.deleteCharAt(demo.indexOf("-"));    // remove the '-'
        demo.insert(0, "X-");                    // "X-Hello-World!"
        System.out.println("insert/replace/reverse/delete demo: [" + demo + "]");

        // StringBuffer: same API, synchronized methods
        StringBuffer threadSafe = new StringBuffer("safe");
        threadSafe.append(" for threads");
        System.out.println("StringBuffer: " + threadSafe);
    }
}