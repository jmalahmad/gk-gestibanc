package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Employee;

public interface EmployeeService {
	Long saveEmployee(Employee employee);

	Employee findBySsn(String ssn);

	void updateEmployee(Employee employee);

	public List<Employee> findAllEmployees();

	public void deleteEmployeeBySsn(String ssn);
}
