package com.electronik54.revision_3.corejava.ch194_transaction_isolation.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 194: Transaction Isolation Levels ===\n");
        System.out.println("READ UNCOMMITTED: Dirty reads, non-repeatable reads, phantom reads"); 
        System.out.println("READ COMMITTED: No dirty reads (default in PostgreSQL, SQL Server)");
        System.out.println("REPEATABLE READ: No dirty or non-repeatable reads (default in MySQL)");
        System.out.println("SERIALIZABLE: All anomalies prevented (slowest)");
        System.out.println("Dirty read: Read uncommitted data from another transaction");
        System.out.println("Non-repeatable: Same row read twice, different values");
        System.out.println("Phantom: Same query twice, different row count");
        System.out.println("MVCC: Multi-version concurrency control (no locks for reads)");
    }
}