package com.brs.AdminMainPage;

import com.brs.AddBus.AddBus;
import com.brs.DeleteBus.DeleteBus;
import com.brs.Register.Register;
import com.brs.mainPage.HomePage;
import com.brs.mainPage.SearchBuses;
import com.brs.shared.auth_user;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;



public class AdminMainPage {

	JTabbedPane tabbedPane;
	JFrame f;
	JPanel panel1, panel2, panel3, panel4, panel5;;
	auth_user user;
	public AdminMainPage() {
		Component();
	}
	
	public AdminMainPage(auth_user user) {
		this.user = user;
		Component();
	}
	
	public void Component()
	{
		f = new JFrame("Admin Home Page");

		Image icon = Toolkit.getDefaultToolkit().getImage("src/Images/redbus.png");  
		f.setIconImage(icon); 
		
		tabbedPane = new JTabbedPane();

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		panel1.add(new SearchBuses().getContentPane());
		panel2.add(new Register(true).getContentPane());
                panel3.add(new AddBus().getContentPane());
                panel4.add(new DeleteBus().f1.getContentPane());
		

		tabbedPane.addTab("Home", panel1);
		tabbedPane.addTab("Add Admin ", panel2);
		tabbedPane.addTab("Add Bus", panel3);
        tabbedPane.addTab("Delete Bus",panel4);

		f.add(tabbedPane);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(550, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new AdminMainPage();
	}

}
