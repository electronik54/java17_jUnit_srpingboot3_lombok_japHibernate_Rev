package com.electronik54.revision_3.jpa_hibernate.ch134_jpa_transactions.solution;

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
    @Entity @Table(name = "txn_accounts")
    static class Account {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String owner; private double balance;
        public Account() {}
        public Account(String owner, double balance) { this.owner = owner; this.balance = balance; }
        public Long getId() { return id; }
        public String getOwner() { return owner; }
        public double getBalance() { return balance; }
        public void setBalance(double b) { this.balance = b; }
    }

    @Repository interface AccountRepo extends JpaRepository<Account, Long> {}

    @Service
    static class TransferService {
        @Autowired private AccountRepo repo;

        @Transactional
        public void transfer(Long fromId, Long toId, double amount) {
            Account from = repo.findById(fromId).orElseThrow();
            Account to = repo.findById(toId).orElseThrow();
            if (from.getBalance() < amount)
                throw new RuntimeException("Insufficient funds");
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            repo.save(from);
            repo.save(to);
        }

        public void demo() {
            Account a = repo.save(new Account("Alice", 1000));
            Account b = repo.save(new Account("Bob", 500));
            System.out.println("=== Solution 134: JPA Transactions ===\n");
            System.out.println("Before: " + a.getOwner() + "=$" + a.getBalance() + ", " + b.getOwner() + "=$" + b.getBalance());
            transfer(a.getId(), b.getId(), 300);
            Account a2 = repo.findById(a.getId()).orElseThrow();
            Account b2 = repo.findById(b.getId()).orElseThrow();
            System.out.println("After transfer $300: " + a2.getOwner() + "=$" + a2.getBalance() + ", " + b2.getOwner() + "=$" + b2.getBalance());
            try { transfer(a2.getId(), b2.getId(), 9999); }
            catch (RuntimeException e) { System.out.println("Failed (insufficient): rollback - funds unchanged"); }
            Account a3 = repo.findById(a.getId()).orElseThrow();
            Account b3 = repo.findById(b.getId()).orElseThrow();
            System.out.println("After failed attempt: " + a3.getOwner() + "=$" + a3.getBalance() + " (unchanged)");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(TransferService.class).demo();
        ctx.close();
    }
}