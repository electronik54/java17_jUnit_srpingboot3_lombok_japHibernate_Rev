package com.electronik54.revision_3.springboot.ch131_spring_data_jpa_basics;

/**
 * Challenge 131: Spring Data JPA Basics (@Entity, @Id, JpaRepository)
 *
 * Problem:
 * Create a Customer entity and a CustomerRepository extending
 * JpaRepository<Customer, Long>. Demonstrate the inherited CRUD methods:
 * save(), findById(), findAll(), deleteById() - no SQL or boilerplate.
 *
 * Hint:
 * - JpaRepository extends PagingAndSortingRepository + QueryByExampleExecutor
 * - It provides save, findById, findAll, count, delete, existsById out of the box
 * - Derived queries: List<Customer> findByName(String name) - Spring derives JPQL
 *   from the method name
 *
 * Expected Output (test run):
 * All customers: [Alice, Bob]
 * findByName('Alice') size = 1
 *
 * TODO:
 * 1. Create Customer entity (id, name, email)
 * 2. Create CustomerRepository with derived query findByName
 * 3. Boot a context test that saves and reads customers
 *
 * Ch141 has a working Product example; this challenge extends the concept.
 * The solution/test lives under solution/ + src/test.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 131: Spring Data JPA Basics ===");
    }
}