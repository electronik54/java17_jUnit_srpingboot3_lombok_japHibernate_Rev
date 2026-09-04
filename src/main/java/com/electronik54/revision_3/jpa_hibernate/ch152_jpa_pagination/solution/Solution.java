package com.electronik54.revision_3.jpa_hibernate.ch152_jpa_pagination.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "emps_page")
    static class Employee {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; private double salary;
        public Employee() {}
        public Employee(String name, double salary) { this.name = name; this.salary = salary; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public double getSalary() { return salary; }
        @Override public String toString() { return name + "($" + (long)salary + ")"; }
    }

    @Repository
    interface EmployeeRepo extends JpaRepository<Employee, Long> {}

    @Service
    static class PageService {
        @Autowired private EmployeeRepo repo;
        public void demo() {
            for (int i = 1; i <= 10; i++)
                repo.save(new Employee("Emp" + i, 50000 + i * 5000));

            System.out.println("=== Solution 152: Pagination & Sorting ===\n");

            PageRequest pageReq = PageRequest.of(0, 2, Sort.by(Sort.Direction.DESC, "salary"));
            Page<Employee> page = repo.findAll(pageReq);
            System.out.println("Page 0/" + page.getTotalPages() + " (size=2): " + page.getContent() + " - Total: " + page.getTotalElements());

            pageReq = PageRequest.of(1, 2, Sort.by(Sort.Direction.DESC, "salary"));
            page = repo.findAll(pageReq);
            System.out.println("Page 1/" + page.getTotalPages() + " (size=2): " + page.getContent());

            pageReq = PageRequest.of(2, 2, Sort.by(Sort.Direction.DESC, "salary"));
            page = repo.findAll(pageReq);
            System.out.println("Page 2/" + page.getTotalPages() + " (size=2): " + page.getContent());

            List<Employee> sorted = repo.findAll(Sort.by(Sort.Direction.ASC, "name"));
            System.out.println("\nSorted by name ASC: " + sorted);
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(PageService.class).demo();
        ctx.close();
    }
}