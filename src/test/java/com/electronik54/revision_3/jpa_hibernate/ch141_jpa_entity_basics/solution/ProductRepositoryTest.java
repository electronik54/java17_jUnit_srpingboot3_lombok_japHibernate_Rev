package com.electronik54.revision_3.jpa_hibernate.ch141_jpa_entity_basics.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/** Context boot + real H2 test for the Product entity/repository. */
@SpringBootTest
@Transactional
class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    void saveAndFindProduct() {
        Product saved = repository.save(new Product("Laptop", 999.99));
        assertNotNull(saved.getId());

        Optional<Product> found = repository.findById(saved.getId());
        assertTrue(found.isPresent());
        assertEquals("Laptop", found.get().getName());
        assertEquals(999.99, found.get().getPrice(), 0.001);
    }
}