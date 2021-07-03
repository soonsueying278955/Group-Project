package Restaurant;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class EmployeeRegistration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRegistration window = new EmployeeRegistration();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeRegistration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeeRegistration.class.getResource("icon.png")));
		setTitle("Employee Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 859, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel.setBounds(0, 0, 841, 590);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 23, 791, 72);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.CYAN));
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Employee Registration System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel.setBounds(49, 0, 704, 63);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(new Color(255, 255, 255));
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel_1_1.setBounds(26, 102, 252, 470);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 24, 62, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("IC Number");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 52, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Age");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(20, 77, 62, 14);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(20, 102, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Position");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(20, 128, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telephone");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(20, 154, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ID");
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(20, 183, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Category");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(20, 235, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Citizenship");
		lblNewLabel_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(20, 267, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Salary");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1_1_1.setBounds(20, 296, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(100, 24, 127, 20);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 51, 127, 20);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(100, 77, 127, 20);
		panel_1_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(100, 102, 127, 20);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 128, 127, 20);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(100, 154, 127, 20);
		panel_1_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(100, 180, 127, 20);
		panel_1_1.add(textField_6);
		
		JComboBox CatBox = new JComboBox();
		CatBox.setForeground(Color.BLACK);
		CatBox.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Contract", "Full Time", "Part Time", "Temporary"}));
		CatBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		CatBox.setBounds(98, 235, 129, 20);
		panel_1_1.add(CatBox);
		
		JComboBox CitBox = new JComboBox();
		CitBox.setForeground(Color.BLACK);
		CitBox.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Local", "Foreign"}));
		CitBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		CitBox.setBounds(98, 265, 129, 20);
		panel_1_1.add(CitBox);
		
		JComboBox SaBox = new JComboBox();
		SaBox.setForeground(Color.BLACK);
		SaBox.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Below RM2000", "RM2000 to RM5000", "Above RM5000"}));
		SaBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		SaBox.setBounds(98, 296, 129, 20);
		panel_1_1.add(SaBox);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setBounds(41, 335, 163, 50);
		panel_1_1.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
						textField_7.getText(),
						CatBox.getSelectedItem(),
						CitBox.getSelectedItem(),
						SaBox.getSelectedItem(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "Employee Registration System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(41, 398, 163, 50);
		panel_1_1.add(btnUpdate);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField.getText(),i,0);
			    	model.setValueAt(textField_1.getText(),i,1);
			    	model.setValueAt(textField_2.getText(),i,2);
			    	model.setValueAt(textField_3.getText(),i,3);
			    	model.setValueAt(textField_4.getText(),i,4);
			    	model.setValueAt(textField_5.getText(),i,5);
			    	model.setValueAt(textField_6.getText(),i,6);
			    	model.setValueAt(CatBox.getSelectedItem(),i,7);
			    	model.setValueAt(CitBox.getSelectedItem(),i,8);
			    	model.setValueAt(SaBox.getSelectedItem(),i,9);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblEmail.setBounds(20, 208, 62, 14);
		panel_1_1.add(lblEmail);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setColumns(10);
		textField_7.setBounds(100, 206, 127, 20);
		panel_1_1.add(textField_7);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(287, 436, 530, 81);
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 255, 255)));
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel.add(panel_1_2);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.BLACK);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDelete.setBounds(184, 16, 163, 50);
		panel_1_2.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setBackground(Color.BLACK);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnPrint.setBounds(355, 16, 163, 50);
		panel_1_2.add(btnPrint);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(12, 16, 163, 50);
		panel_1_2.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				CatBox.setSelectedItem("Make a selection");
				CitBox.setSelectedItem("Make a selection");
				SaBox.setSelectedItem("Make a selection");
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(287, 102, 530, 326);
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(null);
		panel_1_3.setBackground(new Color(0, 255, 255));
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 13, 506, 252);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "IC Number", "Age", "Gender", "Position", "Telephone", "ID", "Email", "Category", "Citizenship", "Salary"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("UPLOAD");
		btnNewButton_1.setBounds(182, 271, 163, 50);
		panel_1_3.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(654, 524, 163, 50);
		panel.add(btnExit);
		btnExit.setIcon(new ImageIcon(EmployeeRegistration.class.getResource("e1.png")));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Restaurant\\EmployeeRegistration.txt");
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
	}
}