package com.electronik54.revision_3.jpa_hibernate.ch153_jpa_caching.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "cache_demo")
    static class Item {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        public Item() {}
        public Item(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
    }

    @Repository
    interface ItemRepo extends JpaRepository<Item, Long> {}

    @Service
    static class CacheService {
        @PersistenceContext
        private EntityManager em;
        @Autowired
        private ItemRepo repo;

        @org.springframework.transaction.annotation.Transactional
        public void demo() {
            repo.save(new Item("First-Level Cache Demo"));

            System.out.println("=== Solution 153: JPA Caching ===\n");

            System.out.println("First-level cache (per persistence context):");
            System.out.print("  First query: ");
            Item i1 = em.find(Item.class, 1L);
            System.out.println("SQL executed (loaded from DB) - " + i1.getName());

            System.out.print("  Second query: ");
            Item i2 = em.find(Item.class, 1L);
            System.out.println("From cache (no SQL) - " + i2.getName());

            System.out.println("\nSame entity reference? " + (i1 == i2));

            System.out.println("\nEvict from first-level cache:");
            em.detach(i1);
            System.out.print("  After evict: ");
            Item i3 = em.find(Item.class, 1L);
            System.out.println("SQL executed again - " + i3.getName());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(CacheService.class).demo();
        ctx.close();
    }
}