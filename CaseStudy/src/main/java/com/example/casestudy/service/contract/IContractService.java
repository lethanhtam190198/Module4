package com.example.casestudy.service.contract;

import com.example.casestudy.dto.TotalMoneyDto;
import com.example.casestudy.model.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract>findAll();

    void create(Contract contract);

    List<TotalMoneyDto> TotalMoneyDto();
}
