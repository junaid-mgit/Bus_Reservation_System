package com.brs.DeleteBus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import com.brs.shared.busrv_businfo;

public class DBConnect {
	Connection con;
	ResultSet res;
	Statement stat;
	ArrayList<busrv_businfo> buses;
	busrv_businfo bus;

	public static void main(String[] args) {
		new DeleteBus();
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
	
	public boolean delete(busrv_businfo bus) {
		String query = "delete"
				+ " FROM busrv_businfo where id='" + bus.getId() + "' and bus_name = '" + bus.getBus_name()+"'";

		buses = new ArrayList<busrv_businfo>();
int num=0;
		System.out.print(query);
		try {
		 num=stat.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(num>0)
                    return true;
                else
                    return false;
		
	}
	
	public boolean CheckBus(int id, String name)
	{
		for( busrv_businfo b : buses)
		{
			if(b.getId()==id && b.getBus_name().equals(name)) 
			{
				return true;
			}
		}
		return false;
	}
	
	
	
}