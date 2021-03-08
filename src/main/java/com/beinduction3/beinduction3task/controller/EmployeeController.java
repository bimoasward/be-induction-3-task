package com.beinduction3.beinduction3task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beinduction3.beinduction3task.model.entity.Employee;
import com.beinduction3.beinduction3task.service.EmployeeService;

@RequestMapping("api/v1/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = "/{id}")
    public Employee getById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }
	
	@GetMapping(value = "/{firstName}/{lastName}")
    public Employee getByName(@PathVariable(value="firstName") String firstName, @PathVariable(value="lastName") String lastName) {
        return employeeService.getByName(firstName, lastName);
    }
	
	@GetMapping(value = "/native/{firstName}/{lastName}")
    public Employee getByNameNative(@PathVariable(value="firstName") String firstName, @PathVariable(value="lastName") String lastName) {
        return employeeService.getByNameNative(firstName, lastName);
    }
	
	@GetMapping(value = "/salary/{salary}")
    public List<Employee> getByNameNative(@PathVariable(value="salary") Integer salary) {
        return employeeService.getBySalary(salary);
    }
}
