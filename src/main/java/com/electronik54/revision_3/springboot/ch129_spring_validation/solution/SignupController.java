package com.electronik54.revision_3.springboot.ch129_spring_validation.solution;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Validates the request body with @Valid. */
@RestController
public class SignupController {

    @PostMapping("/api/signup")
    public String signup(@Valid @RequestBody SignupRequest request) {
        return "Signed up " + request.getEmail();
    }
}