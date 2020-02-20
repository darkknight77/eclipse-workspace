package com.latheef.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.latheef.entity.Employee;
import com.latheef.util.HibernateUtil;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	public EmployeeDAOImpl() {
        System.out.println("EmployeeDAOImpl");
    }
    
    @Autowired
    private HibernateUtil hibernateUtil;
	
	@Override
	public long createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  hibernateUtil.fetchAll(Employee.class);
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
