package com.electronik54.revision_3.jpa_hibernate.ch147_jpa_inheritance;

/**
 * Challenge 147: JPA Inheritance Strategies
 * 
 * Challenge Statement:
 * Create an inheritance hierarchy with Vehicle - Car and Bike entities
 * using JPA's inheritance strategies. Demonstrate all three strategies:
 * - SINGLE_TABLE (default, one table for hierarchy)
 * - JOINED (separate tables for parent and child)
 * - TABLE_PER_CLASS (separate tables for each concrete class)
 * Show the pros and cons of each strategy.
 * 
 * Hint:
 * - @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * - @DiscriminatorColumn and @DiscriminatorValue for single table
 * - @PrimaryKeyJoinColumn for joined strategy
 * - SINGLE_TABLE is fastest but allows null columns
 * - JOINED is normalized but requires joins
 * - TABLE_PER_CLASS avoids nulls but uses UNION for queries
 * 
 * Expected Output (Solution):
 * Vehicle hierarchy with all 3 strategies:
 * SINGLE_TABLE: All types in 'vehicle' table (DTYPE column)
 * JOINED: Vehicle + Car + Bike tables (joined by PK)
 * TABLE_PER_CLASS: Separate tables for Car, Bike
 */
public class Challenge {

}