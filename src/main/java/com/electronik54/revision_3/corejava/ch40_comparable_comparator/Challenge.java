package com.electronik54.revision_3.corejava.ch40_comparable_comparator;

/**
 * Challenge 40: Comparable and Comparator
 *
 * Problem:
 * Sort Employee objects three ways: by natural ordering (Comparable on id),
 * by name (Comparator), and by salary descending then name (chained
 * Comparator with thenComparing).
 *
 * Hint:
 * - Comparable = natural order, implemented BY the class (compareTo)
 * - Comparator = external order, passed to sort (compare)
 * - Comparator.comparing(...).thenComparing(...) chains multiple keys
 *
 * Expected Output:
 * By id:       [E1 Dave, E2 Alice, E3 Bob]
 * By name:     [E2 Alice, E3 Bob, E1 Dave]
 * By salary desc, then name: [E1 Dave(90000), E3 Bob(80000), E2 Alice(80000)]
 *
 * TODO:
 * 1. Employee: id, name, salary; implement Comparable by id
 * 2. Sort by natural order and print
 * 3. Sort by name using Comparator.comparing
 * 4. Sort by salary DESC with name ASC tiebreak using .reversed() and thenComparing
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 40: Comparable and Comparator ===");
    }
}