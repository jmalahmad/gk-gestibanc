package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.EmployeeDao;
import com.wha.spring.iservice.EmployeeService;
import com.wha.spring.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeDao employeeDAO;
	
	public Long saveEmployee(Employee employee) {
		return ((Long) (employeeDAO.saveEmployee(employee)));
	}

	public Employee findBySsn(String ssn) {
		return employeeDAO.findBySsn(ssn);
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();
	}

	public void deleteEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		
	}

}
