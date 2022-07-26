package com.example.casestudy.service.impl;

import com.example.casestudy.model.EducationDegree;
import com.example.casestudy.repository.IEducationDegreeRepository;
import com.example.casestudy.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {

    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
