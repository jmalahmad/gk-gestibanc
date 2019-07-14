package com.wha.spring.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.EmployeeDao;
import com.wha.spring.model.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {


	public Serializable saveEmployee(Employee employee) {
		return getSession().save(employee);
	}

	public Employee findById(final Serializable id) {
		return (Employee) getSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

	public List<Employee> findAllEmployees() {
		return null;
	}

	public void deleteEmployeeBySsn(String ssn) {

	}

	public Employee findBySsn(String ssn) {
		return null;
	}

}
