package com.electronik54.revision_3.corejava.ch105_prototype_pattern.solution;

/**
 * Solution for Challenge 105: Prototype Pattern
 */
public class Solution {

    public static void main(String[] args) {
        Document original = new Document("Report", new java.util.ArrayList<>());
        original.addLine("Intro");
        original.addLine("Body");

        Document cloned = original.clone();

        // Modify only the clone
        cloned.addLine("Conclusion");

        System.out.println("Original content size: " + original.getContent().size());
        System.out.println("Clone content size: " + cloned.getContent().size());
    }
}