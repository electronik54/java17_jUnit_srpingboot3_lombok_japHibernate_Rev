package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced.solution;

/**
 * Solution for Challenge 92: Sealed Classes Advanced
 *
 * Demonstrates: Result ADT with records, exhaustive instanceof chains,
 * and a non-sealed extension branch.
 */
public class Solution {

    static Result<Integer> compute(boolean ok) {
        return ok ? new Success<>(42) : new Error(500, "boom");
    }

    static String handle(Result<Integer> result) {
        // Exhaustive chain - compiler knows the full hierarchy
        if (result instanceof Success<Integer> s) {
            return "Handle success: value " + s.value();
        }
        if (result instanceof Error e) {
            return "Handle error: failed with " + e.message() + " (code " + e.code() + ")";
        }
        return "unknown";
    }

    public static void main(String[] args) {
        Result<Integer> ok = compute(true);
        Result<Integer> bad = compute(false);

        if (ok instanceof Success<Integer> s) {
            System.out.println("Success: computed " + s.value());
        }
        if (bad instanceof Error e) {
            System.out.println("Error: code=" + e.code() + ", message=" + e.message());
        }

        System.out.println(handle(ok) + " / " + handle(bad));

        // non-sealed branch: ANYONE may implement LegacyResult
        LegacyResult<Integer> legacy = new LegacyResult<>() {
            @Override
            public String raw() {
                return "CustomResult works";
            }
        };
        System.out.println("Non-sealed branch allows extension: " + legacy.raw());
    }
}