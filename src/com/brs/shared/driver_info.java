package com.brs.shared;

/*
 * Class for Driver's information 
 * Contains methods to get and set driver informations
 * 
 */
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
	/*
	 * parameterized constructor for initialization
	 * @param driver's id
	 * @param driver's name
	 * @param Street name
	 * @param location
	 * @param city
	 * @param pincode
	 * @param driver's mobile number
	 * @param diver's licence number
	 */
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
	/*
	 * gets driver id
	 * @return id 
	 */
	public int getId() {
		return id;
	}
	/*
	 * sets driver id
	 * @param is to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * gets driver's name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/*
	 * @sets driver's name
	 * @param name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * gets driver's Street name
	 * @return streen name 
	 */
	public String getStreet() {
		return street;
	}
	/*
	 * sets street name
	 * @param street name
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/*
	 * gets driver's location
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	/*
	 * sets driver's location
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/*
	 *gets driver's city
	 *@return city
	 */
	public String getCity() {
		return city;
	}
	/*
	 * sets driver's city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/*
	 * gets pincode
	 * @return pincode
	 */
	public int getPincode() {
		return pincode;
	}
	/*
	 * sets pincode
	 * @param pincode
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/*
	 * gets driver's mobile number
	 * @returns mobile number
	 */
	public int getMobile_no() {
		return mobile_no;
	}
	/*
	 * sets driver's mobile number
	 * @param mobile number
	 */
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	/*
	 * gets driver's licence number
	 * @return licence number
	 */
	public String getLicense_no() {
		return license_no;
	}
	/*
	 * sets driver's licence number
	 * @param license number
	 */
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	/*
	 * Overring the toStrinhg method
	 */
	@Override
	public String toString() {
		return "Driver_info [id=" + id + ", name=" + name + ", street=" + street + ", location=" + location + ", city="
				+ city + ", pincode=" + pincode + ", mobile_no=" + mobile_no + ", license_no=" + license_no + "]";
	}
	
	
	
	
	
}
