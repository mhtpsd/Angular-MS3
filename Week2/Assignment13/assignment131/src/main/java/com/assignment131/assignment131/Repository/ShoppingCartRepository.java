package com.assignment131.assignment131.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment131.assignment131.Entity.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    
}
