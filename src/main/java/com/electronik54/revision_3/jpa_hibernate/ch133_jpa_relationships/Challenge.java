package com.electronik54.revision_3.jpa_hibernate.ch133_jpa_relationships;

/**
 * Challenge 133: JPA Relationships (@OneToMany @ManyToOne)
 *
 * Problem:
 * Model an Order -> OrderItem one-to-many relationship. Order owns
 * @OneToMany(mappedBy = "order", cascade = ALL); OrderItem has @ManyToOne
 * + @JoinColumn. Persist an order with items and cascade saves them together.
 *
 * Hint:
 * - @OneToMany(mappedBy = "order") is the parent side; mappedBy points to the
 *   field name on the child
 * - @ManyToOne + @JoinColumn(name = "order_id") is the FK-owning side
 * - cascade = CascadeType.ALL propagates persist/merge/remove to children
 * - FetchType.LAZY (default) loads children on access, not with the parent
 *
 * Expected Output (test run):
 * Order id saved + 2 OrderItems persisted in same transaction
 * order.getItems() size = 2 after re-fetch
 *
 * TODO:
 * 1. Create Order and OrderItem entities with the relationship
 * 2. Add OrderRepository + OrderItemRepository
 * 3. Persist an order with items; verify cascade and lazy fetch
 *
 * Dev profile uses H2 in-memory (application-dev.yaml) so this runs safely.
 * See the test under src/test for verification.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 133: JPA Relationships ===");
    }
}