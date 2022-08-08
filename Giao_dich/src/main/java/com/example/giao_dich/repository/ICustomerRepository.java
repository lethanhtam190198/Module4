package com.example.giao_dich.repository;

import com.example.giao_dich.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
