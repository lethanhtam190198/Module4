package com.example.book.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class BookExceptionHandle {

    @ExceptionHandler(Exception.class)
    public String showEmpty() {
        return "empty";
    }

    @ExceptionHandler(Exception.class)
    public String showFull() {
        return "full";
    }
}
