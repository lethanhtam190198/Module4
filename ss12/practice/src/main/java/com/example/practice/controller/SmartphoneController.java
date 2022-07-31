package com.example.practice.controller;

import com.example.practice.model.Smartphone;
import com.example.practice.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/smartphones")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;

    @GetMapping()
    public ResponseEntity<List<Smartphone>> getList(){
        List<Smartphone> smartphones = smartphoneService.findAll();
        if (smartphones.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartphones, HttpStatus.OK);
    }

}
