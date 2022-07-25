package com.example.music.controller;


import com.example.music.dto.MusicDto;
import com.example.music.model.Music;
import com.example.music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class MusicController {

    @Autowired
    IMusicService musicService;

    @GetMapping({"", "list"})
    public String list(Model model) {
        model.addAttribute("musicList", musicService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("create", new Music());
        return "create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute("productListDto") @Validated MusicDto musicDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("musicList", musicService.findAll());
            return "create";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto, music);
            musicService.save(music);
            redirectAttributes.addFlashAttribute("message", "tao moi thanh cong");
            return "redirect:/list";
        }
    }


    //    @PostMapping("create")
//    public String create(Music music){
//        musicService.save(music);
//        return "redirect:/list";
//    }
    @GetMapping("/update")
    public String formUpdate(@RequestParam int id, Model model) {
        Music music = musicService.findById(id);
        model.addAttribute("musicList", music);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("music") Music music) {
        musicService.update(music);
        return "redirect:list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        musicService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "da xoa thanh cong");
        return "redirect:list";
    }
}
