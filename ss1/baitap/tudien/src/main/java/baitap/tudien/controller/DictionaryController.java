package baitap.tudien.controller;


import baitap.tudien.service.IDistionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DictionaryController {
    @Autowired
    private IDistionaryService distionaryService;

    @GetMapping("/")
    public String dictionary() {
        return "list";
    }

    @PostMapping("/dictionary")
    public String result(@RequestParam String keyword, Model model) {
        String result = distionaryService.translate(keyword);
        model.addAttribute("result", result);
        return "list";
    }
}
