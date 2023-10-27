package com.example.Departmentservice2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Departmentservice2.entity.Department;
import com.example.Departmentservice2.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private DepartmentService service;

	@Autowired
	DepartmentController(DepartmentService service) {
		this.service = service;
	}

	@PostMapping("/save")
	String saveDepartment(@RequestBody Department department) {
		service.savingDeprment(department);
		return "saved department ";
	}

	@GetMapping("{id}")
	Optional<Department> getData(@PathVariable long id) {
		return service.gettingdata(id);
	}

}
