package com.customer.manage.dto;

import java.sql.Date;
import java.util.List;

public class CustomerDto {

	private int customerId;

	private String firstName;

	private String middleName;

	private String lastName;

	private Date dateOfBirth;

	private String gender;

	private AddressDto addressDto;

	private List<ContactDto> contactDtos;

	public CustomerDto() {

	}

	public CustomerDto(int customerId, String firstName, String middleName, String lastName, Date dateOfBirth,
			String gender, AddressDto addressDto, List<ContactDto> contactDtos) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.addressDto = addressDto;
		this.contactDtos = contactDtos;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public AddressDto getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

	public List<ContactDto> getContactDtos() {
		return contactDtos;
	}

	public void setContactDtos(List<ContactDto> contactDtos) {
		this.contactDtos = contactDtos;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", addressDto="
				+ addressDto + ", contactDtos=" + contactDtos + "]";
	}

}
