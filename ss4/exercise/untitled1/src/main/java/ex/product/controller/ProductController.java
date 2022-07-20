package ex.product.controller;

import ex.product.model.Product;
import ex.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping({"", "/list"})
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("product", productList);
        return "list";
    }
    @PostMapping ("delete")
    public String delete(@RequestParam int id) {
        productService.remove(id);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String search(String name, Model model) {
        model.addAttribute("product", productService.findByName(name));
        return "/list";
    }

}
