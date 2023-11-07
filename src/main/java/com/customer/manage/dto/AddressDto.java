package com.customer.manage.dto;

public class AddressDto {

	private int addressId;

	private String line1;

	private String line2;

	private String line3;

	private String city;

	private String state;

	private String postalCode;

//	private int customerId;

	public AddressDto() {

	}

	public AddressDto(int addressId, String line1, String line2, String line3, String city, String state,
			String postalCode) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	/*
	 * public AddressDto(int addressId, @NotNull(message = "line 1 is mandatory")
	 * String line1,
	 * 
	 * @NotNull(message = "line 2 cannot be null") String line2, String line3,
	 * 
	 * @NotNull(message = "city cannot be null") String city,
	 * 
	 * @NotNull(message = "state cannot be null") String state,
	 * 
	 * @NotNull(message = "postal code cannot be null") @Min(value = 1, message =
	 * "postalcode must be positive number") @Max(value = 999999, message =
	 * "postalcode cannot be exceed 999999") String postalCode, int customerId) {
	 * super(); this.addressId = addressId; this.line1 = line1; this.line2 = line2;
	 * this.line3 = line3; this.city = city; this.state = state; this.postalCode =
	 * postalCode; this.customerId = customerId; }
	 */
	/*
	 * public int getCustomerId() { return customerId; }
	 * 
	 * public void setCustomerId(int customerId) { this.customerId = customerId; }
	 */

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
