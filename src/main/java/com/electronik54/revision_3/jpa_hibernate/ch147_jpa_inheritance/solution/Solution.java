package com.electronik54.revision_3.jpa_hibernate.ch147_jpa_inheritance.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Solution {
    @Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    @DiscriminatorColumn(name = "vehicle_type")
    static abstract class Vehicle {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String brand; private String model;
        public Vehicle() {}
        public Vehicle(String brand, String model) { this.brand = brand; this.model = model; }
        public Long getId() { return id; }
        public String getBrand() { return brand; }
        public String getModel() { return model; }
        public abstract String getTypeInfo();
    }

    @Entity @DiscriminatorValue("CAR")
    static class Car extends Vehicle {
        private int doors;
        public Car() {}
        public Car(String brand, String model, int doors) { super(brand, model); this.doors = doors; }
        public int getDoors() { return doors; }
        @Override public String getTypeInfo() { return "Car with " + doors + " doors"; }
    }

    @Entity @DiscriminatorValue("BIKE")
    static class Bike extends Vehicle {
        private boolean hasBasket;
        public Bike() {}
        public Bike(String brand, String model, boolean hasBasket) { super(brand, model); this.hasBasket = hasBasket; }
        public boolean isHasBasket() { return hasBasket; }
        @Override public String getTypeInfo() { return "Bike" + (hasBasket ? " with basket" : ""); }
    }

    @Repository
    interface VehicleRepo extends JpaRepository<Vehicle, Long> {}

    @Service
    static class VehicleService {
        @Autowired private VehicleRepo repo;
        public void demo() {
            repo.save(new Car("Toyota", "Camry", 4));
            repo.save(new Bike("Giant", "Escape", true));
            repo.save(new Car("Honda", "Civic", 2));

            System.out.println("=== Solution 147: JPA Inheritance (SINGLE_TABLE) ===\n");
            System.out.println("All vehicles in single 'vehicle' table:");
            repo.findAll().forEach(v -> System.out.println("  " + v.getBrand() + " " + v.getModel() + " - " + v.getTypeInfo()));
            System.out.println("\nSchema: Single table (vehicle) with DTYPE discriminator column");
            System.out.println("Pro: Fast queries (no joins), simple schema");
            System.out.println("Con: Null columns for unused subclass fields");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(VehicleService.class).demo();
        ctx.close();
    }
}