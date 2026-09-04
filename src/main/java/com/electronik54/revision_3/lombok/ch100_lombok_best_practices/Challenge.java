package com.electronik54.revision_3.lombok.ch100_lombok_best_practices;

/**
 * Challenge 100: Lombok Best Practices
 *
 * Problem:
 * Combine Lombok best practices in one entity: use @Getter/@Setter only
 * where needed (not over-eager @Data), mark fields with @NonNull for
 * validation, keep the class immutable with @Value where appropriate, and
 * exclude transient/derived fields from equals/hashCode.
 *
 * Hint:
 * - Prefer @Getter over @Data for JPA entities (avoids accidental setter exposure)
 * - @Builder(toBuilder = true) copies the builder from a built instance
 * - In production, run a Lombok version alongside an IDE plugin to align generated code
 *
 * Expected Output:
 * Employee(name=Alice, baseSalary=5000.0)
 * Derived bonus: 250.0
 * totalCompensation: 5250.0
 *
 * TODO:
 * 1. Create Employee with @Getter, @Setter, @ToString (exclude derivedField), @AllArgsConstructor
 * 2. Add @NonNull name and a derived bonus field excluded from toString
 * 3. Instantiate and print, then compute total compensation
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 100: Lombok Best Practices ===");
    }
}