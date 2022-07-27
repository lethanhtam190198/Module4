package com.example.book.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private int code;
    @ManyToOne

    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    private Book books;

    public User() {
    }

    public User(int userId, String name, int code, Book books) {
        this.userId = userId;
        this.name = name;
        this.code = code;
        this.books = books;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }
}
