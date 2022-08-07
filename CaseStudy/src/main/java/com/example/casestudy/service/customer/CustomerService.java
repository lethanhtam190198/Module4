package com.example.casestudy.service.customer;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.repository.customer.ICustomerRepository;
import com.example.casestudy.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer.getCustomerType(), customer.getCustomerName(), customer.getDayOfBirth(),
                customer.getGender(), customer.getCustomerIdCard(), customer.getPhoneNumber(), customer.getCustomerEmail(),
                customer.getAddress(), customer.getCustomerId());
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> searchByName(Pageable pageable,String name) {
        return customerRepository.findAll(pageable,"%" + name + "%");
    }
}