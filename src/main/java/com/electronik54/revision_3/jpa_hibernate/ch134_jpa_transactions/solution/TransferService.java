package com.electronik54.revision_3.jpa_hibernate.ch134_jpa_transactions.solution;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Atomic transfer. Because @Transactional wraps genuine RuntimeException,
 * a failed debit rolls back the entire method (both balances unchanged).
 */
@Service
public class TransferService {

    private final BankAccountRepository repository;

    public TransferService(BankAccountRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void transfer(String fromNumber, String toNumber, double amount) {
        BankAccount from = repository.findByAccountNumber(fromNumber)
                .orElseThrow(() -> new IllegalArgumentException("Sender not found"));
        BankAccount to = repository.findByAccountNumber(toNumber)
                .orElseThrow(() -> new IllegalArgumentException("Receiver not found"));

        // Debit FIRST - if it throws (unchecked), the whole tx rolls back
        from.debit(amount);
        to.credit(amount);

        repository.save(from);
        repository.save(to);
    }
}