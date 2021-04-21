package com.brs.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	Connection con;
	ResultSet res;
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
	
}
