package com.electronik54.revision_3.corejava.ch157_maven_lifecycle.solution;

/**
 * Solution 157: Maven Lifecycle
 *
 * Maven has three built-in lifecycles:
 * 1. default - handles project deployment
 * 2. clean - cleans the project
 * 3. site - generates site documentation
 *
 * Default lifecycle phases (in order):
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 157: Maven Lifecycle ===\n");
        System.out.println("Default Lifecycle Phases:");
        System.out.println("  1. validate    - Validate project structure and POM");
        System.out.println("  2. initialize - Set up build environment");
        System.out.println("  3. generate-sources - Generate source code");
        System.out.println("  4. process-sources - Process source code");
        System.out.println("  5. compile    - Compile source code (compiler:compile)");
        System.out.println("  6. test       - Run tests (surefire:test)");
        System.out.println("  7. package    - Create JAR/WAR (jar:jar, war:war)");
        System.out.println("  8. verify    - Run integration tests (failsafe:verify)");
        System.out.println("  9. install    - Copy to local .m2 repo (install:install)");
        System.out.println("  10. deploy    - Upload to remote repo (deploy:deploy)");
        System.out.println("\nExample: 'mvn test' runs validate→compile→test");
    }
}