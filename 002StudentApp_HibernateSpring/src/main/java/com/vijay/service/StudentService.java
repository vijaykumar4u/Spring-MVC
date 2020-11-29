package com.vijay.service;

import java.util.List;

import com.vijay.model.Student;

public interface StudentService {
	public void add(Student student);

	public List<Student> findAll();

	public void deleteById(Integer id);

}
