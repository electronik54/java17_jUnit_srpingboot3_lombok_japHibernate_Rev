package com.electronik54.revision_3.corejava.ch121_integration_testing.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Minimal REST controller used by the @SpringBootTest integration test.
 * Being in com.electronik54.revision_3.* it is component-scanned by
 * Revision3Application.
 */
@RestController
public class GreetingRestController {

    @GetMapping("/api/greet")
    public Map<String, String> greet() {
        return Map.of("message", "Hello, World!");
    }
}