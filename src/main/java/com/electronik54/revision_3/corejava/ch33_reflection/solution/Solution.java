package com.electronik54.revision_3.corejava.ch33_reflection.solution;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Solution for Challenge 33: Reflection
 *
 * Demonstrates: runtime inspection, instantiating a class, and accessing
 * private members with setAccessible(true).
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Secret.class;

        System.out.println("Fields: " + Arrays.toString(Arrays.stream(clazz.getDeclaredFields())
                .map(Field::getName).toArray()));
        System.out.println("Methods: " + Arrays.toString(Arrays.stream(clazz.getDeclaredMethods())
                .map(Method::getName).toArray()));

        // Instantiate without knowing the class at compile time
        Object secret = clazz.getDeclaredConstructor().newInstance();

        // Write a private field
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(secret, "Alice");

        // Invoke a private method
        Method greetMethod = clazz.getDeclaredMethod("greet");
        greetMethod.setAccessible(true);
        System.out.println("Invoked private method: " + greetMethod.invoke(secret));
    }
}