package com.example.book.repository;

import com.example.book.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
     User findByCode(int code);
}
