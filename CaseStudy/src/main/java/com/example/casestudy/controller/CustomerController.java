package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.customer.CustomerType;
import com.example.casestudy.service.contract.ContractService;
import com.example.casestudy.service.customer.CustomerService;
import com.example.casestudy.service.customer.CustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ContractService contractService;
    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("")
    public String index( Model model) {
        model.addAttribute("customerList",  customerService.findAll());
        return "customer/customerList";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        model.addAttribute("customerTypeList",customerTypeList);
        List<Contract> contractList =  contractService.findAll();
        model.addAttribute("contractList",contractList);
        return "customer/customerCreate";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customerDto") @Validated CustomerDto customerDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList",customerTypeList);
            List<Contract> contractList =  contractService.findAll();
            model.addAttribute("contractList",contractList);
            return "customer/customerCreate";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirect.addFlashAttribute("success", "Update  successfully!");
            return "redirect:/customer";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        CustomerDto customerDto = new CustomerDto();

        BeanUtils.copyProperties(customerService.findById(id),customerDto);

        List<CustomerType> customerTypeList = customerTypeService.findAll();
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerTypeList", customerTypeList);
        return "customer/customerEdit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("customerDto")@Validated CustomerDto customerDto,
                         BindingResult bindingResult,RedirectAttributes redirect,Model model) {
        if (bindingResult.hasFieldErrors()){
            List<CustomerType> customerTypeList = customerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            return "customer/customerEdit";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.updateCustomer(customer);
            redirect.addFlashAttribute("success", "Update Customer " +
                    customer.getCustomerId() + " successfully!");
            return "redirect:/customer";
        }

    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        customerService.remove(id);
        redirect.addFlashAttribute("success", "Delete successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("customerList", customerService.searchByName(name));
        model.addAttribute("search", name);
        return "customer/customerList";
    }
}
