package com.brs.shared;

import java.util.Date;
/*
 * Class for user informations
 * contains methos to get and set user informations
 */
public class auth_user {
	private int id;
	private String password;
	private Date last_login;
	private boolean is_superuser;
	private String username;
	private String first_name;
	private String last_name;
	private String  email;
	private boolean is_staff;
	private boolean is_active;
	private Date date_joined;
	
	/*
	 * Parameterized constructor for initialization
	 * @param password
	 * @param user name
	 * @param user's first name
	 * @param user's last name
	 * @param user's email id
	 * @param date of joining
	 */
	public auth_user(String password, String username, String first_name, String last_name, String email,
			Date date_joined) {
		super();
		this.password = password;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.date_joined = date_joined;
	}
	/*
	 * Parameterized constructor for initialization
	 * @param password
	 * @param username
	 * @param active status
	 */
	public auth_user(String username,String password,boolean is_active) {
		super();
		this.password = password;
		this.username = username;
		this.is_active = is_active;
	}
	/*
	 * Parameterized constructor for initialization
	 * @param user id
	 * @param password
	 * @param date of last login
	 * @param superuser or not
	 * @param username
	 * @param user's first name
	 * @param user's last name
	 * @param user's email id
	 * @param staff or not
	 * @param active status
	 * @param date of joining
	 */
	public auth_user(int id, String password, Date last_login, boolean is_superuser, String username, String first_name,
			String last_name, String email, boolean is_staff, boolean is_active, Date date_joined) {
		super();
		this.id = id;
		this.password = password;
		this.last_login = last_login;
		this.is_superuser = is_superuser;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.is_staff = is_staff;
		this.is_active = is_active;
		this.date_joined = date_joined;
	}
	/*
	 * gets user id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/*
	 * sets user id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * gets password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/*
	 * sets password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * gets date of last login
	 * @return last login date
	 */
	public Date getLast_login() {
		return last_login;
	}
	/*
	 * sets date of last login
	 * @param date of last login
	 */
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	/*
	 * gets whether user is super user or not
	 * @returns super user or not
	 */
	public boolean isIs_superuser() {
		return is_superuser;
	}
	/*
	 * sets whether the user is super user or not
	 * @param boolean value as super user or not
	 */
	public void setIs_superuser(boolean is_superuser) {
		this.is_superuser = is_superuser;
	}
	/*
	 * gets user name
	 * @return user name
	 */
	public String getUsername() {
		return username;
	}
	/*
	 * sets user name
	 * @param user name
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/*
	 * gets user's first name
	 * @return first name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/*
	 * sets user's first name
	 * @param first name
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/*
	 * gets user's last name
	 * @return last name
	 */
	public String getLast_name() {
		return last_name;
	}
	/*
	 * sets user's last name
	 * @param last name
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/*
	 * gets user's email id
	 * @return email id
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * sets user's email id
	 * @param email id
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * gets whether the user is staff or not
	 * @return boolean value whether staff or not
	 */
	public boolean isIs_staff() {
		return is_staff;
	}
	/*
	 * sets whether the user is staff or not
	 * @param boolean value whether staff or not
	 */
	public void setIs_staff(boolean is_staff) {
		this.is_staff = is_staff;
	}
	/*
	 * gets active status
	 * @return boolean value for active status
	 */
	public boolean isIs_active() {
		return is_active;
	}
	/*
	 * sets active status
	 * @param boolean value for active status
	 */
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	/*
	 * gets date of joining
	 * @return date of joning
	 */
	public Date getDate_joined() {
		return date_joined;
	}
	/*
	 * sets date of joining
	 * @param date of joining
	 */
	public void setDate_joined(Date date_joined) {
		this.date_joined = date_joined;
	}
	/*
	 * Overriding toString method
	 */
	@Override
	public String toString() {
		return "auth_user [id=" + id + ", password=" + password + ", last_login=" + last_login + ", is_superuser="
				+ is_superuser + ", username=" + username + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", is_staff=" + is_staff + ", is_active=" + is_active + ", date_joined="
				+ date_joined + "]";
	}
	
	
}
