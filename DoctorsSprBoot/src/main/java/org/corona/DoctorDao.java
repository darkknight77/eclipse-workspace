package org.corona;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DoctorDao {
	private static final Logger logger = Logger.getLogger(DoctorDao.class);
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	
	@SuppressWarnings("unchecked")
	public List<DoctorModel> getDoctors() {

		List<DoctorModel> doctors = new ArrayList<DoctorModel>();
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		/*
		 * Session session = null; try { session = sessionFactory.openSession();
		 * session.beginTransaction(); doctors =
		 * session.createQuery("From Doctors").list();
		 * System.out.println("Doctors are : " + doctors);
		 * 
		 * } catch (Exception e) {} return doctors;
		 */
		return session.createQuery("FROM Doctors").list();
	}

	@SuppressWarnings("unchecked")
	public List<DoctorModel> searchDoctors(String doctorName) {

		List<DoctorModel> doctorsList = new ArrayList<DoctorModel>();

		String query = "SELECT d.* FROM Doctors d WHERE d.Dname like '%" + doctorName + "%' ";
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		List<Object[]> doctorObjects =

				session.createSQLQuery(query).list();
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

		/*
		 * Session session = null; try {
		 * 
		 * session = sessionFactory.openSession(); session.beginTransaction(); String
		 * query = "SELECT d.* FROM Doctors d WHERE d.Dname like '%" + doctorName +
		 * "%' "; List<Object[]> doctorObjects = session.createSQLQuery(query).list();
		 * 
		 * for (Object[] object : doctorObjects) {
		 * 
		 * int id = ((BigInteger) object[0]).intValue(); String name = (String)
		 * object[1]; float salary = (float) object[2]; String specialization = (String)
		 * object[3];
		 * 
		 * DoctorModel doctor = new DoctorModel(id, name, salary, specialization);
		 * System.out.println(doctor); doctorsList.add(doctor); }
		 * 
		 * logger.info(doctorsList);
		 * 
		 * } catch (Exception e) { System.out.println("dao search doctors error");
		 * e.printStackTrace(); }
		 * 
		 * return doctorsList;
		 */

		return doctorsList;
	}

	public DoctorModel getDoctor(int id) {

		DoctorModel doctor = new DoctorModel();
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		doctor = (DoctorModel) session.get(DoctorModel.class, id);
		/*
		 * Session session = null; try {
		 * 
		 * session = sessionFactory.openSession(); session.beginTransaction(); doctor =
		 * (DoctorModel) session.get(DoctorModel.class, id); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 */

		return doctor;
	}

	public void updateDoctor(DoctorModel doctor) {

		/*
		 * Session session = null;
		 * 
		 * try { session = sessionFactory.openSession(); session.beginTransaction();
		 * session.saveOrUpdate(doctor); session.getTransaction().commit(); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        session.beginTransaction();
		session.saveOrUpdate(doctor);
		session.getTransaction().commit();
	}

	public void deleteDoctor(int id) {
		
		/*
		 * Session session = null; try { session = sessionFactory.openSession();
		 * session.beginTransaction(); session.delete(doctor);
		 * session.getTransaction().commit(); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();  
		session.beginTransaction();
		DoctorModel doctor=session.get(DoctorModel.class,id);
		session.delete(doctor);
		session.getTransaction().commit();
	}

}
