package ex.mailbox.controller;

import ex.mailbox.model.Mail;
import ex.mailbox.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailBoxController {
    @Autowired
    private IMailService mailService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("list", mailService.findAll());
        model.addAttribute("languageList", mailService.lang());
        model.addAttribute("sizeList", mailService.size());
        return "list";
    }

    @GetMapping("/save")
    public String getForm(Model model) {
        model.addAttribute("languageList", mailService.lang());
        model.addAttribute("sizeList", mailService.size());
        model.addAttribute("mail",new Mail());
        return "edit";
    }

    @PostMapping ("/save")
    public String save(@ModelAttribute Mail mail) {
        mailService.save(mail.getId(),mail);
        return "redirect:/";
    }
}


