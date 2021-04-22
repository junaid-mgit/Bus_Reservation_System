package com.brs.Register;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.brs.dbConnect.DBConnect;
import com.brs.shared.auth_user;

public class AddAdmin implements ActionListener {
	
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

	public AddAdmin()
	{
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
