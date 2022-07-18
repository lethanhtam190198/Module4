package exercise.sandwich.controller;


import exercise.sandwich.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
    @Autowired
    ISandwichService sandwichService;

    @GetMapping("/")
    public String sandwich() {
        return "list";
    }

    @RequestMapping("/save")
    public String result(@RequestParam("condiment") String[] condiment, ModelMap modelMap) {
        String sandwich = sandwichService.sandwich(condiment);
        modelMap.addAttribute("sandwich", sandwich);
        return "list";
    }
}
