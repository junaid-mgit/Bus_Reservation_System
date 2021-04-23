package com.brs.AddBus;

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
		new AddBus();
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
	
	public boolean add(busrv_businfo bus) {
	String query = "insert into busrv_businfo values(0,'" 
                + bus.getBus_name()+"','"+ bus.getSlug()+"','" + bus.getType()+"','" 
                +bus.getArriving_time()+"','" + bus.getDepature_time()+"','"+bus.getFare()+"','"+bus.getNo_of_seats()+"','"
                + "',true,current_date(),current_date()," + bus.getArriving_from_id() +"," + bus.getDepature_at_id()+ ")";

	    System.out.println(query);
		buses = new ArrayList<busrv_businfo>();
                int num=0;
		try {
		 num=stat.executeUpdate(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
                }
                return false;
	}
	

	
	
	
}