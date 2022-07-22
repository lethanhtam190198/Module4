package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping({"", "list"})
    public String list(@PageableDefault(value = 4, sort = "dateCommit", direction = Sort.Direction.ASC) Pageable pageable, Model model) {
        model.addAttribute("blogList", blogService.findAll(pageable));
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("blogList", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute("blogList") Blog blog) {
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }

    @GetMapping("/update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("blog") Blog blog) {
        blogService.update(blog);
        return "redirect:list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id) {
        blogService.remove(id);
        return "redirect:list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("nameBlog") String nameBlog, Model model,@PageableDefault(value = 3) Pageable pageable) {
        model.addAttribute("blogList", blogService.findByName(nameBlog, pageable));
        model.addAttribute("nameBlog", nameBlog);
        return "list";
    }

}
