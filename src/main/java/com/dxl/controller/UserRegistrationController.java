package com.dxl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxl.DestinationxlApp;
import com.dxl.bean.UserRegistrationVO;

/**
 * @author kishor.jadhav
 *
 */
@RestController("/v1/destinational")
@CrossOrigin(origins = "*")
public class UserRegistrationController {
	private static final Logger log = LoggerFactory.getLogger(UserRegistrationController.class);  
	
	@RequestMapping(value="/user/registration",method = RequestMethod.POST)
	public String registerUser(@RequestBody UserRegistrationVO userRegistration) {
		log.debug(userRegistration.getUserName());
		return "user is registration has been done";
		
	}

}
