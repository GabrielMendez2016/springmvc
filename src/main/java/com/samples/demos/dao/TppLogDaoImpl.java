package com.samples.demos.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samples.demos.model.TppLog;

@Repository
@Transactional
public class TppLogDaoImpl extends AbstractDao<Long, TppLog> implements TppLogDao {

	@Override
	public TppLog findById(Long id) {
		return getByKey(id);
	}

	@Override
	public List<TppLog> findAllLogs() {
		Criteria criteria = createEntityCriteria();
        return (List<TppLog>) criteria.list();
	}

}
