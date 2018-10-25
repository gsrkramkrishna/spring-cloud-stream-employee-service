package com.gsrk.employee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gsrk.employee.model.Employee;
import com.gsrk.employee.source.EmployeeRegistrationSource;

@RestController
@EnableBinding(EmployeeRegistrationSource.class)
@RequestMapping(value="/v1")
public class EmployeeController {
	private Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeRegistrationSource employeeRegistrationSource;
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee employee) {
		logger.info("Employee Reuest Payload:{}",employee);
		boolean response = employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
		//return employeeService.saveEmployee(employee);
		logger.info("Response:{}",response);
		
		
	}
	

}
