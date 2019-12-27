package com.JJJ.services;

import org.springframework.stereotype.Service;

import com.JJJ.dto.CustomerDto;

@Service
public class CustomerService {

	public CustomerDto setCustomerDetails(Long id) {
		CustomerDto customer = new CustomerDto();
		customer.setFirstName("Jay");
		customer.setLastName("Joshi");
		customer.setEmail("jay@mail.com");
		customer.setPhone("5717894367");
		return customer;
		
	}
	
	
}
