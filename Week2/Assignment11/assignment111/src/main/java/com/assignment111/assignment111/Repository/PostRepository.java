package com.assignment111.assignment111.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment111.assignment111.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    
}
