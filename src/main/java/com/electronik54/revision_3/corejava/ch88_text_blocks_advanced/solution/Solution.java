package com.electronik54.revision_3.corejava.ch88_text_blocks_advanced.solution;

/**
 * Solution for Challenge 88: Text Blocks Advanced
 *
 * Demonstrates: indentation stripping, formatting, line joining.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. JSON template - quotes need NO escaping inside a text block
        String json = """
                {
                    "name": "Alice",
                    "age": 30
                }
                """;
        System.out.println("JSON block:");
        System.out.println(json);

        // 2. No interpolation -> use formatted()
        String greeting = """
                Hello %s, you are %d
                """.formatted("Alice", 30);
        System.out.println("Formatted: " + greeting.trim());

        // 3. Line joining with trailing backslash (no newline inserted)
        String sql = """
                SELECT * FROM users \
                WHERE id = 1
                """;
        System.out.println("Line-joined: " + sql.trim());

        // 4. Closing-delimiter position controls stripping
        String indented = """
                first
                  second
                """;
        System.out.println("Stripped block: " + indented.replace("\\n", "|"));

        // 5. \\s keeps trailing whitespace, \\n forces newline
        String explicit = """
                line one\\s\\s
                line two\\n
                """;
        System.out.println("Explicit escapes length: " + explicit.length());
    }
}