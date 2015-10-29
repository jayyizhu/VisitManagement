package com.visitman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.visitman.entity.EmployeeEntity;

@Controller
public class EmployeeController {

	@RequestMapping("/employee/view")
	public String index() {
		return "home";
	}
	
	@RequestMapping("/employee/query")
	public String query() {
		return "home";
	}
	
	@RequestMapping("/employee/update")
	public String update() {
		return "home";
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String add(@RequestBody EmployeeEntity emp, Model model) {
		return "home";
	}
}