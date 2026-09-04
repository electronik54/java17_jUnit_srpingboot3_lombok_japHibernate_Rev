package com.electronik54.revision_3.lombok.ch93_lombok_basics;

/**
 * Challenge 93: Lombok Basics
 *
 * Problem:
 * Create a 'Person' class with fields (name, age, email). Use Lombok
 * annotations @Data, @Getter, @Setter, @NoArgsConstructor to eliminate
 * boilerplate. Instantiate it and use generated getters/setters/toString.
 *
 * Hint:
 * - @Data combines @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
 * - @NoArgsConstructor generates a zero-argument constructor
 * - Without Lombok you'd hand-write ~50 lines of boilerplate for this class
 *
 * Expected Output:
 * Person(name=John, age=30, email=john@example.com)
 * Age after setter: 31
 * Equals check (same values): true
 *
 * TODO:
 * 1. Create Person class annotated with @Data and @NoArgsConstructor
 * 2. Fields: String name, int age, String email
 * 3. Instantiate with all-args, then try no-args constructor
 * 4. Use generated getters/setters and toString in main
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 93: Lombok Basics ===");
    }
}