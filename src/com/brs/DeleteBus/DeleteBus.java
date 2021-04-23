package com.brs.DeleteBus;

import com.brs.mainPage.HomePage;
import com.brs.shared.busrv_businfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DeleteBus extends JFrame implements ActionListener {

    public JFrame f1;
    JLabel l1, l2;
    JTextField busId;
    JTextField busName;
    JButton b1;
    JPanel p1;
    DBConnect db;
    Statement s;
    ResultSet res;

    ArrayList<busrv_businfo> buses;
    busrv_businfo bus;

    public DeleteBus() {

        db = new DBConnect();

        f1 = new JFrame("Delete Bus");
        p1 = new JPanel();

        l1 = new JLabel("Bus Id");
        busId = new JTextField(30);

        l2 = new JLabel("Bus Name");
        busName = new JTextField(30);

        b1 = new JButton("Delete Bus");
        b1.addActionListener(this); // an object of class where actionPerformed is defined

        p1.add(l1);
        p1.add(busId);
        p1.add(l2);
        p1.add(busName);

        p1.add(b1);

        f1.add(p1);
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int id = Integer.parseInt(busId.getText());
        String name = busName.getText();

        busrv_businfo bus = new busrv_businfo(id, name, true);

        try {
            boolean isBus = db.delete(bus);
            if (isBus) {
                busId.setText("");
                busName.setText("");
                JOptionPane.showMessageDialog(f1, "Bus deleted successfully");
            } else {
                JOptionPane.showMessageDialog(f1, "Bus Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DeleteBus().f1.setVisible(true);
    }
}
