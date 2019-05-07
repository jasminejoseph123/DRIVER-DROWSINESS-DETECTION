package proj1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;

import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class owner {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					owner window = new owner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public owner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1447, 770);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 99);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 110, 1370, 623);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "name_1302241853745023");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Alive tomorrow.");
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(741, 476, 346, 41);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Alert today –");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(776, 355, 274, 41);
		panel_2.add(lblNewLabel_2);
		
		JLabel label = new JLabel("Drive Safe and Drive");
		label.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
		label.setForeground(Color.WHITE);
		label.setBounds(531, 209, 694, 83);
		panel_2.add(label);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 0, 1370, 623);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\d1.png"));
		panel_2.add(lblNewLabel_5);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_1300223076522311");
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane_3.setForeground(Color.WHITE);
		scrollPane_3.setBackground(Color.DARK_GRAY);
		scrollPane_3.setBounds(0,0,1370,780);
		
		panel_3.add(scrollPane_3);
		
		DefaultTableModel table_3 = new DefaultTableModel (0,0);
		
		table_3.addColumn("ID");
		table_3.addColumn("NAME");
		table_3.addColumn("GENDER");
		table_3.addColumn("DOB");
		table_3.addColumn("ADDRESS");
		table_3.addColumn("PHONE NUMBER");
		table_3.addColumn("LICENSE NUMBER");
		table_3.addColumn("USERNAME");
		table_3.addColumn("PASSWORD");
		
		JTable table_2 = new JTable();
		table_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		table_2.setBorder(new LineBorder(Color.LIGHT_GRAY,2));
		table_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		table_2.setBackground(Color.PINK);
		table_2.setForeground(Color.WHITE);
		table_2.setRowHeight(50);
		
        scrollPane_3.setColumnHeaderView(table_2);
		
        table_2.setModel(table_3);
		scrollPane_3.setViewportView(table_2);
		
		/*String unam=textField.getText();
		String pas=passwordField_1.getText();*/
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			 
             PreparedStatement ps = conn.prepareStatement("select * from owner_details");
			 
			 ResultSet rs = (ResultSet) ps.executeQuery();
			 int i = 0;
			 
			 while(rs.next()) {
				 String id= rs.getString("id");
				 String name= rs.getString("own_name");
				 String gender= rs.getString("own_gend");
				 String dob= rs.getString("own_dob");
				 String address= rs.getString("own_add");
				 String phone= rs.getString("own_phn");
				 String license=rs.getString("own_lice");
				 String uname=rs.getString("user");
				 String pass=rs.getString("passw");

					

					
				
				 table_3.addRow(new Object[] {id, name, gender, dob, address, phone, license, uname, pass});
				 
				 i++;
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "name_1307813086102764");
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane_2.setForeground(Color.WHITE);
		scrollPane_2.setBackground(Color.DARK_GRAY);
		scrollPane_2.setBounds(0,0,1370,780);
		
          panel_4.add(scrollPane_2);
		
		DefaultTableModel tb2 = new DefaultTableModel (0,0);
		
		tb2.addColumn("ID");
		tb2.addColumn("VEHICLE NUMBER");
		tb2.addColumn("OWNER NAME");
		tb2.addColumn("TYPE OF VEHICLE");
		tb2.addColumn("MODEL");
		tb2.addColumn("COLOR");
		tb2.addColumn("YEAR OF MANUFACTURE");
		
		JTable table_4 = new JTable();
		table_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		table_4.setBorder(new LineBorder(Color.LIGHT_GRAY,2));
		table_4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		table_4.setBackground(Color.PINK);
		table_4.setForeground(Color.WHITE);
		table_4.setRowHeight(50);
		
        scrollPane_2.setColumnHeaderView(table_4);
		
		table_4.setModel(tb2);
		scrollPane_2.setViewportView(table_4);
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			 
			 
			 
			 PreparedStatement ps = conn1.prepareStatement("select * from vehicle");
			 
			 ResultSet rs = (ResultSet) ps.executeQuery();
			 int i = 0;
			 while(rs.next()) {
				 String id= rs.getString("id");
				 String vname= rs.getString("v_no");
				 String oname= rs.getString("own_name");
				 String type= rs.getString("type");
				 String mdl= rs.getString("model");
				 String clr= rs.getString("color");
				 String yr=rs.getString("year");
				 
				 tb2.addRow(new Object[] {id, vname, oname, type, mdl, clr, yr});
				 
				 i++;
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBounds(60, 31, 204, 62);
		panel.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_1.removeAll();
				panel_1.add(panel_2);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnHome.setBackground(Color.BLUE);
		btnHome.setForeground(Color.WHITE);
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\or.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1372, 20);
		panel.add(lblNewLabel_1);
		
		JButton btnUserDetails = new JButton("USER DETAILS");
		btnUserDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_1.removeAll();
				panel_1.add(panel_3);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnUserDetails.setBackground(Color.BLUE);
		btnUserDetails.setForeground(Color.WHITE);
		btnUserDetails.setBounds(327, 29, 190, 62);
		panel.add(btnUserDetails);	
		
		
		
		JButton btnVehicleDetails = new JButton("VEHICLE DETAILS");
		btnVehicleDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.removeAll();
				panel_1.add(panel_4);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		btnVehicleDetails.setForeground(Color.WHITE);
		btnVehicleDetails.setBackground(Color.BLUE);
		btnVehicleDetails.setBounds(600, 31, 197, 59);
		panel.add(btnVehicleDetails);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				proj2 window = new proj2();
				window.frame.setVisible(true);
				owner.this.frame.setVisible(false);
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.BLUE);
		btnLogout.setBounds(1125, 31, 190, 60);
		panel.add(btnLogout);
		
		JButton btnNotification = new JButton("MESSAGE");
		btnNotification.setBackground(Color.BLUE);
		btnNotification.setForeground(Color.WHITE);
		btnNotification.setBounds(863, 30, 197, 60);
		panel.add(btnNotification);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\1920x1080-white-solid-color-background.jpg"));
		lblNewLabel.setBounds(0, 0, 1372, 101);
		panel.add(lblNewLabel);
		
		

		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\119061.jpg"));
		lblNewLabel_3.setBounds(0, 97, 1370, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
