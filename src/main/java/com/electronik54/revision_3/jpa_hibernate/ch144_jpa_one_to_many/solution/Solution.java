package com.electronik54.revision_3.jpa_hibernate.ch144_jpa_one_to_many.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "orders")
    static class Order {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
        private List<OrderItem> items = new ArrayList<>();
        public Long getId() { return id; }
        public List<OrderItem> getItems() { return items; }
        public void addItem(OrderItem item) { items.add(item); item.setOrder(this); }
        public void removeItem(OrderItem item) { items.remove(item); item.setOrder(null); }
        public double getTotal() { return items.stream().mapToDouble(OrderItem::getSubtotal).sum(); }
    }

    @Entity @Table(name = "order_items")
    static class OrderItem {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String productName; private int quantity; private double price;
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "order_id")
        private Order order;
        public OrderItem() {}
        public OrderItem(String productName, int quantity, double price) {
            this.productName = productName; this.quantity = quantity; this.price = price;
        }
        public Long getId() { return id; }
        public String getProductName() { return productName; }
        public int getQuantity() { return quantity; }
        public double getPrice() { return price; }
        public double getSubtotal() { return quantity * price; }
        public Order getOrder() { return order; }
        public void setOrder(Order order) { this.order = order; }
    }

    @Repository
    interface OrderRepo extends JpaRepository<Order, Long> {}

    @Service
    static class OrderService {
        @Autowired private OrderRepo repo;
        public void demo() {
            Order order = new Order();
            order.addItem(new OrderItem("Widget", 2, 10.00));
            order.addItem(new OrderItem("Gadget", 1, 25.00));
            order.addItem(new OrderItem("Doohickey", 5, 5.00));
            repo.save(order);

            System.out.println("=== Solution 144: @OneToMany ===\n");
            Order found = repo.findById(1L).orElseThrow();
            System.out.println("Order #" + found.getId() + ": " + found.getItems().size() + " items (Total: $" + String.format("%.2f", found.getTotal()) + ")");
            found.getItems().forEach(i -> System.out.println("  " + i.getProductName() + " - Qty: " + i.getQuantity() + " - $" + String.format("%.2f", i.getPrice()) + " each"));

            found.removeItem(found.getItems().get(0));
            repo.save(found);
            Order afterRemove = repo.findById(1L).orElseThrow();
            System.out.println("After removing Item 1: " + afterRemove.getItems().size() + " items remaining");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(OrderService.class).demo();
        ctx.close();
    }
}