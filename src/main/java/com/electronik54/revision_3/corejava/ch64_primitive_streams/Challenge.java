package com.electronik54.revision_3.corejava.ch64_primitive_streams;

/**
 * Challenge 64: Primitive Streams (IntStream, LongStream, DoubleStream)
 *
 * Problem:
 * Use primitive streams for numeric work: ranges, sum/average/max without
 * boxing, mapToObj/mapToInt conversions, and boxed() when you need objects.
 *
 * Hint:
 * - IntStream.range(0, n) excludes n; rangeClosed includes it
 * - Primitive streams avoid boxing overhead and have sum()/average() built in
 * - boxed() converts IntStream -> Stream<Integer>; mapToObj makes any object
 * - IntSummaryStatistics via summaryStatistics()
 *
 * Expected Output:
 * Range 0..4: [0, 1, 2, 3, 4]
 * Sum 1..100: 5050
 * Average 1..10: 5.5
 * Squares: [1, 4, 9]
 * Boxed sum via Stream: 6
 *
 * TODO:
 * 1. IntStream.range and rangeClosed - print list of first five
 * 2. Sum 1..100 without any boxing
 * 3. average() on 1..10 (returns OptionalDouble)
 * 4. mapToObj squares of 1..3; then boxed() + reduce sum of 1..3
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 64: Primitive Streams ===");
    }
}