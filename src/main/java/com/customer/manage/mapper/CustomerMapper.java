package com.customer.manage.mapper;

import org.mapstruct.Mapper;

import com.customer.manage.dto.AddressDto;
import com.customer.manage.dto.ContactDto;
import com.customer.manage.dto.CustomerDto;
import com.customer.manage.entity.AddressEntity;
import com.customer.manage.entity.ContactEntity;
import com.customer.manage.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	public CustomerEntity dtoToCustomerEntity(CustomerDto customerDto);

	public AddressEntity dtoToAddressEntity(AddressDto addressDto);

	public ContactEntity dtoToContactEntity(ContactDto contactDto);

	public CustomerDto entityToCustomerDto(CustomerEntity customerEntity);

	public AddressDto entityToAddressDto(AddressEntity addressEntity);

	public ContactDto entityToContactDto(ContactEntity contactEntity);

	
	
	
	

	
}
