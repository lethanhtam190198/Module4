package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @ManyToOne
    @JoinColumn(name ="customerTypeId",referencedColumnName = "customerTypeId")
    private CustomerType customerType;

    private String customerName;
    private String dayOfBirth;
    private int gender;
    private String customerIdCard;
    private String phoneNumber;
    private String customerEmail;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, CustomerType customerTypeId, String customerName, String dayOfBirth, int gender, String customerIdCard, String phoneNumber, String customerEmail, String address) {
        this.customerId = customerId;
        this.customerType = customerTypeId;
        this.customerName = customerName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.customerIdCard = customerIdCard;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
        this.address = address;
    }

    public int getId() {
        return customerId;
    }

    public void setId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerTypeId) {
        this.customerType = customerTypeId;
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
