package com.example.blog.service;


import com.example.blog.model.Blog;

import java.util.List;

public interface  IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void remove(int id);

    void update(Blog blog);

    Blog findById(Integer id);
}
