package com.electronik54.revision_3.jpa_hibernate.ch151_jpa_criteria_api.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import jakarta.persistence.criteria.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "emps_criteria")
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
        @Override public String toString() { return name + " ($" + (long)salary + ")"; }
    }

    @Service
    static class CriteriaService {
        @PersistenceContext
        private EntityManager em;

        public void init() {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(new Employee("Alice", "Engineering", 95000));
            em.persist(new Employee("Bob", "Engineering", 100000));
            em.persist(new Employee("Charlie", "Engineering", 120000));
            em.persist(new Employee("Diana", "Sales", 85000));
            tx.commit();
        }

        public List<Employee> search(String dept, Double minSalary) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
            Root<Employee> root = query.from(Employee.class);
            List<Predicate> predicates = new ArrayList<>();

            if (dept != null) predicates.add(cb.equal(root.get("dept"), dept));
            if (minSalary != null) predicates.add(cb.greaterThanOrEqualTo(root.get("salary"), minSalary));

            query.select(root).where(predicates.toArray(new Predicate[0]))
                 .orderBy(cb.desc(root.get("salary")));

            return em.createQuery(query).getResultList();
        }

        public void demo() {
            System.out.println("=== Solution 151: JPA Criteria API ===\n");

            List<Employee> results = search("Engineering", 100000.0);
            System.out.println("Dynamic search: department=Engineering, minSalary=100000");
            System.out.println("Found " + results.size() + " employees: " + results);
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        CriteriaService svc = ctx.getBean(CriteriaService.class);
        svc.init();
        svc.demo();
        ctx.close();
    }
}