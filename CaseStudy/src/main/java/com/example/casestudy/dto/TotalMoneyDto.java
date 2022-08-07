package com.example.casestudy.dto;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.facility.Facility;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class TotalMoneyDto {
    private int contractId;
    private Date contractStartDay;
    private Date contractEndDay;
    private double contractDeposit;
    private Employee employee;
    private Customer customer;
    private Facility facility;
    private double total;

    public TotalMoneyDto() {
    }

    public TotalMoneyDto(int contractId, Date contractStartDay, Date contractEndDay, double contractDeposit, Employee employee, Customer customer, Facility facility, double total) {
        this.contractId = contractId;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.contractDeposit = contractDeposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.total = total;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Date getContractStartDay() {
        return contractStartDay;
    }

    public void setContractStartDay(Date contractStartDay) {
        this.contractStartDay = contractStartDay;
    }

    public Date getContractEndDay() {
        return contractEndDay;
    }

    public void setContractEndDay(Date contractEndDay) {
        this.contractEndDay = contractEndDay;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
