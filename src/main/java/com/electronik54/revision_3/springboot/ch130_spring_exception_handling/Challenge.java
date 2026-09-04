package com.electronik54.revision_3.springboot.ch130_spring_exception_handling;

/**
 * Challenge 130: Spring Exception Handling (@RestControllerAdvice)
 *
 * Problem:
 * Centralize exception handling with @RestControllerAdvice and
 * @ExceptionHandler. Create a custom ResourceNotFoundException, throw it from
 * a controller, and map it to a 404 JSON response with a consistent error body.
 *
 * Hint:
 * - @RestControllerAdvice defines a global exception handler for all controllers
 * - @ExceptionHandler(SomeException.class) maps that exception to a response
 * - @ResponseStatus sets the HTTP status on the exception
 *
 * Expected Output (curl):
 * GET /api/users/999 -> 404 {"error":"User not found","status":404}
 *
 * TODO:
 * 1. Create ResourceNotFoundException and mark @ResponseStatus(NOT_FOUND)
 * 2. Create a UserController that throws it for id > 3
 * 3. Create GlobalExceptionHandler with @RestControllerAdvice + @ExceptionHandler
 *
 * Spring beans. Verify by starting the app and curling.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 130: Spring Exception Handling ===");
    }
}