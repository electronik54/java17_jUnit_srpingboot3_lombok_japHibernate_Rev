package com.electronik54.revision_3.springboot.ch131_spring_data_jpa_basics.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Context boot + H2 test for the derived query + inherited CRUD. */
@SpringBootTest
@Transactional
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    void inheritedCrudAndDerivedQueryWork() {
        repository.save(new Customer("Alice", "alice@example.com"));
        repository.save(new Customer("Bob", "bob@example.com"));

        assertEquals(2, repository.count());

        List<Customer> alices = repository.findByName("Alice");
        assertEquals(1, alices.size());

        List<Customer> all = repository.findAll();
        assertEquals(List.of("Alice", "Bob"), all.stream().map(Customer::getName).toList());
    }
}