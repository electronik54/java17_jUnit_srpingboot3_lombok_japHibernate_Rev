package com.electronik54.revision_3.springboot.ch131_spring_data_jpa_basics.solution;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/** Inherits CRUD; defines a derived query from the method name. */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);
}