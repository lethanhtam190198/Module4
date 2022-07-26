package com.example.casestudy.service.impl;

import com.example.casestudy.model.Division;
import com.example.casestudy.repository.IDivisionRepository;
import com.example.casestudy.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionService implements IDivisionService {

    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
