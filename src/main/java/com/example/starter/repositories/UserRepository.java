package com.example.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starter.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
