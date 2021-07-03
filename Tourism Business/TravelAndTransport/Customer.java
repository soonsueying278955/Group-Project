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
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

public class Customer extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField RefNo;
	private JTextField firstNameText;
	private JTextField SurnameText;
	private JTextField AgeText;
	private JTextField followersText;
	private JTable table;
	
	double price, discount; 
	static double totalIncome;
	String finalprice;
	private JTextField totalPrice;
	private JTextField disc;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setTitle("Customer Tab");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Customer.class.getResource("small-axe.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1109, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.MAGENTA));
		panel.setBounds(0, 21, 1095, 525);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(21, 27, 1053, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Customer Management Tab");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 11, 1018, 51);
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Package No");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(20, 133, 72, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		RefNo = new JTextField();
		RefNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		RefNo.setBounds(100, 24, 127, 20);
		panel_1_1.add(RefNo);
		RefNo.setColumns(10);
		
		firstNameText = new JTextField();
		firstNameText.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstNameText.setColumns(10);
		firstNameText.setBounds(100, 49, 127, 20);
		panel_1_1.add(firstNameText);
		
		SurnameText = new JTextField();
		SurnameText.setFont(new Font("Tahoma", Font.BOLD, 11));
		SurnameText.setColumns(10);
		SurnameText.setBounds(100, 77, 127, 20);
		panel_1_1.add(SurnameText);
		
		AgeText = new JTextField();
		AgeText.setFont(new Font("Tahoma", Font.BOLD, 11));
		AgeText.setColumns(10);
		AgeText.setBounds(100, 106, 127, 20);
		panel_1_1.add(AgeText);
		
		followersText = new JTextField();
		followersText.setFont(new Font("Tahoma", Font.BOLD, 11));
		followersText.setColumns(10);
		followersText.setBounds(100, 157, 127, 20);
		panel_1_1.add(followersText);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Age");
		lblNewLabel_1_2_2.setBounds(20, 109, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_2);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JComboBox cbPackage = new JComboBox();
		cbPackage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cbPackage.setModel(new DefaultComboBoxModel(new String[] {"Select Package", "1", "2", "3"}));
		cbPackage.setBounds(102, 130, 125, 20);
		panel_1_1.add(cbPackage);
		
		JLabel lblNewLabel_1_3 = new JLabel("Followers");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(20, 157, 62, 20);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Total Price");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(20, 190, 62, 14);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		totalPrice = new JTextField();
		totalPrice.setEditable(false);
		totalPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalPrice.setColumns(10);
		totalPrice.setBounds(100, 187, 127, 20);
		panel_1_1.add(totalPrice);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Discount");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1_1.setBounds(20, 226, 62, 14);
		panel_1_1.add(lblNewLabel_1_3_1_1);
		
		disc = new JTextField();
		disc.setEditable(false);
		disc.setFont(new Font("Tahoma", Font.BOLD, 11));
		disc.setColumns(10);
		disc.setBounds(100, 224, 127, 20);
		panel_1_1.add(disc);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(Color.YELLOW);
		panel_1_2.setBounds(21, 426, 1053, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 int num1 = Integer.parseInt(followersText.getText());
					if(cbPackage.getSelectedItem() == "1") {
						Payment p1 = new PriceRateOne();
						if(num1 <=4) {
							price = p1.Price() * num1; 
							String s = String.valueOf(price);
							totalPrice.setText(s);
							disc.setText("");
	                        double newprice = price*(1-discount);
	                        finalprice = Double.toString(newprice);
						}else {
							Discount d = new DiscountRate();
							discount = d.discountRate();
							price = p1.Price()*num1;
							String s = String.valueOf(price);
							totalPrice.setText(s);
							String e1 = String.valueOf(discount);
							disc.setText(e1);
							double newprice = p1.totalPrice(discount)*num1;
	                        finalprice = Double.toString(newprice);
						}
					}else if(cbPackage.getSelectedItem() == "2") {
						Payment p1 = new PriceRateTwo();
						if(num1 <=4) {
							price = p1.Price() * num1; 
							String s = String.valueOf(price);
							totalPrice.setText(s);
							disc.setText("");
	                        double newprice = price*(1-discount);
	                        finalprice = Double.toString(newprice);
						}else {
							Discount d = new DiscountRate();
							discount = d.discountRate();
							price = p1.Price()*num1;
							String s = String.valueOf(price);
							totalPrice.setText(s);
							String e1 = String.valueOf(discount);
							disc.setText(e1);
							double newprice = p1.totalPrice(discount)*num1;
	                        finalprice = Double.toString(newprice);
						}
					}else if(cbPackage.getSelectedItem() == "3") {
						Payment p1 = new PriceRateThree();
						if(num1 <=4) {
							price = p1.Price() * num1; 
							String s = String.valueOf(price);
							totalPrice.setText(s);
							disc.setText("");
	                        double newprice = price*(1-discount);
	                        finalprice = Double.toString(newprice);
						}else {
							Discount d = new DiscountRate();
							discount = d.discountRate();
							price = p1.Price()*num1;
							String s = String.valueOf(price);
							totalPrice.setText(s);
							String e1 = String.valueOf(discount);
							disc.setText(e1);
							double newprice = p1.totalPrice(discount)*num1;
	                        finalprice = Double.toString(newprice);
						}
					}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						RefNo.getText(),
						firstNameText.getText(),
						SurnameText.getText(),
						AgeText.getText(),
						cbPackage.getSelectedItem(),
						followersText.getText(),
						totalPrice.getText(),
						finalprice,
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Customer Update confirmed", "Customer Management System",
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
		btnNewButton.setBounds(27, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RefNo.setText("");
				firstNameText.setText("");
				SurnameText.setText("");
				AgeText.setText("");
				cbPackage.setSelectedItem("Select Package");
				followersText.setText("");
				totalPrice.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(194, 23, 146, 38);
		panel_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(684, 23, 146, 38);
		panel_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home frame = new Home();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(858, 23, 146, 38);
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
		btnPrint.setBounds(517, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(RefNo.getText(),i,0);
			    	model.setValueAt(firstNameText.getText(),i,1);
			    	model.setValueAt(SurnameText.getText(),i,2);
			    	model.setValueAt(AgeText.getText(),i,3);
			    	model.setValueAt(cbPackage.getSelectedItem(),i,4);
			    	model.setValueAt(followersText.getText(),i,5);
			    	model.setValueAt(totalPrice.getText(),i,6);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(360, 23, 146, 38);
		panel_1_2.add(btnUpdate);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 110, 791, 256);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 2, 2);
		panel_1_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 771, 236);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref Num", "First Name", "Surname", "Age", "TravelPackageNo", "No of followers", "Total Price (RM)" , "Final Price (RM)"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Travel and Transport\\Customer.txt");
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
		btnUpload.setBounds(362, 376, 146, 38);
		panel.add(btnUpload);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(837, 376, 183, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Total Travel Income");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                DefaultTableModel model = (DefaultTableModel) table.getModel();
				totalIncome = 0;
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 7));
			        
			        totalIncome += Double.parseDouble(s);
			}
			    
		        String ni = String.valueOf(totalIncome);
		        textField.setText(ni);
		        totalIncome = Double.parseDouble(ni); //pass value to finance as total income
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(571, 376, 219, 38);
		panel.add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1095, 22);
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

