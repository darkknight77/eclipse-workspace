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

}
