package com.electronik54.revision_3.jpa_hibernate.ch151_jpa_criteria_api;

/**
 * Challenge 151: JPA Criteria API
 * 
 * Challenge Statement:
 * Use JPA Criteria API to build dynamic queries programmatically.
 * Create a search method that filters employees by multiple optional
 * criteria: department, minSalary, maxSalary, nameKeyword.
 * Demonstrate:
 * - CriteriaBuilder and CriteriaQuery creation
 * - Predicate composition with and() / or()
 * - Path expressions for nested properties
 * - CriteriaQuery.multiselect() for DTO projections
 * - Order by with CriteriaBuilder.asc()/desc()
 * 
 * Hint:
 * - CriteriaBuilder from EntityManager.getCriteriaBuilder()
 * - CriteriaQuery<Employee> for typed queries
 * - Combine predicates with cb.and(predicates.toArray())
 * - cb.like(root.get("name"), "%" + keyword + "%") for LIKE
 * - Use Specification<T> pattern (Spring Data JPA) for cleaner code
 * 
 * Expected Output (Solution):
 * Dynamic search: department=Engineering, minSalary=80000
 * Found 2 employees matching criteria
 * Results: [Bob ($100k), Charlie ($120k)]
 */
public class Challenge {

}