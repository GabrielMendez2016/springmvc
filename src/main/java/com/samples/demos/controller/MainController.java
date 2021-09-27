package com.samples.demos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samples.demos.dao.UserDao;
import com.samples.demos.model.User;

@RestController
public class MainController {
	@Autowired
    private UserDao dao;
	
	@GetMapping("/alive")
	public ResponseEntity<String> getHealth() {
		List<User> listOfUsers = dao.findAllUsers();
		return ResponseEntity.ok("alive");
	}
}
