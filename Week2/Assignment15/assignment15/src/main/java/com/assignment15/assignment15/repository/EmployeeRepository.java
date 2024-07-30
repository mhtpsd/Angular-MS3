package com.assignment15.assignment15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment15.assignment15.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
