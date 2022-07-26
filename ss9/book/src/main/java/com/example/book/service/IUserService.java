package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(int id);

    void save(User user);

    User findByCode(int code);

    void delete(User user);
}
