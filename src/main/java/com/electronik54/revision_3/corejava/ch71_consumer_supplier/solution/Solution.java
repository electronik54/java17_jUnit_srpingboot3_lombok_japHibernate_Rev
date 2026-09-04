package com.electronik54.revision_3.corejava.ch71_consumer_supplier.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Solution for Challenge 71: Consumer and Supplier
 *
 * Demonstrates: consumers for side effects, andThen chaining,
 * suppliers as lazy factories, and BiConsumer.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Logging consumer
        Consumer<String> logger = s -> System.out.println("Logging consumer: processing " + s);
        logger.accept("apple");

        // 2. andThen chain: log then transform into a list
        List<String> collected = new ArrayList<>();
        Consumer<String> toUpperAndStore = s -> collected.add(s.toUpperCase());
        Consumer<String> pipeline = logger.andThen(toUpperAndStore);
        pipeline.accept("apple");
        System.out.println("andThen chain: apple -> " + collected);

        // 3. Suppliers as lazy factories
        Supplier<List<String>> listFactory = ArrayList::new;
        Supplier<Integer> meaningOfLife = () -> 42;
        System.out.println("Supplier factory: new list " + listFactory.get()
                + "  and constant " + meaningOfLife.get());

        // Supplier used by orElseGet - runs ONLY if empty
        Supplier<String> defaultName = () -> "DEFAULT";
        String value = java.util.Optional.<String>empty().orElseGet(defaultName);
        System.out.println("Supplier in orElseGet: " + value);

        // 4. BiConsumer filling a map
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> putter = (k, v) -> map.put(k, v);
        putter.accept("a", 1);
        putter.accept("b", 2);
        System.out.println("BiConsumer map fill: " + map);

        // forEach takes a BiConsumer
        map.forEach((k, v) -> System.out.println("forEach BiConsumer: " + k + "=" + v));
    }
}