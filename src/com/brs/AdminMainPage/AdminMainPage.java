package com.brs.AdminMainPage;

import com.brs.AddAdmin.AddAdmin;
import com.brs.AddBus.AddBus;
import com.brs.DeleteBus.DeleteBus;
import javax.swing.*;



public class AdminMainPage {

	JTabbedPane tabbedPane;
	JFrame f;
	JPanel panel1, panel2, panel3, panel4, panel5;;

	public AdminMainPage() {

		f = new JFrame("Admin Home Page");

		
		tabbedPane = new JTabbedPane();

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		panel1.add(new AdminHomePage().getContentPane());
		panel2.add(new AddAdmin().getContentPane());
                panel3.add(new AddBus().getContentPane());
                panel4.add(new DeleteBus().getContentPane());
		

		tabbedPane.addTab("Home", panel1);
		tabbedPane.addTab("Add Admin ", panel2);
		tabbedPane.addTab("Add Bus", panel3);
                tabbedPane.addTab("Delete Bus",panel4);

		f.add(tabbedPane);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(550, 350);
		f.setVisible(true);

//		p2 = new JPanel();
//		p3 = new JPanel();
//		tp = new JTabbedPane();
////		tp.setBounds(100, 100, 200, 200);
//		tp.addTab("main", p1);
//		tp.addTab("visit", p2);
//		tp.addTab("help", p3);
//		f.add(tp);
//		f.setSize(400, 400);
//		f.setLayout(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setVisible(true);
	}

	public static void main(String[] args) {
		new AdminMainPage();

	}

}
