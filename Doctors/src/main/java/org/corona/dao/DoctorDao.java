package org.corona.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.corona.controller.DoctorController;
import org.corona.model.DoctorModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDao {
	private static final Logger logger = Logger.getLogger(DoctorDao.class);
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<DoctorModel> getDoctors() {

		Session session = null;
		List<DoctorModel> doctors = new ArrayList<DoctorModel>();

		try {

			session = sessionFactory.openSession();
			session.beginTransaction();
			doctors = session.createQuery("From Doctors").list();
			System.out.println("Doctors are : " + doctors);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return doctors;
	}

	@SuppressWarnings("unchecked")
	public List<DoctorModel> getDoctors(String doctorName) {

		Session session = null;
		List<DoctorModel> doctorsList = new ArrayList<DoctorModel>();

		try {

			session = sessionFactory.openSession();
			session.beginTransaction();
			String query = "SELECT d.* FROM Doctors d WHERE d.Dname like '%" + doctorName + "%' ";
			List<Object[]> doctorObjects = session.createSQLQuery(query).list();

			for (Object[] object : doctorObjects) {

				int id = ((BigInteger) object[0]).intValue();
				String name = (String) object[1];
				float salary = (float) object[2];
				String specialization = (String) object[3];

				DoctorModel doctor = new DoctorModel(id, name, salary, specialization);
				System.out.println(doctor);
				doctorsList.add(doctor);
			}

			logger.info(doctorsList);

		} catch (Exception e) {
			System.out.println("dao search doctors error");
			e.printStackTrace();
		}

		return doctorsList;

	}

	public DoctorModel getDoctor(int id) {

		Session session = null;
		DoctorModel doctor = new DoctorModel();
		try {

			session = sessionFactory.openSession();
			session.beginTransaction();
			doctor = (DoctorModel) session.get(DoctorModel.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return doctor;
	}

	public void updateDoctor(DoctorModel doctor) {
		// TODO Auto-generated method stub

		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(doctor);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteDoctor(DoctorModel doctor) {		
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction(); 
			session.delete(doctor);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
