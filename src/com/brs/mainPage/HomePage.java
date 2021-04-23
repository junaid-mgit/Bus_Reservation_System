package com.brs.mainPage;

import javax.swing.*;
import java.awt.*;

import com.brs.Register.Register;

public class HomePage {

	JTabbedPane tabbedPane;
	JFrame f;
	JPanel panel1, panel2, panel3, panel4, panel5;;

	public HomePage() {

		f = new JFrame("Home Page");
		
		Register r = new Register();
		
		tabbedPane = new JTabbedPane();

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();

		panel1.add(new SearchBuses().getContentPane());
		panel2.add(r.getContentPane());
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/Images/redbus.png");  
		f.setIconImage(icon);  

		tabbedPane.addTab("Main Page", UIManager.getIcon("OptionPane.informationIcon"),panel1);
		tabbedPane.addTab("Regsiter ", panel2);
		tabbedPane.addTab("Buses", panel3);

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
		new HomePage();

	}

}
