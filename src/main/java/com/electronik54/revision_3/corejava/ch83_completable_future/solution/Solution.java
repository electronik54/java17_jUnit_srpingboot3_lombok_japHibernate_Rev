package com.electronik54.revision_3.corejava.ch83_completable_future.solution;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Solution for Challenge 83: CompletableFuture
 *
 * Demonstrates: async pipelines, combining, allOf, exception recovery.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        // 1. Pipeline: transform then consume
        CompletableFuture.supplyAsync(() -> 25)
                .thenApply(n -> n * 2)
                .thenAccept(n -> System.out.println("Pipeline: 50 -> 100 -> consumed " + n));

        // 2. Combine two independent futures
        CompletableFuture<Integer> a = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> b = CompletableFuture.supplyAsync(() -> 3);
        CompletableFuture<Integer> combined = a.thenCombine(b, Integer::sum);
        System.out.println("Combined: " + combined.get());

        // 3. Run several, wait for all
        CompletableFuture<String> fa = CompletableFuture.supplyAsync(() -> "A");
        CompletableFuture<String> fb = CompletableFuture.supplyAsync(() -> "B");
        CompletableFuture.allOf(fa, fb).join();
        List<String> results = Arrays.asList(fa.join(), fb.join());
        System.out.println("All done: " + results);

        // 4. Exception recovery
        CompletableFuture<String> failing = CompletableFuture.<String>supplyAsync(() -> {
            throw new IllegalStateException("boom");
        }).exceptionally(ex -> "fallback");
        System.out.println("Recovered from failure: " + failing.get());

        // 5. thenCompose: future that depends on another future (flatMap-style)
        CompletableFuture<Integer> nested = CompletableFuture.supplyAsync(() -> 5)
                .thenCompose(n -> CompletableFuture.supplyAsync(() -> n * 10));
        System.out.println("thenCompose: " + nested.get());
    }
}