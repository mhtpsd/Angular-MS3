package com.assignment10.assignment10.Service;

import java.util.HashMap;
import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment10.assignment10.Entity.Employee;

@Service
public class EmployeeService {
    
    // @Autowired
    // private Employee employee;

    Map<Long, Employee> employeeMap = new HashMap<>();

    public Employee getEmployeeById(long id) {
        // get employee by id
        return employeeMap.get(id);
      }  

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
      }
  
}
