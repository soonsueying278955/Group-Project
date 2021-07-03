package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EmployeeManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldPhoneNum;
	private JTextField textFieldEmail;
	private JTextField textFieldMonthlySalary;
	private JTextField textFieldYearlySalary;
	private JTable table;
	private final ButtonGroup gender = new ButtonGroup();
	static double TotalSalary;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement frame = new EmployeeManagement();
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
	public EmployeeManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1342, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1326, 739);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(10, 10, 1308, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setFont(new Font("Pristina", Font.BOLD, 70));
		lblEmployeeManagement.setBounds(349, 0, 635, 113);
		panel_1.add(lblEmployeeManagement);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 133, 1308, 596);
		panel.add(panel_2);
		panel_2.setLayout(null);
		

		JLabel lbLabel = new JLabel("");
		Image f = new ImageIcon(this.getClass().getResource("picture.jpg")).getImage();
		lbLabel.setIcon(new ImageIcon(f));
		lbLabel.setBounds(85, 10, 191, 245);
		panel_2.add(lbLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblName.setBounds(350, 30, 142, 30);
		panel_2.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldName.setBounds(503, 30, 203, 30);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblAge.setBounds(350, 77, 142, 30);
		panel_2.add(lblAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(503, 77, 203, 30);
		panel_2.add(textFieldAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGender.setBounds(350, 126, 142, 30);
		panel_2.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		gender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 25));
		rdbtnMale.setBounds(503, 126, 142, 30);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		gender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 25));
		rdbtnFemale.setBounds(503, 162, 142, 30);
		panel_2.add(rdbtnFemale);
		
		JLabel lblJobPosition = new JLabel("Job Position");
		lblJobPosition.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblJobPosition.setBounds(350, 213, 142, 30);
		panel_2.add(lblJobPosition);
		
		JComboBox comboBoxJobposition = new JComboBox();
		comboBoxJobposition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxJobposition.getSelectedItem().equals("Tourism Trainer")) {
					textFieldMonthlySalary.setText("5500");
					
					double p = Double.parseDouble(textFieldMonthlySalary.getText());
					double yearlysalary = p * 12;
					
					textFieldYearlySalary.setText(String.format("%.2f", yearlysalary));
				}
				else if(comboBoxJobposition.getSelectedItem().equals("Visitor Information Counsellor")) {
					textFieldMonthlySalary.setText("3000");
					
					double p = Double.parseDouble(textFieldMonthlySalary.getText());
					double yearlysalary = p * 12;
					
					textFieldYearlySalary.setText(String.format("%.2f", yearlysalary));
				}
				else if(comboBoxJobposition.getSelectedItem().equals("Manager")) {
					textFieldMonthlySalary.setText("7000");
					
					double p = Double.parseDouble(textFieldMonthlySalary.getText());
					double yearlysalary = p * 12;
					
					textFieldYearlySalary.setText(String.format("%.2f", yearlysalary));
				}
			}
		});
		comboBoxJobposition.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Tourism Trainer", "Visitor Information Counsellor", "Manager"}));
		comboBoxJobposition.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBoxJobposition.setBounds(503, 213, 203, 30);
		panel_2.add(comboBoxJobposition);
		
		JLabel lblPhoneNum = new JLabel("Phone Num");
		lblPhoneNum.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPhoneNum.setBounds(820, 30, 142, 30);
		panel_2.add(lblPhoneNum);
		
		textFieldPhoneNum = new JTextField();
		textFieldPhoneNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldPhoneNum.setColumns(10);
		textFieldPhoneNum.setBounds(1013, 30, 203, 30);
		panel_2.add(textFieldPhoneNum);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEmail.setBounds(820, 77, 142, 30);
		panel_2.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(1013, 77, 203, 30);
		panel_2.add(textFieldEmail);
		
		JLabel lblSalary = new JLabel("Monthly Salary");
		lblSalary.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblSalary.setBounds(820, 126, 183, 30);
		panel_2.add(lblSalary);
		
		textFieldMonthlySalary = new JTextField();
		textFieldMonthlySalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMonthlySalary.setColumns(10);
		textFieldMonthlySalary.setBounds(1067, 126, 149, 30);
		panel_2.add(textFieldMonthlySalary);
		
		JLabel lblYearlySalary = new JLabel("Yearly Salary");
		lblYearlySalary.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblYearlySalary.setBounds(820, 175, 183, 30);
		panel_2.add(lblYearlySalary);
		
		textFieldYearlySalary = new JTextField();
		textFieldYearlySalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldYearlySalary.setColumns(10);
		textFieldYearlySalary.setBounds(1067, 175, 149, 30);
		panel_2.add(textFieldYearlySalary);
	
		JLabel lblRM = new JLabel("RM");
		lblRM.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRM.setBounds(1013, 126, 45, 30);
		panel_2.add(lblRM);
		
		JLabel lblRM_1 = new JLabel("RM");
		lblRM_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRM_1.setBounds(1013, 175, 45, 30);
		panel_2.add(lblRM_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_3.setBounds(236, 281, 593, 305);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 573, 285);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Job Position", "Phone Num", "Email", "Monthly salary", "Yearly Salary"
			}
		));
		scrollPane.setViewportView(table);
	
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAge.getText(),
						gender.getSelection().getActionCommand(),
						comboBoxJobposition.getSelectedItem(),
						textFieldPhoneNum.getText(),
						textFieldEmail.getText(),
						textFieldMonthlySalary.getText(),
						textFieldYearlySalary.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnAddRecord.setBounds(866, 291, 165, 30);
		panel_2.add(btnAddRecord);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				gender.clearSelection();
				comboBoxJobposition.setSelectedItem("Please select");
				textFieldPhoneNum.setText("");
				textFieldEmail.setText("");
				textFieldMonthlySalary.setText("");
				textFieldYearlySalary.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnReset.setBounds(866, 331, 165, 30);
		panel_2.add(btnReset);
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(textFieldAge.getText(), i, 1);
			    	model.setValueAt(gender.getSelection().getActionCommand(), i, 2);
			    	model.setValueAt(comboBoxJobposition.getSelectedItem(), i, 3);
			    	model.setValueAt(textFieldPhoneNum.getText(), i, 4);
			    	model.setValueAt(textFieldEmail.getText(), i, 5);
			    	model.setValueAt(textFieldMonthlySalary.getText(), i, 6);
			    	model.setValueAt(textFieldYearlySalary.getText(), i, 7);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnUpdate.setBounds(866, 371, 165, 30);
		panel_2.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Tourism Related Service\\Employee Management.txt");
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
						

						DefaultTableModel model = (DefaultTableModel) table.getModel();
						TotalSalary = 0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double salary = Double.parseDouble(model.getValueAt(i, 7).toString());
							TotalSalary = salary + TotalSalary;
						}
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnUpload.setBounds(866, 411, 165, 30);
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
		btnPrint.setBounds(866, 451, 165, 30);
		panel_2.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete.",
								"Employee Management", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row you want to delete.",
								"Employee Management", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnDelete.setBounds(866, 491, 165, 30);
		panel_2.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage home = new AdminHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
				}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(866, 531, 165, 30);
		panel_2.add(btnExit);
		
	}	
}

