package com.example.casestudy.service;

import com.example.casestudy.model.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
}
