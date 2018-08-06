package com.dxl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxl.bean.DXLAccountVO;
import com.dxl.bean.UserRegistrationVO;

/**
 * @author kishor.jadhav
 *
 */
@RestController("/v1/destinational")
@CrossOrigin(origins = "*")
public class DXLAccountController {
	
	private static final Logger log = LoggerFactory.getLogger(UserRegistrationController.class);
	
	@RequestMapping(value="/account/dxlaccount",method = RequestMethod.POST)
	public String registerUser(@RequestBody DXLAccountVO dxlAccount) {
		log.debug(dxlAccount.getAccountNumber());
		return dxlAccount.getAccountNumber();
		
	}

}
