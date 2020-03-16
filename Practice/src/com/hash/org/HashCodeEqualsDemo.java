package com.hash.org;

import java.util.HashSet;

public class HashCodeEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Employee employee = new Employee("rajeev", 24);
	        Employee employee1 = new Employee("rajeev", 25);
	        Employee employee2 = new Employee("rajeev", 24);

	        HashSet<Employee> employees = new HashSet<Employee>();
	        employees.add(employee);
	        System.out.println(employees.contains(employee2));
	        System.out.println("employee.hashCode():  " + employee.hashCode()
	        + "  employee2.hashCode():" + employee2.hashCode());
	    }
	}


