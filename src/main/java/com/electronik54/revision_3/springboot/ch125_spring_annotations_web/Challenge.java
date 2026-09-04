package com.electronik54.revision_3.springboot.ch125_spring_annotations_web;

/**
 * Challenge 125: Spring Annotations - Web (@RestController, @GetMapping)
 *
 * Problem:
 * Build a REST controller exposing:
 *   GET /api/hello -> "Hello, World!"
 *   GET /api/hello/{name} -> "Hello, {name}!"
 * Use @RestController, @GetMapping, @PathVariable.
 *
 * Hint:
 * - @RestController = @Controller + @ResponseBody (returns JSON/string directly)
 * - @GetMapping("/path") maps GET requests
 * - @PathVariable binds a path segment to a method parameter
 *
 * Expected Output (curl):
 * GET /api/hello -> Hello, World!
 * GET /api/hello/John -> Hello, John!
 *
 * TODO:
 * 1. Create HelloController in the solution package
 * 2. Add a no-arg GET /api/hello and a GET /api/hello/{name}
 * 3. Run the app (or a @WebMvcTest) and hit both endpoints
 *
 * Spring bean — component-scanned; verify via integration test or curl when running the app.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 125: Spring Web Annotations ===");
    }
}