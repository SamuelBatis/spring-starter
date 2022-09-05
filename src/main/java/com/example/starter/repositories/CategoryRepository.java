package com.example.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
