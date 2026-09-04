package com.electronik54.revision_3.corejava.ch34_file_io.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Solution for Challenge 34: File I/O
 *
 * Demonstrates: NIO.2 Paths/Files for write, readAllLines,
 * streaming BufferedReader read, and cleanup.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("build", "demo.txt");
        Files.createDirectories(path.getParent());

        List<String> lines = List.of("line one", "line two", "line three");
        Files.write(path, lines);
        System.out.println("Written " + lines.size() + " lines");

        System.out.println("Read back:");
        Files.readAllLines(path).forEach(System.out::println);

        int count = 0;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        System.out.println("Streaming read: " + count + " lines");

        Files.deleteIfExists(path);
    }
}