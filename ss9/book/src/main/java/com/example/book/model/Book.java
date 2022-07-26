package com.example.book.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String name;
    private int amount;
    @OneToMany(mappedBy = "books",cascade = CascadeType.ALL)
    private Set<User> user;

    public Book() {
    }

    public Book(int bookId, String name, int amount, Set<User> user) {
        this.bookId = bookId;
        this.name = name;
        this.amount = amount;
        this.user = user;
    }

    public Book(int bookId, String name, int amount) {
        this.bookId = bookId;
        this.name = name;
        this.amount = amount;
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}
