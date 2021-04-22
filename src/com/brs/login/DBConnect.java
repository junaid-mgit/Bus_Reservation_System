package com.brs.dbConnect;

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

	public static void main(String[] args) {
		new Login();
	}
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
	
	public static class Login implements ActionListener{

		JFrame f1;
		JLabel l1,l2;
		JTextField user_name;
		JPasswordField password;
		JButton b1;
		JPanel p1;
		DBConnect db;
		Statement s;
		ResultSet res;
		
		ArrayList<auth_user> users;
		auth_user user;
		
		public Login() {
			
			db = new DBConnect();
			s = db.getStatement();
			
			f1=new JFrame("BRS Login");
			p1=new JPanel();
			
			l1=new JLabel("UserName");
			user_name= new JTextField(30);
			
			l2=new JLabel("Password");
			password= new JPasswordField(30);
			

			b1=new JButton("Login");
			b1.addActionListener(this);  // an object of class where actionPerformed is defined 
			
			p1.add(l1);
			p1.add(user_name);
			p1.add(l2);
			p1.add(password);

			p1.add(b1);
			
			f1.add(p1);
			f1.setSize(400,400);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			String username = user_name.getText();
			String psd = new String(password.getPassword());
			
			auth_user user = new auth_user(username,psd,true);
			
			String query = "SELECT id,password,last_login,is_superuser,username,first_name,last_name,email,is_staff,is_active,date_joined"
					+ " FROM auth_user where username='" +user.getUsername()+"' and password = '" + user.getPassword() +"' and is_active =" + user.isIs_active();
			
			users = new ArrayList<auth_user>();
			
			try {
				res= s.executeQuery(query);
				users = addUser(res);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			boolean isLogin = CheckUser(username,psd,users);
			System.out.println(isLogin);
		}
		
		
		
		public ArrayList<auth_user> addUser(ResultSet res)
		{
			try {
					while(res.next())
				 	{
						user=new auth_user(
								res.getInt("id"),
								res.getString("password"),
								res.getDate("last_login"),
								res.getBoolean("is_superuser"),
								res.getString("username"),
								res.getString("first_name"),
								res.getString("last_name"),
								res.getString("email"),
								res.getBoolean("is_staff"),
								res.getBoolean("is_active"),
								res.getDate("date_joined")
								);
						users.add(user);
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return users;
		}
		
		public boolean CheckUser(String username, String password, ArrayList<auth_user> users)
		{
			for( auth_user au : users)
			{
				if(au.getUsername().equals(username) && au.getPassword().equals(password)) 
				{
					JOptionPane.showMessageDialog(f1, 
							"Congratulations! You Loggedin Successfully");	
					return true;
				}
			}
			JOptionPane.showMessageDialog(f1, "User Not Found!");	
			return false;
		}
	}	
}