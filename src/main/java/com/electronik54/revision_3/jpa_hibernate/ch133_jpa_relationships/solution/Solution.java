package com.electronik54.revision_3.jpa_hibernate.ch133_jpa_relationships.solution;

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
    @Entity static class Department {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
        private List<Employee> employees = new ArrayList<>();
        public Department() {}
        public Department(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public List<Employee> getEmployees() { return employees; }
        public void addEmployee(Employee e) { employees.add(e); e.setDepartment(this); }
    }

    @Entity static class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @ManyToOne @JoinColumn(name = "dept_id")
        private Department department;
        @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
        private ParkingSpot parkingSpot;
        public Employee() {}
        public Employee(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public Department getDepartment() { return department; }
        public void setDepartment(Department d) { this.department = d; }
        public ParkingSpot getParkingSpot() { return parkingSpot; }
        public void setParkingSpot(ParkingSpot p) { this.parkingSpot = p; p.setEmployee(this); }
    }

    @Entity static class ParkingSpot {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String spotNumber;
        @OneToOne @JoinColumn(name = "emp_id", unique = true)
        private Employee employee;
        public ParkingSpot() {}
        public ParkingSpot(String spotNumber) { this.spotNumber = spotNumber; }
        public Long getId() { return id; }
        public String getSpotNumber() { return spotNumber; }
        public Employee getEmployee() { return employee; }
        public void setEmployee(Employee e) { this.employee = e; }
    }

    @Repository interface DeptRepo extends JpaRepository<Department, Long> {}

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        DeptRepo repo = ctx.getBean(DeptRepo.class);

        Department dept = new Department("Engineering");
        Employee emp = new Employee("Alice");
        emp.setParkingSpot(new ParkingSpot("A-42"));
        dept.addEmployee(emp);
        repo.save(dept);

        System.out.println("=== Solution 133: JPA Relationships ===\n");
        Department found = repo.findById(1L).orElseThrow();
        System.out.println("Department: " + found.getName());
        found.getEmployees().forEach(e -> {
            System.out.println("  Employee: " + e.getName());
            if (e.getParkingSpot() != null)
                System.out.println("    Parking: " + e.getParkingSpot().getSpotNumber());
        });
        System.out.println("\nRelationship types:");
        System.out.println("  @OneToMany (Department -> Employee) with mappedBy");
        System.out.println("  @ManyToOne (Employee -> Department) owning side");
        System.out.println("  @OneToOne  (Employee <-> ParkingSpot) bidirectional");
        ctx.close();
    }
}