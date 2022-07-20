package com.example.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameBlog;
    private String rentBlog;
    private  String detailBlog;

    public Blog() {
    }

    public Blog(int id, String nameBlog, String rentBlog, String detailBlog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.rentBlog = rentBlog;
        this.detailBlog = detailBlog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getRentBlog() {
        return rentBlog;
    }

    public void setRentBlog(String rentBlog) {
        this.rentBlog = rentBlog;
    }

    public String getDetailBlog() {
        return detailBlog;
    }

    public void setDetailBlog(String detailBlog) {
        this.detailBlog = detailBlog;
    }
}
