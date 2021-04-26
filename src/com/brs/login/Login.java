package com.brs.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;

import com.brs.AdminMainPage.AdminMainPage;
import com.brs.Register.Register;
import com.brs.mainPage.HomePage;
import com.brs.shared.auth_user;


/*
 * The Login class is used to add and validate login credentials
 */
public class Login implements ActionListener{


	public JFrame f1;
	JLabel l1, l2;
	JTextField user_name;
	JPasswordField password;
	JButton b1,b2;
	JPanel p1;
	DBConnect db;
	Statement s;
	ResultSet res;

	ArrayList<auth_user> users;
	auth_user user;

	
/*
 * The Login method is used to add login details
 */
	
	public Login() {

		db = new DBConnect();

		f1 = new JFrame("BRS Login");
		p1 = new JPanel();

		l1 = new JLabel("UserName");
		user_name = new JTextField(30);

		l2 = new JLabel("Password");
		password = new JPasswordField(30);

		b1 = new JButton("Login");
		b1.addActionListener(this); // an object of class where actionPerformed is defined

		b2 = new JButton("Register");
		b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

		
		p1.add(l1);
		p1.add(user_name);
		p1.add(l2);
		p1.add(password);

		p1.add(b1);
		p1.add(b2);
		
		f1.add(p1);
		f1.setSize(400, 400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
		f1.dispose();
		new Register().setVisible(true);
    }//
	
	
/*
 * The actionPerformed method is used to validate login details
 */

	@Override
	public void actionPerformed(ActionEvent ae) {
		String username = user_name.getText();
		String psd = new String(password.getPassword());

		auth_user user = new auth_user(username, psd, true);

		try {
			boolean isLogin = db.LoginUser(user);

			if (isLogin) {
				if (db.IsAdmin()) {
					f1.dispose();
					new AdminMainPage();
				} else {
					f1.dispose();
					new HomePage();
				}
			} else {
				JOptionPane.showMessageDialog(f1, "User Not Found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Login().f1.setVisible(true);
	}
}