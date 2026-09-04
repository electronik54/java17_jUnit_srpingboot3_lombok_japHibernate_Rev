package com.electronik54.revision_3.corejava.ch27_stringbuilder;

/**
 * Challenge 27: StringBuilder and StringBuffer
 *
 * Problem:
 * Build a CSV string for 10,000 rows two ways - with String concatenation
 * and with StringBuilder - and compare. Then demonstrate key StringBuilder
 * methods (append, insert, replace, reverse, delete).
 *
 * Hint:
 * - String += creates a new object each time: O(n^2) in a loop
 * - StringBuilder is mutable, non-synchronized, single-threaded default
 * - StringBuffer is the synchronized (thread-safe) variant with the same API
 *
 * Expected Output:
 * Both outputs match: true
 * Time with String  > Time with StringBuilder (usually)
 * insert/replace/reverse/delete demo: [X-Hello-World!]
 *
 * TODO:
 * 1. Build "row0,row1,...row9999" using String += in a loop
 * 2. Build the same using StringBuilder.append
 * 3. Compare results with equals(); time both loops with System.nanoTime()
 * 4. Demonstrate insert, replace, reverse, deleteCharAt on a sample
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 27: StringBuilder and StringBuffer ===");
    }
}