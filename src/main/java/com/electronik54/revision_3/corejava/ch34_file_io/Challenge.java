package com.electronik54.revision_3.corejava.ch34_file_io;

/**
 * Challenge 34: File I/O (NIO.2)
 *
 * Problem:
 * Write a list of lines to a file and read it back using java.nio.file
 * (Paths, Files). Then read with BufferedReader for line-by-line access.
 *
 * Hint:
 * - Files.write(path, lines) creates/overwrites in one call
 * - Files.readAllLines(path) loads everything into memory - fine for small files
 * - Files.newBufferedReader is the streaming choice for big files
 * - Always handle IOException - file ops are checked exceptions
 *
 * Expected Output:
 * Written 3 lines
 * Read back:
 * line one
 * line two
 * line three
 * Streaming read: 3 lines
 *
 * TODO:
 * 1. Get a Path via Path.of("build", "demo.txt")
 * 2. Write List.of("line one","line two","line three") with Files.write
 * 3. Read all lines with Files.readAllLines and print
 * 4. Read again with Files.newBufferedReader in try-with-resources, count lines
 * 5. Delete the file with Files.deleteIfExists
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 34: File I/O ===");
    }
}