package com.electronik54.revision_3.jpa_hibernate.ch143_jpa_one_to_one;

/**
 * Challenge 143: JPA @OneToOne Relationship
 * 
 * Challenge Statement:
 * Create a User and UserProfile entity with a OneToOne relationship.
 * Each user has exactly one profile. The relationship is bidirectional
 * with the owning side (UserProfile) containing the foreign key.
 * Demonstrate saving a user with profile and retrieving them together.
 * 
 * Hint:
 * - UserProfile has @OneToOne with @JoinColumn (owning side)
 * - User has @OneToOne(mappedBy="user") (inverse side)
 * - Use cascade = CascadeType.ALL to save both together
 * - FetchType.LAZY to avoid N+1 queries
 * - @ToString.Exclude on both sides to avoid circular reference
 * 
 * Expected Output (Solution):
 * User: john_doe
 * Profile: John Doe, john@example.com, Bio: Java developer
 * Retrieved together: User and Profile loaded in one operation
 */
public class Challenge {

}