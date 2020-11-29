package com.vijay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.dao.StudentDAO;
import com.vijay.model.Student;

@Service

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public void add(Student student) {
		studentDAO.add(student);
	}

	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	public void deleteById(Integer id) {
		studentDAO.deleteById(id);

	}

}
