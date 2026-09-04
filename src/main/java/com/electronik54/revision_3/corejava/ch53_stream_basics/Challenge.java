package com.electronik54.revision_3.corejava.ch53_stream_basics;

import java.util.List;

/**
 * Challenge 53: Stream Basics
 *
 * Problem:
 * Understand what a stream IS: a lazy pipeline of source -> intermediate
 * operations -> terminal operation. Show that intermediate ops do nothing
 * until a terminal op runs, and that a stream can be consumed only ONCE.
 *
 * Hint:
 * - Intermediate ops (filter/map/sorted) return a new stream - LAZY
 * - Terminal ops (forEach/collect/count) trigger the whole pipeline
 * - Streams are single-use: reuse throws IllegalStateException
 * - Streams don't store data; they convey elements from a source
 *
 * Expected Output:
 * Pipeline ran: filtered=3 mapped=30
 * No terminal op: nothing printed above until forEach
 * Reusing threw: IllegalStateException: stream has already been operated upon or closed
 *
 * TODO:
 * 1. Create a stream from a List; chain filter+map WITHOUT a terminal op and observe nothing runs
 * 2. Add forEach as terminal op and observe output
 * 3. Attempt to consume the same stream twice; catch IllegalStateException
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 53: Stream Basics ===");
        List<Integer> numbers = List.of(10, 20, 30, 40);
        System.out.println("Source: " + numbers);
    }
}