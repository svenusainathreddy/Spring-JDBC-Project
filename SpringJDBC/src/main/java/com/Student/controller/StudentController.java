package com.Student.controller;

import com.Student.dao.StudentDAo;
import com.Student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class StudentController {
	@Autowired
	StudentDAo dao;

	@RequestMapping("/studentform")
	public String showform(Model m) {
		m.addAttribute("command", new Student());
		return "studentform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("s") Student s) {
		dao.save(s);
		return "redirect:/viewstudent";
	}
	@RequestMapping(value = "/editsave",method =RequestMethod.POST)
	public String updated(@ModelAttribute("s") Student s) {
		dao.update(s);
		return "redirect:/viewstudent";
	}
	

	@RequestMapping("/viewstudent")
	public String viewstudent(Model m) {
		List<Student> list = dao.getStudents();
		m.addAttribute("l", list);
		return "viewstudent";
	}

	@RequestMapping(value = "/editstudent/{sid}")
	public String editStudent(@PathVariable("sid") int sid, Model m) {
		Student s = dao.getStudentById(sid);
		m.addAttribute("command", s);
		return "studentedit";
	}
	
	@RequestMapping(value = "/deletestudent/{sid}", method = RequestMethod.GET)
	public String deleteStudent(@ModelAttribute("s") Student s) {
		dao.delete(s.getSid());
		return "redirect:/viewstudent";
	}

}
