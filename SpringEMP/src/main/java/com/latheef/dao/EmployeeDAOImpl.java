package com.latheef.dao;

import java.math.BigInteger;
import java.util.ArrayList;
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
		  return (Long) hibernateUtil.create(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return hibernateUtil.update(employee);
	}
	
	
	    
	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(id);
	//	hibernateUtil.delete(employee);
		hibernateUtil.delete(id,Employee.class);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  hibernateUtil.fetchAll(Employee.class);
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return hibernateUtil.fetchById(id, Employee.class);
	}

	@SuppressWarnings("unchecked")
    @Override
    public List<Employee> getAllEmployees(String employeeName) { 
        String query = "SELECT e.* FROM Employees e WHERE e.ename like '%"+ employeeName +"%'";
        List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
        List<Employee> employees = new ArrayList<Employee>();
        for(Object[] employeeObject: employeeObjects) {
            Employee employee = new Employee();
            long id = ((BigInteger) employeeObject[0]).longValue();         
            int age = (int) employeeObject[1];
            String name = (String) employeeObject[2];
            float salary = (float) employeeObject[3];
            employee.setId(id);
            employee.setEname(name);
            employee.setAge(age);
            employee.setSalary(salary);
            employees.add(employee);
        }
        System.out.println(employees);
        return employees;
    }

}
