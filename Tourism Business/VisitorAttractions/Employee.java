package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bGGender = new ButtonGroup();
	private JTextField txtPosition;
	private JTextField txtEmail;
	private JTextField txtPhoneNo;
	private JTextField txtIcNo;
	private JTextField txtCountry;
	private JTextField txtPostcode;
	private JTextField txtAdddress;
	private JTextField txtName;
	private JTextField textESalary;
	private JTable tableDetails;
	private JTextField txtTotalSalary;
	private JButton btnTSalary;
	private double sum;
	private String sumF;
	private JTable tableTP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Employee() {
		initComponent();
	}
	private void initComponent() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 588);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		
		//button "exit" back to menuVA
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
			        if (cmd.equals("Exit")) {
			            dispose();
			            new MenuVA().setVisible(true);
				}
			}
		});
		
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnExit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExit.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblPoscode = new JLabel("Postcode");
		lblPoscode.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JRadioButton rdbMale = new JRadioButton("Male");
		rdbMale.setBackground(Color.WHITE);
		bGGender.add(rdbMale);
		rdbMale.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JRadioButton rdbFemale = new JRadioButton("Female");
		rdbFemale.setBackground(Color.WHITE);
		bGGender.add(rdbFemale);
		rdbFemale.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblIcNo = new JLabel("I/C No.");
		lblIcNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		txtPosition = new JTextField();
		txtPosition.setBackground(Color.WHITE);
		txtPosition.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPosition.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setBackground(Color.WHITE);
		txtPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPhoneNo.setColumns(10);
		
		txtIcNo = new JTextField();
		txtIcNo.setBackground(Color.WHITE);
		txtIcNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtIcNo.setColumns(10);
		
		txtCountry = new JTextField();
		txtCountry.setBackground(Color.WHITE);
		txtCountry.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCountry.setColumns(10);
		
		txtPostcode = new JTextField();
		txtPostcode.setBackground(Color.WHITE);
		txtPostcode.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPostcode.setColumns(10);
		
		txtAdddress = new JTextField();
		txtAdddress.setBackground(Color.WHITE);
		txtAdddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtAdddress.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtName.setColumns(10);
		
		JLabel lblExpectedSalary = new JLabel("Expected Salary");
		lblExpectedSalary.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		textESalary = new JTextField();
		textESalary.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textESalary.setColumns(10);
		textESalary.setBackground(Color.WHITE);
		
		//button "Clear"
		JButton btnReset = new JButton("Clear");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				rdbMale.setSelected(false);
				rdbFemale.setSelected(false);
				txtAdddress.setText("");
				txtPostcode.setText("");
				txtCountry.setText("");
				txtIcNo.setText("");
				txtPhoneNo.setText("");
				txtEmail.setText("");
				txtPosition.setText("");
				textESalary.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.setBackground(Color.LIGHT_GRAY);
		
		JButton btnAdd = new JButton("Add ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableDetails.getModel();	
				
				if (rdbMale.isSelected()) {//male
					model.addRow(new Object[]{
							txtName.getText(),
							"Male",
							txtAdddress.getText(),
							txtPostcode.getText(),
							txtCountry.getText(),
							txtIcNo.getText(),
							txtPhoneNo.getText(),
							txtEmail.getText(),
							txtPosition.getText(),
							textESalary.getText(),				
					});
				}		
				else {//female
					model.addRow(new Object[]{
							txtName.getText(),
							"Female",
							txtAdddress.getText(),
							txtPostcode.getText(),
							txtCountry.getText(),
							txtIcNo.getText(),
							txtPhoneNo.getText(),
							txtEmail.getText(),
								txtPosition.getText(),
							textESalary.getText(),
					});
				}	
				if (tableDetails.getSelectedRow() == -1) {
					if (tableDetails.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.DARK_GRAY);
		
		tableDetails = new JTable();
		tableDetails.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tableDetails.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "Address", "Postcode", "Country", "I/C No.", "Phone No.", "Email", "Position", "Salary"
			}
		));
		scrollPane.setViewportView(tableDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Employee");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(336)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(341))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		tableTP = new JTable();
		tableTP.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Total Salary"
			}
		));
		tableTP.getColumnModel().getColumn(0).setPreferredWidth(77);
		tableTP.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane_1.setViewportView(tableTP);
		
		JButton btnRemoveDetails = new JButton("Remove");
		btnRemoveDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)tableDetails.getModel();
					
					if(tableDetails.getSelectedRow() == -1) {
						if(tableDetails.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null,"No data to remove",
									"GK System", JOptionPane.OK_OPTION);
						}else {
							JOptionPane.showMessageDialog(null,"Select a row to delete",
									"GK System", JOptionPane.OK_OPTION);
						}
					}else {
						model.removeRow(tableDetails.getSelectedRow());
					}
			}
		});
		btnRemoveDetails.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnRemoveDetails.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRemoveDetails.setBackground(Color.LIGHT_GRAY);
		
		JButton btnRemoveTS = new JButton("Remove");
		btnRemoveTS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableTP.getModel();
				if(tableTP.getSelectedRow() == -1) {
					if(tableTP.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null,"No data to remove",
								"GK System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"GK System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableTP.getSelectedRow());
				}	
			}
		});
		btnRemoveTS.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnRemoveTS.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRemoveTS.setBackground(Color.LIGHT_GRAY);
		
		txtTotalSalary = new JTextField();
		txtTotalSalary.setBorder(null);
		txtTotalSalary.setForeground(Color.WHITE);
		txtTotalSalary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalSalary.setColumns(10);
		txtTotalSalary.setBackground(Color.GRAY);
		
		btnTSalary = new JButton("Total Salary");
		btnTSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declaration
				sum = 0;
				//calculate total salary
				for(int i = 0; i < tableDetails.getRowCount(); i++){
				    sum += Double.parseDouble(tableDetails.getValueAt(i, 9).toString());
				}
				//convert double too string
				sumF = Double.toString(sum);
				txtTotalSalary.setText(sumF);
				
				DefaultTableModel model = (DefaultTableModel) tableTP.getModel();	
				model.addRow(new Object[]{
						txtTotalSalary.getText()
				});
				if (tableDetails.getSelectedRow() == -1) {
					if (tableDetails.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "The total salary is 0");
					}
				}
			}
		});
		btnTSalary.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTSalary.setBackground(Color.LIGHT_GRAY);
		btnTSalary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		//"Upload" button
		JButton btnUploadTS = new JButton("Upload ");
		btnUploadTS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//export details
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Employee.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i = 0; i < tableDetails.getRowCount(); i++) {
						for (int j = 0; j < tableDetails.getColumnCount(); j++) {
							bw.write(tableDetails.getModel().getValueAt(i, j) + "\t  ");
							}
						bw.write("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				//export total salary
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\TotalSalary.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i = 0; i < tableTP.getRowCount(); i++) {
						for (int j = 0; j < tableTP.getColumnCount(); j++) {
							bw.write(tableTP.getModel().getValueAt(i, j) + "\t  ");
							}
						}
						bw.close();
						fw.close();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUploadTS.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnUploadTS.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUploadTS.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnRemoveDetails, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
							.addGap(2))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
							.addGap(2))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnRemoveTS, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
							.addGap(2)))
					.addGap(15))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnRemoveDetails, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnRemoveTS, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(3, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(rdbMale, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(9, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(138)
					.addComponent(rdbFemale, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtAdddress, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblPoscode, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtPostcode, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblCountry, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtCountry, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblIcNo, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtIcNo, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblPhoneNo, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtPhoneNo, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblExpectedSalary)
					.addGap(10)
					.addComponent(textESalary, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
					.addGap(15)
					.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
					.addGap(12))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(lblName))
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGender)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(2)
							.addComponent(rdbMale, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addComponent(rdbFemale, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAddress)
						.addComponent(txtAdddress, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPoscode))
						.addComponent(txtPostcode, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCountry))
						.addComponent(txtCountry, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIcNo))
						.addComponent(txtIcNo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPhoneNo))
						.addComponent(txtPhoneNo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(lblEmail))
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPosition)
						.addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblExpectedSalary)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(3)
							.addComponent(textESalary, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnTSalary, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtTotalSalary, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(111)
							.addComponent(btnUploadTS, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnTSalary, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTotalSalary, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUploadTS, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
