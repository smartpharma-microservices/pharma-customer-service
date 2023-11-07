package com.customer.manage.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.customer.manage.dto.CustomerDto;
import com.customer.manage.entity.CustomerEntity;
import com.customer.manage.mapper.CustomerCommandMapper;
import com.customer.manage.repository.CustomerRepository;
import com.customer.manage.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;

	CustomerCommandMapper customerCommandMapper;

	public CustomerServiceImpl(CustomerRepository customerRepository, CustomerCommandMapper customerCommandMapper) {
		this.customerRepository = customerRepository;
		this.customerCommandMapper = customerCommandMapper;
	}

	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		return customerCommandMapper
				.entityToCustomerDto(customerRepository.save(customerCommandMapper.dtoToCustomerEntity(customerDto)));

	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customerDto) {
		return customerCommandMapper
				.entityToCustomerDto(customerRepository.save(customerCommandMapper.dtoToCustomerEntity(customerDto)));
	}

	@Override
	public void deleteCustomer(int customerId) {
		Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
		if (customerEntity.isPresent()) {
			customerRepository.delete(customerEntity.get());
		} else {
			throw new RuntimeException("invalid customer code");
		}

	}

	@Override
	public CustomerDto findByCustomerId(int customerId) {
		Optional<CustomerEntity> customerOptionalEntity = customerRepository.findById(customerId);
		if (customerOptionalEntity.isPresent()) {
			return customerCommandMapper.entityToCustomerDto(customerOptionalEntity.get());
		} else {
			throw new RuntimeException("customer not found with given Id");
		}
	}

	@Override
	public CustomerDto findByFirstName(String firstName) {
		CustomerEntity customerEntity = customerRepository.findByFirstName(firstName)
				.orElseThrow(() -> new RuntimeException("customer not found"));
		return customerCommandMapper.entityToCustomerDto(customerEntity);
	}
}
