package com.electronik54.revision_3.springboot.ch139_spring_rest_clients.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Solution 139: Spring REST Clients
 *
 * Demonstrates:
 * - RestTemplate with RestTemplateBuilder
 * - Mapping JSON response to Java records
 * - Error handling with try-catch
 * - Building URL with path variables
 */
@SpringBootApplication
public class Solution {

    public record Post(int userId, int id, String title, String body) {}

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(RestClientDemo.class).run();
        ctx.close();
    }

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    static class RestClientDemo implements CommandLineRunner {
        private final RestTemplate restTemplate;

        RestClientDemo(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        @Override
        public void run(String... args) {
            System.out.println("=== Solution 139: Spring REST Clients ===\n");

            String url = "https://jsonplaceholder.typicode.com/posts?_limit=3";
            
            try {
                var response = restTemplate.getForEntity(url, Post[].class);
                System.out.println("Status: " + response.getStatusCode());
                System.out.println("Content-Type: " + response.getHeaders().getContentType());
                
                List<Post> posts = List.of(response.getBody());
                posts.forEach(p -> System.out.printf("Post #%d: %s%n", p.id(), p.title()));
                
            } catch (Exception e) {
                System.out.println("API call failed (expected offline): " + e.getMessage());
                System.out.println("\nRestTemplate alternatives:");
                System.out.println("- WebClient (reactive, Spring WebFlux)");
                System.out.println("- RestClient (fluent, Spring Boot 3.2+)");
                System.out.println("- OpenFeign (declarative HTTP client)");
            }

            System.out.println("\n=== Key Takeaways ===");
            System.out.println("- RestTemplate: blocking, simple, widely used (semi-deprecated)");
            System.out.println("- WebClient: reactive, non-blocking, high scalability");
            System.out.println("- RestClient: modern fluent API, same blocking model");
            System.out.println("- Error handling: ResponseErrorHandler or try-catch");
        }
    }
}