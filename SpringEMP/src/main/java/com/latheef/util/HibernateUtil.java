package com.latheef.util;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	
	 @SuppressWarnings("unchecked")  
	    public <T> List<T> fetchAll(Class<T> entityClass) {        
	        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();        
	    }
	
}
