package com.latheef.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latheef.dao.EmployeeDAO;
import com.latheef.dao.EmployeeDAOImpl;
import com.latheef.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}
	
	@Override
	public long createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 return employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		
		employeeDAO.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
	
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(id);
	}

	 @Override
	    public List<Employee> getAllEmployees(String employeeName) {
	        return employeeDAO.getAllEmployees(employeeName);
	    }

	

}
