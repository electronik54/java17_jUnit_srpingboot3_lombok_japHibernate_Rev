package com.electronik54.revision_3.jpa_hibernate.ch150_jpa_native_queries;

/**
 * Challenge 150: JPA Native Queries
 * 
 * Challenge Statement:
 * Write native SQL queries using JPA's @Query with nativeQuery=true.
 * Demonstrate:
 * - @Query(value = "SELECT * FROM employees WHERE salary > ?1", nativeQuery = true)
 * - @SqlResultSetMapping for complex result mappings
 * - Named native queries with @NamedNativeQuery
 * - Stored procedure calls with @Procedure
 * - When to use native queries vs JPQL
 * 
 * Hint:
 * - nativeQuery = true in @Query enables SQL instead of JPQL
 * - Use :param syntax for named parameters (not ?1)
 * - @SqlResultSetMapping maps SQL results to entities or DTOs
 * - @Procedure(name = "raise_salary") for stored procedures
 * - Native queries are database-specific (portability trade-off)
 * 
 * Expected Output (Solution):
 * Native query: SELECT * FROM employees WHERE salary > 80000
 * Results: [Alice ($95k), Bob ($100k), Charlie ($120k)]
 * Named native query result: same results
 */
public class Challenge {

}