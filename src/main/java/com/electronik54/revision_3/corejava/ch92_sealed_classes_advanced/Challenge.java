package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced;

/**
 * Challenge 92: Sealed Classes Advanced
 *
 * Problem:
 * Build a complete ADT-style sealed hierarchy: a sealed interface Result
 * with Success and Error records, a non-sealed branch, combined with
 * pattern matching instanceof chains - the "Result pattern" used in
 * modern APIs (replacing exceptions for expected failures).
 *
 * Hint:
 * - Sealed INTERFACES work too: sealed interface Result permits Success, Error
 * - Records as leaf nodes: record Success(T value) implements Result
 * - non-sealed re-opens a branch for everyone else
 * - Exhaustive handling: compiler knows all permitted subtypes
 *
 * Expected Output:
 * Success: computed 42
 * Error: code=500, message=boom
 * Handle success: value 42 / Handle error: failed with boom
 * Non-sealed branch allows extension: CustomResult
 *
 * TODO:
 * 1. sealed interface Result<T> permits Success, Error
 * 2. record Success<T>(T value) implements Result<T>
 * 3. record Error(int code, String message) implements Result<Nothing-like>
 * 4. handle(Result) with instanceof chain covering all cases
 * 5. Add a non-sealed extension branch
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 92: Sealed Classes Advanced ===");
    }
}