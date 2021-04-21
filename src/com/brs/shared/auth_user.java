package com.brs.shared;

import java.sql.Date;

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
	
	public auth_user(String username,String password,boolean is_active) {
		super();
		this.password = password;
		this.username = username;
		this.is_active = is_active;
	}
	
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public boolean isIs_superuser() {
		return is_superuser;
	}
	public void setIs_superuser(boolean is_superuser) {
		this.is_superuser = is_superuser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isIs_staff() {
		return is_staff;
	}
	public void setIs_staff(boolean is_staff) {
		this.is_staff = is_staff;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public Date getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(Date date_joined) {
		this.date_joined = date_joined;
	}

	@Override
	public String toString() {
		return "auth_user [id=" + id + ", password=" + password + ", last_login=" + last_login + ", is_superuser="
				+ is_superuser + ", username=" + username + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", is_staff=" + is_staff + ", is_active=" + is_active + ", date_joined="
				+ date_joined + "]";
	}
	
	
}
