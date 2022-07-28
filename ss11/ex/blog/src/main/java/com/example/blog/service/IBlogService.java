package com.example.blog.service;


import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void remove(int id);

    void update(Blog blog);

    Blog findById(Integer id);

    Page<Blog> findByName(String nameBlog, Pageable pageable);
}
