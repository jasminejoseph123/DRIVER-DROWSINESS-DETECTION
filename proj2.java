package proj1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class proj2 {

	JFrame frame;
	protected Object loginframe;
	private JPasswordField passwordField;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proj2 window = new proj2();
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
	public proj2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1422, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1370, 749);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel errorup = new JLabel("");
		errorup.setForeground(Color.RED);
		errorup.setBounds(862, 396, 211, 14);
		panel_1.add(errorup);
		
		JLabel lblLoginHere = new JLabel("LOGIN HERE");
		lblLoginHere.setForeground(Color.WHITE);
		lblLoginHere.setFont(new Font("Calibri", Font.BOLD, 30));
		lblLoginHere.setBounds(928, 181, 173, 47);
		panel_1.add(lblLoginHere);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Calibri", Font.BOLD, 14));
		lblUsername.setBounds(858, 237, 145, 32);
		panel_1.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(858, 270, 215, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPassword.setBounds(858, 313, 93, 14);
		panel_1.add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(858, 338, 215, 32);
		panel_1.add(passwordField_1);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un=textField.getText();
				String psw=passwordField_1.getText();
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
					
					ResultSet rs = null;
					
					PreparedStatement ps = con.prepareStatement("select * from admin where username='"+un+"' and password='"+psw+"'");
				    rs = ps.executeQuery();
				    
				    if(rs.next()) {
				       admin window = new admin();
				       window.frame.setVisible(true);
				       proj2.this.frame.setVisible(false);
				    }
				    
				    else {
				    	try {
				    		Class.forName("com.mysql.jdbc.Driver");
				    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
				    		
				    		ResultSet rss = null;
				    	
				    		PreparedStatement pss = conn.prepareStatement("select * from owner_details where user='"+un+"' and passw='"+psw+"'");
				    		 rss = pss.executeQuery();
				    		 
				    		 if(rss.next()) {
							       owner window = new owner();
							       window.frame.setVisible(true);
							       proj2.this.frame.setVisible(false);
							    }
							    
				    		 /*else {
				    			 JOptionPane.showMessageDialog(null, "enter the valid username and password");
				    		 }*/
							
				    		 if(un!="+un+" || psw!="+psw+")
				    		 {
				    			 textField.setEditable(true); 
				    			 passwordField_1.setEditable(true); 
				    			 errorup.setText("*Invalid Username or Password");
				    			 
				    		 }
				    	}
				    	catch(Exception e1)
				    	{
				    		e1.printStackTrace();
				    	}
				    }
				}
				
				catch(Exception e1)
		    	{
		    		e1.printStackTrace();
		    	}  
				
				textField.setText("");
				passwordField_1.setText("");
				Refresh();
				
			}

			private void Refresh() {
				// TODO Auto-generated method stub
				
			}
				
			
		});
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 16));
		btnLogin.setBounds(910, 421, 108, 53);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\Capture6.JPG"));
		lblNewLabel_1.setBounds(878, 149, 48, 96);
		panel_1.add(lblNewLabel_1);
		
		JLabel image = new JLabel("image");
		image.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\background-front-page-cropped.jpg"));
		image.setBounds(0, 5, 1370, 738);
		panel_1.add(image);
		
		
		
		
	}
}
