package com.electronik54.revision_3.springboot.ch124_spring_annotations_core.solution;

import org.springframework.stereotype.Service;

import java.util.List;

/** @Service — business layer, depends on repository via DI. */
@Service
public class CustomerService {

    private final CustomerStore customerStore;

    public CustomerService(CustomerStore customerStore) {
        this.customerStore = customerStore;
    }

    public List<String> getCustomers() {
        return customerStore.findAll();
    }
}