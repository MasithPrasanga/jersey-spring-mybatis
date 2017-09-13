package com.masith.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masith.employee.model.Employee;
import com.masith.employee.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public void insert(Employee employee) {
		employeeRepository.insert(employee);
	}

	@Override
	@Transactional
	public Employee read(int id) {
		return employeeRepository.read(id);
	}

	@Override
	@Transactional
	public List<Employee> readAll() {
		return employeeRepository.readAll();
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		employeeRepository.update(employee);
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		employeeRepository.delete(employee);
	}
}
