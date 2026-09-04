package com.electronik54.revision_3.corejava.ch160_git_basics.solution;

/**
 * Solution 160: Git Basics
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 160: Git Basics ===\n");
        System.out.println("Git Core Concepts:");
        System.out.println("  Working Directory → Staging Area (index) → Local Repo → Remote Repo");
        System.out.println("         git add             git commit         git push");
        System.out.println("\nKey Commands:");
        System.out.println("  git init     - Create new repository");
        System.out.println("  git clone    - Copy remote repo locally");
        System.out.println("  git add .    - Stage all changes");
        System.out.println("  git commit -m 'msg' - Commit staged changes");
        System.out.println("  git push     - Upload to remote");
        System.out.println("  git pull     - Download from remote");
        System.out.println("  git branch   - List/create branches");
        System.out.println("  git merge    - Combine branches");
        System.out.println("  git log      - Show commit history");
        System.out.println("  git status   - Show working directory state");
        System.out.println("\nBranching Strategy (GitFlow):");
        System.out.println("  main → develop → feature/* → release/* → hotfix/*");
    }
}