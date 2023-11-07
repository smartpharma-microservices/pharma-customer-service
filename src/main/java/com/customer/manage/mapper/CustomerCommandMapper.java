package com.customer.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.customer.manage.dto.AddressDto;
import com.customer.manage.dto.ContactDto;
import com.customer.manage.dto.CustomerDto;
import com.customer.manage.entity.AddressEntity;
import com.customer.manage.entity.ContactEntity;
import com.customer.manage.entity.CustomerEntity;

@Component
public class CustomerCommandMapper {

	CustomerMapper customerMapper;

	public CustomerCommandMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}
//	dto to entity================================

	public CustomerEntity dtoToCustomerEntity(CustomerDto customerDto) {
		if (customerDto.getCustomerId() == 0) {
			customerDto.setCustomerId(id());
		}
		CustomerEntity customerEntity = customerMapper.dtoToCustomerEntity(customerDto);
		customerEntity.setAddressEntity(dtoToAddressEntity(customerDto.getAddressDto(), customerEntity));
		customerEntity.setContactEntities(dtoToContactEntities(customerDto.getContactDtos(), customerEntity));
		return customerEntity;
	}

	public AddressEntity dtoToAddressEntity(AddressDto addressDto, CustomerEntity customerEntity) {
		if (addressDto.getAddressId() == 0) {
			addressDto.setAddressId(id());
		}
		AddressEntity addressEntity = customerMapper.dtoToAddressEntity(addressDto);
		addressEntity.setCustomerEntity(customerEntity);
		return addressEntity;
	}

	public ContactEntity dtoToContactEntity(ContactDto contactDto, CustomerEntity customerEntity) {
		if (contactDto.getContactId() == 0) {
			contactDto.setContactId(id());
		}
		ContactEntity contactEntity = customerMapper.dtoToContactEntity(contactDto);
		contactEntity.setCustomerEntity(customerEntity);
		return contactEntity;
	}

	public List<ContactEntity> dtoToContactEntities(List<ContactDto> contactDtos, CustomerEntity customerEntity) {
		return contactDtos.stream().map(contactEntity -> dtoToContactEntity(contactEntity, customerEntity))
				.collect(Collectors.toList());

	}
	// entity to dto=============================================================

	public CustomerDto entityToCustomerDto(CustomerEntity customerEntity) {
		var customerDto = customerMapper.entityToCustomerDto(customerEntity);
		customerDto.setAddressDto(entityToAddressDto(customerEntity.getAddressEntity()));
		customerDto.setContactDtos(entityToContactDtos(customerEntity.getContactEntities(), customerEntity));
		return customerDto;
	}

	public AddressDto entityToAddressDto(AddressEntity addressEntity) {
		var addressDto = customerMapper.entityToAddressDto(addressEntity);
		return addressDto;
	}

	public ContactDto entityToContactDto(ContactEntity contactEntity) {
		var contactDto = customerMapper.entityToContactDto(contactEntity);
		return contactDto;
	}

	public List<ContactDto> entityToContactDtos(List<ContactEntity> contactEntities, CustomerEntity customerEntity) {
		return contactEntities.stream().map(contactEntity -> entityToContactDto(contactEntity))
				.collect(Collectors.toList());

	}

	public Integer id() {
		int min = 000_000;
		int max = 999_999;
		return min + (int) (Math.random() * (max - min + 1));
	}
}
