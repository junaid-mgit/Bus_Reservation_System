package com.busReservationMiniProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

// SearchBuses class to search buses based on user inputs
public class SearchBuses extends JFrame implements ItemListener,ActionListener{
	DBConnect db = new DBConnect();
	// declaring swing components
	JDatePicker datePicker;
	JPanel searchPanel;
	JLabel fromArea,toArea,fromStop,toStop,travelDate;
	JComboBox fromAreaList,toAreaList,fromStopList,toStopList;
	JButton searchButton;
	
	String areasList[] ;
	Map<String,List<String>> fromAreaPairs,toAreaPairs;
	List<String> stops;
	
	// class constructor
	public SearchBuses() {
		// defining components
		fromAreaPairs = new HashMap<String,List<String>>();
		areasList = populateAreas();
		searchPanel = new JPanel();
		fromArea = new JLabel("Source");
		toArea = new JLabel("Destination");
		fromStop = new JLabel("Source Stops");
		toStop = new JLabel("Destination Stops");
		searchButton = new JButton("Search Buses");
		searchButton.addActionListener(this);
		
		travelDate = new JLabel("Travel Date");
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		
		fromAreaList = new JComboBox(areasList);
		fromAreaList.addItemListener(this);
		toAreaList = new JComboBox(areasList);
		toAreaList.addItemListener(this);
		fromStopList = new JComboBox();
		fromStopList.addItemListener(this);
		toStopList = new JComboBox();
		toStopList.addItemListener(this);
		
		// adding components in the panel
		searchButton = new JButton("Search");
		searchPanel.add(fromArea);
		searchPanel.add(fromAreaList);
		searchPanel.add(toArea);
		searchPanel.add(toAreaList);
		searchPanel.add(fromStop);
		searchPanel.add(fromStopList);
		searchPanel.add(toStop);
		searchPanel.add(toStopList);
		searchPanel.add(travelDate);
		searchPanel.add(datePicker);
		searchPanel.add(searchButton);
		add(searchPanel);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	// method to areas list
	private String[] populateAreas() {
		ResultSet areasResultSet= db.getTravelAreas();
		String[] areasList2 = new String[100];
		try {
			int i=0;
			while(areasResultSet.next()) {
				areasList2[i] = areasResultSet.getString("area_name");
				i++;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return areasList2;
	}
	// overide item state change listener
	@Override
	public void itemStateChanged(ItemEvent e) {
		int i=1;
		if(e.getSource()==fromAreaList) {
			String name = (String)fromAreaList.getSelectedItem();
			fromStopList.removeAllItems();
			fromStopList.addItem(name.substring(0, 2) + ":Stop "+i++);
			fromStopList.addItem(name.substring(0, 2) + ":Stop "+i++);
//			stops.add(name.substring(0, 2) + ":Stop "+i++);
//			stops.add(name.substring(0, 2) + ":Stop "+i++);
//			fromAreaPairs.put(name, stops);
		} else if(e.getSource()==toAreaList) {
			String name = (String)toAreaList.getSelectedItem();
			toStopList.removeAllItems();
			toStopList.addItem(name.substring(0, 2) + ":Stop "+i++);
			toStopList.addItem(name.substring(0, 2) + ":Stop "+i++);
//			stops.add(name.substring(0, 2) + ":Stop "+i++);
//			stops.add(name.substring(0, 2) + ":Stop "+i++);
//			toAreaPairs.put(name, stops);
		} 
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
////	ResultSet busesAvailable = databaseConnection.getResultSet();
////	String busTableColumns[] = new String[] {
////			"Bus Id","Bus Name","Bus Fare"
////	};
////	
////	Object[][] busData = new Object[databaseConnection.getResultSetSize()][3];
////	int i = 0;
////	try {
////		
////		while(busesAvailable.next()) {
////			busData[i][0] = busesAvailable.getInt("id");
////			busData[i][1] = busesAvailable.getString("bus_name");
////			busData[i][2] = busesAvailable.getDouble("fare");
////			i++;
////		}
////	} catch (SQLException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	JTable busTable = new JTable(busData,busTableColumns);
////	availableBusesPanel.add(new JScrollPane(busTable));
		
	}
	
}

