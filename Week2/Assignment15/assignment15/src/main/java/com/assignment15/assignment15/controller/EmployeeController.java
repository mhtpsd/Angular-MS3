package com.assignment15.assignment15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.assignment15.assignment15.entity.Employee;
import com.assignment15.assignment15.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee creatEmployee(@RequestBody Employee employee) {
        employeeService.creatEmployee(employee);
        return employee;
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeByEmployeeId(@PathVariable Long employeeId) {
        return employeeService.getEmployeeByEmployeeId(employeeId);
    }
    
    
}
