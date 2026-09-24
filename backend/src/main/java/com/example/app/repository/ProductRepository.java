package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

    
}
