package com.electronik54.revision_3.jpa_hibernate.ch141_jpa_entity_basics.solution;

import org.springframework.data.jpa.repository.JpaRepository;

/** Spring Data repository - CRUD without writing SQL. */
public interface ProductRepository extends JpaRepository<Product, Long> {
}