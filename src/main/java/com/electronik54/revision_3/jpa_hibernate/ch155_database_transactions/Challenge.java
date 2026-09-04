package com.electronik54.revision_3.jpa_hibernate.ch155_database_transactions;

/**
 * Challenge 155: Database Transactions & Isolation
 * 
 * Challenge Statement:
 * Demonstrate transaction management with @Transactional annotation.
 * Show different propagation levels and isolation levels:
 * - REQUIRED (default): join existing or create new
 * - REQUIRES_NEW: suspend existing, create new
 * - NESTED: savepoint within existing transaction
 * - READ_COMMITTED vs REPEATABLE_READ vs SERIALIZABLE isolation
 * Demonstrate rollback scenarios with RuntimeException vs checked exception.
 * 
 * Hint:
 * - @Transactional(propagation = Propagation.REQUIRES_NEW)
 * - @Transactional(isolation = Isolation.SERIALIZABLE)
 * - @Transactional(rollbackFor = Exception.class, noRollbackFor = CustomException.class)
 * - Default: rolls back on RuntimeException, not on checked exceptions
 * - Propagation.NESTED uses savepoints (supported by PostgreSQL, not H2)
 * 
 * Expected Output (Solution):
 * Transfer $500 from Account A to Account B:
 * SUCCESS: A=$500, B=$500, C=null (new account)
 * Transfer fails (insufficient funds):
 * ROLLBACK: A=$500, B=$500 (unchanged)
 * Transaction behavior: REQUIRED joins, REQUIRES_NEW suspends
 */
public class Challenge {

}