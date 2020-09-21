package com.brand.application.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brand.application.dao.BrandDao;
import com.brand.application.model.BrandModel;


@Service
public class BrandService {
	@Autowired
	private BrandDao brandDao;
	
	public List<BrandModel> getBrands(){
		
		return brandDao.getBrands();
		
	}

	public void addBrand(BrandModel brand) {
		// TODO Auto-generated method stub
		brandDao.addBrand(brand);
	}

	public void updateBrand(BrandModel brand) {
		// TODO Auto-generated method stub
		brandDao.updateBrand(brand);
	}
	public BrandModel getBrand(int id) {
		// TODO Auto-generated method stub
		return brandDao.getBrand(id);
	}

	public void deleteBrand(int id) {
		// TODO Auto-generated method stub
		brandDao.deleteBrand(id);
	}

	

}
