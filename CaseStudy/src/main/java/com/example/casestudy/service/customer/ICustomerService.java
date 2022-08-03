package com.example.casestudy.service.customer;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void remove(int id);

    void updateCustomer(Customer customer);

    Customer findById(int id);

    List<Customer> searchByName(String name);
}
