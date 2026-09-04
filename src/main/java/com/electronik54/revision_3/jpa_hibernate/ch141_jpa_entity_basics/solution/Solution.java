package com.electronik54.revision_3.jpa_hibernate.ch141_jpa_entity_basics.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@SpringBootApplication
public class Solution {
    @Entity
    @Table(name = "jpa_entity_demo")
    static class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String name;
        private double price;
        @Column(updatable = false)
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        @PrePersist void onCreate() { createdAt = LocalDateTime.now(); updatedAt = createdAt; }
        @PreUpdate void onUpdate() { updatedAt = LocalDateTime.now(); }

        public Product() {}
        public Product(String name, double price) { this.name = name; this.price = price; }

        public Long getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public LocalDateTime getUpdatedAt() { return updatedAt; }

        @Override public String toString() {
            return String.format("Product{id=%d, name='%s', price=%.2f, createdAt=%s, updatedAt=%s}",
                    id, name, price, createdAt, updatedAt);
        }
    }

    @Repository
    interface ProductRepo extends JpaRepository<Product, Long> {}

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ProductRepo repo = ctx.getBean(ProductRepo.class);

        System.out.println("=== Solution 141: JPA Entity Basics ===\n");

        Product p = new Product("Laptop", 999.99);
        repo.save(p);

        Product found = repo.findById(p.getId()).orElseThrow();
        System.out.println("Entity saved successfully!");
        System.out.println("  " + found);
        System.out.println("\nKey annotations:");
        System.out.println("  @Entity        - Marks class as JPA entity");
        System.out.println("  @Table(name=)  - Maps to database table");
        System.out.println("  @Id            - Primary key field");
        System.out.println("  @GeneratedValue- Auto-increment strategy");
        System.out.println("  @Column        - Column constraints");
        System.out.println("  @PrePersist    - Lifecycle callback before insert");
        System.out.println("  @PreUpdate     - Lifecycle callback before update");
        ctx.close();
    }
}