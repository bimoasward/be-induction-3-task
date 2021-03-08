package com.beinduction3.beinduction3task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beinduction3.beinduction3task.model.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmployeeId(Integer employeeId);
	Employee findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query(nativeQuery = true, value = "SELECT * FROM employees e WHERE e.first_name = :firstName AND e.last_name = :lastName")
    Employee findByNameNative(String firstName, String lastName);
	
	@Query(nativeQuery = true, value = "SELECT * FROM employees e LEFT JOIN jobs j ON e.job_id = j.job_id WHERE :salary BETWEEN j.min_salary AND j.max_salary")
	List<Employee> findBySalary(Integer salary);
}
