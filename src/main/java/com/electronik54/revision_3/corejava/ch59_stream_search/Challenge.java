package com.electronik54.revision_3.corejava.ch59_stream_search;

import java.util.List;

/**
 * Challenge 59: Stream Search Operations (findFirst, findAny, matches)
 *
 * Problem:
 * Use the short-circuit search operations: findFirst, findAny, anyMatch,
 * allMatch, noneMatch. Understand short-circuiting and findAny's
 * parallel-stream behavior.
 *
 * Hint:
 * - Short-circuit: stops processing as soon as the answer is known
 * - findAny returns ANY matching element - on parallel streams it's faster
 * - anyMatch/allMatch/noneMatch return boolean; findFirst/findAny return Optional
 * - allMatch on an EMPTY stream returns TRUE (vacuous truth!)
 *
 * Expected Output:
 * anyMatch even: true  allMatch positive: true  noneMatch negative: true
 * findFirst even: Optional[2]
 * findAny: Optional (any matching element)
 * allMatch on empty: true
 *
 * TODO:
 * 1. anyMatch/allMatch/noneMatch on a number list
 * 2. findFirst over a filtered stream
 * 3. findAny on a parallel stream
 * 4. Show allMatch returning true on an empty stream
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 59: Stream Search ===");
        System.out.println("Source: " + List.of(1, 2, 3, 4, 5));
    }
}