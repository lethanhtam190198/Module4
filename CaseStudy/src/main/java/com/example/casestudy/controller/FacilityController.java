package com.example.casestudy.controller;

import com.example.casestudy.dto.FacilityDto;
import com.example.casestudy.model.facility.Facility;
import com.example.casestudy.service.facility.FacilityService;
import com.example.casestudy.service.facility.FacilityTypeService;
import com.example.casestudy.service.facility.RentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private FacilityService facilityService;
    @Autowired
    private FacilityTypeService facilityTypeService;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("facilityList", facilityService.findAll());
        return "facility/facilityList";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("facilityDto", new FacilityDto());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/facilityCreate";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("facilityDto") @Validated FacilityDto facilityDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("facilityTypeList", facilityTypeService.findAll());
            model.addAttribute("facilityTypeId", facilityDto.getFacilityTypeId().getFacilityTypeId());
            model.addAttribute("rentTypeList", rentTypeService.findAll());
            return "facility/facilityCreate";
        } else {
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            facilityService.save(facility);
            redirect.addFlashAttribute("success", "Create  successfully!");
        }
        return "redirect:/facility";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {

        FacilityDto facilityDto = new FacilityDto();

        Facility facility = facilityService.findById(id);

        BeanUtils.copyProperties(facility, facilityDto);

        model.addAttribute("facility", facilityDto);
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/facilityEdit";
    }

    @PostMapping("/update")
    public String edit(@ModelAttribute("facilityDto") @Validated FacilityDto facilityDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("facility", facilityDto);
            model.addAttribute("facilityTypeList", facilityTypeService.findAll());
            model.addAttribute("rentTypeList", rentTypeService.findAll());
            return "facility/facilityEdit";
        } else {
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            facilityService.updateFacility(facility);
            redirect.addFlashAttribute("success", "Update facility " +
                    facility.getFacilityName() + " successfully!");
            return "redirect:/facility";
        }
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        facilityService.remove(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/facility";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("facilityList", facilityService.searchByName(name));
        model.addAttribute("search", name);
        return "facility/facilityList";
    }
}
