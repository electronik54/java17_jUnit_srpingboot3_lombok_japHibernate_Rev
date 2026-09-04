package com.electronik54.revision_3.corejava.ch88_text_blocks_advanced;

/**
 * Challenge 88: Text Blocks Advanced
 *
 * Problem:
 * Master text-block details: incidental indentation stripping (closing
 * delimiter position decides!), escaping quotes without \\\", embedded
 * expressions via String.format, and trailing whitespace control with
 * \\\\s.
 *
 * Hint:
 * - The position of the CLOSING \"\"\" determines how much indentation is stripped
 * - One \\ before a line joins it to the next (no newline)
 * - Text blocks have no variable interpolation - use String.format/formatted
 * - \\s preserves trailing spaces; \\\n adds explicit newlines
 *
 * Expected Output:
 * JSON block parsed-free, printed with stripped indentation
 * Formatted: Hello Alice, you are 30
 * Line-joined: SELECT * FROM users WHERE id = 1
 *
 * TODO:
 * 1. JSON template as a text block; print it
 * 2. Use .formatted(...) to inject name and age
 * 3. Join SQL lines with a trailing backslash
 * 4. Show indent() and stripIndent effects
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 88: Text Blocks Advanced ===");
    }
}