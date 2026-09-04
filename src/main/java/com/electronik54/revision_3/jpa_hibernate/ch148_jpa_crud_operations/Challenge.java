package com.electronik54.revision_3.jpa_hibernate.ch148_jpa_crud_operations;

/**
 * Challenge 148: JPA CRUD Operations
 * 
 * Challenge Statement:
 * Perform full CRUD operations using JpaRepository on an Employee entity.
 * Include: save (create), findById (read), update (merge), delete.
 * Also demonstrate:
 * - saveAll() for batch insert
 * - findAll() with sorting
 * - deleteById() vs delete()
 * - existsById() for existence check
 * - EntityManager flush() and refresh()
 * 
 * Hint:
 * - save() persists new and updates existing (based on ID presence)
 * - findById() returns Optional<Employee>
 * - Use @Transactional for read-write operations
 * - flush() forces synchronization to DB
 * - refresh() reloads entity state from DB
 * 
 * Expected Output (Solution):
 * Created: Employee(id=1, name=Alice)
 * Found by ID: Employee(id=1, name=Alice)
 * Updated: Employee(id=1, name=Alice Johnson)
 * Exists: true
 * Deleted: Employee with id=1 no longer exists
 * Count after delete: 4 employees remaining
 */
public class Challenge {

}