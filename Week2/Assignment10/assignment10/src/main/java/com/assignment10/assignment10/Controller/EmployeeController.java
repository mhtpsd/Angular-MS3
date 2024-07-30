package com.assignment10.assignment10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment10.assignment10.Entity.Employee;
import com.assignment10.assignment10.Service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService empService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        // get employee by idn and return it
        // return 404 not found if employee not found
        Employee emp = empService.getEmployeeById(id);
        if(emp==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(empService.getEmployeeById(id));
    }
    
    @PostMapping("/employees")
    public ResponseEntity<Employee>  addEmployee(@RequestBody Employee employee) {
        // add new employee
        empService.addEmployee(employee);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

}
