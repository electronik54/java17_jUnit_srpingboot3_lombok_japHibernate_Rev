package com.electronik54.revision_3.jpa_hibernate.ch149_jpa_queries_jpql.solution;

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
    @Entity @Table(name = "emps_jpql")
    static class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; private String dept; private double salary;
        public Employee() {}
        public Employee(String name, String dept, double salary) { this.name = name; this.dept = dept; this.salary = salary; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public String getDept() { return dept; }
        public double getSalary() { return salary; }
        @Override public String toString() { return name + "($" + (long)salary + ")"; }
    }

    @Repository
    interface EmployeeRepo extends JpaRepository<Employee, Long> {
        List<Employee> findByDept(String dept);
        @Query("SELECT AVG(e.salary) FROM Employee e WHERE e.dept = :dept")
        Double avgSalaryByDept(String dept);
        @Query("SELECT MAX(e.salary) FROM Employee e WHERE e.dept = :dept")
        Double maxSalaryByDept(String dept);
        @Query("SELECT e.dept, COUNT(e) FROM Employee e GROUP BY e.dept")
        List<Object[]> countByDept();
    }

    @Service
    static class QueryService {
        @Autowired private EmployeeRepo repo;
        public void demo() {
            repo.saveAll(List.of(
                new Employee("Alice", "Engineering", 95000),
                new Employee("Bob", "Engineering", 100000),
                new Employee("Charlie", "Engineering", 120000),
                new Employee("Diana", "Sales", 85000),
                new Employee("Eve", "Sales", 90000),
                new Employee("Frank", "HR", 75000)
            ));

            System.out.println("=== Solution 149: JPA Queries - JPQL ===\n");

            System.out.println("Employees in Engineering: " + repo.findByDept("Engineering"));
            System.out.println("Avg salary in Engineering: $" + String.format("%.0f", repo.avgSalaryByDept("Engineering")));
            System.out.println("Highest paid: $" + String.format("%.0f", repo.maxSalaryByDept("Engineering")) + " (Engineering)");

            System.out.println("Department counts:");
            repo.countByDept().forEach(row -> System.out.println("  " + row[0] + ": " + row[1] + " employees"));
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(QueryService.class).demo();
        ctx.close();
    }
}