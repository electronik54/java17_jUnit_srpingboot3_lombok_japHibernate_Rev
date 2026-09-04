package com.electronik54.revision_3.corejava.ch71_consumer_supplier;

/**
 * Challenge 71: Consumer<T> and Supplier<T>
 *
 * Problem:
 * Use Consumer (T -> side effect, no return) for logging and list
 * modification, chain consumers with andThen(), use Supplier (no input ->
 * T, lazily creates values) for factories, and combine both in a lazy
 * "produce then consume" pipeline. Know BiConsumer too.
 *
 * Hint:
 * - Consumer<T> = T -> void: performs an action (forEach, logging)
 * - consumer1.andThen(consumer2) runs both in order on the same value
 * - Supplier<T> = () -> T: a factory / lazy value producer
 * -orElseGet(supplier) and Collectors.toCollection(TreeSet::new) take suppliers!
 *
 * Expected Output:
 * Logging consumer: processing apple
 * andThen chain: apple -> APPLE
 * Supplier factory: new list []  and random-ish constant 42
 * BiConsumer map fill: {a=1, b=2}
 *
 * TODO:
 * 1. Consumer that logs each word
 * 2. Chain a logger with an upper-caser that stores results
 * 3. Supplier producing a new empty ArrayList and a fixed value
 * 4. BiConsumer filling a map
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 71: Consumer and Supplier ===");
    }
}