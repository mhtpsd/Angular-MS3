package com.assignment161.assignment161.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment161.assignment161.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
