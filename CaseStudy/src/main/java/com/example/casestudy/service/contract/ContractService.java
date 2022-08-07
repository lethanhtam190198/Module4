package com.example.casestudy.service.contract;

import com.example.casestudy.dto.TotalMoneyDto;
import com.example.casestudy.model.contract.AttachFacility;
import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.model.contract.ContractDetail;
import com.example.casestudy.model.facility.Facility;
import com.example.casestudy.repository.contract.IContractRepository;
import com.example.casestudy.service.facility.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository contractRepository;

    @Autowired
    private FacilityService facilityService;

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private AttachFacilityService attachFacilityService;


    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public void create(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<TotalMoneyDto> TotalMoneyDto() {
        List<Facility> facilityList = facilityService.findAll();
        List<Contract> contractList = contractRepository.findAll();
        List<ContractDetail> contractDetailList = contractDetailService.findAll();
        List<AttachFacility> attachFacilityList = attachFacilityService.findAllAttach();
        List<TotalMoneyDto> totalMoneyDtoList = new ArrayList<>();

        for (int i = 0; i < contractList.toArray().length; i++) {
            double totalMoney = 0;
            double facilityCost = 0;
            double contractDetailCost = 0;

            facilityCost = contractList.get(i).getFacility().getCost();
            for (ContractDetail contractDetail : contractDetailList) {
                if (contractList.get(i).getContractId() == contractDetail.getContract().getContractId()) {
                    for (AttachFacility attachFacility : attachFacilityList) {
                        if (contractDetail.getAttachFacility().getAttachFacilityId() == attachFacility.getAttachFacilityId()) {
                            contractDetailCost = contractDetailCost + (contractDetail.getContractDetailQuantity() * attachFacility.getAttachFacilityCost());
                        }
                    }
                }
            }

            totalMoney = facilityCost + contractDetailCost;
            totalMoneyDtoList.add(new TotalMoneyDto(contractList.get(i).getContractId(), contractList.get(i).getContractStartDay(), contractList.get(i).getContractEndDay(),
                    contractList.get(i).getContractDeposit(), contractList.get(i).getEmployee(), contractList.get(i).getCustomer(), contractList.get(i).getFacility(), totalMoney));
        }
        return totalMoneyDtoList;
    }
}
