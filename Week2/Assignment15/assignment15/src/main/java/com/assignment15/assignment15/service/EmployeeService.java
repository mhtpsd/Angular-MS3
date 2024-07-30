package com.assignment15.assignment15.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment15.assignment15.entity.Employee;
import com.assignment15.assignment15.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee creatEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeByEmployeeId(Long id) {
        Employee emp = employeeRepository.findById(id).get();
        if(emp!=null) {
            return emp;
        }
        return null;
    }
    
}
