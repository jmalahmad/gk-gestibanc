package com.wha.spring.idao;

import java.io.Serializable;
import java.util.List;

import com.wha.spring.model.Employee;

public interface EmployeeDao {
	Serializable saveEmployee(Employee employee);

	Employee findBySsn(String ssn);

	void updateEmployee(Employee employee);

	public List<Employee> findAllEmployees();

	Employee findById(final Serializable id);

	public void deleteEmployeeBySsn(String ssn);
}
