package com.latheef.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = -7988799579036225137L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column
    private String ename;
    
    @Column
    private int age;
    
    @Column
    private float salary;
    
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}


	


}
