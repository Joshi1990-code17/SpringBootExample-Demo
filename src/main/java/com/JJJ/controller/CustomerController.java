package com.JJJ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JJJ.dto.CustomerDto;
import com.JJJ.services.CustomerService;

@RestController
@RequestMapping("/customerdetails")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="",method = RequestMethod.GET)
	public  CustomerDto getCustomerDetails(@RequestParam Long id){ 
		return customerService.setCustomerDetails(id);
			
}
	@RequestMapping(value="",method = RequestMethod.POST)
	public void setCustomer(@RequestBody CustomerDto dto) {
		System.out.println(dto.toString());
	}
}