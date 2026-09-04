package com.electronik54.revision_3.jpa_hibernate.ch145_jpa_many_to_many.solution;

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
    @Entity @Table(name = "students")
    static class Student {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @ManyToMany(mappedBy = "students")
        private Set<Course> courses = new HashSet<>();
        public Student() {}
        public Student(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public Set<Course> getCourses() { return courses; }
    }

    @Entity @Table(name = "courses")
    static class Course {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        @ManyToMany
        @JoinTable(name = "enrollment",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
        private Set<Student> students = new HashSet<>();
        public Course() {}
        public Course(String title) { this.title = title; }
        public Long getId() { return id; }
        public String getTitle() { return title; }
        public Set<Student> getStudents() { return students; }
        public void enrollStudent(Student s) { students.add(s); s.getCourses().add(this); }
    }

    @Repository
    interface StudentRepo extends JpaRepository<Student, Long> {}
    @Repository
    interface CourseRepo extends JpaRepository<Course, Long> {}

    @Service
    static class SchoolService {
        @Autowired private StudentRepo studentRepo;
        @Autowired private CourseRepo courseRepo;
        public void demo() {
            Student alice = new Student("Alice"); Student bob = new Student("Bob");
            Course math = new Course("Math 101"); Course physics = new Course("Physics 201");
            math.enrollStudent(alice); math.enrollStudent(bob);
            physics.enrollStudent(alice);
            studentRepo.saveAll(List.of(alice, bob));
            courseRepo.saveAll(List.of(math, physics));

            System.out.println("=== Solution 145: @ManyToMany ===\n");
            Student s = studentRepo.findById(1L).orElseThrow();
            System.out.println("Student: " + s.getName());
            System.out.println("  Courses: " + s.getCourses().stream().map(Course::getTitle).toList());

            Course c = courseRepo.findById(1L).orElseThrow();
            System.out.println("Course: " + c.getTitle());
            System.out.println("  Students: " + c.getStudents().stream().map(Student::getName).toList());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(SchoolService.class).demo();
        ctx.close();
    }
}