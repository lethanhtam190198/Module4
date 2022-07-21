package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Modifying
    @Query(value = "update Blog set detail_blog = :detailBlog, name_blog=:nameBlog, rent_blog=:rentBlog , date_commit=:dateCommit  where id = :id", nativeQuery = true)
    void update(@Param("detailBlog") String detailBlog, @Param("nameBlog") String nameBlog, @Param("rentBlog") String rentBlog,@Param("dateCommit") String dateCommit, @Param("id") int id);


    @Query(value = "select * from blog where name_blog like:nameBlog",nativeQuery = true)
    List<Blog> findByName(@Param("nameBlog")String nameBlog);
}
