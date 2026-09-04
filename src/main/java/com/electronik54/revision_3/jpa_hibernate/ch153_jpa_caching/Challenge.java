package com.electronik54.revision_3.jpa_hibernate.ch153_jpa_caching;

/**
 * Challenge 153: JPA Caching (1st & 2nd Level)
 * 
 * Challenge Statement:
 * Understand and demonstrate JPA/Hibernate caching levels:
 * - First-level cache (PersistenceContext, per session/transaction)
 * - Second-level cache (shared across sessions, needs provider like EhCache)
 * - Query cache (caches query results with their parameters)
 * Show how the first-level cache reduces SQL queries within a transaction
 * and how to evict entities from the cache.
 * 
 * Hint:
 * - First-level: automatic, within EntityManager/transaction scope
 * - Second-level: @Cacheable, requires @Cache on entity
 * - Query cache: @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
 * - evict() removes from first-level, getCache().evictAllRegions() for second-level
 * - @Cache(usage = CacheConcurrencyStrategy.READ_WRITE) on entity
 * 
 * Expected Output (Solution):
 * Transaction 1:
 *   First query: SQL executed (loads from DB)
 *   Second query: Same entity returned from cache (no SQL)
 * Transaction 2 (new EntityManager):
 *   Query: SQL executed (new persistence context)
 * After evict: SQL executed again
 */
public class Challenge {

}