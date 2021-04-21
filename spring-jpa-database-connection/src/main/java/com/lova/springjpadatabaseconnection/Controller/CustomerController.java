package com.lova.springjpadatabaseconnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lova.springjpadatabaseconnection.model.Customer;
import com.lova.springjpadatabaseconnection.repository.ICustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	ICustomerRepository customerRepository;

	@GetMapping("/getData")
	public List<Customer> getCustomerData() {
		return customerRepository.findAll();
	}

	@GetMapping("/hello")
	public String sayGoodMorning(String name) {
		return "Good Morning   " + name;
	}

}
