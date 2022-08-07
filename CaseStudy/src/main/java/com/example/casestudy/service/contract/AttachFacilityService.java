package com.example.casestudy.service.contract;

import com.example.casestudy.model.contract.AttachFacility;
import com.example.casestudy.repository.contract.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService {
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll(int id) {
        return attachFacilityRepository.findAllAttach(id);
    }

    @Override
    public List<AttachFacility> findAllAttach() {
        return attachFacilityRepository.findAll();
    }

}
