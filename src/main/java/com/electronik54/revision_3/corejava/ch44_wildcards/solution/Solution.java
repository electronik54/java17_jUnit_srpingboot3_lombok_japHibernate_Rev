package com.electronik54.revision_3.corejava.ch44_wildcards.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution for Challenge 44: Wildcards
 *
 * Demonstrates PECS: Producer Extends (read), Consumer Super (write),
 * and generic invariance.
 */
public class Solution {

    // PRODUCER: the list produces Numbers for us - read-only access
    static double sumAll(List<? extends Number> items) {
        double sum = 0;
        for (Number n : items) {       // safe: everything IS a Number
            sum += n.doubleValue();
        }
        return sum;
    }

    // CONSUMER: the list consumes Integers - write-only access here
    static void fillWithDefaults(List<? super Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(0);               // safe: any supertype of Integer accepts Integer
        }
    }

    public static void main(String[] args) {
        // Producer side: works with List<Integer>, List<Double>, List<Number>...
        System.out.println("sum of [1, 2.5] = " + sumAll(Arrays.asList(1, 2.5)));

        // Consumer side: List<Number> and List<Object> accept Integer writes
        List<Number> numbers = new ArrayList<>();
        fillWithDefaults(numbers, 3);
        System.out.println("Filled: " + numbers);

        // INVARIANCE: List<String> is NOT a List<Object>.
        // Object o = "str";        // references are covariant - OK
        // List<Object> lo = ???    // List<String> cannot be assigned here - compile error
        // That is why we need wildcards.
        System.out.println("List<String> is not a List<Object> (invariance) - compile error if attempted");
    }
}