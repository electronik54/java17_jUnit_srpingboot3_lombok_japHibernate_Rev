package com.electronik54.revision_3.jpa_hibernate.ch149_jpa_queries_jpql;

/**
 * Challenge 149: JPA Queries - JPQL
 * 
 * Challenge Statement:
 * Write JPQL queries for an Employee entity with department and salary fields.
 * Demonstrate:
 * - Named queries (@NamedQuery on entity)
 * - Dynamic queries with @Query annotation
 * - Aggregate queries (AVG, SUM, COUNT, MAX, MIN)
 * - JOIN FETCH to avoid N+1 queries
 * - Subqueries and CASE expressions
 * - Pagination with JPQL
 * 
 * Hint:
 * - @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.dept = :dept")
 * - @Query("SELECT e FROM Employee e JOIN FETCH e.department")
 * - Aggregates: @Query("SELECT AVG(e.salary) FROM Employee e WHERE e.dept = :dept")
 * - Use LIKE for pattern matching in JPQL
 * 
 * Expected Output (Solution):
 * Employees in Engineering: [Alice, Bob, Charlie]
 * Average salary in Engineering: $95,000
 * Highest paid: $120,000 (Engineering)
 * Department employee counts: {Engineering: 3, Sales: 2, HR: 1}
 */
public class Challenge {

}