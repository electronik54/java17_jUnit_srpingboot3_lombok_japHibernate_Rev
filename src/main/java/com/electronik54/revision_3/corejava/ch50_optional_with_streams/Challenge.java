package com.electronik54.revision_3.corejava.ch50_optional_with_streams;

import java.util.List;
import java.util.Optional;

/**
 * Challenge 50: Optional with Streams
 *
 * Problem:
 * Bridge Optionals and Streams: convert a List<Optional<T>> into
 * List<T> skipping empties, use findFirst/findAny which return Optionals,
 * and unwrap a Stream<Optional<T>> with flatMap.
 *
 * Hint:
 * - Stream.findFirst()/findAny() RETURN Optional - empty when no element matches
 * - Stream.of(Optional...).flatMap(Optional::stream) (Java 9+) filters and unwraps at once
 * - reduce() also returns an Optional (empty for an empty stream without identity)
 *
 * Expected Output:
 * Unwrapped: [apple, cherry]
 * findFirst with match: Optional[banana]
 * findFirst no match: Optional.empty
 * reduce without identity: Optional[60]
 *
 * TODO:
 * 1. List<Optional<String>> -> flatMap(Optional::stream) -> collect non-empty values
 * 2. findFirst on numbers filtered by a matching and a non-matching predicate
 * 3. reduce a stream of ints (no identity) and print the Optional
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 50: Optional with Streams ===");
        List<Optional<String>> mixed = List.of(Optional.of("apple"), Optional.empty(), Optional.of("cherry"));
        System.out.println("Mixed input: " + mixed.size() + " optionals, 1 empty");
    }
}