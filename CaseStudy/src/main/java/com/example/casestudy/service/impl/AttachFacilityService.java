package com.example.casestudy.service.impl;

import com.example.casestudy.model.AttachFacility;
import com.example.casestudy.repository.IAttachFacilityRepository;
import com.example.casestudy.service.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService {
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
