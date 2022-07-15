package ex.calculator.controller;


import ex.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService calculatorService;

    @GetMapping("")
    public String list() {
        return "list";
    }

    @PostMapping("/save")
    public String save(@RequestParam String calculation, double num1, double num2, Model model) {
        double total = calculatorService.calculator(calculation, num1, num2);
        model.addAttribute("total", total);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "list";
    }
}

