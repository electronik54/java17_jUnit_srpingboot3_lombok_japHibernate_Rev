package com.electronik54.revision_3.corejava.ch18_static_final.solution;

/**
 * Database class.
 * Demonstrates static initialization block.
 */
public class Database {
    static {
        System.out.println("Static block executed");
        System.out.println("Database initialized");
    }
    
    public Database() {
        System.out.println("Database constructor called");
    }
}