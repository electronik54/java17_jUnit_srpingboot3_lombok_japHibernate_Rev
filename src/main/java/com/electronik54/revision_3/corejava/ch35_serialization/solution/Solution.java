package com.electronik54.revision_3.corejava.ch35_serialization.solution;

import java.io.*;

/**
 * Solution for Challenge 35: Serialization
 *
 * Demonstrates: Serializable, serialVersionUID, transient field behavior,
 * ObjectOutputStream / ObjectInputStream round trip.
 */
public class Solution {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("build", "user.ser");
        file.getParentFile().mkdirs();

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(new User("Alice", 30, "s3cret"));
        }

        // Deserialize
        User deserialized;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            deserialized = (User) in.readObject();
        }

        System.out.println("Deserialized: " + deserialized);
        System.out.println("Note: password was transient so it was NOT restored");
        file.delete();
    }
}