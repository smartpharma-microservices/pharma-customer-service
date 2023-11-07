package com.customer.manage.service;

import com.customer.manage.dto.CustomerDto;

public interface CustomerService {

	public CustomerDto createCustomer(CustomerDto customerDto);

	public CustomerDto updateCustomer(CustomerDto customerDto);

	public void deleteCustomer(int customerId);

	public CustomerDto findByCustomerId(int customerId);

	public CustomerDto findByFirstName(String firstName);

}
