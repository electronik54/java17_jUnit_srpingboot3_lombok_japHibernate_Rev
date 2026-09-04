package com.electronik54.revision_3.corejava.ch21_this_super.solution;

/**
 * Solution for Challenge 21: this and super
 *
 * Demonstrates: this.field vs parameter, super(...) constructor chaining,
 * super.method() to invoke the parent's overridden version.
 */
public class Solution {

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "IT", 5);
        System.out.println(manager);
        manager.work();
    }
}