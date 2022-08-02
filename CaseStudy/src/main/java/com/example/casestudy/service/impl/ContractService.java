package com.example.casestudy.service.impl;

import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.repository.IContractRepository;
import com.example.casestudy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
