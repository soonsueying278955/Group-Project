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
import java.util.Calendar;
import java.util.Date;
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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FinancialStatus extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinancialStatus frame = new FinancialStatus();
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
	public FinancialStatus() {
		setTitle("Financial Status");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FinancialStatus.class.getResource("icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 852, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 51, 255)));
		panel.setBounds(0, 0, 835, 577);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 51, 255)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(21, 27, 791, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Financial Status");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(62, 11, 704, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 51, 255)));
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1.setBounds(21, 111, 252, 420);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 140, 89, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telephone");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(20, 230, 62, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(121, 140, 106, 20);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(121, 20, 106, 20);
		panel_1_1.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(121, 170, 106, 20);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(121, 230, 106, 20);
		panel_1_1.add(textField_5);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(new Color(255, 255, 255));
		lblMonth.setHorizontalAlignment(SwingConstants.LEFT);
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMonth.setBounds(20, 50, 89, 14);
		panel_1_1.add(lblMonth);
		
		JComboBox monthBox = new JComboBox();
		monthBox.setForeground(Color.BLACK);
		monthBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		monthBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		monthBox.setBounds(121, 50, 106, 20);
		panel_1_1.add(monthBox);
		
		JComboBox TypeBox = new JComboBox();
		TypeBox.setModel(new DefaultComboBoxModel(new String[] {"Type", "Income", "Expenditure", "Profit", "Debt"}));
		TypeBox.setForeground(Color.BLACK);
		TypeBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		TypeBox.setBounds(121, 110, 106, 20);
		panel_1_1.add(TypeBox);
		
		JLabel lblTotalSpending = new JLabel("Year");
		lblTotalSpending.setForeground(new Color(255, 255, 255));
		lblTotalSpending.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalSpending.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotalSpending.setBounds(20, 20, 89, 14);
		panel_1_1.add(lblTotalSpending);
		
		JLabel lblSubmittedBy = new JLabel("Submitted by");
		lblSubmittedBy.setForeground(new Color(255, 255, 255));
		lblSubmittedBy.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubmittedBy.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSubmittedBy.setBounds(20, 170, 89, 14);
		panel_1_1.add(lblSubmittedBy);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEmail.setBounds(20, 260, 62, 14);
		panel_1_1.add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(121, 260, 106, 20);
		panel_1_1.add(textField_6);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(53, 304, 146, 38);
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						
						textField_2.getText(),
						monthBox.getSelectedItem(),
						textField.getText(),
						TypeBox.getSelectedItem(),
						textField_1.getText(),
						textField_4.getText(),
						textField_3.getText(),
						textField_5.getText(),
						textField_6.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "Financial Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton button = new JButton("UPDATE");
		button.setBounds(53, 355, 146, 38);
		panel_1_1.add(button);
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	
			    	
			    	model.setValueAt(textField_2.getText(),i,0);
			    	model.setValueAt(monthBox.getSelectedItem(),i,1);
			    	model.setValueAt(textField.getText(),i,2);
			    	model.setValueAt(TypeBox.getSelectedItem(),i,3);
			    	model.setValueAt(textField_1.getText(),i,4);
			    	model.setValueAt(textField_4.getText(),i,5);
			    	model.setValueAt(textField_3.getText(),i,6);
			    	model.setValueAt(textField_5.getText(),i,7);
			    	model.setValueAt(textField_6.getText(),i,8);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		JLabel lblType = new JLabel("Type");
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblType.setBounds(20, 110, 89, 14);
		panel_1_1.add(lblType);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setColumns(10);
		textField.setBounds(121, 80, 106, 20);
		panel_1_1.add(textField);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setHorizontalAlignment(SwingConstants.LEFT);
		lblDay.setForeground(Color.WHITE);
		lblDay.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDay.setBounds(20, 80, 89, 14);
		panel_1_1.add(lblDay);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(121, 200, 106, 20);
		panel_1_1.add(textField_3);
		
		JLabel lblIcNumber = new JLabel("IC Number");
		lblIcNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcNumber.setForeground(Color.WHITE);
		lblIcNumber.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblIcNumber.setBounds(20, 200, 89, 14);
		panel_1_1.add(lblIcNumber);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 51, 255)));
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel_1_2.setBounds(285, 427, 369, 104);
		panel.add(panel_1_2);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(181, 13, 146, 38);
		panel_1_2.add(btnDelete);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.BLACK);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Financial Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Financial Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnUpdate = new JButton("UPLOAD");
		btnUpdate.setBounds(31, 13, 146, 38);
		panel_1_2.add(btnUpdate);
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
						File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Restaurant\\FinancialManagement.txt");
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
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(181, 55, 146, 38);
		panel_1_2.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				monthBox.setSelectedItem("Month");
				textField.setText("");
				TypeBox.setSelectedItem("Type");
				textField_1.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(31, 55, 146, 38);
		panel_1_2.add(btnPrint);
		btnPrint.setBackground(Color.BLACK);
		btnPrint.setForeground(Color.WHITE);
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
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(153, 51, 255)));
		panel_1_3.setBackground(new Color(153, 51, 255));
		panel_1_3.setBounds(283, 111, 529, 310);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(11, 12, 506, 285);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Year", "Month", "Day", "Type", "Amount", "Submitted By", "IC Number", "Telephone", "Email"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(666, 448, 146, 54);
		panel.add(btnExit);
		btnExit.setIcon(new ImageIcon(FinancialStatus.class.getResource("e1.png")));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
}
