package com.latheef.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.latheef.entity.Employee;
import com.latheef.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController() {
        System.out.println("EmployeeController()");
    }
	
	@RequestMapping("createEmployee")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		logger.info("Creating Employee. Data: "+ employee);
		return new ModelAndView("employeeForm");
		
	}
	@RequestMapping(value = {"getAllEmployees", "/"})
	public ModelAndView getAllEmployees() {
		 logger.info("Getting the all Employees.");
		 List<Employee> employeeList = employeeService.getAllEmployees();
		 return  new ModelAndView("employeeList","employeeList",employeeList);
		
	}
}
