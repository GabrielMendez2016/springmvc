package com.samples.demos.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.samples.demos.model.TppLog;

public interface TppLogDao {
	
	TppLog findById(Long id);
	List<TppLog> findAllLogs();
	 
//    void saveUser(User user);
//     
//    void deleteUserBySsn(String ssn);
//     
//    List<User> findAllUsers();
// 
//    User findUserBySsn(String ssn);
	
}
