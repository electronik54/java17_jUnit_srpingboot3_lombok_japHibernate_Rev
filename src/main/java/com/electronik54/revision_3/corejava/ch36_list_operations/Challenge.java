package com.electronik54.revision_3.corejava.ch36_list_operations;

import java.util.List;

/**
 * Challenge 36: List Operations (ArrayList vs LinkedList)
 *
 * Problem:
 * Perform core List operations: add, insert at index, remove by value and
 * index, get/set, contains, indexOf, subList, and conversion to array.
 *
 * Hint:
 * - ArrayList: O(1) random access, O(n) middle insert/remove
 * - LinkedList: O(1) end insert/remove, O(n) random access
 * - List.of(...) creates an IMMUTABLE list - mutation throws UnsupportedOperationException
 *
 * Expected Output:
 * [apple, banana, cherry]
 * After insert: [apple, avocado, banana, cherry]
 * After remove: [apple, banana]
 * subList: [apple]  contains banana: true
 *
 * TODO:
 * 1. Create a mutable ArrayList with apple, banana, cherry
 * 2. Insert "avocado" at index 1 and print
 * 3. Remove "cherry" by value and element at index 0? No - remove by value only, then remove index 1... keep it simple: remove "cherry"
 * 4. Demonstrate contains, indexOf, size, subList and toArray
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 36: List Operations ===");
        List<String> immutable = List.of("a", "b");  // reminder: this one cannot be modified
        System.out.println("Immutable list example: " + immutable);
    }
}