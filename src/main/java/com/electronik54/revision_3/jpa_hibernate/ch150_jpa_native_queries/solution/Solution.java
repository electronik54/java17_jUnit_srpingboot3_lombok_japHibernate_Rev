package com.electronik54.revision_3.jpa_hibernate.ch150_jpa_native_queries.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "emps_native")
    static class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; private double salary;
        public Employee() {}
        public Employee(String name, double salary) { this.name = name; this.salary = salary; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public double getSalary() { return salary; }
        @Override public String toString() { return name + " ($" + (long)salary + ")"; }
    }

    @Repository
    interface EmployeeRepo extends JpaRepository<Employee, Long> {
        @Query(value = "SELECT * FROM emps_native WHERE salary > :minSalary", nativeQuery = true)
        List<Employee> findBySalaryGreaterThan(double minSalary);

        @Query(value = "SELECT name, salary FROM emps_native ORDER BY salary DESC", nativeQuery = true)
        List<Object[]> findAllNamesAndSalaries();

        @Query(value = "SELECT COUNT(*) FROM emps_native WHERE salary > 80000", nativeQuery = true)
        long countHighEarners();
    }

    @Service
    static class NativeService {
        @Autowired private EmployeeRepo repo;
        public void demo() {
            repo.saveAll(List.of(
                new Employee("Alice", 95000), new Employee("Bob", 100000),
                new Employee("Charlie", 120000), new Employee("Diana", 70000)
            ));

            System.out.println("=== Solution 150: Native Queries ===\n");
            System.out.println("Native: SELECT * WHERE salary > 80000");
            repo.findBySalaryGreaterThan(80000).forEach(e -> System.out.println("  " + e));
            System.out.println("\nNative: SELECT name, salary ORDER BY salary DESC");
            repo.findAllNamesAndSalaries().forEach(r -> System.out.println("  " + r[0] + ": $" + r[1]));
            System.out.println("\nHigh earners (>$80k): " + repo.countHighEarners());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(NativeService.class).demo();
        ctx.close();
    }
}