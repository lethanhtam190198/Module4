package ex.music.controller;


import ex.music.model.Music;
import ex.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller

public class MusicController {

    @Autowired
    IMusicService musicService;

    @GetMapping({"","list"})
    public String list(Model model) {
        model.addAttribute("musicList", musicService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate( Model model) {
        model.addAttribute("create", new Music());
        return "create";
    }
    @PostMapping("create")
    public String create(Music music){
        musicService.save(music);
        return "redirect:/list";
    }
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
        redirectAttributes.addFlashAttribute("mess","da xoa thanh cong");
        return "redirect:list";
    }
}
