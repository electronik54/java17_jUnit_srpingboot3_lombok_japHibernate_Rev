package com.electronik54.revision_3.jpa_hibernate.ch133_jpa_relationships.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/** Verifies @OneToMany/@ManyToOne cascade persistence on H2. */
@SpringBootTest
@Transactional
class OrderRelationshipTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void persistsOrderWithCascadedItems() {
        Order order = new Order("Alice");
        order.addItem(new OrderItem("Apple", 2));
        order.addItem(new OrderItem("Banana", 5));

        Order saved = orderRepository.save(order);
        assertNotNull(saved.getId());

        Optional<Order> reloaded = orderRepository.findById(saved.getId());
        assertTrue(reloaded.isPresent());
        assertEquals(2, reloaded.get().getItems().size());
    }
}