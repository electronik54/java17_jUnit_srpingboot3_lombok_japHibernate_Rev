package com.electronik54.revision_3.lombok.ch99_lombok_val_var;

/**
 * Challenge 99: Lombok val vs var
 *
 * Problem:
 * Compare Lombok's @val (final / immutable, Java-7 compatible style) and
 * @var (mutable local variable). Note this is Lombok's feature - distinct
 * from Java 10+'s built-in 'var'. Use them to infer types in a method.
 *
 * Hint:
 * - @val infers type as final
 * - @var infers type as mutable (like Java's var)
 * - Both work with local variables, while Java's built-in var is the modern replacement
 *
 * Expected Output:
 * val value = 10 (int, final)
 * var count = 5 (int, mutable) -> 6
 * var name = InferenceDemo (class type)
 *
 * TODO:
 * 1. Use @val for a final inferred local variable
 * 2. Use @var for a mutable inferred local variable
 * 3. Print both and confirm @val cannot be reassigned
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 99: Lombok val vs var ===");
    }
}