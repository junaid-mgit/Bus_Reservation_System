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
			// result set for buses table
			 res=stat.executeQuery("select id,bus_name,fare from busrv_businfo");
//			 res=stat.executeQuery("select employee_id,first_name,last_name,salary,department_id,manager_id from employees");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet getResultSet() {
		return this.res;
	}
	public int getResultSetSize() {
		int size = 0;
		try {
			if(res.next()) {
				
					size++;
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return size;
	}
	public Statement getStatement() {
		return stat;
	}
}
