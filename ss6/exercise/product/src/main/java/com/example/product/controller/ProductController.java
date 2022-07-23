package com.example.product.controller;


import com.example.product.dto.ProductDto;
import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping({"", "/list"})
    public String index(Model model) {
        model.addAttribute("product", productService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("productListDto", new ProductDto());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("productListDto") @Validated ProductDto productDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("product", productService.findAll());
            return "create";
        } else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);

            productService.save(product);
            redirectAttributes.addFlashAttribute("message", "tao moi thanh cong");
            return "redirect:/list";
        }
//    public String save(Product product) {
//        productService.save(product);
//        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product);
        return "redirect:/list";
    }


    @PostMapping("/delete")
    public String delete(@RequestParam int id, Product product, RedirectAttributes redirect) {
        productService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }

    @PostMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("product", productService.findByName(name));
        return "/list";
    }
}
