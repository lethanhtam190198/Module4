package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Modifying
    @Query(value = "update blog set detail_blog = :detailBlog, name_blog=:nameBlog, rent_blog=:rentBlog  where id = :id", nativeQuery = true)
    void update(@Param("detailBlog") String detailBlog, @Param("nameBlog") String nameBlog, @Param("rentBlog") String rentBlog, @Param("id") int id);
}
