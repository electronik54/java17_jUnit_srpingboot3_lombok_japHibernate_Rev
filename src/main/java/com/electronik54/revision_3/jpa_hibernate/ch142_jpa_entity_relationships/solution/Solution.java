package com.electronik54.revision_3.jpa_hibernate.ch142_jpa_entity_relationships.solution;

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
    @Entity @Table(name = "authors")
    static class Author {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Book> books = new ArrayList<>();
        public Author() {}
        public Author(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public List<Book> getBooks() { return books; }
        public void addBook(Book book) { books.add(book); book.setAuthor(this); }
    }

    @Entity @Table(name = "books")
    static class Book {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "author_id")
        private Author author;
        @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
        private Publisher publisher;
        @ManyToMany
        @JoinTable(name = "book_library",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "library_id"))
        private Set<LibraryBranch> libraries = new HashSet<>();
        public Book() {}
        public Book(String title) { this.title = title; }
        public Long getId() { return id; }
        public String getTitle() { return title; }
        public Author getAuthor() { return author; }
        public void setAuthor(Author author) { this.author = author; }
        public Publisher getPublisher() { return publisher; }
        public void setPublisher(Publisher p) { this.publisher = p; p.setBook(this); }
        public Set<LibraryBranch> getLibraries() { return libraries; }
    }

    @Entity @Table(name = "publishers")
    static class Publisher {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @OneToOne @JoinColumn(name = "book_id", unique = true)
        private Book book;
        public Publisher() {}
        public Publisher(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public Book getBook() { return book; }
        public void setBook(Book book) { this.book = book; }
    }

    @Entity @Table(name = "libraries")
    static class LibraryBranch {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @ManyToMany(mappedBy = "libraries")
        private Set<Book> books = new HashSet<>();
        public LibraryBranch() {}
        public LibraryBranch(String name) { this.name = name; }
        public Long getId() { return id; }
        public String getName() { return name; }
        public Set<Book> getBooks() { return books; }
    }

    @Repository
    interface AuthorRepo extends JpaRepository<Author, Long> {}
    @Repository
    interface BookRepo extends JpaRepository<Book, Long> {}
    @Repository
    interface LibraryRepo extends JpaRepository<LibraryBranch, Long> {}

    @Service
    static class LibraryService {
        @Autowired private AuthorRepo authorRepo;
        @Autowired private BookRepo bookRepo;
        @Autowired private LibraryRepo libraryRepo;

        public void demo() {
            Author rowling = new Author("J.K. Rowling");
            Book hp1 = new Book("Harry Potter and the Sorcerer's Stone");
            Book hp2 = new Book("Harry Potter and the Chamber of Secrets");
            rowling.addBook(hp1); rowling.addBook(hp2);
            Publisher pub = new Publisher("Bloomsbury");
            hp1.setPublisher(pub);
            LibraryBranch lib1 = new LibraryBranch("Central Library");
            LibraryBranch lib2 = new LibraryBranch("City Library");
            hp1.getLibraries().addAll(Set.of(lib1, lib2));
            authorRepo.save(rowling);
            libraryRepo.saveAll(List.of(lib1, lib2));

            System.out.println("=== Solution 142: JPA Entity Relationships ===\n");
            authorRepo.findAll().forEach(a -> {
                System.out.println("Author: " + a.getName());
                System.out.println("  Books: " + a.getBooks().stream().map(Book::getTitle).toList());
                a.getBooks().forEach(b -> {
                    if (b.getPublisher() != null)
                        System.out.println("  Publisher: " + b.getPublisher().getName());
                    System.out.println("  Libraries: " + b.getLibraries().stream().map(LibraryBranch::getName).toList());
                });
            });
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(LibraryService.class).demo();
        ctx.close();
    }
}