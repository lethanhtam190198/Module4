package com.example.casestudy.service;

import com.example.casestudy.model.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    void remove(int id);

    void updateEmployee(Employee employee);

    Employee findById(int id);
}
