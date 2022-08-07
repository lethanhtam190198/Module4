package com.example.casestudy.controller;

import com.example.casestudy.dto.TotalMoneyDto;
import com.example.casestudy.model.contract.AttachFacility;
import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.model.contract.ContractDetail;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.facility.Facility;
import com.example.casestudy.service.contract.AttachFacilityService;
import com.example.casestudy.service.contract.ContractDetailService;
import com.example.casestudy.service.contract.ContractService;
import com.example.casestudy.service.customer.CustomerService;
import com.example.casestudy.service.facility.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private AttachFacilityService attachFacilityService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private ContractDetailService contractDetailService;

    @ModelAttribute(value = "contractList")
    public void findAllContract(Model model) {
        List<Contract> contractList =  this.contractService.findAll();
        model.addAttribute("contractList",contractList);
    }

    @ModelAttribute(value = "attachFacilityS")
    public void findAllAttachFacility(Model model) {
        List<AttachFacility> attachFacilityS =  this.attachFacilityService.findAllAttach();
        model.addAttribute("attachFacilityS",attachFacilityS);
    }
    @ModelAttribute(value = "facilityList")
    public void findAllFacility(Model model) {
        List<Facility> facilityList =  this.facilityService.findAll();
        model.addAttribute("facilityList",facilityList);
    }

    @ModelAttribute(value = "customerList")
    public void findAllCustomer(Model model, Pageable pageable) {
        Page<Customer> customerList =  this.customerService.findAll(pageable);
        model.addAttribute("customerList",customerList);
    }

    @ModelAttribute(value = "totalMoney")
    public void totalMoney(Model model) {
        List<TotalMoneyDto> totalMoney =  this.contractService.TotalMoneyDto();
        model.addAttribute("totalMoney",totalMoney);
    }

    @GetMapping("")
    public String index() {
        return "contract/contractList";
    }

    @GetMapping("showAttach/{id}")
    public String showAttach(@PathVariable int id, Model model) {
        List<AttachFacility> attachFacilityList = attachFacilityService.findAll(id);
        model.addAttribute("attachFacilityList", attachFacilityList);
        model.addAttribute("flag", 1);
        return "contract/contractList";
    }

    @PostMapping("createContract")
    public ResponseEntity<?> createContract(@RequestBody Contract contract) {
        contractService.create(contract);
        int contractId = 0;
        for (Contract item: contractService.findAll()) {
            contractId = item.getContractId();
        }
        return new ResponseEntity<>(contractId, HttpStatus.OK);
    }

    @PostMapping("createContractDetail")
    public ResponseEntity createContractDetail(@RequestBody String[][] contractDetailList) {
        for (int i = 0; i < contractDetailList.length; i++) {
            ContractDetail contractDetail = new ContractDetail(new Contract(Integer.parseInt(contractDetailList[i][1])), new AttachFacility(Integer.parseInt(contractDetailList[i][2])), Integer.parseInt(contractDetailList[i][0]));
            contractDetailService.save(contractDetail);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("totalMoney")
    public ResponseEntity<?> totalMoney(@RequestBody String [][] totalMoneyList, @RequestParam int facilityId) {
        double facilityCost = 0;
        double totalMoneyAttach = 0;
        double totalMoney =0;
        List<Facility> facilityList = facilityService.findAll();
        for (Facility item: facilityList) {
            if (item.getFacilityId() == facilityId) {
                facilityCost = item.getCost();
            }
        }

        for (int i = 0; i < totalMoneyList.length; i++) {
            totalMoneyAttach = totalMoneyAttach + (Integer.parseInt(totalMoneyList[i][0]) * Double.parseDouble(totalMoneyList[i][1]));
        }

        totalMoney = facilityCost + totalMoneyAttach;
        return new ResponseEntity<>(totalMoney, HttpStatus.OK);
    }
}
