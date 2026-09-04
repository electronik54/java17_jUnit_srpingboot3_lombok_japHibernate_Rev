package com.electronik54.revision_3.corejava.ch169_interview_prep;

/**
 * Challenge 169: Debugging Techniques
 * 
 * Challenge Statement:
 * Master debugging techniques for Java applications:
 * - IntelliJ IDEA debugger: breakpoints, step over/into, watch
 * - Conditional breakpoints for specific states
 * - Evaluating expressions during debug sessions
 * - Thread debugging for concurrent issues
 * - Remote debugging for deployed applications
 * - Logging vs debugging: when to use each
 * 
 * Demonstrate by debugging a buggy binary search implementation.
 * 
 * Expected Output:
 * Bug found: Off-by-one error in binary search mid calculation
 * Fix: (low + high) >>> 1 instead of (low + high) / 2
 * Root cause: Integer overflow when low + high exceeds MAX_INT
 */
public class Challenge {

}