package com.samples.demos.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samples.demos.model.User;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {

	@Override
	public User findById(Long id) {
		return getByKey(id);
	}

	@Override
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
	}

}
