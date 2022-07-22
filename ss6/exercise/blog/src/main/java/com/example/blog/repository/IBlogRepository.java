package com.example.blog.repository;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Modifying
    @Query(value = "update Blog set detail_blog = :detailBlog, name_blog=:nameBlog, rent_blog=:rentBlog , date_commit=:dateCommit , id_category=:category  where id = :id", nativeQuery = true)
    void update(@Param("detailBlog") String detailBlog, @Param("nameBlog") String nameBlog, @Param("rentBlog") String rentBlog, @Param("dateCommit") String dateCommit, @Param("category") int category, @Param("id") int id);


    @Query(value = "select * from blog where name_blog like:nameBlog",nativeQuery = true)
    Page<Blog> findByName(@Param("nameBlog")String nameBlog, Pageable pageable);
}
