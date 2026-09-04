package com.electronik54.revision_3.jpa_hibernate.ch144_jpa_one_to_many;

/**
 * Challenge 144: JPA @OneToMany Relationship
 * 
 * Challenge Statement:
 * Create an Order and OrderItem entity with a OneToMany relationship.
 * One order can have multiple items. Demonstrate:
 * - Cascade persist from Order to OrderItem
 * - orphanRemoval when items are removed from the collection
 * - JPQL JOIN FETCH to load order + items in one query
 * - Bidirectional mapping with @ManyToOne on child side
 * 
 * Hint:
 * - Order has @OneToMany(mappedBy="order", cascade=ALL, orphanRemoval=true)
 * - OrderItem has @ManyToOne with @JoinColumn
 * - Use addItem() and removeItem() helper methods for both sides
 * - Orphan removal deletes items removed from the collection
 * 
 * Expected Output (Solution):
 * Order #1: 3 items (Total: $60.00)
 *   Item 1: Widget - Qty: 2 - $10.00 each
 *   Item 2: Gadget - Qty: 1 - $25.00 each
 *   Item 3: Doohickey - Qty: 5 - $5.00 each
 * After removing Item 1: 2 items remaining
 */
public class Challenge {

}