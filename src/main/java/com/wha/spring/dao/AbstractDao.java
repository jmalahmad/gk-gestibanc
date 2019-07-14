package com.wha.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wha.spring.model.Employee;

public abstract class AbstractDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	protected void persist(Object entity) {
		getSession().save(entity);
	}

	protected void delete(Object entity) {
		getSession().delete(entity);
	}
}
