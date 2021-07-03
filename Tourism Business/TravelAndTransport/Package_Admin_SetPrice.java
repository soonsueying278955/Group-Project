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

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
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

public class Package_Admin_SetPrice extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField package1TF;
	private JTextField package2TF;
	private JTextField package3TF;
	private JTextField discountTF;
	static String price1 = "1200", price2 = "1350", price3 = "1500" , discount = "0.1";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package_Admin_SetPrice frame = new Package_Admin_SetPrice();
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
	public Package_Admin_SetPrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Package_Admin_SetPrice.class.getResource("small-axe.png"))); //contructor without argument
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 0, 0));
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		panel.setBounds(0, 0, 870, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(27, 53, 817, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("PACKAGE PRICE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 10, 797, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(34, 139, 34)));
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(238, 147, 606, 277);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 586, 256);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1200", "1350", "1500", "0.1"},
			},
			new String[] {
				"Package 1", "Package 2", "Package 3", "Discount"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Package 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 165, 106, 15);
		panel.add(lblNewLabel_1);
		
		package1TF = new JTextField();
		package1TF.setBounds(126, 166, 86, 20);
		panel.add(package1TF);
		package1TF.setColumns(10);
		
		package2TF = new JTextField();
		package2TF.setColumns(10);
		package2TF.setBounds(126, 198, 86, 20);
		panel.add(package2TF);
		
		package3TF = new JTextField();
		package3TF.setColumns(10);
		package3TF.setBounds(126, 228, 86, 20);
		panel.add(package3TF);
		
		discountTF = new JTextField();
		discountTF.setColumns(10);
		discountTF.setBounds(126, 258, 86, 20);
		panel.add(discountTF);
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			
	        price1 = String.valueOf(model.getValueAt(i, 0));
	        price2 = String.valueOf(model.getValueAt(i, 1));
	        price3 = String.valueOf(model.getValueAt(i, 2));
	        discount = String.valueOf(model.getValueAt(i, 3));
		}
		
		JButton recordButton = new JButton("ADD RECORD");
		recordButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		recordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						package1TF.getText(),
						package2TF.getText(),
						package3TF.getText(),
						discountTF.getText(),
						
												
				});
				
							
				 				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Sales Information Update confirmed", "Thank you",
								JOptionPane.OK_OPTION);
					}
				}
				
				//How to read data in table
				
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
			        price1 = String.valueOf(model.getValueAt(i, 0));
			        price2 = String.valueOf(model.getValueAt(i, 1));
			        price3 = String.valueOf(model.getValueAt(i, 2));
			        discount = String.valueOf(model.getValueAt(i, 3));
				}
			
			}
		});
			
		recordButton.setBounds(44, 288, 150, 47);
		panel.add(recordButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Package 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 197, 106, 15);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Package 3");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 227, 106, 15);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Discount");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 257, 106, 15);
		panel.add(lblNewLabel_1_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 870, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("HOME");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("HOME PAGE");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Logout");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
					
			        price1 = String.valueOf(model.getValueAt(i, 0));
			        price2 = String.valueOf(model.getValueAt(i, 1));
			        price3 = String.valueOf(model.getValueAt(i, 2));
			        discount = String.valueOf(model.getValueAt(i, 3));
				}
				
				Home frame = new Home();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(44, 416, 150, 47);
		panel.add(btnOk);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Travel and Transport\\New_Price_Rate.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpload.setBounds(44, 345, 150, 47);
		panel.add(btnUpload);
		
		
	}
}
