package com.electronik54.revision_3.jpa_hibernate.ch133_jpa_relationships.solution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}