package TourismRelatedService;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;
import junit.textui.TestRunner;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JTable table;
	private final ButtonGroup gender = new ButtonGroup();
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JPasswordField retypepasswordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 981, 744);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(10, 10, 961, 87);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRegisterForm = new JLabel("Register Form");
		lblRegisterForm.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblRegisterForm.setBounds(303, 10, 314, 67);
		panel_1.add(lblRegisterForm);
		
		JLabel Label1 = new JLabel("");
		Image icon = new ImageIcon(this.getClass().getResource("register icon.png")).getImage();
		Label1.setIcon(new ImageIcon(icon));
		Label1.setBounds(627, 10, 64, 67);
		panel_1.add(Label1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 250, 210));
		panel_2.setBounds(10, 107, 961, 627);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblName.setBounds(43, 24, 142, 30);
		panel_2.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldName.setBounds(244, 24, 266, 30);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGender.setBounds(43, 64, 142, 30);
		panel_2.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		gender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnMale.setBounds(244, 64, 119, 30);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		gender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnFemale.setBounds(391, 64, 119, 30);
		panel_2.add(rdbtnFemale);
		
		JLabel lblBirthDate = new JLabel("Birth Date");
		lblBirthDate.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBirthDate.setBounds(43, 107, 142, 30);
		panel_2.add(lblBirthDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(244, 107, 266, 30);
		panel_2.add(dateChooser);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEmail.setBounds(43, 147, 142, 30);
		panel_2.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(244, 150, 266, 30);
		panel_2.add(textFieldEmail);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblUsername.setBounds(43, 187, 142, 30);
		panel_2.add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(244, 187, 266, 30);
		panel_2.add(textFieldUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPassword.setBounds(43, 227, 142, 32);
		panel_2.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(244, 227, 266, 32);
		panel_2.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxShowPassword.setBounds(522, 227, 156, 32);
		panel_2.add(chckbxShowPassword);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRetypePassword.setBounds(43, 269, 191, 33);
		panel_2.add(lblRetypePassword);
		
		retypepasswordField = new JPasswordField();
		retypepasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		retypepasswordField.setBounds(244, 269, 266, 32);
		panel_2.add(retypepasswordField);
		
		JCheckBox chckbxShowPassword1 = new JCheckBox("Show Password");
		chckbxShowPassword1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword1.isSelected()) {
					retypepasswordField.setEchoChar((char)0);
				}
				else {
					retypepasswordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxShowPassword1.setBounds(522, 269, 156, 33);
		panel_2.add(chckbxShowPassword1);
		
		JLabel lbLabelFrame = new JLabel("");
		Image f = new ImageIcon(this.getClass().getResource("picture.jpg")).getImage();
		lbLabelFrame.setIcon(new ImageIcon(f));
		lbLabelFrame.setBounds(742, 24, 191, 230);
		panel_2.add(lbLabelFrame);
		
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						gender.getSelection().getActionCommand(),
						textFieldUsername.getText(),
						passwordField.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Register Form",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setBackground(new Color(255, 250, 205));
		btnAddRecord.setBounds(736, 302, 170, 35);
		panel_2.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 23));
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				gender.clearSelection();
				dateChooser.setToolTipText("");
				textFieldEmail.setText("");
				textFieldUsername.setText("");
				passwordField.setText("");
				retypepasswordField.setText("");
			}
		});
		btnReset.setBackground(new Color(255, 250, 205));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnReset.setBounds(736, 347, 170, 35);
		panel_2.add(btnReset);
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(gender.getSelection().getActionCommand(), i, 1);
			    	model.setValueAt(textFieldUsername.getText(), i, 2);
			    	model.setValueAt(passwordField.getText(), i, 3);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnUpdate.setBackground(new Color(255, 250, 205));
		btnUpdate.setBounds(736, 392, 170, 35);
		panel_2.add(btnUpdate);
		
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Tourism Related Service\\Register Form.txt");
					if(!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnUpload.setBackground(new Color(255, 250, 205));
		btnUpload.setBounds(736, 437, 170, 35);
		panel_2.add(btnUpload);
		
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} 
				catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnPrint.setBackground(new Color(255, 250, 205));
		btnPrint.setBounds(736, 482, 170, 35);
		panel_2.add(btnPrint);
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete.",
								"Register Form", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row you want to delete.",
								"Register Form", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBackground(new Color(255, 250, 205));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnDelete.setBounds(736, 527, 170, 35);
		panel_2.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
	            dispose();
			}
		});
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(736, 572, 170, 35);
		panel_2.add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(83, 347, 619, 240);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 599, 221);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "Username", "Password"
			}
		));
		scrollPane.setViewportView(table);
	}
}
