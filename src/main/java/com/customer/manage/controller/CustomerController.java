package com.customer.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.manage.dto.CustomerDto;
import com.customer.manage.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/create")
	ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
		return new ResponseEntity<CustomerDto>(customerService.createCustomer(customerDto), HttpStatus.ACCEPTED);
	}

	@PutMapping("/update")
	ResponseEntity<CustomerDto> updateCustomer(@RequestBody CustomerDto customerDto) {
		return new ResponseEntity<CustomerDto>(customerService.updateCustomer(customerDto), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteByCustomerid/{customerId}")
	public void deleteCustomer(@RequestParam int customerId) {
		customerService.deleteCustomer(customerId);
	}

	@GetMapping("/findById/{customerId}")
	public CustomerDto findByCustomerId(@PathVariable int customerId) {
		return customerService.findByCustomerId(customerId);
	}

	@GetMapping("/findByName/{FirstName}")
	public CustomerDto findByFirstName(@PathVariable String FirstName) {
		return customerService.findByFirstName(FirstName);
	}

}
