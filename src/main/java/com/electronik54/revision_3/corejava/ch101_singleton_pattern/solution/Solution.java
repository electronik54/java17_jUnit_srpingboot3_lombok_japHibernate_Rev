package com.electronik54.revision_3.corejava.ch101_singleton_pattern.solution;

/**
 * Solution for Challenge 101: Singleton Pattern
 */
public class Solution {

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("db1 == db2 ? " + (db1 == db2));
        System.out.println("Only one instance exists -> " + (DatabaseConnection.getInstanceCount() == 1));
        db1.query("SELECT * FROM users");
    }
}