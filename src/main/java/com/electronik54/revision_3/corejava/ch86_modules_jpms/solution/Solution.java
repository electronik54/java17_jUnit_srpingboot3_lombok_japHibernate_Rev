package com.electronik54.revision_3.corejava.ch86_modules_jpms.solution;

import java.lang.module.ModuleDescriptor;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 86: Module System (JPMS)
 *
 * Demonstrates: runtime module introspection without a module-info.java.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Which module does this class live in?
        Module unnamed = Solution.class.getModule();
        System.out.println("This class's module: " + unnamed.getName()
                + " (null name = unnamed/classpath module)");

        // 2. Modules in the boot layer
        long moduleCount = ModuleLayer.boot().modules().size();
        System.out.println("Boot layer modules: " + moduleCount);

        // 3. What does java.base export?
        Module base = ModuleLayer.boot().findModule("java.base").orElseThrow();
        ModuleDescriptor descriptor = base.getDescriptor();
        List<String> exported = descriptor.exports().stream()
                .map(ModuleDescriptor.Exports::source)
                .filter(p -> p.startsWith("java.lang") || p.startsWith("java.util"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("java.base exports (lang/util): " + exported);

        // Key JPMS keywords explained in comments:
        // module com.example.app {
        //     requires java.net.http;        // dependency on another module
        //     requires spring.context;       // transitive not implied
        //     exports com.example.app.api;   // public API for others
        //     opens com.example.app.model;   // deep reflection (Jackson, Hibernate)
        //     provides com.example.spi.Plugin with com.example.app.MyPlugin;
        // }
        System.out.println("Descriptor concepts: requires, exports, opens, provides...with");
    }
}