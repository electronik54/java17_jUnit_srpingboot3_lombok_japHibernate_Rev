package com.electronik54.revision_3.jpa_hibernate.ch145_jpa_many_to_many;

/**
 * Challenge 145: JPA @ManyToMany Relationship
 * 
 * Challenge Statement:
 * Create a Student and Course entity with a ManyToMany relationship.
 * Many students can enroll in many courses. Demonstrate:
 * - @JoinTable configuration with join columns and inverse join columns
 * - Adding and removing students from courses bidirectionally
 * - Fetch courses for a student with JOIN FETCH to avoid N+1
 * - Cascade only on the owning side
 * 
 * Hint:
 * - Course is the owning side with @JoinTable
 * - Student has @ManyToMany(mappedBy="students")
 * - Use Set instead of List to avoid Hibernate bag issues
 * - addCourse() and removeCourse() helper methods maintain both sides
 * - Avoid CascadeType.ALL on @ManyToMany (use PERSIST, MERGE instead)
 * 
 * Expected Output (Solution):
 * Student: Alice
 *   Courses: [Math 101, Physics 201, Chemistry 101]
 * Course: Math 101
 *   Students: [Alice, Bob, Charlie]
 * After enrollment change: Alice has 2 courses
 */
public class Challenge {

}