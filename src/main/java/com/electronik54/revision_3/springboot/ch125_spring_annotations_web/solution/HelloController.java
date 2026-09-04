package com.electronik54.revision_3.springboot.ch125_spring_annotations_web.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/** REST controller showcasing @RestController/@GetMapping/@PathVariable. */
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/api/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}