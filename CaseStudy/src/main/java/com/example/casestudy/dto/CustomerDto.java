package com.example.casestudy.dto;

import com.example.casestudy.model.customer.CustomerType;


public class CustomerDto {
    private int customerId;
    private CustomerType customerType;
    private String customerName;
    private String dayOfBirth;
    private int gender;
    private String customerIdCard;
    private String phoneNumber;
    private String customerEmail;
    private String address;

    public CustomerDto() {
    }

    public CustomerDto(int customerId, CustomerType customerType, String customerName, String dayOfBirth, int gender, String customerIdCard, String phoneNumber, String customerEmail, String address) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerName = customerName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
