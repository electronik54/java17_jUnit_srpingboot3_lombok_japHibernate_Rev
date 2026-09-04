package com.electronik54.revision_3.jpa_hibernate.ch148_jpa_crud_operations.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "employees_crud")
    static class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; private String dept; private double salary;
        public Employee() {}
        public Employee(String name, String dept, double salary) { this.name = name; this.dept = dept; this.salary = salary; }
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDept() { return dept; }
        public double getSalary() { return salary; }
        @Override public String toString() { return "Employee(id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ")"; }
    }

    @Repository
    interface EmployeeRepo extends JpaRepository<Employee, Long> {}

    @Service
    static class CrudService {
        @Autowired private EmployeeRepo repo;

        @org.springframework.transaction.annotation.Transactional
        public void demo() {
            System.out.println("=== Solution 148: JPA CRUD Operations ===\n");

            Employee alice = repo.save(new Employee("Alice", "Engineering", 95000));
            repo.saveAll(List.of(new Employee("Bob", "Engineering", 100000), new Employee("Charlie", "Sales", 80000)));
            System.out.println("Created: " + alice);

            Employee found = repo.findById(alice.getId()).orElseThrow();
            System.out.println("Found by ID: " + found);

            found.setName("Alice Johnson");
            Employee updated = repo.save(found);
            System.out.println("Updated: " + updated);

            System.out.println("Exists: " + repo.existsById(alice.getId()));

            repo.delete(updated);
            System.out.println("Deleted: Employee with id=" + alice.getId() + " exists? " + repo.existsById(alice.getId()));

            System.out.println("Count after delete: " + repo.count() + " employees remaining");
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(CrudService.class).demo();
        ctx.close();
    }
}