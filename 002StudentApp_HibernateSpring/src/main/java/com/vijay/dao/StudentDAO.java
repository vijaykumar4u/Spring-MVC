package com.vijay.dao;

import java.util.List;

import com.vijay.model.Student;

public interface StudentDAO {

	public void add(Student student);

	public List<Student> findAll();

	public void deleteById(Integer id);
}
