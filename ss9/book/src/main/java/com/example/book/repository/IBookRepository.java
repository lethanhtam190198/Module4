package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {

    @Modifying
    @Query(value = "update Book set amount=:amount-1 where book_id=:id", nativeQuery = true)
    void update(@Param("amount") double amount, @Param("id") int id);
}
