package com.example.Departmentservice2.service;

import java.util.Optional;

import com.example.Departmentservice2.entity.Department;

public interface DepartmentService {

	Department savingDeprment(Department department);

	Optional<Department> gettingdata(long id);

}
