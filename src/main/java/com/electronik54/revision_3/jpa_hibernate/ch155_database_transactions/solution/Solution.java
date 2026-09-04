package com.electronik54.revision_3.jpa_hibernate.ch155_database_transactions.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "accounts")
    static class Account {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String owner; private double balance;
        public Account() {}
        public Account(String owner, double balance) { this.owner = owner; this.balance = balance; }
        public Long getId() { return id; }
        public String getOwner() { return owner; }
        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }
        @Override public String toString() { return owner + ": $" + String.format("%.2f", balance); }
    }

    @Repository
    interface AccountRepo extends JpaRepository<Account, Long> {}

    @Service
    static class BankService {
        @Autowired private AccountRepo repo;

        @Transactional(rollbackFor = Exception.class)
        public void transfer(Long fromId, Long toId, double amount) {
            Account from = repo.findById(fromId).orElseThrow();
            Account to = repo.findById(toId).orElseThrow();
            if (from.getBalance() < amount) throw new RuntimeException("Insufficient funds");
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            repo.save(from); repo.save(to);
        }

        public void demo() {
            Account a = repo.save(new Account("Alice", 1000));
            Account b = repo.save(new Account("Bob", 500));
            Account c = repo.save(new Account("Charlie", 200));

            System.out.println("=== Solution 155: Database Transactions ===\n");

            System.out.println("Before transfer:");
            System.out.println("  " + a + ", " + b);

            try {
                transfer(a.getId(), b.getId(), 500);
                System.out.println("\nAfter transfer $500 (success):");
                System.out.println("  " + repo.findById(a.getId()).orElseThrow() + ", " + repo.findById(b.getId()).orElseThrow());
            } catch (Exception e) {
                System.out.println("\nTransfer failed: " + e.getMessage());
            }

            System.out.println("\nAttempting transfer with insufficient funds:");
            try {
                transfer(c.getId(), a.getId(), 500);
            } catch (RuntimeException e) {
                System.out.println("  " + e.getMessage() + " => ROLLBACK");
            }
            System.out.println("  " + repo.findById(c.getId()).orElseThrow() + " (unchanged)");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(BankService.class).demo();
        ctx.close();
    }
}