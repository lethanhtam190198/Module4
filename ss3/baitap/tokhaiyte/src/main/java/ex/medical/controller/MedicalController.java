package ex.medical.controller;

import ex.medical.models.Medical;
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
        List<Medical> medicalList = medicalService.getAll();
        model.addAttribute("medicalList", medicalList);
        return "list";
    }

    @GetMapping ("/create")
    public String getFormCreate(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("birthdayList", medicalService.getBirthYear());
        model.addAttribute("genderList", medicalService.getGender());
        model.addAttribute("nalionalityList", medicalService.getNational());
        model.addAttribute("transportType", medicalService.getTransportType());
        model.addAttribute("inputDay", medicalService.getInputDay());
        model.addAttribute("inputMonth", medicalService.getInputMonth());
        model.addAttribute("inputYear", medicalService.getInputYear());
        model.addAttribute("outDay", medicalService.getOutDay());
        model.addAttribute("outMonth", medicalService.getOutMonth());
        model.addAttribute("outYear", medicalService.getOutYear());
        return "create";
    }

    @PostMapping    ("/create-medical")
    public String create(@ModelAttribute("medical") Medical medical, RedirectAttributes redirectAttributes) {
        medicalService.create(medical);
        redirectAttributes.addFlashAttribute("message", "Create Success Congratulation");
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String formUpdate(@RequestParam String id, Model model) {
        Medical medical= medicalService.findId(id);
        model.addAttribute("medicalForm",medical);
        model.addAttribute("birthdayList", medicalService.getBirthYear());
        model.addAttribute("genderList", medicalService.getGender());
        model.addAttribute("nalionalityList", medicalService.getNational());
        model.addAttribute("transportType", medicalService.getTransportType());
        model.addAttribute("inputDay", medicalService.getInputDay());
        model.addAttribute("inputMonth", medicalService.getInputMonth());
        model.addAttribute("inputYear", medicalService.getInputYear());
        model.addAttribute("outDay", medicalService.getOutDay());
        model.addAttribute("outMonth", medicalService.getOutMonth());
        model.addAttribute("outYear", medicalService.getOutYear());
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Medical medical,Model model, RedirectAttributes redirectAttributes) {
        medicalService.update(medical);
        model.addAttribute("medicalList", medicalService.getAll());
        redirectAttributes.addFlashAttribute("note", "Successful Update Congratulation");
        return "redirect:/list";
    }

}
