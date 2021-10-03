package com.samples.demos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samples.demos.model.User;
import com.samples.demos.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}

}
