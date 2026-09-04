package com.electronik54.revision_3.corejava.ch62_collectors_grouping;

import java.util.List;

/**
 * Challenge 62: Collectors - groupingBy and partitioningBy
 *
 * Problem:
 * Group employees by department with groupingBy, count per group,
 * compute averages per group, and split data with partitioningBy
 * (boolean partition). Then do a multi-level group (dept -> by-seniority map).
 *
 * Hint:
 * - groupingBy returns Map<K, List<T>>; downstream collectors change the value type
 * - counting(), averagingInt(), mapping() are common downstream collectors
 * - partitioningBy splits into exactly TWO groups (predicate true/false)
 *
 * Expected Output:
 * By dept: {IT=[Alice, Bob], HR=[Carol]}
 * Count per dept: {IT=2, HR=1}
 * Avg salary per dept: {IT=60000.0, HR=50000.0}
 * Partition by senior: {false=[Bob, Carol], true=[Alice]}
 *
 * TODO:
 * 1. Group employees by department
 * 2. counting() downstream for per-department counts
 * 3. averagingInt downstream for per-department avg salary
 * 4. partitioningBy on salary >= 60000
 * 5. Multi-level: group by dept, then mapping to names sorted
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 62: Collectors grouping ===");
        System.out.println("Employees: Alice(IT,70000), Bob(IT,50000), Carol(HR,50000)");
    }
}