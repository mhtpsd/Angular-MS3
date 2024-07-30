package com.assignment152.assignment152.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment152.assignment152.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
