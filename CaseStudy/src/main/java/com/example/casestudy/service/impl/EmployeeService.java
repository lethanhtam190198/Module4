package com.example.casestudy.service.impl;

import com.example.casestudy.model.Employee;
import com.example.casestudy.repository.IEmployeeRepository;
import com.example.casestudy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.updateEmployee(employee.getEmployeeName(),employee.getEmployeeDayOfBirth(),employee.getEmployeeIdCard(),
                employee.getEmployeeSalary(),employee.getEmployeePhoneNumber(),employee.getEmployeeEmail(),employee.getEmployeeAddress(),
                employee.getPosition(),employee.getEducationDegree(),employee.getDivision(),employee.getUserName(),employee.getEmployeeId());
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
