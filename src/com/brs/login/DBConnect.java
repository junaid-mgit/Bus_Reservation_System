package com.brs.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import com.brs.shared.auth_user;

public class DBConnect {
	Connection con;
	ResultSet res;
	Statement stat;
	ArrayList<auth_user> users;
	auth_user user;

	public static void main(String[] args) {
		new Login();
	}
	public DBConnect() {
		
		try 
		{
			 con=DriverManager.getConnection("jdbc:mysql://dev.thekrishna.in:3306/Bus_Reservation_System", "root", "0000");
			 stat=con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean LoginUser(auth_user user) {
		String query = "SELECT id,password,last_login,is_superuser,username,first_name,last_name,email,is_staff,is_active,date_joined"
				+ " FROM auth_user where username='" + user.getUsername() + "' and password = '" + user.getPassword()
				+ "' and is_active =" + user.isIs_active();

		users = new ArrayList<auth_user>();

		
		try {
			res = stat.executeQuery(query);
			while (res.next()) {
				user = new auth_user(res.getInt("id"), res.getString("password"), res.getDate("last_login"),
						res.getBoolean("is_superuser"), res.getString("username"), res.getString("first_name"),
						res.getString("last_name"), res.getString("email"), res.getBoolean("is_staff"),
						res.getBoolean("is_active"), res.getDate("date_joined"));
				users.add(user);
			}
			System.out.println(users);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return CheckUser(user.getUsername(),user.getPassword());
	}
	
	public boolean CheckUser(String username, String password)
	{
		for( auth_user au : users)
		{
			if(au.getUsername().equals(username) && au.getPassword().equals(password)) 
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean IsAdmin()
	{
		for( auth_user au : users)
		{
			if(au.isIs_superuser()) 
			{
				return true;
			}
		}
		return false;
	}
	
}