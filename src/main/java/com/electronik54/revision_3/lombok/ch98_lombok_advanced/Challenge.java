package com.electronik54.revision_3.lombok.ch98_lombok_advanced;

/**
 * Challenge 98: Lombok Advanced (@With, @SneakyThrows, @Cleanup, @Accessors)
 *
 * Problem:
 * Create a 'UserProfile' class using @With (returns a modified copy) and
 * @Accessors(fluent = true) (setters return this and drop the 'set' prefix).
 * Also demonstrate @SneakyThrows by wrapping a checked exception, and
 * @Cleanup for automatic resource closing.
 *
 * Hint:
 * - @With generates withField(...) methods that return a NEW copy (immutability)
 * - @Accessors(fluent=true) allows userProfile.name("Bob") instead of setName
 * - @SneakyThrows lets you throw checked exceptions without declaring them
 * - @Cleanup auto-closes Closeable resources in a finally block
 *
 * Expected Output:
 * Original:  UserProfile(name=Alice, age=30)
 * With age:  UserProfile(name=Alice, age=31)
 * Fluent:    UserProfile(name=Bob, age=30)
 * SneakyThrows worked, resource closed
 *
 * TODO:
 * 1. UserProfile: @With, @Accessors(fluent=true), @ToString, @AllArgsConstructor
 * 2. Demo withAge(31) returns a copy; fluent builder-style chaining
 * 3. @SneakyThrows method that throws Exception; @Cleanup a ByteArrayOutputStream
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 98: Lombok Advanced (@With etc.) ===");
    }
}