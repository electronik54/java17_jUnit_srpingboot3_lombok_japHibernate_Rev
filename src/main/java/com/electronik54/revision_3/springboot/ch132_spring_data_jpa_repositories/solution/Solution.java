package com.electronik54.revision_3.springboot.ch132_spring_data_jpa_repositories.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;
import java.util.List;

/**
 * Solution 132: Spring Data JPA Repositories
 *
 * Demonstrates:
 * - Custom query methods in JpaRepository
 * - @Query with JPQL
 * - Pagination and sorting
 * - Repository method naming conventions
 *
 * Run this as a Spring Boot app.
 */
@SpringBootApplication
public class Solution {

    @Entity
    @Table(name = "products")
    static class Product {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double price;
        private String category;

        public Product() {}
        public Product(String name, double price, String category) {
            this.name = name; this.price = price; this.category = category;
        }
        public Long getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getCategory() { return category; }
        @Override public String toString() {
            return String.format("Product{id=%d, name='%s', price=%.2f, category='%s'}", id, name, price, category);
        }
    }

    @Repository
    interface ProductRepository extends JpaRepository<Product, Long> {
        List<Product> findByPriceBetween(double min, double max);
        List<Product> findByNameContainingIgnoreCase(String keyword);
        long countByCategory(String category);
        @Query("SELECT p FROM Product p ORDER BY p.price DESC")
        List<Product> findTop3MostExpensive(PageRequest pageable);
        List<Product> findByCategoryOrderByPriceDesc(String category);
    }

    @Service
    static class ProductService {
        @Autowired
        private ProductRepository repo;

        public void demo() {
            System.out.println("=== Products between $10-$50 ===");
            repo.findByPriceBetween(10, 50).forEach(p -> System.out.println("  " + p));

            System.out.println("\n=== Products containing 'pro' (ignore case) ===");
            repo.findByNameContainingIgnoreCase("pro").forEach(p -> System.out.println("  " + p));

            System.out.println("\n=== Count of 'Electronics' products ===");
            System.out.println("  Count: " + repo.countByCategory("Electronics"));

            System.out.println("\n=== Top 3 most expensive (PageRequest) ===");
            repo.findTop3MostExpensive(PageRequest.of(0, 3, Sort.by(Sort.Direction.DESC, "price")))
                .forEach(p -> System.out.println("  " + p));

            System.out.println("\n=== Electronics sorted by price DESC ===");
            repo.findByCategoryOrderByPriceDesc("Electronics").forEach(p -> System.out.println("  " + p));
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(ProductService.class).demo();
        ctx.close();
    }
}