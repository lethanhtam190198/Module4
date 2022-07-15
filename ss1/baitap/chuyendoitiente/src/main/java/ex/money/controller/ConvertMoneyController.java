package ex.money.controller;


import ex.money.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ConvertMoneyController {
    @Autowired
    IConvertService iConvertService;

    @GetMapping("/usd")
    public String convert() {
        return "list";
    }


    @PostMapping("/usd")
    public String result(@RequestParam double usd, Model model) {
        double vnd = iConvertService.convert(usd);
        model.addAttribute("vnd", vnd);
        return "list";
    }
}
