package com.electronik54.revision_3.corejava.ch33_reflection;

/**
 * Challenge 33: Reflection
 *
 * Problem:
 * Inspect a class at runtime: list its declared fields and methods, then
 * create an instance, set a private field via reflection, and invoke a
 * private method dynamically.
 *
 * Hint:
 * - Class<?> c = SomeClass.class; or obj.getClass()
 * - setAccessible(true) bypasses private access checks (accessSetAccessible caveats apply)
 * - Reflection is how frameworks (Spring, Jackson, JUnit) work their magic
 *
 * Expected Output:
 * Fields: [name, greet]
 * Methods: [greet, ...]
 * Invoked private method: Hello from private method, Alice
 *
 * TODO:
 * 1. Create Secret class with private String name and private String greet()
 * 2. List declared fields and methods of Secret.class
 * 3. Instantiate Secret via its no-arg constructor
 * 4. Set the private field 'name' to "Alice" via Field.setAccessible(true)
 * 5. Invoke the private greet() via Method.invoke and print the result
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 33: Reflection ===");
    }
}