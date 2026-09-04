package com.electronik54.revision_3.springboot.ch131_spring_data_jpa_basics.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Solution 131: Spring Data JPA Basics
 *
 * Demonstrates @Entity, @Id, @GeneratedValue, JpaRepository,
 * CRUD operations, and custom finder methods.
 */
@SpringBootApplication
public class Solution {

    @Entity
    @Table(name = "jpa_products")
    static class Product {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double price;

        public Product() {}
        public Product(String name, double price) { this.name = name; this.price = price; }

        public Long getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        @Override public String toString() {
            return String.format("Product{id=%d, name='%s', price=%.2f}", id, name, price);
        }
    }

    @Repository
    interface ProductRepo extends JpaRepository<Product, Long> {
        List<Product> findByNameContaining(String keyword);
        List<Product> findByPriceGreaterThan(double price);
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ProductRepo repo = ctx.getBean(ProductRepo.class);

        System.out.println("=== Solution 131: Spring Data JPA Basics ===\n");

        repo.save(new Product("Laptop", 999.99));
        repo.save(new Product("Phone", 599.99));
        repo.save(new Product("Tablet", 399.99));

        System.out.println("All products:");
        repo.findAll().forEach(p -> System.out.println("  " + p));

        System.out.println("\nProducts containing 'Phone':");
        repo.findByNameContaining("Phone").forEach(p -> System.out.println("  " + p));

        System.out.println("\nProducts over $500:");
        repo.findByPriceGreaterThan(500).forEach(p -> System.out.println("  " + p));

        ctx.close();
    }
}