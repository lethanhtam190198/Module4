package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;

    @ManyToOne
    @JoinColumn(name="contractId",referencedColumnName = "contractId")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name="attachFacilityId",referencedColumnName ="attachFacilityId" )
    private AttachFacility attachFacility;

    private int contractDetailQuantity;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, Contract contract, AttachFacility attachFacility, int contractDetailQuantity) {
        this.contractDetailId = contractDetailId;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.contractDetailQuantity = contractDetailQuantity;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public int getContractDetailQuantity() {
        return contractDetailQuantity;
    }

    public void setContractDetailQuantity(int contractDetailQuantity) {
        this.contractDetailQuantity = contractDetailQuantity;
    }
}
