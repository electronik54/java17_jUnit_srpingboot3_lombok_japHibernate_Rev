package com.electronik54.revision_3.springboot.ch125_spring_annotations_web.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Solution 125: Spring Web Annotations
 *
 * Demonstrates @RestController, @GetMapping, @PostMapping,
 * @PathVariable, @RequestParam, @RequestBody, @ResponseStatus
 */
@SpringBootApplication
public class Solution {

    @RestController
    @RequestMapping("/api/users")
    static class UserController {
        @GetMapping("/{id}")
        public String getUser(@PathVariable Long id) {
            return "User #" + id;
        }

        @GetMapping
        public String listUsers(@RequestParam(defaultValue = "1") int page) {
            return "Users page " + page;
        }

        @PostMapping
        @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
        public String createUser(@RequestBody String name) {
            return "Created: " + name;
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        System.out.println("=== Solution 125: Spring Web Annotations ===\n");
        System.out.println("Endpoints registered:");
        System.out.println("  GET  /api/users/{id}     - @GetMapping + @PathVariable");
        System.out.println("  GET  /api/users?page=1   - @GetMapping + @RequestParam");
        System.out.println("  POST /api/users           - @PostMapping + @RequestBody + @ResponseStatus(201)");
        System.out.println("\nKey annotations:");
        System.out.println("  @RestController = @Controller + @ResponseBody");
        System.out.println("  @RequestMapping at class level sets base path");
        System.out.println("  @PathVariable extracts URI template variables");
        System.out.println("  @RequestParam extracts query parameters");
        ctx.close();
    }
}