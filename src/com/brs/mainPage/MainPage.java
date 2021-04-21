package com.busReservationMiniProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainPage {

	public static void main(String[] args) {
		DBConnect databaseConnection = new DBConnect();
		JFrame mainFrame = new JFrame("Welcome To Red Bus");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500,800);
		// PANELS
		JPanel datePanel = new JPanel();
		JPanel searchPanel = new JPanel();
		JPanel availableBusesPanel = new JPanel();
		
		// DATE FIELDS
		DateFormat fromDateFormat = new SimpleDateFormat("dd MMM YYYY");
		DateFormat toDateFormat = new SimpleDateFormat("dd MMM YYYY");
		JFormattedTextField fromDate = new JFormattedTextField(fromDateFormat);
		JFormattedTextField toDate = new JFormattedTextField(toDateFormat);
		fromDate.setName("From_Date");
		toDate.setName("To_Date");
		fromDate.setColumns(10);
		toDate.setColumns(10);
		JLabel fromDateLabel = new JLabel("From Date:");
		JLabel toDateLabel = new JLabel("To Date:");
		datePanel.add(fromDateLabel);
		datePanel.add(fromDate);
		datePanel.add(toDateLabel);
		datePanel.add(toDate);
		
		// SEARCH FIELD
		JTextField findTextField = new JTextField(20);
//		JPanel mainPanel = new JPanel();
//		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.X_AXIS));
//		mainPanel.add(searchPanel);
//		mainPanel.add(datePanel);
		
		// mainPanel.setLayout(new BoxLayout());
		searchPanel.setLayout(new BoxLayout(searchPanel,BoxLayout.X_AXIS));
		searchPanel.setBorder(BorderFactory.createEmptyBorder(6,6,6,6));
		JLabel findLabel = new JLabel("Search");
		searchPanel.add(findLabel);
		searchPanel.add(Box.createRigidArea(new Dimension(6,0)));
		searchPanel.add(findTextField);
		searchPanel.add(Box.createRigidArea(new Dimension(6,0)));
		JButton findButton = new JButton("Search");
		findButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				String searchText = findTextField.getText().trim();
				if(!searchText.equals("")) {
					findTextField.setText(searchText);
				}
			}
		});
		searchPanel.add(findButton);
		// BUS TABLE FIELD
		ResultSet busesAvailable = databaseConnection.getResultSet();
		String busTableColumns[] = new String[] {
				"Bus Id","Bus Name","Bus Fare"
		};
		Object[][] busData = new Object[databaseConnection.getResultSetSize()][3];
		int i = 0;
		try {
			while(busesAvailable.next()) {
				busData[i][0] = busesAvailable.getInt("id");
				busData[i][1] = busesAvailable.getString("bus_name");
				busData[i][2] = busesAvailable.getDouble("fare");
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JTable busTable = new JTable(busData,busTableColumns);
		availableBusesPanel.add(new JScrollPane(busTable));
		// INTEGRATE
		
		//mainFrame.setLayout(new BoxLayout(mainPanel,BoxLayout.X_AXIS));
		//mainFrame.getContentPane().setLayout(new BoxLayout(mainFrame.getContentPane(),BoxLayout.X_AXIS));
		mainFrame.getContentPane().add(BorderLayout.NORTH,searchPanel);
		mainFrame.getContentPane().add(BorderLayout.WEST,datePanel);
		mainFrame.getContentPane().add(BorderLayout.CENTER,availableBusesPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

}
