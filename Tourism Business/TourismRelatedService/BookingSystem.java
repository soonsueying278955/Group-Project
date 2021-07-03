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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class BookingSystem extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPhoneNum;
	private JTextField textFieldEmail;
	private JTable table;
	private final ButtonGroup gender = new ButtonGroup();
	private final ButtonGroup payment = new ButtonGroup();
	private JTextField textFieldPrice;
	private JTextField textFieldDiscount;
	private JTextField textFieldTotalPrice;
	private JTextField textFieldHour;
	private JTextField textFieldQuantity;
	static double TotalIncome;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem frame = new BookingSystem();
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
	public BookingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1268, 808);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1254, 771);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(221, 160, 221));
		panel_1.setBounds(10, 10, 1234, 104);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBooking = new JLabel("Booking Form");
		lblBooking.setFont(new Font("Pristina", Font.BOLD, 65));
		lblBooking.setBounds(409, 10, 400, 84);
		panel_1.add(lblBooking);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(10, 124, 1234, 637);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblName.setBounds(43, 32, 137, 36);
		panel_2.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGender.setBounds(43, 78, 137, 36);
		panel_2.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		gender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnMale.setBounds(237, 78, 113, 36);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		gender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 23));
		rdbtnFemale.setBounds(362, 78, 113, 36);
		panel_2.add(rdbtnFemale);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBounds(237, 33, 210, 36);
		panel_2.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblPhoneNum = new JLabel("No. H/P");
		lblPhoneNum.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPhoneNum.setBounds(43, 124, 137, 36);
		panel_2.add(lblPhoneNum);
		
		textFieldPhoneNum = new JTextField();
		textFieldPhoneNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPhoneNum.setColumns(10);
		textFieldPhoneNum.setBounds(237, 125, 210, 36);
		panel_2.add(textFieldPhoneNum);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEmail.setBounds(43, 170, 137, 36);
		panel_2.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(237, 171, 210, 36);
		panel_2.add(textFieldEmail);
		
		JLabel lblTourism = new JLabel("Tourism");
		lblTourism.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTourism.setBounds(43, 216, 137, 36);
		panel_2.add(lblTourism);
		
		JComboBox comboBoxTourism = new JComboBox();
		comboBoxTourism.setFont(new Font("Times New Roman", Font.BOLD, 23));
		comboBoxTourism.setModel(new DefaultComboBoxModel(new String[] {"Please select", "Health Tourism", "Sport Tourism", "Cultural Tourism"}));
		comboBoxTourism.setBounds(237, 217, 210, 36);
		panel_2.add(comboBoxTourism);
		
		JLabel lblService = new JLabel("Service");
		lblService.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblService.setBounds(43, 262, 137, 36);
		panel_2.add(lblService);
		
		JComboBox comboBoxService = new JComboBox();
		comboBoxService.setFont(new Font("Times New Roman", Font.BOLD, 23));
		comboBoxService.setBounds(237, 263, 210, 35);
		panel_2.add(comboBoxService);
		
		comboBoxTourism.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	final DefaultComboBoxModel health = new DefaultComboBoxModel(new String[]{"Please Select", "Cosmetic Surgery", "Dentistry", "Cardiac Surgery"});
		    	final DefaultComboBoxModel sport = new DefaultComboBoxModel(new String[]{"Please Select", "Snorkeling", "Kayaking", "Gym"});
		    	final DefaultComboBoxModel cultural = new DefaultComboBoxModel(new String[]{"Please Select", "Museums", "Historic sites", "Handicrafts"});
		    	
		        if (comboBoxTourism.getSelectedItem().equals("Health Tourism")){
		        	comboBoxService.setModel(health);
		            
		        	comboBoxService.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxService.getSelectedItem().equals("Cosmetic Surgery")) {
		    		    		textFieldPrice.setText(String.format("%.2f", HealthTourismReplacePrice.PriceComesticSurgery));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Dentistry")) {
		    		    		textFieldPrice.setText(String.format("%.2f", HealthTourismReplacePrice.PriceDentistry));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Cardiac Surgery")) {
		    		    		textFieldPrice.setText(String.format("%.2f", HealthTourismReplacePrice.PriceCardiacSurgery));
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxTourism.getSelectedItem().equals("Sport Tourism")){
		        	comboBoxService.setModel(sport);  
		        	
		        	comboBoxService.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxService.getSelectedItem().equals("Snorkeling")) {
		    		    		textFieldPrice.setText(String.format("%.2f", SportTourismReplacePrice.Snorkeling));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Kayaking")) {
		    		    		textFieldPrice.setText(String.format("%.2f", SportTourismReplacePrice.Kayaking));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Gym")) {
		    		    		textFieldPrice.setText(String.format("%.2f", SportTourismReplacePrice.Gym));
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxTourism.getSelectedItem().equals("Cultural Tourism")){
					comboBoxService.setModel(cultural);  
		        	
		        	comboBoxService.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxService.getSelectedItem().equals("Museums")) {
		    		    		textFieldPrice.setText(String.format("%.2f", CulturalTourismReplacePrice.Museums));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Historic sites")) {
		    		    		textFieldPrice.setText(String.format("%.2f", CulturalTourismReplacePrice.HistoricSites));
		    		    	}
		    		    	else if (comboBoxService.getSelectedItem().equals("Handicrafts")) {
		    		    		textFieldPrice.setText(String.format("%.2f", CulturalTourismReplacePrice.Handicrafts));
		    		    	}
		    		    }
		    		});
		        }
		    }
		});
	
		JLabel lblPrice = new JLabel("Price (RM)");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPrice.setBounds(43, 308, 137, 36);
		panel_2.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(282, 309, 82, 36);
		panel_2.add(textFieldPrice);
		
		JLabel lblPerPerson = new JLabel("per person");
		lblPerPerson.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPerPerson.setBounds(374, 308, 137, 36);
		panel_2.add(lblPerPerson);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblHour.setBounds(43, 354, 137, 36);
		panel_2.add(lblHour);
		
		textFieldHour = new JTextField();
		textFieldHour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldHour.setColumns(10);
		textFieldHour.setBounds(237, 355, 113, 36);
		panel_2.add(textFieldHour);
		
		JLabel lblHours = new JLabel("hour(s)");
		lblHours.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblHours.setBounds(362, 354, 113, 36);
		panel_2.add(lblHours);
		
		JLabel lblQuantity = new JLabel("Quantity Person");
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblQuantity.setBounds(43, 400, 184, 36);
		panel_2.add(lblQuantity);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double p = Double.parseDouble(textFieldPrice.getText());
					int h = Integer.parseInt(textFieldHour.getText());
					int q = Integer.parseInt(textFieldQuantity.getText());
					
					if (h >= 5) {
						double d = 0.2;
					
						textFieldDiscount.setText("20%");
						double Totalprice = p * q * h * (1 - d);
						textFieldTotalPrice.setText(String.format("%.2f", Totalprice));
					}
					else {
						textFieldDiscount.setText("-");
						textFieldTotalPrice.setText(String.format("%.2f", p));
					}
					
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the valid number");
				}
			}
		});
		textFieldQuantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(237, 401, 113, 36);
		panel_2.add(textFieldQuantity);
		
		JLabel lblPerson = new JLabel("person(s)");
		lblPerson.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPerson.setBounds(362, 400, 113, 36);
		panel_2.add(lblPerson);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblDiscount.setBounds(43, 450, 137, 36);
		panel_2.add(lblDiscount);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDiscount.setColumns(10);
		textFieldDiscount.setBounds(237, 451, 210, 36);
		panel_2.add(textFieldDiscount);
		
		JLabel lblTotalPrice = new JLabel("Total Price (RM)");
		lblTotalPrice.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalPrice.setBounds(43, 496, 184, 36);
		panel_2.add(lblTotalPrice);
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTotalPrice.setColumns(10);
		textFieldTotalPrice.setBounds(237, 497, 210, 36);
		panel_2.add(textFieldTotalPrice);
		
		JLabel lblRM = new JLabel("RM");
		lblRM.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRM.setBounds(237, 308, 45, 36);
		panel_2.add(lblRM);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPayment.setBounds(43, 542, 184, 36);
		panel_2.add(lblPayment);
		
		JRadioButton rdbtnCash = new JRadioButton("Cash/Online Banking");
		rdbtnCash.setActionCommand("Cash/Online Banking");
		payment.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnCash.setActionCommand("Male");
		rdbtnCash.setBounds(237, 544, 210, 36);
		panel_2.add(rdbtnCash);
		
		JRadioButton rdbtnCard = new JRadioButton("Debit/Credit Card");
		rdbtnCard.setActionCommand("Debit/Credit Card");
		payment.add(rdbtnCard);
		rdbtnCard.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnCard.setActionCommand("Male");
		rdbtnCard.setBounds(237, 582, 210, 36);
		panel_2.add(rdbtnCard);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(221, 160, 221));
		panel_3.setBounds(515, 33, 668, 351);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 648, 285);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "No. H/P", "Email", "Tourism", "Service", "Price (RM)", "Hour", "Quantity Person", "Discount", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Tourism Related Service\\Booking Form.txt");
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
						TotalIncome = 0;
						
						for(int i=0; i<model.getRowCount(); i++) {
							double income = Double.parseDouble(model.getValueAt(i, 9).toString());
							TotalIncome = income + TotalIncome;
						}
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpload.setBounds(249, 305, 157, 36);
		panel_3.add(btnUpload);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 23));
		
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						gender.getSelection().getActionCommand(),
						textFieldPhoneNum.getText(),
						textFieldEmail.getText(),
						comboBoxTourism.getSelectedItem(),
						comboBoxService.getSelectedItem(),
						textFieldPrice.getText(),
						textFieldHour.getText(),
						textFieldDiscount.getText(),
						textFieldTotalPrice.getText(),
						payment.getSelection().getActionCommand(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Booking Form",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnAddRecord.setBounds(623, 415, 157, 36);
		panel_2.add(btnAddRecord);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				gender.clearSelection();
				textFieldPhoneNum.setText("");
				textFieldEmail.setText("");
				comboBoxTourism.setSelectedItem("Please Select");
				comboBoxService.setSelectedItem("Please Select");
				textFieldPrice.setText("");
				textFieldHour.setText("");
				textFieldDiscount.setText("");
				textFieldTotalPrice.setText("");
				payment.clearSelection();
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnReset.setBounds(895, 415, 157, 36);
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
			    	model.setValueAt(textFieldPhoneNum.getText(), i, 2);
			    	model.setValueAt(textFieldEmail.getText(), i, 3);
			    	model.setValueAt(comboBoxTourism.getSelectedItem(), i, 4);
			    	model.setValueAt(comboBoxService.getSelectedItem(), i, 5);
			    	model.setValueAt(textFieldPrice.getText(), i, 6);
			    	model.setValueAt(textFieldHour.getText(), i, 7);
			    	model.setValueAt(textFieldDiscount.getText(), i, 8);
			    	model.setValueAt(textFieldTotalPrice.getText(), i, 9);
			    	model.setValueAt(payment.getSelection().getActionCommand(), i, 10);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnUpdate.setBounds(489, 472, 157, 36);
		panel_2.add(btnUpdate);
		
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
		btnPrint.setBounds(674, 472, 157, 36);
		panel_2.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete.",
								"Booking Form", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row you want to delete.",
								"Booking Form", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnDelete.setBounds(861, 472, 157, 36);
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
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(1042, 472, 157, 36);
		panel_2.add(btnExit);
		
	}
}
