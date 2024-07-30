package com.onetoone.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.onetoone.Entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
    
}
