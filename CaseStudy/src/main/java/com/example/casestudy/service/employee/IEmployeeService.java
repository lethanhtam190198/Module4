package com.example.casestudy.service.employee;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    void remove(int id);

    void updateEmployee(Employee employee);

    Employee findById(int id);

    Page<Employee> searchByName(String name,String position, Pageable pageable);
}
