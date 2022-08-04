package com.example.casestudy.service.customer;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void remove(int id);

    void updateCustomer(Customer customer);

    Customer findById(int id);

    Page<Customer> searchByName(String name,Pageable pageable);
}
