package com.electronik54.revision_3.jpa_hibernate.ch154_hibernate_advanced;

/**
 * Challenge 154: Hibernate Advanced Features
 * 
 * Challenge Statement:
 * Demonstrate advanced Hibernate features:
 * - @DynamicInsert / @DynamicUpdate (only include changed columns)
 * - @SQLDelete (soft delete instead of physical delete)
 * - @Where (filter entities with a condition)
 * - @Formula (calculated field from SQL expression)
 * - Interceptors and event listeners (@PrePersist, @PreUpdate)
 * - Batch fetching and batch size configuration
 * 
 * Hint:
 * - @DynamicInsert(true) excludes null columns from INSERT
 * - @SQLDelete(sql = "UPDATE entity SET deleted=true WHERE id=?")
 * - @Where(clause = "deleted = false") to exclude soft-deleted
 * - @Formula("(SELECT AVG(r.rating) FROM reviews r WHERE r.product_id = id)")
 * - @BatchSize(size = 10) to batch lazy loading
 * 
 * Expected Output (Solution):
 * Before save: @PrePersist fires, sets createdAt
 * Insert: Only non-null columns included (DynamicInsert)
 * Update: Only changed columns updated (DynamicUpdate)
 * Soft delete: UPDATE sets deleted=true (not real DELETE)
 * Query: @Where filters out soft-deleted records
 * Calculated: @Formula provides average rating
 */
public class Challenge {

}