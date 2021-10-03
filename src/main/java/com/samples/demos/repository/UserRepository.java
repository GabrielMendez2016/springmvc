package com.samples.demos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samples.demos.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
