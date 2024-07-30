package com.assignment131.assignment131.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment131.assignment131.Entity.Product;
import com.assignment131.assignment131.Repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> searchProducts(String name) {
        return productRepository.findByNameContaining(name);
    }
    
}
