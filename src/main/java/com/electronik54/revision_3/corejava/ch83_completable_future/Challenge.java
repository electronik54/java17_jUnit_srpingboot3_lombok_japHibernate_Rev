package com.electronik54.revision_3.corejava.ch83_completable_future;

/**
 * Challenge 83: CompletableFuture (async composition)
 *
 * Problem:
 * Build async pipelines: supplyAsync, thenApply/thenAccept, combine two
 * independent futures with thenCombine, run two in parallel and join with
 * allOf, and handle exceptions with exceptionally/handle.
 *
 * Hint:
 * - supplyAsync runs on ForkJoinPool.commonPool by default
 * - thenApply transforms the value; thenCompose chains another future (flatMap-style)
 * - thenCombine merges two INDEPENDENT futures
 * - exceptionally() recovers from failures; handle() sees both result and error
 *
 * Expected Output:
 * Pipeline: 50 -> 100 -> consumed 100
 * Combined: 13
 * All done: [A, B]
 * Recovered from failure: fallback
 *
 * TODO:
 * 1. supplyAsync(25).thenApply(x2).thenAccept(print)
 * 2. Two futures (10 and 3) combined with thenCombine into 13
 * 3. allOf over two supplyAsync of strings; collect results after join
 * 4. A failing future recovered with exceptionally
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 83: CompletableFuture ===");
    }
}