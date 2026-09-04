package com.electronik54.revision_3.corejava.ch08_text_blocks.solution;

/**
 * Solution for Challenge 8: Text Blocks
 * 
 * This solution demonstrates:
 * - Multi-line strings with text blocks (Java 15+)
 * - JSON, HTML, SQL templates
 * - Escape sequences in text blocks
 * - String.formatted() method
 */
public class Solution {

    public static void main(String[] args) {
        // JSON example
        System.out.println("=== JSON Example ===");
        var json = """
            {
              "name": "John",
              "age": 30
            }
            """;
        System.out.println(json);
        
        // HTML example
        System.out.println("=== HTML Example ===");
        var html = """
            <html>
              <body>
                <h1>Hello</h1>
              </body>
            </html>
            """;
        System.out.println(html);
        
        // SQL example
        System.out.println("=== SQL Example ===");
        var sql = """
            SELECT id, name, email
            FROM users
            WHERE age > 18
            """;
        System.out.println(sql);
        
        // Formatted text
        System.out.println("=== Formatted Example ===");
        var formatted = """
            Hello %s,
            You have %d new messages.
            """.formatted("Alice", 5);
        System.out.println(formatted);
        
        // Escape sequences
        System.out.println("=== Escape Sequences ===");
        var withEscapes = """
            Line 1
            Line 2\t(tabbed)
            Line 3 with "quotes"
            """;
        System.out.println(withEscapes);
    }

}