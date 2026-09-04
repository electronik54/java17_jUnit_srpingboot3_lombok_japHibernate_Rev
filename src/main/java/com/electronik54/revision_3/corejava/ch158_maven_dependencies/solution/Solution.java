package com.electronik54.revision_3.corejava.ch158_maven_dependencies.solution;

/**
 * Solution 158: Maven Dependencies & Scopes
 *
 * Maven dependency scopes control when dependencies are available:
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 158: Maven Dependencies & Scopes ===\n");
        System.out.println("Dependency Scopes:");
        System.out.println("  compile  - Available everywhere (default)");
        System.out.println("  provided - Available at compile, NOT at runtime");
        System.out.println("  runtime  - Not needed for compile, needed at runtime");
        System.out.println("  test     - Only for test compilation and execution");
        System.out.println("  system   - Provided, must specify systemPath (rare)");
        System.out.println("  import   - Only for dependencyManagement (BOM)");
        System.out.println("\nExamples from this project:");
        System.out.println("  spring-boot-starter-web → compile");
        System.out.println("  lombok                 → compile (annotation processing)");
        System.out.println("  h2                     → runtime (not needed to compile)");
        System.out.println("  junit-jupiter          → test");
        System.out.println("\nKey commands:");
        System.out.println("  mvn dependency:tree    - Show full dependency tree");
        System.out.println("  mvn dependency:resolve - Resolve and list dependencies");
    }
}