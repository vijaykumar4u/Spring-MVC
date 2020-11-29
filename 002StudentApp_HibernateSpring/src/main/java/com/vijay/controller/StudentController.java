package com.vijay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vijay.model.Student;
import com.vijay.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		List<Student> students = studentService.findAll();
		return new ModelAndView("getAllStudents","students",students);
	}
	
	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	
	@RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
	public String saveStudent(Student student) {
		studentService.add(student);
		return "redirect:/getAll";
	}
	
	
	@RequestMapping(value = "/deleteById")
	public String saveStudent(@RequestParam("id") Integer id) {
		studentService.deleteById(id);
		return "redirect:/getAll";
	}

}
