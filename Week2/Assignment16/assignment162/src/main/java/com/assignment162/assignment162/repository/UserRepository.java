package com.assignment162.assignment162.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment162.assignment162.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
