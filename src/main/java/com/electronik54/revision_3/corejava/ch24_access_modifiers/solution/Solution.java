package com.electronik54.revision_3.corejava.ch24_access_modifiers.solution;

/**
 * Solution for Challenge 24: Access Modifiers
 *
 * Demonstrates what an unrelated class in the SAME package can see.
 * private is reachable only through its public getter; default,
 * protected and public members are directly accessible here because
 * Solution lives in the same package.
 */
public class Solution {

    public static void main(String[] args) {
        Visibility v = new Visibility();

        // privateField is NOT accessible directly from here:
        // v.privateField = 10;              // COMPILE ERROR
        System.out.println("private via getter: " + v.getPrivateField());

        System.out.println("default field: " + v.defaultField);
        System.out.println("protected field: " + v.protectedField);
        System.out.println("public field: " + v.publicField);
    }
}