package com.brs.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.brs.shared.auth_user;
// Enter the data into database whenever new user registers
public class DBConnect {
	Connection con;
	int res;
	Statement stat;
// default constructor
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
	// returns statement object
	public Statement getStatement() {
		return stat;
	}
	//inserts the value into database
	public boolean RegisterUser(auth_user user)
	{
		String query = "insert into auth_user values(0,'" + user.getPassword()+ "',current_date(),false,'" + 
                        user.getUsername()+"','" + user.getFirst_name()+"','" + user.getLast_name()+"','" 
                        + user.getEmail()+"',false,true,current_date())";
		try {
			res=stat.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	// registers the admin
	public boolean RegisterAdmin(auth_user user)
	{
		String query = "insert into auth_user values(0,'" + user.getPassword()+
                        
                        "',current_date(),true,'" + user.getUsername()+"','" + user.getFirst_name()
                        +"','" + user.getLast_name()+"','" + user.getEmail()+"',true,true,current_date())";
		
		try {
			res=stat.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
