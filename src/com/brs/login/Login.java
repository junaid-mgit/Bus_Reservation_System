package com.brs.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;

import com.brs.shared.auth_user;

public class Login implements ActionListener{

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
		
		try {
			boolean isLogin = db.LoginUser(user);
			
			if(isLogin) 
			{
				if(db.IsAdmin())
					JOptionPane.showMessageDialog(f1, 
							"Congratulations! Admin Loggedin Successfully");
				else
					JOptionPane.showMessageDialog(f1, 
							"Congratulations! User Loggedin Successfully");
			}
			else {
				JOptionPane.showMessageDialog(f1, 
						"User Not Found!");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
}


