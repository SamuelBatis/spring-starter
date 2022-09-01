package com.example.starter.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.starter.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<Users> findAll() {
		Users u = new Users(1L, "Maria", "maria@gmial.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
