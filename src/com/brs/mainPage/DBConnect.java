package com.busReservationMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	Connection con;
	ResultSet res;
	Statement stat;

	public DBConnect() {
		
		try 
		{
			 con=DriverManager.getConnection("jdbc:mysql://dev.thekrishna.in:3306/Bus_Reservation_System", "root", "0000");
			 stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			 
			 // result set for buses table
			 res=stat.executeQuery("select id,bus_name,fare from busrv_businfo");
		
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
			res.last();
			size = res.getRow();
			res.beforeFirst();
//			while(res.next()) {
//				
//					size++;
//				
//			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(size);
		
		return size;
	}
	public Statement getStatement() {
		return stat;
	}
	public ResultSet getTravelAreas() {
		String query = "SELECT area_name FROM Bus_Reservation_System.busrv_busdroparea;";
		try {
			res.beforeFirst();
			res = stat.executeQuery(query);
			res.beforeFirst();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
}