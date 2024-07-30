package com.assignment12.assignment12.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment12.assignment12.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
