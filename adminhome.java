package proj1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import com.mysql.jdbc.ResultSet;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class admin1 {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/*private JPasswordField passwordField;*/
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ButtonGroup G1;
		G1 = new ButtonGroup(); 
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1413, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-11, 69, 174, 675);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1370, 49);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(161, 68, 1209, 681);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, "name_612598371549080");
		panel_5.setLayout(null);
		
		JLabel label_16 = new JLabel("to change the world for good");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		label_16.setBounds(333, 497, 406, 39);
		panel_5.add(label_16);
		
		JLabel label_15 = new JLabel("Driving innovation");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		label_15.setBounds(333, 430, 359, 56);
		panel_5.add(label_15);
		
		JLabel label_14 = new JLabel("WELCOME");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Bookman Old Style", Font.BOLD, 70));
		label_14.setBounds(244, 213, 415, 85);
		panel_5.add(label_14);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\2017-12_CarHop_Website_1600x850_88944735-1600x850.jpg"));
		lblNewLabel_11.setBounds(0, 0, 1219, 696);
		panel_5.add(lblNewLabel_11);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, "name_577813858504149");
		panel_3.setLayout(null);
		
		
		
		JButton btnSubmit = new JButton("SUBMIT");
		
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(Color.GRAY);
		btnSubmit.setBounds(675, 549, 119, 47);
		panel_3.add(btnSubmit);
		
		
				
		JLabel errorad = new JLabel("");
		errorad.setForeground(Color.RED);
		errorad.setBounds(674, 316, 120, 14);
		panel_3.add(errorad);
		
		
		
		JLabel errorname = new JLabel("");
		errorname.setForeground(Color.RED);
		errorname.setBounds(674, 164, 190, 14);
		panel_3.add(errorname);
		
		JLabel errordob = new JLabel("");
		errordob.setForeground(Color.RED);
		errordob.setBounds(674, 262, 158, 14);
		panel_3.add(errordob);
		
		JLabel errorph = new JLabel("");
		errorph.setForeground(Color.RED);
		errorph.setBounds(674, 370, 135, 14);
		panel_3.add(errorph);
		
		JLabel errorli = new JLabel("");
		errorli.setForeground(Color.RED);
		errorli.setBounds(672, 427, 137, 14);
		panel_3.add(errorli);
		
		
		
		textField_10 = new JTextField();
		textField_10.setBounds(674, 500, 171, 25);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblOwnerRegistration = new JLabel("OWNER REGISTRATION");
		lblOwnerRegistration.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblOwnerRegistration.setForeground(Color.CYAN);
		lblOwnerRegistration.setBounds(466, 67, 289, 33);
		panel_3.add(lblOwnerRegistration);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Verdana", Font.BOLD, 12));
		lblName.setBounds(373, 133, 79, 21);
		panel_3.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(675, 128, 170, 25);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("GENDER");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(373, 188, 79, 14);
		panel_3.add(lblNewLabel);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Verdana", Font.BOLD, 12));
		lblDob.setBounds(373, 238, 46, 14);
		panel_3.add(lblDob);
		
		textField_2 = new JTextField();
		textField_2.setBounds(674, 230, 171, 25);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBounds(675, 185, 79, 23);
		panel_3.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBounds(756, 185, 89, 23);
		panel_3.add(rdbtnFemale);
		

		G1.add(rdbtnMale); 
        G1.add(rdbtnFemale); 
		
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAddress.setBounds(373, 287, 79, 14);
		panel_3.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
		lblPhoneNumber.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPhoneNumber.setBounds(373, 344, 109, 14);
		panel_3.add(lblPhoneNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(675, 272, 170, 41);
		panel_3.add(textArea);
		
        textField_1 = new JTextField();
        textField_1.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(java.awt.event.KeyEvent evt) {
        		String Phn=textField_1.getText();
        		int length=Phn.length();
        		char c=evt.getKeyChar();
        		if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        		{
        		
        		if(length<10)
        		{
        			textField_1.setEditable(true);
        			errorph.setText("*enter 10 digits:");
        		}
        		
        		
        		else
        		{
        			textField_1.setEditable(false);
        			errorph.setText("");
        		}
        		}
        		else
        		{
        			if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        			{
        				textField_1.setEditable(true);
        		}
        	
        		else {
        			textField_1.setEditable(false);
        		}
        		}
        		}
        		
        });
        textField_1.setBounds(675, 336, 170, 23);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLicenseNumber = new JLabel("LICENSE NUMBER");
		lblLicenseNumber.setFont(new Font("Verdana", Font.BOLD, 12));
		lblLicenseNumber.setBounds(373, 403, 129, 14);
		panel_3.add(lblLicenseNumber);
		
		textField_3 = new JTextField();
		textField_3.setBounds(674, 395, 171, 22);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(545, 136, 46, 14);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(545, 188, 46, 14);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(545, 238, 46, 14);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel(":");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(545, 287, 46, 14);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel(":");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(545, 344, 46, 14);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(545, 403, 46, 14);
		panel_3.add(label_5);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\1920x1080-white-solid-color-background.jpg"));
		lblNewLabel_9.setBounds(292, 58, 620, 59);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Verdana", Font.BOLD, 12));
		lblUsername.setBounds(373, 456, 109, 14);
		panel_3.add(lblUsername);
		
		JLabel lblNewLabel_13 = new JLabel(":");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setBounds(545, 456, 46, 14);
		panel_3.add(lblNewLabel_13);
		
		textField_9 = new JTextField();
		textField_9.setBounds(674, 448, 171, 22);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPassword.setBounds(373, 508, 109, 14);
		panel_3.add(lblPassword);
		
		JLabel label_13 = new JLabel(":");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(545, 508, 46, 14);
		panel_3.add(label_13);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\wallpapers-plain-colors-26.jpg"));
		lblNewLabel_1.setBounds(292, 114, 620, 527);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\bg7.jpg"));
		lblNewLabel_10.setBounds(0, 0, 1178, 701);
		panel_3.add(lblNewLabel_10);
		
		
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, "name_579286929612941");
		panel_4.setLayout(null);
		
		JLabel errornumb = new JLabel("");
		errornumb.setForeground(Color.RED);
		errornumb.setBounds(637, 180, 151, 14);
		panel_4.add(errornumb);
		
		JLabel erroroname = new JLabel("");
		erroroname.setForeground(Color.RED);
		erroroname.setBounds(637, 246, 169, 14);
		panel_4.add(erroroname);
		
		JLabel errormod = new JLabel("");
		errormod.setForeground(Color.RED);
		errormod.setBounds(637, 348, 151, 14);
		panel_4.add(errormod);
		
		
		JLabel lblVehicleRegistration = new JLabel("VEHICLE REGISTRATION");
		lblVehicleRegistration.setForeground(Color.CYAN);
		lblVehicleRegistration.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblVehicleRegistration.setBounds(455, 90, 288, 24);
		panel_4.add(lblVehicleRegistration);
		
		JLabel label_6 = new JLabel("VEHICLE NUMBER");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Verdana", Font.BOLD, 12));
		label_6.setBounds(315, 155, 151, 20);
		panel_4.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(637, 151, 175, 24);
		panel_4.add(textField_4);
		
		JLabel lblOwnerName = new JLabel("OWNER NAME");
		lblOwnerName.setForeground(Color.BLACK);
		lblOwnerName.setFont(new Font("Verdana", Font.BOLD, 12));
		lblOwnerName.setBounds(315, 207, 110, 24);
		panel_4.add(lblOwnerName);
		
		textField_5 = new JTextField();
		textField_5.setBounds(637, 205, 175, 24);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TYPE OF VEHICLE");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_2.setBounds(316, 268, 130, 19);
		panel_4.add(lblNewLabel_2);
		
		JRadioButton radioButton = new JRadioButton("Car");
		radioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		radioButton.setBounds(637, 265, 61, 24);
		panel_4.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Van");
		radioButton_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		radioButton_1.setBounds(710, 265, 55, 24);
		panel_4.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Bus");
		radioButton_2.setFont(new Font("Verdana", Font.PLAIN, 12));
		radioButton_2.setBounds(778, 266, 61, 23);
		panel_4.add(radioButton_2);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Verdana", Font.PLAIN, 12));
		rdbtnOther.setBounds(852, 265, 73, 24);
		panel_4.add(rdbtnOther);
		
		G1.add(radioButton); 
        G1.add(radioButton_1); 
        G1.add(radioButton_2);
        G1.add(rdbtnOther);
        
		
		
		JLabel lblModel = new JLabel("MODEL");
		lblModel.setForeground(Color.BLACK);
		lblModel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblModel.setBounds(316, 324, 73, 14);
		panel_4.add(lblModel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(637, 317, 175, 24);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblColor = new JLabel("COLOR");
		lblColor.setForeground(Color.BLACK);
		lblColor.setFont(new Font("Verdana", Font.BOLD, 12));
		lblColor.setBounds(315, 380, 74, 14);
		panel_4.add(lblColor);
		
		textField_7 = new JTextField();
		textField_7.setBounds(637, 373, 175, 24);
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblYearOfManufacture = new JLabel("YEAR OF MANUFACTURE");
		lblYearOfManufacture.setForeground(Color.BLACK);
		lblYearOfManufacture.setFont(new Font("Verdana", Font.BOLD, 12));
		lblYearOfManufacture.setBounds(315, 432, 169, 24);
		panel_4.add(lblYearOfManufacture);
		
		textField_8 = new JTextField();
		textField_8.setBounds(637, 430, 175, 24);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnSubmit_1 = new JButton("SUBMIT");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String vnum=textField_4.getText();
				String oname=textField_5.getText();
				String mod=textField_6.getText();
		        String clr=textField_7.getText();
		        String yr=textField_8.getText();
                String typ = " "; 
		        
                // If condition to check if jRadioButton2 is selected. 
                if (radioButton.isSelected()) { 
  
                   typ= "Car"; 
                } 
  
                else if (radioButton_1.isSelected()) { 
  
                    typ = "Van"; 
                } 
                else if (radioButton_2.isSelected()) { 
  
                    typ= "Bus"; 
                } 
		        
                else if (rdbtnOther.isSelected()) { 
                	  
                    typ= "Other"; 
                } 
                else {
                	typ="no selected";
                }
              if(textField_4.getText().isEmpty()||textField_5.getText().isEmpty()||textField_6.getText().isEmpty()||textField_7.getText().isEmpty()||textField_8.getText().isEmpty())
                {
            	  if(textField_4.getText().isEmpty()) {
              		errornumb.setText("*enter valid number");
              	}
            	  if(textField_5.getText().isEmpty()) {
                		erroroname.setText("*enter valid name");
                	}
            	  if(textField_6.getText().isEmpty()) {
              		errormod.setText("*enter model name");
              	}
        
        }
        else
        {
       
               
                try
                {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                 Statement st=con.createStatement();
                 int k=st.executeUpdate("insert into vehicle(v_no,own_name,type,model,color,year) values('"+vnum+"','"+oname+"','"+typ+"','"+mod+"','"+clr+"','"+yr+"')");
                
                 
                 JOptionPane.showMessageDialog(null,"REGISTRATION SUCCESSFUL");
                }
                catch(Exception e)
                {
                System.out.println(e);
                e.printStackTrace();
                }
        }
                textField_4.setText("");
                textField_5.setText("");
                textField_6.setText("");
                textField_7.setText("");
                textField_8.setText(""); 
                
                 G1.clearSelection();
                
                Refresh();
				
			}

			private void Refresh() {
				// TODO Auto-generated method stub
				
			}
		});
		btnSubmit_1.setForeground(Color.WHITE);
		btnSubmit_1.setBackground(Color.GRAY);
		btnSubmit_1.setBounds(637, 491, 122, 51);
		panel_4.add(btnSubmit_1);
		
		JLabel label_7 = new JLabel(":");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(545, 158, 46, 14);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel(":");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(545, 212, 46, 14);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel(":");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(545, 270, 46, 14);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel(":");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(545, 324, 46, 14);
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel(":");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(545, 389, 46, 14);
		panel_4.add(label_11);
		
		JLabel label_12 = new JLabel(":");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(545, 437, 46, 14);
		panel_4.add(label_12);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\wallpapers-plain-colors-26.jpg"));
		lblNewLabel_3.setBounds(254, 125, 689, 447);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\1920x1080-white-solid-color-background.jpg"));
		lblNewLabel_7.setBackground(Color.GREEN);
		lblNewLabel_7.setBounds(254, 72, 689, 56);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\o-TYPING-facebook.jpg"));
		lblNewLabel_8.setBounds(0, 0, 1209, 696);
		panel_4.add(lblNewLabel_8);
		
		
		
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, "name_585182201879387");
		panel_6.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1209, 681);
		scrollPane_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane_1.setForeground(Color.WHITE);
		scrollPane_1.setBackground(Color.DARK_GRAY);
		
		panel_6.add(scrollPane_1);
		
		
		
		
		
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, "name_616164740729907");
		panel_7.setLayout(null);
		
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane_2.setForeground(Color.WHITE);
		scrollPane_2.setBackground(Color.DARK_GRAY);
		scrollPane_2.setBounds(0,0,1209,780);
		
          panel_7.add(scrollPane_2);
          
          table = new JTable();
          table.setBounds(0, 0, 1, 1);
          panel_7.add(table);
		
		
		
		
	
		
		JButton btnNewButton = new JButton("ADD OWNER");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_2.removeAll();
				panel_2.add(panel_3);
				panel_2.repaint();
				panel_2.revalidate();
				
			}
		});
		
		JLabel lblNewLabel_14 = new JLabel("Dashboard");
		lblNewLabel_14.setFont(new Font("Bookman Old Style", Font.BOLD, 21));
		lblNewLabel_14.setForeground(Color.BLUE);
		lblNewLabel_14.setBounds(30, 139, 121, 38);
		panel.add(lblNewLabel_14);
		btnNewButton.setBounds(25, 211, 126, 70);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("ADD VEHICLE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_4);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		btnNewButton_2.setBounds(25, 394, 126, 70);
		panel.add(btnNewButton_2);
		
		JButton btnViewOwner = new JButton("VIEW OWNER");
		btnViewOwner.setForeground(Color.WHITE);
		btnViewOwner.setBackground(Color.BLUE);
		
		btnViewOwner.setBounds(25, 306, 126, 70);
		panel.add(btnViewOwner);
		
		JButton btnNewButton_1 = new JButton("VIEW VEHICLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_7);
				panel_2.repaint();
				panel_2.revalidate();
				
				
DefaultTableModel tb2 = new DefaultTableModel (0,0);
				
							tb2.addColumn("slno");
							tb2.addColumn("ID");
							tb2.addColumn("VEHICLE NUMBER");
							tb2.addColumn("OWNER NAME");
							tb2.addColumn("TYPE OF VEHICLE");
							tb2.addColumn("MODEL");
							tb2.addColumn("COLOR");
							tb2.addColumn("YEAR OF MANUFACTURE");
							tb2.addColumn("DELETE");
				
				
				
				Object rowtb[] = new Object[8];
				
				JTable table = new JTable();
				table.setFont(new Font("Times New Roman", Font.BOLD, 17));
				table.setBorder(new LineBorder(Color.LIGHT_GRAY,2));
				table.setAlignmentX(Component.RIGHT_ALIGNMENT);
				table.setBackground(Color.PINK);
				table.setForeground(Color.WHITE);
				table.setRowHeight(50);
				
				
				
				scrollPane_2.setColumnHeaderView(table);
				
				table.setModel(tb2);

				table.getColumn("DELETE").setCellRenderer(new ButtonRendererrej());
				table.getColumn("DELETE").setCellEditor(
			        new ButtonEditorrej(new JCheckBox()));
				scrollPane_2.setViewportView(table);
				
				
			   
				
				tb2.getDataVector().removeAllElements();
				tb2.fireTableDataChanged();
				
				
				
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
					 
					 
					 
					 PreparedStatement ps = conn1.prepareStatement("select * from vehicle where status='0'");
					 
					 ResultSet rs = (ResultSet) ps.executeQuery();
					 int i = 0;
					 while(rs.next()) {
						 String sl="1";
						 String id= rs.getString("id");
						 String vname= rs.getString("v_no");
						 String oname= rs.getString("own_name");
						 String type= rs.getString("type");
						 String mdl= rs.getString("model");
						 String clr= rs.getString("color");
						 String yr=rs.getString("year");
						 
						 
						 
						 /*tb2.addRow(new Object[] {id, vname, oname, type, mdl, clr, yr});*/
						 
						 rowtb[0]=id;
						 rowtb[1]=id;
						 rowtb[2]=vname;
						 rowtb[3]=oname;
						 rowtb[4]=type;
						 rowtb[5]=mdl;
						 rowtb[6]=clr;
						 rowtb[7]=yr;
						 	
						 rowtb[7]="Delete";
						 
						 tb2.addRow(rowtb);
							scrollPane_2.setViewportView(table);
						 
						 i++;
					 }
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				

				
			}
		});
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(25, 482, 126, 70);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\Capturead.JPG"));
		lblNewLabel_4.setBounds(52, 11, 76, 100);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\2277.jpg"));
		lblNewLabel_6.setBounds(10, 0, 164, 675);
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_4 = new JButton("HOME");
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_5);
				panel_2.repaint();
				panel_2.revalidate();

			}
		});
		

		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				proj2 window = new proj2();
				window.frame.setVisible(true);
				admin1.this.frame.setVisible(false);
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(1251, 11, 89, 27);
		panel_1.add(btnLogout);
		btnNewButton_4.setBounds(1139, 11, 102, 27);
		panel_1.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\119061.jpg"));
		lblNewLabel_5.setBounds(0, 0, 1383, 49);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Jasmine\\Pictures\\Saved Pictures\\2277.jpg"));
		lblNewLabel_12.setBounds(0, 49, 1370, 20);
		frame.getContentPane().add(lblNewLabel_12);

		
		btnViewOwner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.removeAll();
				panel_2.add(panel_6);
				panel_2.repaint();
				panel_2.revalidate();
				
				
				
				
				DefaultTableModel tb1 = new DefaultTableModel (0,0);
				
				tb1.addColumn("Sl No");
				tb1.addColumn("ID");
				tb1.addColumn("NAME");
				tb1.addColumn("GENDER");
				tb1.addColumn("DOB");
				tb1.addColumn("ADDRESS");
				tb1.addColumn("PHONE NUMBER");
				tb1.addColumn("LICENSE NUMBER");
				tb1.addColumn("USERNAME");
				tb1.addColumn("PASSWORD");
				tb1.addColumn("DELETE");
				
				
				
				Object rowtb1[] = new Object[11];
				
				JTable table_1 = new JTable();
				table_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
				table_1.setBorder(new LineBorder(Color.LIGHT_GRAY,2));
				table_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
				table_1.setBackground(Color.PINK);
				table_1.setForeground(Color.WHITE);
				table_1.setRowHeight(50);
				
				
				
				scrollPane_1.setColumnHeaderView(table_1);
				
				table_1.setModel(tb1);

				table_1.getColumn("DELETE").setCellRenderer(new ButtonRenderer());
				table_1.getColumn("DELETE").setCellEditor(
			        new ButtonEditor(new JCheckBox()));
				scrollPane_1.setViewportView(table_1);
				
				
			   
				
				tb1.getDataVector().removeAllElements();
				tb1.fireTableDataChanged();
				
				
				try
				{
					 Class.forName("com.mysql.jdbc.Driver");
					 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
					 
					 
					 
					 PreparedStatement ps = conn.prepareStatement("select * from owner_details where status='0'");
					 
					 ResultSet rs = (ResultSet) ps.executeQuery();
					 int i = 0;
					 
					 while(rs.next()) {
						 String slno="1";
						 String id= rs.getString("id");
						 String name= rs.getString("own_name");
						 String gender= rs.getString("own_gend");
						 String dob= rs.getString("own_dob");
						 String address= rs.getString("own_add");
						 String phone= rs.getString("own_phn");
						 String license=rs.getString("own_lice");
						 String uname=rs.getString("user");
						 String pass=rs.getString("passw");

							

							
						
						//tb1.addRow(new Object[] {"id",id, name, gender, dob, address, phone, license, uname, pass});
						 
						 	rowtb1[0]=slno;
						 	rowtb1[1]=id;
						 	rowtb1[2]=name;
						 	rowtb1[3]=gender;
						 	rowtb1[4]=dob;
						 	rowtb1[5]=address;
						 	rowtb1[6]=phone;
						 	rowtb1[7]=license;
						 	rowtb1[8]=uname;
						 	rowtb1[9]=pass;
						 	rowtb1[10]="Delete";
							
							
						
							
							tb1.addRow(rowtb1);
							scrollPane_1.setViewportView(table_1);
						 
						 i++;
					 }
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				
				
			}
		});
		
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String oname=textField.getText();
				String dob=textField_2.getText();
				String Addr=textArea.getText();
				String Phn=textField_1.getText();
		        String Lice=textField_3.getText();
		        String Usname=textField_9.getText();
		        String Passwd=textField_10.getText();
		        
                String qual = " "; 
		        
                // If condition to check if jRadioButton2 is selected. 
                if (rdbtnMale.isSelected()) { 
  
                    qual = "Male"; 
                } 
  
                else if (rdbtnFemale.isSelected()) { 
  
                    qual = "Female"; 
                } 
                else { 
  
                    qual = "NO Button selected"; 
                } 
                if(textField.getText().isEmpty()||textField_2.getText().isEmpty()||textArea.getText().isEmpty()||textField_1.getText().isEmpty()||textField_3.getText().isEmpty()||textField_9.getText().isEmpty()||textField_10.getText().isEmpty())
                   
                	{
                	if(textField.getText().isEmpty()) {
                		errorname.setText("*enter valid name");
                	}
                	if(textField.getText().isEmpty()) {
                		errordob.setText("*fill the field ");
                		
                	}
                	if(textArea.getText().isEmpty()) {
                		errorad.setText("*enter the address");
                	}
                	if(textField_1.getText().isEmpty()) {
                		errorph.setText("*enter the phone no:");
                	}
                	if(textField_3.getText().isEmpty()) {
                		errorli.setText("*enter the license no:");
                	}
                	}
                else
                {
                try
                {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                 Statement st=con.createStatement();
                 int j=st.executeUpdate("insert into owner_details(own_name,own_gend,own_dob,own_add,own_phn,own_lice,user,passw) values('"+oname+"','"+qual+"','"+dob+"','"+Addr+"','"+Phn+"','"+Lice+"','"+Usname+"','"+Passwd+"')");
                 
                 
                 JOptionPane.showMessageDialog(null,"REGISTRATION SUCCESSFUL");
                }
               
                catch(Exception e)
                {
                System.out.println(e);
                e.printStackTrace();
                }
                }
                textField.setText("");
                textField_2.setText("");
                textArea.setText("");
                textField_1.setText("");
                textField_3.setText("");
                textField_9.setText(""); 
                textField_10.setText("");
                 G1.clearSelection();
                
                Refresh();
				
			}

			private void Refresh() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
}




