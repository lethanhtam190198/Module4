package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<Blog>> getBlog(Pageable pageable) {
        Page<Blog> blogPage = blogService.findAll(pageable);
        if (blogPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogPage, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id, @RequestBody Blog blog) {
        Blog currentBlog = blogService.findById(id);
        if (currentBlog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentBlog.setNameBlog(blog.getNameBlog());
        currentBlog.setRentBlog(blog.getRentBlog());
        currentBlog.setDetailBlog(blog.getDetailBlog());
        currentBlog.setDateCommit(blog.getDateCommit());
        currentBlog.setCategory(blog.getCategory());

        blogService.save(currentBlog);
        return new ResponseEntity<>(currentBlog, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteBlog(@PathVariable int id, @RequestBody Blog blog) {
        Blog blog1 = blogService.findById(id);
        if (blog1 == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity(blog1, HttpStatus.OK);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getBlog() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<Category>> typeList() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> getBlogList(@RequestParam String name, Pageable pageable) {
        Page<Blog> blogList = blogService.findByName(name, pageable);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
