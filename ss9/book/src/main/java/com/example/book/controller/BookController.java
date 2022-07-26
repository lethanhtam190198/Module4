package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.model.User;
import com.example.book.service.IBookService;
import com.example.book.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String listBook(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "listBook";
    }

    @GetMapping("/create")
    public String formCreate(Model model) {
        model.addAttribute("create", new Book());
        return "createBook";
    }

    @PostMapping("/create")
    public String create(Book book) {
        bookService.save(book);
        return "redirect:";
    }

    @GetMapping("{id}/borrow")
    public String formBorrow(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "/borrow";
    }

    @PostMapping("/borrow")
    public String borrow(Book book, User user) {
        int code = (int) Math.floor((Math.random() * 89999) + 10000);
        user.setCode(code);
        userService.save(user);
        bookService.borrow(book);
        return "redirect:";
    }

    @GetMapping("/back")
    public String giveBackBook(@RequestParam("id") int id) {
        User user = userService.findByCode(id);
        Book book = user.getBooks();
        book.setAmount(book.getAmount() + 1);
        userService.delete(user);
        return "redirect:";
    }


}
