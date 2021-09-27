package com.samples.demos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.samples.demos.model.User;

public interface UserDao {
	
	User findById(Long id);
	List<User> findAllUsers();
	 
//    void saveUser(User user);
//     
//    void deleteUserBySsn(String ssn);
//     
//    List<User> findAllUsers();
// 
//    User findUserBySsn(String ssn);
	
}
