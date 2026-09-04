package com.electronik54.revision_3.corejava.ch101_singleton_pattern.solution;

/**
 * Thread-safe Singleton using double-checked locking + a constructed counter.
 *
 * Why double-checked locking? 'volatile' ensures the instance reference is
 * always read fresh across threads; the synchronized block serializes the
 * one-time creation race.
 */
public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private static int instanceCount = 0;

    private DatabaseConnection() {
        instanceCount++;
    }

    public static DatabaseConnection getInstance() {
        // First check (no lock) - fast path
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                // Second check (inside lock) - correct thread-safe creation
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}