package com.electronik54.revision_3.springboot.ch130_spring_exception_handling.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Solution 130: Spring Exception Handling
 *
 * Demonstrates @RestControllerAdvice, @ExceptionHandler,
 * @ResponseStatus, and custom error response DTO.
 */
@SpringBootApplication
public class Solution {

    static class ErrorResponse {
        private int status; private String message; private long timestamp;
        public ErrorResponse(int status, String message) {
            this.status = status; this.message = message;
            this.timestamp = System.currentTimeMillis();
        }
        public int getStatus() { return status; }
        public String getMessage() { return message; }
        public long getTimestamp() { return timestamp; }
    }

    @RestController
    static class DemoController {
        @GetMapping("/api/demo/{id}")
        public String get(@PathVariable Long id) {
            if (id <= 0) throw new IllegalArgumentException("ID must be positive");
            if (id > 100) throw new RuntimeException("Resource not found");
            return "Item #" + id;
        }
    }

    @RestControllerAdvice
    static class GlobalExceptionHandler {
        @ExceptionHandler(IllegalArgumentException.class)
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        public ErrorResponse handleBadArg(IllegalArgumentException e) {
            return new ErrorResponse(400, e.getMessage());
        }

        @ExceptionHandler(RuntimeException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public ErrorResponse handleNotFound(RuntimeException e) {
            return new ErrorResponse(404, e.getMessage());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        System.out.println("=== Solution 130: Spring Exception Handling ===\n");
        System.out.println("Endpoints with error handling:");
        System.out.println("  GET /api/demo/{id}");
        System.out.println("    id=50   -> 200 OK: 'Item #50'");
        System.out.println("    id=0    -> 400 BAD_REQUEST: 'ID must be positive'");
        System.out.println("    id=200  -> 404 NOT_FOUND: 'Resource not found'");
        System.out.println("\nKey annotations:");
        System.out.println("  @RestControllerAdvice = global @ExceptionHandler container");
        System.out.println("  @ExceptionHandler maps exceptions to response");
        System.out.println("  @ResponseStatus sets HTTP status code");
        ctx.close();
    }
}