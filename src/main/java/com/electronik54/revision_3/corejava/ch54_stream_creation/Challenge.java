package com.electronik54.revision_3.corejava.ch54_stream_creation;

/**
 * Challenge 54: Stream Creation
 *
 * Problem:
 * Create streams from every common source: collections, arrays,
 * Stream.of, Stream.iterate, Stream.generate, String chars, and
 * Stream.concat. Also create an empty stream safely.
 *
 * Hint:
 * - collection.stream() is the most common source
 * - Stream.iterate(seed, hasNext, next) creates infinite streams (bound it!)
 * - Stream.generate(supplier) also infinite - always use limit()
 * - Arrays.stream or Stream.of for arrays
 *
 * Expected Output:
 * From list: [a, b, c]
 * From array: [10, 20, 30]
 * Iterate powers of 2: [1, 2, 4, 8]
 * From string chars: [j, a, v, a]
 * Empty stream count: 0
 *
 * TODO:
 * 1. Stream from a List<String> and collect to list
 * 2. Stream from an int[] via Arrays.stream (sum it)
 * 3. Stream.iterate: first 4 powers of 2
 * 4. Stream.generate: 3 random-ish constant values with limit
 * 5. Stream from a String's chars; and Stream.empty()
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 54: Stream Creation ===");
    }
}