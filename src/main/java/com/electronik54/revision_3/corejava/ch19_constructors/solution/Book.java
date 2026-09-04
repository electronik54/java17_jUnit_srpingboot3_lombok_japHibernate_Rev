package com.electronik54.revision_3.corejava.ch19_constructors.solution;

public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor - chains to the parameterized one using this(...)
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book other) {
        this(other.title, other.author, other.price);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}