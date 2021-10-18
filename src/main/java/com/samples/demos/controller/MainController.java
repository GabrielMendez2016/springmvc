package com.samples.demos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samples.demos.dao.TppLogDao;
import com.samples.demos.model.TppLog;

@RestController
public class MainController {
	@Autowired
    private TppLogDao dao;
	
	@GetMapping("/alive")
	public ResponseEntity<String> getHealth() {
		TppLog log = dao.findById(8L);
		return ResponseEntity.ok("alive: " + log.getTppContent());
	}
}
