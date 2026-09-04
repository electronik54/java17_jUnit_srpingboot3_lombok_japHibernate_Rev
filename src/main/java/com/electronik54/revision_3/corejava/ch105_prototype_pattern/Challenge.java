package com.electronik54.revision_3.corejava.ch105_prototype_pattern;

/**
 * Challenge 105: Prototype Pattern
 *
 * Problem:
 * Implement the Prototype pattern by implementing Cloneable on a 'Document'
 * class. Demonstrate shallow vs deep copy: a shallow clone shares the
 * mutable list of content, while a deep copy duplicates it.
 *
 * Hint:
 * - Override clone() (protected Object clone()) and widen to public / covariant
 * - For a deep copy, also clone mutable fields (e.g., new ArrayList<>(content))
 * - Prototype avoids re-creating expensive objects - just clone an existing one
 *
 * Expected Output:
 * After editing clone's content:
 * Original content size: 2  (deep clone kept original untouched)
 * Clone content size: 3
 *
 * TODO:
 * 1. Make Document implements Cloneable with fields title + List<String> content
 * 2. Implement clone() that deep-copies the content list
 * 3. Clone a document, modify the clone, confirm the original is isolated
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 105: Prototype Pattern ===");
    }
}