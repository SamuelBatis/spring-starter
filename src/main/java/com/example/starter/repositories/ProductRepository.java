package com.example.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
