package org.corona;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Doctors")
@Table(name = "Doctors")
public class DoctorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "Dname")
	String dName;
	@Column(name = "salary")
	float salary;
	@Column(name = "specialization")
	String specialization;

	
	public DoctorModel(int id, String dName, float salary, String specialization) {
		super();
		this.id = id;
		this.dName = dName;
		this.salary = salary;
		this.specialization = specialization;
	}
	
	public DoctorModel() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "DoctorModel [id=" + id + ", dName=" + dName + ", salary=" + salary + ", specialization="
				+ specialization + "]";
	}

	
	
}
