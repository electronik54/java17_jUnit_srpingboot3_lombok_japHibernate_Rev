package com.electronik54.revision_3.jpa_hibernate.ch146_jpa_many_to_one;

/**
 * Challenge 146: JPA @ManyToOne Relationship
 * 
 * Challenge Statement:
 * Create a Comment and Post entity where many comments belong to one post.
 * Focus on the @ManyToOne side (the owning side with the foreign key).
 * Demonstrate:
 * - FetchType.LAZY to avoid loading the Post when not needed
 * - @JoinColumn(name = "post_id") for FK column
 * - Cascading from Comment to Post (many-to-one cascade is less common)
 * - Query comments with their post using JOIN FETCH
 * 
 * Hint:
 * - @ManyToOne(fetch = FetchType.LAZY) on Comment
 * - @JoinColumn(name = "post_id", nullable = false)
 * - Post has @OneToMany(mappedBy = "post") for inverse side
 * - Use Optional<Post> when findById may return null
 * - CascadeType.ALL from many-to-one is rarely used (risky)
 * 
 * Expected Output (Solution):
 * Post: "Java 17 Features"
 *   Comment 1: "Great article!"
 *   Comment 2: "Thanks for sharing"
 *   Comment 3: "Very helpful"
 * Comments count: 3
 */
public class Challenge {

}