package TravelAndTransport;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField refNo;
	private JTextField firstName;
	private JTextField surName;
	private JTextField ageText;
	private JTextField addressText;
	private JTextField postCode;
	private JTextField telephoneNo;
	private JTextField salaryText;
	private JTable table;
	private String s,s1,s2,s3,s4;
	static double totalSalary;
	private JTextField totalSalaryText;

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

	/**
	 * Create the frame.
	 */
	public Employee() {
		setTitle("Employee Tab");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee.class.getResource("small-axe.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1053, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.RED));
		panel.setBounds(0, 21, 1039, 525);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(21, 27, 983, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Employee Management Tab");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 11, 963, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(Color.YELLOW);
		panel_1_1.setBounds(21, 110, 252, 304);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ref Num");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 27, 62, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 52, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(20, 77, 62, 14);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(20, 133, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Postcode");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(20, 157, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telephone");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(20, 190, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Salary(RM)");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 220, 72, 14);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Position");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(20, 253, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		refNo = new JTextField();
		refNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		refNo.setBounds(100, 24, 127, 20);
		panel_1_1.add(refNo);
		refNo.setColumns(10);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstName.setColumns(10);
		firstName.setBounds(100, 49, 127, 20);
		panel_1_1.add(firstName);
		
		surName = new JTextField();
		surName.setFont(new Font("Tahoma", Font.BOLD, 11));
		surName.setColumns(10);
		surName.setBounds(100, 77, 127, 20);
		panel_1_1.add(surName);
		
		ageText = new JTextField();
		ageText.setFont(new Font("Tahoma", Font.BOLD, 11));
		ageText.setColumns(10);
		ageText.setBounds(100, 106, 127, 20);
		panel_1_1.add(ageText);
		
		postCode = new JTextField();
		postCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		postCode.setColumns(10);
		postCode.setBounds(100, 157, 127, 20);
		panel_1_1.add(postCode);
		
		telephoneNo = new JTextField();
		telephoneNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		telephoneNo.setColumns(10);
		telephoneNo.setBounds(100, 187, 127, 20);
		panel_1_1.add(telephoneNo);
		
		salaryText = new JTextField();
		salaryText.setFont(new Font("Tahoma", Font.BOLD, 11));
		salaryText.setColumns(10);
		salaryText.setBounds(100, 217, 127, 20);
		panel_1_1.add(salaryText);
		
		JComboBox cabPosition = new JComboBox();
		cabPosition.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Manager", "Tour Guide", "Counter Attendant", "Driver", "Cleaner"}));
		cabPosition.setFont(new Font("Tahoma", Font.BOLD, 11));
		cabPosition.setBounds(98, 250, 129, 20);
		panel_1_1.add(cabPosition);
		
		addressText = new JTextField();
		addressText.setFont(new Font("Tahoma", Font.BOLD, 11));
		addressText.setColumns(10);
		addressText.setBounds(100, 130, 127, 20);
		panel_1_1.add(addressText);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Age");
		lblNewLabel_1_2_2.setBounds(20, 109, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_2);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(Color.YELLOW);
		panel_1_2.setBounds(21, 426, 983, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						refNo.getText(),
						firstName.getText(),
						surName.getText(),
						ageText.getText(),
						addressText.getText(),
						postCode.getText(),
						telephoneNo.getText(),
						salaryText.getText(),
						cabPosition.getSelectedItem(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}catch(Exception ee) {
					ee.printStackTrace();
				}
				}
			}
		);
				
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(23, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refNo.setText("");
				firstName.setText("");
				surName.setText("");
				ageText.setText("");
				postCode.setText("");
				addressText.setText("");				
				telephoneNo.setText("");
				salaryText.setText("");
				cabPosition.setSelectedItem("Make a selection");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(179, 23, 146, 38);
		panel_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(653, 23, 146, 38);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Employee Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home frame = new Home();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(827, 23, 146, 38);
		panel_1_2.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(497, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(refNo.getText(),i,0);
			    	model.setValueAt(firstName.getText(),i,1);
			    	model.setValueAt(surName.getText(),i,2);
			    	model.setValueAt(ageText.getText(),i,3);
			    	model.setValueAt(addressText.getText(),i,4);
			    	model.setValueAt(postCode.getText(), i, 5);
			    	model.setValueAt(telephoneNo.getText(),i,6);
			    	model.setValueAt(salaryText.getText(),i,7);
			    	model.setValueAt(cabPosition.getSelectedItem(),i,8);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			
			
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(341, 23, 146, 38);
		panel_1_2.add(btnUpdate);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 110, 721, 256);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 2, 2);
		panel_1_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 701, 236);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"RefNo", "First Name", "Surname", "Age", "Address", "Postcode", "Tel No", "Income(RM)" , "Position"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Travel and Transport\\Employee.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBounds(316, 376, 146, 38);
		panel.add(btnUpload);
		
		JLabel lblNewLabel_2 = new JLabel("Total Salary");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(637, 376, 113, 28);
		panel.add(lblNewLabel_2);
		
		totalSalaryText = new JTextField();
		totalSalaryText.setEditable(false);
		totalSalaryText.setFont(new Font("Tahoma", Font.BOLD, 20));
		totalSalaryText.setBounds(774, 376, 173, 28);
		panel.add(totalSalaryText);
		totalSalaryText.setColumns(10);
		
		JButton btnCalTotalSalary = new JButton("Cal Total Salary");
		btnCalTotalSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 DefaultTableModel model = (DefaultTableModel) table.getModel();
				totalSalary = 0;
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 7));
			        
			        totalSalary += Double.parseDouble(s);
			}
			    
		        String ni = String.valueOf(totalSalary);
		        totalSalaryText.setText(ni);
		        totalSalary = Double.parseDouble(totalSalaryText.getText()); //pass value to finance for total salary
		}
		});
		btnCalTotalSalary.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalTotalSalary.setBounds(481, 376, 146, 38);
		panel.add(btnCalTotalSalary);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1039, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Home");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About Company");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackGround_Admin frame = new CompanyBackGround_Admin();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Logout");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin home = new Admin();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}
}

