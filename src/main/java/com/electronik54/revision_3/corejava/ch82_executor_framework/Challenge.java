package com.electronik54.revision_3.corejava.ch82_executor_framework;

/**
 * Challenge 82: Executor Framework (ExecutorService, Future, Callable)
 *
 * Problem:
 * Submit tasks to a fixed thread pool: Runnable via execute(), Callable
 * via submit() to get a Future, collect results from multiple futures,
 * and ALWAYS shut the pool down.
 *
 * Hint:
 * - Runnable = no result; Callable<V> = returns V and can throw checked exceptions
 * - Future.get() BLOCKS until the result is ready
 * - Always shutdown() the pool; shutdownNow() interrupts running tasks
 *
 * Expected Output:
 * Runnable executed
 * Callable result: 55
 * Squares: [100, 400, 900]
 * Pool shut down cleanly
 *
 * TODO:
 * 1. Fixed pool of 2; execute a Runnable
 * 2. submit(Callable) summing 1..10; print future.get()
 * 3. Submit three Callables squaring 10/20/30; collect all futures' results
 * 4. shutdown + awaitTermination
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 82: Executor Framework ===");
    }
}