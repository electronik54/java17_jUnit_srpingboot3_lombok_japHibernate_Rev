package com.electronik54.revision_3.jpa_hibernate.ch134_jpa_transactions;

/**
 * Challenge 134: JPA Transactions (@Transactional, rollback)
 *
 * Problem:
 * Implement a transfer between two BankAccounts in ONE transaction using
 * @Transactional. If the debit fails (e.g., insufficient balance), throw a
 * RuntimeException so the whole transaction rolls back - both accounts
 * unchanged.
 *
 * Hint:
 * - @Transactional(propagation = REQUIRED) is the default: joins an existing
 *   transaction or starts a new one
 * - A RuntimeException (unchecked) triggers rollback by default; checked
 *   exceptions do NOT
 * - A transfer MUST debit+credit atomically - never debit without credit
 *
 * Expected Output (test run):
 * Successful transfer: balances updated
 * Failed transfer (insufficient): both balances unchanged (rollback)
 *
 * TODO:
 * 1. Create BankAccount entity (accountNumber, balance)
 * 2. Create a TransferService.transfer(from, to, amount) with @Transactional
 * 3. Debit from, credit to; throw if insufficient funds
 * 4. Verify rollback on failure via a test
 *
 * Dev profile uses H2 in-memory. See the test under src/test.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 134: JPA Transactions ===");
    }
}