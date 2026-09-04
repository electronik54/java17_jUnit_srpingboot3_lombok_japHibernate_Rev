package com.electronik54.revision_3.springboot.ch132_spring_data_jpa_repositories;

/**
 * Challenge 132: Spring Data JPA Repositories
 * 
 * Challenge Statement:
 * Create a custom JpaRepository for a Product entity with additional query methods:
 * - findByPriceBetween(double min, double max)
 * - findByNameContainingIgnoreCase(String keyword)
 * - countByCategory(String category)
 * - @Query with JPQL to find top 3 most expensive products
 * Also demonstrate pagination and sorting using Pageable and Sort.
 * 
 * Hint:
 * - Extend JpaRepository<Product, Long> and add custom query methods
 * - Use @Query for custom JPQL queries
 * - Use Pageable and Sort parameters in repository methods
 * - Service layer should demonstrate the repository methods
 * - H2 database (already configured) with some test data
 * 
 * Expected Output (Solution):
 * Products between $10-$50: [ProductA, ProductB]
 * Products containing 'pro': [ProductA, ProductC]
 * Count of 'Electronics' products: 5
 * Top 3 most expensive: [ProductX, ProductY, ProductZ]
 */
public class Challenge {

}