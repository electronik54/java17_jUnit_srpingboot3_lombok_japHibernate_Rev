package com.electronik54.revision_3.corejava.ch35_serialization;

/**
 * Challenge 35: Serialization
 *
 * Problem:
 * Serialize a 'User' object to a file with ObjectOutputStream and read it
 * back with ObjectInputStream. Mark one field 'transient' and observe that
 * it is NOT restored. Declare an explicit serialVersionUID.
 *
 * Hint:
 * - Class must implement java.io.Serializable
 * - transient fields are skipped during serialization (come back as null/0)
 * - serialVersionUID guards against incompatible class changes during deserialization
 * - static fields are never serialized (they belong to the class)
 *
 * Expected Output:
 * Deserialized: User{name='Alice', age=30, password='null'}
 * Note: password was transient so it was NOT restored
 *
 * TODO:
 * 1. User implements Serializable with fields name, age, transient password
 * 2. Add private static final long serialVersionUID = 1L;
 * 3. Serialize to build/user.ser via ObjectOutputStream (try-with-resources)
 * 4. Deserialize back and print - password should be null
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 35: Serialization ===");
    }
}