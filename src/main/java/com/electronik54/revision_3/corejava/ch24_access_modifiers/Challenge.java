package com.electronik54.revision_3.corejava.ch24_access_modifiers;

/**
 * Challenge 24: Access Modifiers
 *
 * Problem:
 * Demonstrate Java's four access levels - private, default (package-private),
 * protected, and public - using fields and methods of a class, and show what
 * is accessible from a subclass in the SAME package vs from an unrelated class.
 *
 * Hint:
 * - private: only inside the same class
 * - default: same package only (no keyword)
 * - protected: same package + subclasses (even in other packages)
 * - public: everywhere
 * - Class-level: only public or default are allowed
 *
 * Expected Output:
 * private via getter: 1
 * default field: 2
 * protected field: 3
 * public field: 4
 *
 * TODO:
 * 1. Create Visibility class with one field per modifier (private, default, protected, public)
 * 2. Add a public getter for the private field only
 * 3. In Solution (same package), access default/protected/public fields directly
 * 4. Observe (in comments) that the private field is only reachable via its getter
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 24: Access Modifiers ===");
    }
}