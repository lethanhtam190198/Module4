package com.example.casestudy.controller;

import com.example.casestudy.dto.EmployeeDto;
import com.example.casestudy.model.employee.Division;
import com.example.casestudy.model.employee.EducationDegree;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.employee.Position;
import com.example.casestudy.service.employee.IDivisionService;
import com.example.casestudy.service.employee.IEducationDegreeService;
import com.example.casestudy.service.employee.IEmployeeService;
import com.example.casestudy.service.employee.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IDivisionService divisionService;


    @GetMapping({""})
    public String index(Model model) {
        model.addAttribute("employeeList", employeeService.findAll());
        return "employee/employeeList";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());

        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        return "employee/employeeCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("employeeList", employeeService.findAll());
            model.addAttribute("positionList", positionService.findAll());
            model.addAttribute("educationDegreeList", educationDegreeService.findAll());
            model.addAttribute("divisionList", divisionService.findAll());
            return "employee/employeeCreate";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);

            employeeService.save(employee);
            redirectAttributes.addFlashAttribute("message", "tao moi thanh cong");
            return "redirect:/employee";
        }
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        employeeService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/employee";
    }

    @GetMapping("/{id}/edit")
    public String formEdit(@PathVariable int id, Model model) {
        EmployeeDto employeeDto = new EmployeeDto();

        BeanUtils.copyProperties(employeeService.findById(id), employeeDto);

        model.addAttribute("employeeDto", employeeDto);
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        return "employee/employeeEdit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto,
                         BindingResult bindingResult, RedirectAttributes redirect, Model model) {
        if (bindingResult.hasFieldErrors()) {
            List<Position> positionList = positionService.findAll();
            List<EducationDegree> educationDegreeList = educationDegreeService.findAll();
            List<Division> divisionList = divisionService.findAll();

            model.addAttribute("positionList", positionList);
            model.addAttribute("educationDegreeList", educationDegreeList);
            model.addAttribute("divisionList", divisionList);
            return "employee/employeeEdit";
        } else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employeeService.updateEmployee(employee);
            redirect.addFlashAttribute("success", "Update employee " +
                    employee.getEmployeeName() + " successfully!");
            return "redirect:/employee";
        }
    }
}
