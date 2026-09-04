package com.electronik54.revision_3.jpa_hibernate.ch134_jpa_transactions.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/** Proves atomic transfer + rollback on H2. */
@SpringBootTest
class TransferServiceTest {

    @Autowired
    private TransferService transferService;

    @Autowired
    private BankAccountRepository repository;

    @Test
    void successfulTransferUpdatesBothAccounts() {
        BankAccount a = repository.save(new BankAccount("A", 500));
        BankAccount b = repository.save(new BankAccount("B", 100));

        transferService.transfer("A", "B", 200);

        assertEquals(300, repository.findById(a.getId()).get().getBalance());
        assertEquals(300, repository.findById(b.getId()).get().getBalance());
    }

    @Test
    void failedTransferRollsBackBothAccounts() {
        BankAccount a = repository.save(new BankAccount("C", 100));
        BankAccount b = repository.save(new BankAccount("D", 100));

        try {
            transferService.transfer("C", "D", 999);
            fail("Expected rollback");
        } catch (IllegalArgumentException expected) {
            // ok
        }

        assertEquals(100, repository.findById(a.getId()).get().getBalance());
        assertEquals(100, repository.findById(b.getId()).get().getBalance());
    }
}