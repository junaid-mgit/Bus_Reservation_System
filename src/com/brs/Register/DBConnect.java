package com.brs.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.brs.shared.auth_user;

public class DBConnect {
	Connection con;
	int res;
	Statement stat;

	public DBConnect() {
		
		try 
		{
			 con=DriverManager.getConnection("jdbc:mysql://dev.thekrishna.in:3306/Bus_Reservation_System", "root", "0000");
			 stat=con.createStatement();  
//			 res=stat.executeQuery("select employee_id,first_name,last_name,salary,department_id,manager_id from employees");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Statement getStatement() {
		return stat;
	}
	
	public boolean RegisterUser(auth_user user)
	{
		String query = "insert into auth_user values(0,'" + user.getPassword()+ "',current_date(),false,'" + user.getUsername()+"','" + user.getFirst_name()+"','" + user.getLast_name()+"','" + user.getEmail()+"',false,true,current_date())";
		try {
			res=stat.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
