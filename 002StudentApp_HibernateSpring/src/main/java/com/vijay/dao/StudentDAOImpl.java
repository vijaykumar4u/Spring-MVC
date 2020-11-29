package com.vijay.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.vijay.model.Student;

@Repository
@Transactional

public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void add(Student student) {
		hibernateTemplate.save(student);

	}

	public List<Student> findAll() {
		return hibernateTemplate.loadAll(Student.class);
	}

	public void deleteById(Integer id) {
		Student student = new Student();
		student.setId(id);
		hibernateTemplate.delete(student);
	}
}
