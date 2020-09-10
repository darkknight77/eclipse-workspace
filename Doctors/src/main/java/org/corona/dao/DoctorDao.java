package org.corona.dao;

import java.util.ArrayList;
import java.util.List;

import org.corona.model.DoctorModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class DoctorDao {
    @Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<DoctorModel> getDoctors(){
		
		Session session =null;
		List<DoctorModel> doctors= new ArrayList<DoctorModel>();
		
		try {
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		doctors=session.createQuery("From Doctors").list();
		System.out.println("Doctors are : " + doctors);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return doctors;
	} 
	
}
