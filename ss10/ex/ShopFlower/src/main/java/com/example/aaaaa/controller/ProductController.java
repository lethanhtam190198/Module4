package com.example.aaaaa.controller;

import com.example.aaaaa.model.Cart;
import com.example.aaaaa.model.Product;
import com.example.aaaaa.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "error";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/";
    }

    @GetMapping("/remove/{id}")
    public String removeToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) throws Exception {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "error";
        }
        if (action.equals("show")) {
            cart.removeProduct(productOptional.get());
            return "redirect:/shopping";
        }
        cart.removeProduct(productOptional.get());
        return "redirect:/";
    }
}
