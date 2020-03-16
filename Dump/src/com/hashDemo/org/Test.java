package com.hashDemo.org;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee ep1 = new Employee("John", 70000);
		Employee ep2 = new Employee("Samantha", 57000);
		Employee ep3 = new Employee("Abraham", 65000);
		Employee ep4 = new Employee("Karen", 43000);
		
		Company c1 =new Company("TCS", 3,ep1);
		Company c2 =new Company("IBM", 5,ep3);
		Company c3 =new Company("CGI", 2,ep4);
		Company c4 =new Company("WIPRO", 1,ep2);
		
		
		HashMap< Integer,Company> companies = new HashMap<Integer,Company> ();
		companies.put(1, c1);
		companies.put(2, c2);
		companies.put(3, c3);
		companies.put(4, c4);
		
		HashMap<Integer, Company> clients = new HashMap<Integer, Company>();
		
		
		clients.put(101,c1);
		clients.put(102,c2);
		clients.put(103,c1);
		clients.put(104,c2);
		clients.put(105,c2);
	   Company comp1 =  clients.get(101);
	   System.out.println(comp1.toString());
		
		
	}

}
