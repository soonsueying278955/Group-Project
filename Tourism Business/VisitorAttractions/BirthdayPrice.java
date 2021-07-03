package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class BirthdayPrice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JPanel panel;
	private JPanel panel_2;
	private JTable table;
	private JTextField txtQuantity;
	private JTextField txtDate;
	private JLabel lblNewLabel_5_3;
	private JTextField txtName;
	private JLabel lblNewLabel_5_4;
	private JTextField txtPhoneNo1;
	private JTextField txtTotalPrice;
	private JButton btnClear;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnUpload;
	private JButton btnReceipt;
	private double totalPrice, q;
	private String totalPriceF, priceFromColumn;
	private JLabel lblNewLabel_5_6;
	private JButton btnTotalPrice;
	private JTable table_1;
	private Object[] tableLines;
	private String[] columnPrice;
	private String[] dataRow;
	private JTextField txtPetronasTwinTowers;
	private JScrollPane scrollPane_2;
	private JTable tableT;
	private JTextField txtTemp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BirthdayPrice frame = new BirthdayPrice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BirthdayPrice() {
		initComponents();
	}

	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BirthdayPrice.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 711);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 128, 128)));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 48, 362, 77);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.PINK);
		
		textField = new JTextField();
		textField.setBounds(70, 0, 148, 44);
		textField.setText("birthday");
		textField.setForeground(Color.MAGENTA);
		textField.setFont(new Font("DengXian Light", Font.BOLD | Font.ITALIC, 36));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.PINK);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 36, 127, 41);
		textField_1.setText("special!");
		textField_1.setForeground(Color.MAGENTA);
		textField_1.setFont(new Font("DengXian Light", Font.BOLD | Font.ITALIC, 36));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.PINK);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(156, 0, 48, 44);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(289, 22, 41, 49);
		lblNewLabel_2.setIcon(new ImageIcon(BirthdayPrice.class.getResource("balloon.png")));
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 22, 50, 49);
		lblNewLabel_3.setIcon(new ImageIcon(BirthdayPrice.class.getResource("normalB.png")));
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(316, 0, 41, 49);
		lblNewLabel_4.setIcon(new ImageIcon(BirthdayPrice.class.getResource("balloon.png")));
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 10, 48, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertise frame = new Advertise();
				frame.setVisible(true);
				dispose(); 
			
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setIcon(new ImageIcon(BirthdayPrice.class.getResource("back.png")));
		
		panel = new JPanel();
		panel.setBounds(26, 361, 362, 297);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.PINK));
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setBounds(73, 13, 43, 22);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_1 = new JLabel("Please select");
		lblNewLabel_5_1.setBounds(10, 44, 106, 22);
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_2 = new JLabel("Quantity");
		lblNewLabel_5_2.setBounds(46, 127, 70, 26);
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnPTT = new JRadioButton("Petronas Twin Towers");
		rdbtnPTT.setBounds(122, 44, 227, 24);
		rdbtnPTT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnStadthuys = new JRadioButton("Stadthuys");
		rdbtnStadthuys.setBounds(122, 70, 228, 24);
		rdbtnStadthuys.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnKinabatanganRiver = new JRadioButton("Kinabatangan River");
		rdbtnKinabatanganRiver.setBounds(122, 96, 229, 24);
		rdbtnKinabatanganRiver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(122, 127, 63, 25);
		txtQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtQuantity.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(122, 10, 136, 25);
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtDate.setColumns(10);
		
		lblNewLabel_5_3 = new JLabel("Name");
		lblNewLabel_5_3.setBounds(63, 158, 53, 25);
		lblNewLabel_5_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtName = new JTextField();
		txtName.setBounds(122, 158, 222, 25);
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtName.setColumns(10);
		
		lblNewLabel_5_4 = new JLabel("Phone No.1");
		lblNewLabel_5_4.setBounds(21, 193, 95, 25);
		lblNewLabel_5_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtPhoneNo1 = new JTextField();
		txtPhoneNo1.setBounds(122, 191, 160, 25);
		txtPhoneNo1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPhoneNo1.setColumns(10);
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setBorder(null);
		txtTotalPrice.setBackground(Color.LIGHT_GRAY);
		txtTotalPrice.setBounds(155, 225, 127, 25);
		txtTotalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalPrice.setColumns(10);
		
		//button "Clear"
		btnClear = new JButton("Clear");
		btnClear.setBounds(10, 260, 106, 26);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDate.setText("");
				rdbtnPTT.setSelected(false);
				rdbtnStadthuys.setSelected(false);
				rdbtnKinabatanganRiver.setSelected(false);
				txtQuantity.setText("");
				txtPhoneNo1.setText("");
				txtTotalPrice.setText("");
				txtName.setText("");
			}
		});
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		panel_2 = new JPanel();
		panel_2.setBounds(26, 131, 362, 220);
		panel_2.setBackground(Color.PINK);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 342, 79);
		scrollPane.setBackground(Color.LIGHT_GRAY);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Place", "Quantity", "Phone No.1", "Name", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		btnRemove = new JButton("Remove");
		btnRemove.setBounds(10, 97, 164, 26);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null,"No data to remove",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnRemove.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnRemove.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRemove.setBackground(Color.LIGHT_GRAY);
		
		btnUpload = new JButton("Upload");
		btnUpload.setBounds(188, 97, 164, 26);
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declaration
				double sum = 0;
				//get the sum of the 6th column
				for(int i = 0; i < table.getRowCount(); i++){
				    sum += Double.parseDouble(table.getValueAt(i, 5).toString());    
				}
				//convert double to string
				String sumF = Double.toString(sum);
				txtTemp.setText(sumF);
				
				DefaultTableModel model = (DefaultTableModel) tableT.getModel();	
				model.addRow(new Object[]{
						txtTemp.getText(),
				});
				if (tableT.getSelectedRow() == -1) {
					if (tableT.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "0");
					}
				}
				//export details 
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Promotions Details(Birthday).txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Customers' Records");
					bw.write("\n---------------------------------------------------------------------------------------------------------------------------------------\n");
					for (int i = 0; i < table.getRowCount(); i++) {
						bw.write((i+1) + ".     ");
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "\t  ");
							}
						bw.write("\n---------------------------------------------------------------------------------------------------------------------------------------\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				//export total income for promotion 
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\PromotionIncome.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i = 0; i < tableT.getRowCount(); i++) {
						for (int j = 0; j < tableT.getColumnCount(); j++) {
							bw.write(tableT.getModel().getValueAt(i, j) + "\t  ");
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
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnUpload.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpload.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 157, 342, 24);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(122, 189, 120, 21);
		
		//import price of tickets
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Price.txt";
				File file = new File(filePath);
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String firstLine = br.readLine().trim();
					columnPrice = firstLine.split("   ");
					DefaultTableModel model = (DefaultTableModel)table_1.getModel();
					model.setColumnIdentifiers(columnPrice);
					
					tableLines = br.lines().toArray();
					
					for(int i = 0; i < tableLines.length; i++) {
						String line = tableLines[i].toString().trim();
						dataRow = line.split(" ");
						model.addRow(dataRow);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		contentPane.setLayout(null);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(textField);
		panel_1.add(textField_1);
		panel_1.add(lblNewLabel_1);
		panel_1.add(lblNewLabel_2);
		panel_1.add(lblNewLabel_3);
		panel_1.add(lblNewLabel_4);
		contentPane.add(btnNewButton);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_5_1);
		panel.add(lblNewLabel_5_2);
		panel.add(rdbtnPTT);
		panel.add(rdbtnStadthuys);
		panel.add(rdbtnKinabatanganRiver);
		panel.add(txtQuantity);
		panel.add(txtDate);
		panel.add(lblNewLabel_5_3);
		panel.add(txtName);
		panel.add(lblNewLabel_5_4);
		panel.add(txtPhoneNo1);
		panel.add(txtTotalPrice);
		panel.add(btnClear);
		
		lblNewLabel_5_6 = new JLabel("RM");
		lblNewLabel_5_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_5_6.setBounds(122, 225, 32, 25);
		panel.add(lblNewLabel_5_6);
		
		//calculate total price
		btnTotalPrice = new JButton("Total Price");
		btnTotalPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//convert string to integer
				int quan = Integer.parseInt(txtQuantity.getText());
				
				if (rdbtnPTT.isSelected()) {//petronas twin towers
					//get price of petronas twin towers's ticket
					priceFromColumn = columnPrice[0];
					//convert string to double
					double price = Double.parseDouble(priceFromColumn);
					double total = quan * (price * 4);
					//convert double to string
					String totalF = String.valueOf(total);
					txtTotalPrice.setText(totalF);	
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
					//get price of stadthuys's ticket 
					priceFromColumn = columnPrice[1];
					//convert string to double
					double price = Double.parseDouble(priceFromColumn);
					double total = quan * (price * 4);
					//convert double to string
					String totalF = String.valueOf(total);
					txtTotalPrice.setText(totalF);
				}
				else if (rdbtnKinabatanganRiver.isSelected()) {//kinabatangan river
					//get price of kinabatangan river's price
					priceFromColumn = columnPrice[2];
					//convert string to double
					double price = Double.parseDouble(priceFromColumn);
					double total = quan * (price * 4);
					//convert double to string
					String totalF = String.valueOf(total);
					txtTotalPrice.setText(totalF);
				}	
			}
		});
		btnTotalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnTotalPrice.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTotalPrice.setBackground(Color.LIGHT_GRAY);
		btnTotalPrice.setBounds(10, 225, 106, 26);
		panel.add(btnTotalPrice);
		
		btnReceipt = new JButton("Receipt");
		btnReceipt.setBounds(132, 260, 95, 26);
		panel.add(btnReceipt);
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					q = Double.parseDouble(txtQuantity.getText());
					
					if (rdbtnPTT.isSelected()) {//petronas twin towers
						//set total price 
						totalPrice = q * (219.99 * 4);
						//2 decimal points
						totalPriceF = String.format("%.2f", totalPrice);
						
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: "+ txtDate.getText()+ "\n") 
								+ String.format("Place: Petronas Twin Towers\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Total Price: RM " + totalPriceF);
						
						JOptionPane.showMessageDialog(null,message);
					}
					else if (rdbtnStadthuys.isSelected()) {//stadthuys
						//set total price 
						totalPrice = q * (109.99 * 4);
						//2 decimal points
						totalPriceF = String.format("%.2f", totalPrice);
						
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: " + txtDate.getText() + "\n") 
								+ String.format("Place: Stadthuys\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Total Price: RM " + totalPriceF);
						
						JOptionPane.showMessageDialog(null,message);
					}
					else if (rdbtnKinabatanganRiver.isSelected()) {//kinabatangan river
						//set total price 
						totalPrice = q * (79.99 * 4);
						//2 decimal points
						totalPriceF = String.format("%.2f", totalPrice);
						
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: " + txtDate.getText() + "\n") 
								+ String.format("Place: Kinabatangan River\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Total Price: RM " + totalPriceF);
						
						JOptionPane.showMessageDialog(null,message);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error");		
				}
	
			}
		});
		btnReceipt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReceipt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReceipt.setBackground(Color.LIGHT_GRAY);
		
		//button "Add"
		btnAdd = new JButton("Add");
		btnAdd.setBounds(244, 260, 105, 26);
		panel.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				if (rdbtnPTT.isSelected()) {//petronas twin towers
					model.addRow(new Object[]{
							txtDate.getText(),
							"Petronas Twin Towers",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtName.getText(),
							txtTotalPrice.getText()
					});
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
					model.addRow(new Object[]{
							txtDate.getText(),
							"Stadthuys",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtName.getText(),
							txtTotalPrice.getText()
					});
				}
				else if (rdbtnKinabatanganRiver.isSelected()) {//kinabatangan river
					model.addRow(new Object[]{
							txtDate.getText(),
							"Kinabatangan River",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtName.getText(),
							txtTotalPrice.getText()
					});
				}
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(scrollPane);
		panel_2.add(btnRemove);
		panel_2.add(btnUpload);
		panel_2.add(scrollPane_1);
		panel_2.add(btnNewButton_1);
		
		txtPetronasTwinTowers = new JTextField();
		txtPetronasTwinTowers.setBorder(null);
		txtPetronasTwinTowers.setBackground(Color.PINK);
		txtPetronasTwinTowers.setText("  Petronas Twin Towers      Satadthuys      Kinabatangan River");
		txtPetronasTwinTowers.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtPetronasTwinTowers.setBounds(10, 133, 342, 24);
		panel_2.add(txtPetronasTwinTowers);
		txtPetronasTwinTowers.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.setBackground(Color.LIGHT_GRAY);
		scrollPane_2.setBounds(280, 17, 0, 0);
		contentPane.add(scrollPane_2);
		
		tableT = new JTable();
		tableT.setForeground(Color.LIGHT_GRAY);
		tableT.setBackground(Color.LIGHT_GRAY);
		tableT.setBorder(null);
		tableT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				""
			}
		));
		scrollPane_2.setViewportView(tableT);
		
		txtTemp = new JTextField();
		txtTemp.setBorder(null);
		txtTemp.setBounds(214, 19, 21, 19);
		contentPane.add(txtTemp);
		txtTemp.setForeground(Color.LIGHT_GRAY);
		txtTemp.setBackground(Color.LIGHT_GRAY);
		txtTemp.setColumns(10);	
	}
}
