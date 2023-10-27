package com.example.Departmentservice2.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Departmentservice2.entity.Department;
import com.example.Departmentservice2.repository.DepartmentRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DepartmentServiceImpl implements DepartmentService {
//	field injection
	@Autowired
	private DepartmentRepository repo;

	@Override
	public Department savingDeprment(Department department) {
		log.info("saving  department {} :", department);
		Department departments = repo.save(department);
		log.info("saved department successfully {} :", departments);
		return departments;
	}

	@Override
	public Optional<Department> gettingdata(long id) {
		log.info("fetching data {} : ", id);
		Optional<Department> departments2 = repo.findById(id);
		log.info("fetched data {} : ", departments2);
		return departments2;

	}
}
