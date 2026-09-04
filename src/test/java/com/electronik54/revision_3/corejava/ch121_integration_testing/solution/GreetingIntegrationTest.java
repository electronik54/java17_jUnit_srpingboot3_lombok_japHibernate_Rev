package com.electronik54.revision_3.corejava.ch121_integration_testing.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration test - boots the full Spring context (not a unit test).
 */
@SpringBootTest
@AutoConfigureMockMvc
class GreetingIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greet_returnsHelloWorld() throws Exception {
        mockMvc.perform(get("/api/greet").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, World!"));
    }
}