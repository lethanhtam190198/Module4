package com.example.casestudy.service;

import com.example.casestudy.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
