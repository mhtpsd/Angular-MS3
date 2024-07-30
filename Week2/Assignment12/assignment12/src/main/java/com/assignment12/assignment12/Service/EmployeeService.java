package com.assignment12.assignment12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment12.assignment12.Entity.Employee;
import com.assignment12.assignment12.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees () {
        return employeeRepository.findAll();
    }

    public Employee getById (long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee deleteEmployee(long id) {
        Employee emp = new Employee();
        emp = employeeRepository.findById(id).orElse(null);
        return emp;
    }
}
