package com.electronik54.revision_3.jpa_hibernate.ch141_jpa_entity_basics;

/**
 * Challenge 141: JPA Entity Basics
 *
 * Problem:
 * Create a Product JPA entity mapped to a 'products' table with @Entity,
 * @Table, @Id, @GeneratedValue. Add a repository (also see ch131) and a
 * runner that persists and reads a Product using the EntityManager/repository.
 *
 * Hint:
 * - @Entity marks a JPA entity; @Table optional name override
 * - @Id + @GeneratedValue(strategy = IDENTITY) for auto-increment PK
 * - @Column(name=...) maps a field to a column; @Transient excludes a field
 * - Repositories extend JpaRepository<Entity, ID> for CRUD without SQL
 *
 * Expected Output (via repository save/find):
 * Saved id=1 -> Product(id=1, name=Laptop, price=999.99)
 * Found: Product(id=1, name=Laptop, price=999.99)
 *
 * TODO:
 * 1. Create Product entity with id, name, price and mappings
 * 2. Add a @Transient 'discountedPrice' field (not persisted)
 * 3. Create ProductRepository extends JpaRepository<Product, Long>
 * 4. Save + findById and print
 *
 * Dev profile uses H2 in-memory (see application-dev.yaml) so it runs safely.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 141: JPA Entity Basics ===");
    }
}