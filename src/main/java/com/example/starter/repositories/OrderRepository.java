package com.example.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
