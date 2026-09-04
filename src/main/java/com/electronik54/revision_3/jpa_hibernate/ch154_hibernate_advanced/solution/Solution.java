package com.electronik54.revision_3.jpa_hibernate.ch154_hibernate_advanced.solution;

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
    @Entity @Table(name = "products_adv")
    @org.hibernate.annotations.DynamicInsert
    @org.hibernate.annotations.DynamicUpdate
    @org.hibernate.annotations.Where(clause = "deleted = false")
    @org.hibernate.annotations.SQLDelete(sql = "UPDATE products_adv SET deleted = true WHERE id = ?")
    static class Product {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; private Double price; private String category;
        private boolean deleted;

        @Column(updatable = false)
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        @PrePersist void onCreate() { createdAt = LocalDateTime.now(); updatedAt = createdAt; }
        @PreUpdate void onUpdate() { updatedAt = LocalDateTime.now(); }

        public Product() {}
        public Product(String name, Double price, String category) { this.name = name; this.price = price; this.category = category; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public Double getPrice() { return price; }
        public void setPrice(Double price) { this.price = price; }
        public String getCategory() { return category; }
        public boolean isDeleted() { return deleted; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public LocalDateTime getUpdatedAt() { return updatedAt; }
        @Override public String toString() { return "Product(id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", deleted=" + deleted + ")"; }
    }

    @Repository
    interface ProductRepo extends JpaRepository<Product, Long> {}

    @Service
    static class HibernateService {
        @Autowired private ProductRepo repo;
        @PersistenceContext private EntityManager em;

        @org.springframework.transaction.annotation.Transactional
        public void demo() {
            System.out.println("=== Solution 154: Hibernate Advanced ===\n");

            Product p = new Product("Laptop", 999.99, "Electronics");
            repo.save(p);
            System.out.println("Saved: " + p);
            System.out.println("  CreatedAt: " + p.getCreatedAt() + " (@PrePersist fired)");

            em.clear();

            Product found = repo.findById(p.getId()).orElseThrow();
            found.setPrice(899.99);
            repo.save(found);
            System.out.println("\nUpdated (DynamicUpdate): " + found);
            System.out.println("  Only price changed (not name/category)");

            repo.delete(found);
            em.flush();
            System.out.println("\nSoft delete: Product exists? " + repo.existsById(p.getId()));
            System.out.println("(@SQLDelete ran UPDATE, not DELETE)");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(HibernateService.class).demo();
        ctx.close();
    }
}