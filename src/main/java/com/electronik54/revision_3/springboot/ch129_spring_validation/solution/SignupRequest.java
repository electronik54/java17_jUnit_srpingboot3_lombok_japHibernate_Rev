package com.electronik54.revision_3.springboot.ch129_spring_validation.solution;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/** DTO with bean-validation constraints. */
public class SignupRequest {

    @NotBlank(message = "name is required")
    @Size(min = 2, max = 30)
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "invalid email")
    private String email;

    @Min(value = 18, message = "must be an adult")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}