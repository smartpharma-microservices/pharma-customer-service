package com.customer.manage.dto;

public class ContactDto {

	private int contactId;

	private String type;

	private String value;

	public ContactDto() {

	}

	public ContactDto(int contactId, String type, String value) {
		super();
		this.contactId = contactId;
		this.type = type;
		this.value = value;
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

	@Override
	public String toString() {
		return "ContactDto [contactId=" + contactId + ", type=" + type + ", value=" + value + "]";
	}

}
