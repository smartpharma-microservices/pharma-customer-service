package com.customer.manage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact", schema = "customer_schema")
public class ContactEntity {

	@Id
	@Column(name = "contact_id")
	private int contactId;

	@Column(name = "type")
	private String type;

	@Column(name = "value")
	private String value;

	@JsonBackReference("customer-contact")
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customerEntity;

	public ContactEntity() {

	}

	public ContactEntity(int contactId, String type, String value, CustomerEntity customerEntity) {
		super();
		this.contactId = contactId;
		this.type = type;
		this.value = value;
		this.customerEntity = customerEntity;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

}
