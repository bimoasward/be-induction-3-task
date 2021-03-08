package com.beinduction3.beinduction3task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beinduction3.beinduction3task.model.entity.Employee;
import com.beinduction3.beinduction3task.repository.EmployeeRepository;
import com.beinduction3.beinduction3task.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
    public Employee getById(Integer id) {
        return employeeRepository.findByEmployeeId(id);
    }
	
	@Override
    public Employee getByName(String firstName, String lastName) {
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }
	
	@Override
    public Employee getByNameNative(String firstName, String lastName) {
        return employeeRepository.findByNameNative(firstName, lastName);
    }
	
	@Override
    public List<Employee> getBySalary(Integer salary) {
        return employeeRepository.findBySalary(salary);
    }
}
