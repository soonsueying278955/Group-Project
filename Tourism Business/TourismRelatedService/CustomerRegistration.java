package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldAge;
	private JTextField textFieldPhoneNum;
	private JTextField textFieldEmail;
	private JTextField textFieldCity;
	private JTextField textFieldState;
	private JTable table;
	private final ButtonGroup gender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 789);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1143, 752);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(10, 10, 1124, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCustomerRegistration = new JLabel("Customer Registration Form");
		lblCustomerRegistration.setFont(new Font("Pristina", Font.BOLD, 65));
		lblCustomerRegistration.setBounds(234, 0, 699, 90);
		panel_1.add(lblCustomerRegistration);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 248, 220));
		panel_2.setBounds(10, 110, 1124, 632);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblFirstName.setBounds(40, 36, 139, 30);
		panel_2.add(lblFirstName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldFirstName.setBounds(180, 36, 227, 30);
		panel_2.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblLastName.setBounds(438, 36, 139, 30);
		panel_2.add(lblLastName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(577, 36, 227, 30);
		panel_2.add(textFieldLastName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAge.setBounds(40, 76, 139, 30);
		panel_2.add(lblAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(180, 76, 227, 30);
		panel_2.add(textFieldAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGender.setBounds(438, 76, 139, 30);
		panel_2.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		gender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnMale.setBounds(577, 76, 115, 30);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		gender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnFemale.setBounds(577, 112, 115, 30);
		panel_2.add(rdbtnFemale);
		
		JLabel lblPhoneNum = new JLabel("No. H/P");
		lblPhoneNum.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPhoneNum.setBounds(40, 116, 139, 30);
		panel_2.add(lblPhoneNum);
		
		textFieldPhoneNum = new JTextField();
		textFieldPhoneNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPhoneNum.setColumns(10);
		textFieldPhoneNum.setBounds(180, 116, 227, 30);
		panel_2.add(textFieldPhoneNum);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEmail.setBounds(40, 156, 139, 30);
		panel_2.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(180, 156, 227, 30);
		panel_2.add(textFieldEmail);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblCity.setBounds(40, 196, 139, 30);
		panel_2.add(lblCity);
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCity.setColumns(10);
		textFieldCity.setBounds(180, 196, 227, 30);
		panel_2.add(textFieldCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblState.setBounds(40, 236, 139, 30);
		panel_2.add(lblState);
		
		textFieldState = new JTextField();
		textFieldState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldState.setColumns(10);
		textFieldState.setBounds(180, 236, 227, 30);
		panel_2.add(textFieldState);
		
		JLabel lbLabel = new JLabel("");
		Image f = new ImageIcon(this.getClass().getResource("picture.jpg")).getImage();
		lbLabel.setIcon(new ImageIcon(f));
		lbLabel.setBounds(867, 36, 191, 235);
		panel_2.add(lbLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 235, 215));
		panel_3.setBounds(120, 288, 620, 316);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 600, 296);
		panel_3.add(scrollPane);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldFirstName.getText(),
						textFieldLastName.getText(),
						textFieldAge.getText(),
						gender.getSelection().getActionCommand(),
						textFieldPhoneNum.getText(),
						textFieldEmail.getText(),
						textFieldCity.getText(),
						textFieldState.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Customer Registration Form",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setBackground(new Color(255, 250, 205));
		btnAddRecord.setBounds(765, 293, 170, 35);
		panel_2.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 23));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldFirstName.setText("");
				textFieldLastName.setText("");
				textFieldAge.setText("");
				gender.clearSelection();
				textFieldPhoneNum.setText("");
				textFieldEmail.setText("");
				textFieldCity.setText("");
				textFieldState.setText("");
			}
		});
		btnReset.setBackground(new Color(255, 250, 205));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnReset.setBounds(765, 338, 170, 35);
		panel_2.add(btnReset);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldFirstName.getText(), i, 0);
			    	model.setValueAt(textFieldLastName.getText(), i, 1);
			    	model.setValueAt(textFieldAge.getText(), i, 2);
			    	model.setValueAt(gender.getSelection().getActionCommand(), i, 3);
			    	model.setValueAt(textFieldPhoneNum.getText(), i, 4);
			    	model.setValueAt(textFieldEmail.getText(), i, 5);
			    	model.setValueAt(textFieldCity.getText(), i, 6);
			    	model.setValueAt(textFieldState.getText(), i, 7);
			    	
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
		btnUpdate.setBounds(765, 383, 170, 35);
		panel_2.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Tourism Related Service\\Customer Registration Form.txt");
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
		btnUpload.setBounds(765, 428, 170, 35);
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
		btnPrint.setBounds(765, 473, 170, 35);
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
		btnDelete.setBounds(765, 518, 170, 35);
		panel_2.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage home = new UserHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(765, 563, 170, 35);
		panel_2.add(btnExit);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Age", "Gender", "No. H/P", "Email", "City", "State"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
