package com.brs.shared;

public class driver_info {
	private int id;
	private String name;
	private String street;
	private String location;
	private String city;
	private int pincode ;
	private int mobile_no;
	private String license_no;
	public driver_info() {
		super();
	}
	public driver_info(int id, String name, String street, String location, String city, int pincode, int mobile_no,
			String license_no) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.location = location;
		this.city = city;
		this.pincode = pincode;
		this.mobile_no = mobile_no;
		this.license_no = license_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	@Override
	public String toString() {
		return "Driver_info [id=" + id + ", name=" + name + ", street=" + street + ", location=" + location + ", city="
				+ city + ", pincode=" + pincode + ", mobile_no=" + mobile_no + ", license_no=" + license_no + "]";
	}
	
	
	
	
	
}
