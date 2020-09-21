package org.corona;

import java.util.List;

import org.corona.DoctorModel;
import org.corona.DoctorService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {

	private static final Logger logger = Logger.getLogger(DoctorController.class);

	@Autowired
	private DoctorService doctorService;

	public DoctorController() {
		System.out.println("DOCTOR CONTROLLER()");
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getDoctors() {
		logger.info("Getting the all Employees.");
		List<DoctorModel> doctorsList = doctorService.getDoctors();
		logger.info("----------------");
		logger.info(doctorsList);
		return new ModelAndView("doctors-list", "doctorsList", doctorsList);
	}

	
	  @RequestMapping(value = "searchDoctor", method = RequestMethod.GET) public
	  ModelAndView searchDoctors(@RequestParam("doctorName") String doctorName) {
	  logger.info("Getting the all Doctors from search."); List<DoctorModel>
	  doctorsList = doctorService.searchDoctors(doctorName);
	  logger.info(doctorsList); return new ModelAndView("doctors-list",
	  "doctorsList", doctorsList); }
	  
	  @RequestMapping(value = "editDoctor", method = RequestMethod.GET) public
	  ModelAndView editDoctor(@RequestParam("id") int id,@ModelAttribute
	  DoctorModel doctor) { doctor = doctorService.getDoctor(id); return new
	  ModelAndView("doctor-form","doctorObject",doctor); }
	  
	  @RequestMapping(value = "updateDoctor", method = RequestMethod.POST) public
	  ModelAndView updateDoctor(@ModelAttribute DoctorModel doctor) {
	  logger.info("Saving the Doctor Data : "+doctor);
	  doctorService.updateDoctor(doctor); return new ModelAndView("redirect:/"); }
	  
	  @RequestMapping(value = "createDoctor", method = RequestMethod.GET) public
	  ModelAndView createDoctor() { logger.info("creating the Doctor Data : ");
	  return new ModelAndView("doctor-form","doctorObject",new DoctorModel()); }
	  
	  @RequestMapping(value = "deleteDoctor", method = RequestMethod.GET) public
	  ModelAndView deleteDoctor(@RequestParam int id) {
	  logger.info("deleting the Doctor Data : ");  doctorService.deleteDoctor(id); return new
	  ModelAndView("redirect:/"); }
	  
	  
	 
	}
