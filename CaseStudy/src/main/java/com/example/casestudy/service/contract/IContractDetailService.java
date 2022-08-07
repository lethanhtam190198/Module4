package com.example.casestudy.service.contract;

import com.example.casestudy.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    void save(ContractDetail contractDetail);

    List<ContractDetail> findAll();
}
