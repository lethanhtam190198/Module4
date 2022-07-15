package exercise.controller;

import exercise.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExComtroller {
    @Autowired
    ICurrencyService currencyService;

    @GetMapping("")
    public String list() {
        return "list";
    }

    @PostMapping("/save")
    public String save(double usd, Model model) {
        double money = currencyService.money(usd);
        model.addAttribute("money", money);
        model.addAttribute("usd",usd);
        return "list";

    }

}
