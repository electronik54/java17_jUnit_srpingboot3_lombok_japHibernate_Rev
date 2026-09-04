package com.electronik54.revision_3.corejava.ch234_transaction_isolation.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 234: Advanced Transaction Management ===\n");
        System.out.println("Distributed transactions: Saga pattern, 2PC, TCC");
        System.out.println("Saga: Sequence of local transactions with compensating actions");
        System.out.println("  Choreography: Each service publishes events and reacts to others");
        System.out.println("  Orchestration: Central coordinator manages steps");
        System.out.println("2PC: Two-Phase Commit (prepare + commit/rollback) — not for microservices");
        System.out.println("Optimistic locking: @Version on entity, version check on update");
        System.out.println("Pessimistic locking: SELECT ... FOR UPDATE (row-level lock)");
    }
}