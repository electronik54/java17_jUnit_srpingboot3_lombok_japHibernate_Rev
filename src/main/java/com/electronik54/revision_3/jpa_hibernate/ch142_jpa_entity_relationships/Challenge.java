package com.electronik54.revision_3.jpa_hibernate.ch142_jpa_entity_relationships;

/**
 * Challenge 142: JPA Entity Relationships
 * 
 * Challenge Statement:
 * Design a data model for a Library Management System demonstrating all 
 * JPA relationship types. Create entities: Author, Book, Publisher, 
 * LibraryBranch. Author has OneToMany with Book. Publisher has OneToOne 
 * with Book. Book has ManyToMany with LibraryBranch. Include proper 
 * cascade types, fetch strategies, and mappedBy configuration.
 * 
 * Hint:
 * - @OneToMany(mappedBy="author", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
 * - @ManyToOne(fetch=FetchType.LAZY) with @JoinColumn
 * - @ManyToMany with @JoinTable for join table configuration
 * - @OneToOne with @JoinColumn(unique=true)
 * - Use bidirectional vs unidirectional appropriately
 * 
 * Expected Output (Solution):
 * Author: J.K. Rowling
 *   Books: [Harry Potter and the Sorcerer's Stone, Harry Potter and the Chamber...]
 * Publisher: Bloomsbury (associated with Book #1)
 * Libraries: [Central Library, City Library] carry Book #1
 */
public class Challenge {

}