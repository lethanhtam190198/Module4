package com.example.register.controller;

import com.example.register.dto.UserDto;
import com.example.register.model.User;
import com.example.register.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping({"","list"})
    public String list(Model model){
        model.addAttribute("userList",userService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
//        model.addAttribute("userList",userService.findAll());
        model.addAttribute("userListDto", new UserDto());
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("userListDto") @Validated UserDto userDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model){
//        new UserDto().validate(userDto,bindingResult);
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("userList",userService.findAll());
            return "/create";
        }else{
            User user= new User();
            BeanUtils.copyProperties(userDto,user);

            userService.save(user);

            redirectAttributes.addFlashAttribute("message","tao moi thanh cong");
            return "redirect:/list";
        }
    }
}
