package com.electronik54.revision_3.springboot.ch129_spring_validation;

/**
 * Challenge 129: Spring Validation (@Valid, @NotBlank, @Min)
 *
 * Problem:
 * Create a DTO 'SignupRequest' with validation annotations and a REST
 * controller that accepts it with @Valid. Show that invalid input returns
 * 400 and valid input passes. Use annotations: @NotBlank, @Email, @Size,
 * @Min.
 *
 * Hint:
 * - Bean validation annotations live in jakarta.validation.constraints
 * - @Valid on a @RequestBody triggers validation automatically
 * - spring-boot-starter-web includes Hibernate Validator
 *
 * Expected Output (curl):
 * POST /api/signup  {"email":"bad","age":5} -> 400 (validation errors)
 * POST /api/signup  {"email":"a@b.com","age":20} -> 200 "Signed up"
 *
 * TODO:
 * 1. Create SignupRequest with @NotBlank, @Email, @Min(18)
 * 2. Create a SignupController with @PostMapping + @Valid
 * 3. Start the app (or @WebMvcTest) and send both requests
 *
 * Spring bean + validation DTO. Run via the app or a web test.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 129: Spring Validation ===");
    }
}