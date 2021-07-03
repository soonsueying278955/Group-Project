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
import javax.swing.table.TableModel;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuMWFAdmin extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldfood1;
	private JTextField textFieldfood2;
	private JTextField textFieldfood3;
	private JTextField textFieldfood4;
	private JTextField textFieldfood5;
	private JTextField textFieldfood6;
	private JTable table;
	static String food1;
	static String food2;
	static String food3;
	static String food4;
	static String food5;
	static String food6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMWFAdmin window = new MenuMWFAdmin();
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
	public MenuMWFAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmployeeRegistration.class.getResource("icon.png")));
		setTitle("Menu Updating System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 761, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.BLACK));
		panel.setBounds(0, 0, 745, 590);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 23, 722, 72);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(222, 184, 135)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Menu Update System (The Amazing Malaysia)");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(12, 13, 696, 50);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(12, 102, 252, 475);
		panel_1_1.setForeground(new Color(255, 255, 255));
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(222, 184, 135)));
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("HIGHLIGHTED DISHES FOR OUR MENU");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 24, 220, 14);
		panel_1_1.add(lblNewLabel_1);
		
		textFieldfood1 = new JTextField();
		textFieldfood1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood1.setBounds(48, 51, 167, 35);
		panel_1_1.add(textFieldfood1);
		textFieldfood1.setColumns(10);
		
		textFieldfood2 = new JTextField();
		textFieldfood2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood2.setColumns(10);
		textFieldfood2.setBounds(48, 98, 167, 35);
		panel_1_1.add(textFieldfood2);
		
		textFieldfood3 = new JTextField();
		textFieldfood3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood3.setColumns(10);
		textFieldfood3.setBounds(48, 144, 167, 35);
		panel_1_1.add(textFieldfood3);
		
		textFieldfood4 = new JTextField();
		textFieldfood4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood4.setColumns(10);
		textFieldfood4.setBounds(48, 191, 167, 35);
		panel_1_1.add(textFieldfood4);
		
		textFieldfood5 = new JTextField();
		textFieldfood5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood5.setColumns(10);
		textFieldfood5.setBounds(48, 238, 167, 35);
		panel_1_1.add(textFieldfood5);
		
		textFieldfood6 = new JTextField();
		textFieldfood6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldfood6.setColumns(10);
		textFieldfood6.setBounds(48, 285, 167, 35);
		panel_1_1.add(textFieldfood6);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setBounds(48, 335, 163, 50);
		panel_1_1.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldfood1.getText(),
						textFieldfood2.getText(),
						textFieldfood3.getText(),
						textFieldfood4.getText(),
						textFieldfood5.getText(),
						textFieldfood6.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "Menu Description System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(48, 398, 163, 50);
		panel_1_1.add(btnUpdate);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldfood1.getText(),i,0);
			    	model.setValueAt(textFieldfood2.getText(),i,1);
			    	model.setValueAt(textFieldfood3.getText(),i,2);
			    	model.setValueAt(textFieldfood4.getText(),i,3);
			    	model.setValueAt(textFieldfood5.getText(),i,4);
			    	model.setValueAt(textFieldfood6.getText(),i,5);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(352, 441, 357, 141);
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(222, 184, 135)));
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel.add(panel_1_2);
		
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
		btnPrint.setBounds(12, 78, 163, 50);
		panel_1_2.add(btnPrint);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(12, 16, 163, 50);
		panel_1_2.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldfood1.setText("");
				textFieldfood2.setText("");
				textFieldfood3.setText("");
				textFieldfood4.setText("");
				textFieldfood5.setText("");
				textFieldfood6.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(179, 78, 163, 50);
		panel_1_2.add(btnExit);
		btnExit.setIcon(new ImageIcon(EmployeeRegistration.class.getResource("e1.png")));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration rr = new Registration();
				rr.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(179, 16, 163, 50);
		panel_1_2.add(btnDelete);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.BLACK);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Menu Description System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Menu Description System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(276, 102, 458, 326);
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(null);
		panel_1_3.setBackground(new Color(222, 184, 135));
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 13, 434, 252);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setBounds(0, 245, 450, -245);
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Highlighted Dishes 1", "Highlighted Dishes 2", "Highlighted Dishes 3", "Highlighted Dishes 4", "Highlighted Dishes 5", "Highlighted Dishes 6"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("UPLOAD");
		btnNewButton_1.setBounds(12, 269, 163, 50);
		panel_1_3.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnRenew = new JButton("RENEW");
		btnRenew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				//
					 food1 = textFieldfood1.getText();
					 food2 = textFieldfood2.getText();
					 food3 = textFieldfood3.getText();
					 food4 = textFieldfood4.getText();
					 food5 = textFieldfood5.getText();
					 food6 = textFieldfood6.getText();
				//
				//
			    }
			
		});
		btnRenew.setForeground(Color.WHITE);
		btnRenew.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRenew.setBackground(Color.BLACK);
		btnRenew.setBounds(182, 269, 163, 50);
		panel_1_3.add(btnRenew);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(MenuMWFAdmin.class.getResource("m2.png")));
		lblNewLabel_2.setBounds(0, 0, 745, 590);
		panel.add(lblNewLabel_2);
		btnNewButton_1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Restaurant\\MenuMWF.txt");
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
