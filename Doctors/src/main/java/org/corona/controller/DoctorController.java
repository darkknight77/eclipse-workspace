package org.corona.controller;



import org.corona.service.DoctorService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DoctorController {
    
	private static final Logger logger = Logger.getLogger(DoctorController.class);
	
	@Autowired
	private DoctorService doctorService;
	
	public DoctorController() {
		System.out.println("DOCTOR CONTROLLER()");
	}
	
@RequestMapping(value = "/", method = RequestMethod.GET)	
 public String getDoctors(ModelMap model) {
	System.out.println("getting");
	logger.info("Getting the all Employees.");
	doctorService.getDoctors();
	 return "doctors-list";
 }  	
	
	
}
