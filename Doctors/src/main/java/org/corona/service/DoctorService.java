package org.corona.service;

import java.util.List;

import org.corona.dao.DoctorDao;
import org.corona.model.DoctorModel;
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
		// TODO Auto-generated method stub
		return doctorDao.searchDoctors(doctorName);
	}

	public DoctorModel getDoctor(int id) {
		
		return doctorDao.getDoctor(id);
	}

	public void updateDoctor(DoctorModel doctor) {
		// TODO Auto-generated method stub
		doctorDao.updateDoctor(doctor);
	}

	public void deleteDoctor(DoctorModel doctor) {
		// TODO Auto-generated method stub
		
		doctorDao.deleteDoctor(doctor);
	}

}
