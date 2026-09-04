package com.electronik54.revision_3.corejava.ch86_modules_jpms;

import java.lang.Module;
import java.lang.ModuleLayer;

/**
 * Challenge 86: Module System (JPMS)
 *
 * Problem:
 * Explore the Platform Module System at runtime: list the resolved
 * modules of the boot layer, inspect what the java.base module exports,
 * and understand module descriptors (requires/exports/opens) conceptually.
 * (This project compiles on the CLASSPATH, so it runs in the unnamed module.)
 *
 * Hint:
 * - module-info.java declares: requires, exports, opens, provides...with
 * - exports = public API; opens = reflection access (needed by frameworks/Jackson)
 * - Every classpath JAR lands in the UNNAMED module - that's why everything "just works" without module-info
 * - java.lang.Module and ModuleLayer are the runtime API
 *
 * Expected Output (trimmed):
 * Unnamed module: com.electronik54.revision_3
 * Boot layer has ~70 modules (JDK 17)
 * java.base exports java.lang, java.util, ...
 *
 * TODO:
 * 1. Print this class's module (unnamed)
 * 2. Count modules in ModuleLayer.boot()
 * 3. List a few package names exported by the java.base module
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 86: Modules (JPMS) ===");
        System.out.println("This project runs on the classpath (unnamed module).");
    }
}