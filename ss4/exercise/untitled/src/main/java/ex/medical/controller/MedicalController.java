package ex.medical.controller;

import ex.medical.model.Medical;
import ex.medical.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private IMedicalService medicalService;

    @GetMapping({"list",""})
    public String getAll(Model model) {
        List<Medical> medicalList = medicalService.findAll();
        model.addAttribute("medicalList", medicalList);
        return "list";
    }
    @GetMapping ("/create")
    public String getFormCreate(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("birthdayList", medicalService.getBirthYear());
        model.addAttribute("travelInformationList",medicalService.getTravellnformation());
        model.addAttribute("departureDayList",medicalService.getDepatureDay());
        model.addAttribute("endDayList",medicalService.getEndDay());
        return "create";
    }

    @PostMapping    ("/create")
    public String create(@ModelAttribute("medical") Medical medical, RedirectAttributes redirectAttributes) {
        medicalService.create(medical);
        redirectAttributes.addFlashAttribute("note", "Create thanh cong");
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam int id, Model model){
        Medical medical= medicalService.findId(id);
        model.addAttribute("medicalForm",medical);
        model.addAttribute("birthdayList", medicalService.getBirthYear());
        model.addAttribute("travelInformationList",medicalService.getTravellnformation());
        model.addAttribute("departureDayList",medicalService.getDepatureDay());
        model.addAttribute("endDayList",medicalService.getEndDay());
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Medical medical,Model model, RedirectAttributes redirectAttributes) {
        medicalService.update(medical);
        model.addAttribute("medicalList", medicalService.findAll());
        redirectAttributes.addFlashAttribute("note", "Update thanh cong");
        return "redirect:/list";
    }
}
