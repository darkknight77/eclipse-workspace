package org.corona;

import java.util.List;

import org.corona.DoctorDao;
import org.corona.DoctorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao doctorDao;

	public List<DoctorModel> getDoctors() {

		return doctorDao.getDoctors();
	}

	public List<DoctorModel> searchDoctors(String doctorName) { 
		return doctorDao.searchDoctors(doctorName); }

	public DoctorModel getDoctor(int id) {

		return doctorDao.getDoctor(id);
	}

	public void updateDoctor(DoctorModel doctor) { 
		doctorDao.updateDoctor(doctor); }

	public void deleteDoctor(int id) { 
	  
	  doctorDao.deleteDoctor(id); }

}
