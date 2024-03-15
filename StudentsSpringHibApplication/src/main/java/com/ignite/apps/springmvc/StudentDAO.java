package com.ignite.apps.springmvc;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public class StudentDAO {

	@Autowired
	SessionFactory factory;

	@Transactional
	void saveStudent(Student stud) {
		factory.getCurrentSession().save(stud);
	}
}
