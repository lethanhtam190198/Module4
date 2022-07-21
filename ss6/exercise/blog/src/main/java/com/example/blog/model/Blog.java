package com.example.blog.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameBlog;
    private String rentBlog;
    private String detailBlog;
    @Column(columnDefinition = "DATE")
    private String dateCommit;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private  Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog() {
    }

    public Blog(int id, String nameBlog, String rentBlog, String detailBlog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.rentBlog = rentBlog;
        this.detailBlog = detailBlog;
    }

    public Blog(int id, String nameBlog, String rentBlog, String detailBlog, String dateCommit) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.rentBlog = rentBlog;
        this.detailBlog = detailBlog;
        this.dateCommit = dateCommit;
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

    public String getDateCommit() {
        return dateCommit;
    }

    public void setDateCommit(String dateCommit) {
        this.dateCommit = dateCommit;
    }
}
