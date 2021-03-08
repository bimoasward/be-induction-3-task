package com.beinduction3.beinduction3task.service;

import java.util.List;

import com.beinduction3.beinduction3task.model.entity.Employee;

public interface EmployeeService {

	Employee getById(Integer id);
	Employee getByName(String firstName, String lastName);
	Employee getByNameNative(String firstName, String lastName);
	List<Employee> getBySalary(Integer salary);
}
