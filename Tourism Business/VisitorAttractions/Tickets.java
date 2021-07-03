package VisitorAttractions;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tickets extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtName;
	private JTextField txtPhoneNo;
	private JTextField txtBookingNo;
	private JTextField txtTPrice;
	private JTextField txtDate;
	private JTextField txtMemID;
	private final ButtonGroup bGPlace = new ButtonGroup();
	protected int option;
	protected double price, p, totalPrice;
	private int q;
	private JTextField txtQuantity;
	private JComboBox comboBox;
	private String ans, totalPriceF;
	private String uDate, uBookingNo, uCombo, uMemID, uPlace, uQuantity, uPhone1, uName, uTotalPrice;
	private JPanel panel;
	private JTextField txtPrice;
	private JButton btnNewButton_3;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private String pricePTTF, priceSF, priceKRF;
	private Object[] tableLines;
	private String[] columnPrice;
	private String[] dataRow;
	private JButton btnRefresh;
	private JTextField txtTemp;
	private JTable tableT;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tickets frame = new Tickets();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	
	public Tickets() {
		initComponents();
	}
	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tickets.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 662);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1 = new JLabel("Please select");
		lblNewLabel_1.setBounds(59, 172, 115, 24);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantity");
		lblNewLabel_1_1.setBounds(386, 201, 78, 24);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		
		
		JRadioButton rdbtnPetronas = new JRadioButton("Petronas Twin Towers");
		rdbtnPetronas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pricePTTF = columnPrice[0];
				txtPrice.setText(pricePTTF);
			}
		});
		rdbtnPetronas.setBounds(180, 171, 226, 26);
		bGPlace.add(rdbtnPetronas);
		rdbtnPetronas.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JRadioButton rdbtnStadthuys = new JRadioButton("Stadthuys");
		rdbtnStadthuys.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				priceSF = columnPrice[1];
				txtPrice.setText(priceSF);
			}
		});
		rdbtnStadthuys.setBounds(418, 171, 117, 26);
		bGPlace.add(rdbtnStadthuys);
		rdbtnStadthuys.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JRadioButton rdbtnKinabatangan = new JRadioButton("Kinabatangan River");
		rdbtnKinabatangan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				priceKRF = columnPrice[2];
				txtPrice.setText(priceKRF);
				
			}
		});
		rdbtnKinabatangan.setBounds(546, 171, 204, 26);
		bGPlace.add(rdbtnKinabatangan);
		rdbtnKinabatangan.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setBounds(121, 230, 60, 24);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtName = new JTextField();
		txtName.setBounds(180, 229, 327, 26);
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtName.setColumns(10);
		
		JLabel lblPhone = new JLabel(" Contact Number");
		lblPhone.setBounds(25, 261, 156, 24);
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setBounds(180, 259, 213, 26);
		txtPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtPhoneNo.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Booking No.");
		lblNewLabel_1_1_1_2.setBounds(566, 203, 115, 24);
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtBookingNo = new JTextField();
		txtBookingNo.setBounds(688, 200, 166, 26);
		txtBookingNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtBookingNo.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBounds(74, 295, 249, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDate.setText("");
				txtBookingNo.setText("");
				comboBox.setSelectedIndex(-1);
				txtMemID.setText("");
				rdbtnPetronas.setSelected(false);
				rdbtnStadthuys.setSelected(false);
				rdbtnKinabatangan.setSelected(false);
				txtQuantity.setText("");;
				txtName.setText("");
				txtPhoneNo.setText("");
				txtTPrice.setText("");
			}
		});
		
		
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(344, 295, 249, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				if (rdbtnPetronas.isSelected()) {//petronas twin towers
					model.addRow(new Object[]{
							txtDate.getText(),
							txtBookingNo.getText(),
							comboBox.getSelectedItem(),
							txtMemID.getText(),
							"Petronas Twin Towers",
							txtQuantity.getText(),
							txtPhoneNo.getText(),
							txtName.getText(),
							totalPriceF
					});
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
					model.addRow(new Object[]{
							txtDate.getText(),
							txtBookingNo.getText(),
							comboBox.getSelectedItem(),
							txtMemID.getText(),
							"Stadthuys           ",
							txtQuantity.getText(),
							txtPhoneNo.getText(),
							txtName.getText(),
							totalPriceF
					});
				}
				else if (rdbtnKinabatangan.isSelected()) {//kinabatangan river
					model.addRow(new Object[]{
							txtDate.getText(),
							txtBookingNo.getText(),
							comboBox.getSelectedItem(),
							txtMemID.getText(),
							"Kinabatangan River  ",
							txtQuantity.getText(),
							txtPhoneNo.getText(),
							txtName.getText(),
							totalPriceF
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
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblTPrice = new JLabel("RM");
		lblTPrice.setBounds(715, 261, 35, 24);
		lblTPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtTPrice = new JTextField();
		txtTPrice.setBackground(Color.LIGHT_GRAY);
		txtTPrice.setBorder(null);
		txtTPrice.setBounds(752, 259, 134, 30);
		txtTPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtTPrice.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Date");
		lblNewLabel_1_1_1_1_2.setBounds(130, 142, 51, 24);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtDate = new JTextField();
		txtDate.setBounds(180, 140, 115, 26);
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtDate.setColumns(10);
		
		JButton btnNewButton_1_2 = new JButton("Receipt");
		btnNewButton_1_2.setBounds(617, 295, 249, 33);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
						try {
							
							if (rdbtnPetronas.isSelected()) {//petronas twin towers
								String message;
								if (comboBox.getSelectedItem() == "Yes") {//got membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: "+ txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Petronas Twin Towers\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: Yes\n")
											+ String.format("Membership ID: " + txtMemID.getText() + "\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF +"\n");
								}
								else {//no membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: "+ txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Petronas Twin Towers\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: No\n")
											+ String.format("Membership ID: -\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF +"\n");
								}
								
								JOptionPane.showMessageDialog(null,message);
							}
							else if (rdbtnStadthuys.isSelected()) {//stadthuys
								String message;
								if (comboBox.getSelectedItem() == "Yes") {//got membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: " + txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Stadthuys\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: Yes\n")
											+ String.format("Membership ID: " + txtMemID.getText() + "\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF + "\n");
								}
								else {//no membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: " + txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Stadthuys\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: No\n")
											+ String.format("Membership ID: -\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF + "\n");
								}
								
								JOptionPane.showMessageDialog(null,message);
							}
							else if (rdbtnKinabatangan.isSelected()) {//kinabatangan river
								String message;
								if (comboBox.getSelectedItem() == "Yes") {//got membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: " + txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Kinabantangan River\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")				
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: Yes\n")
											+ String.format("Membership ID: " + txtMemID.getText() + "\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF + "\n");
								}
								else {//no membership
									message = String.format("\t\tReciept\n") 
											+ String.format("Date: " + txtDate.getText() + "\n") 
											+ String.format("Booking No.: " + txtBookingNo.getText() + "\n") 
											+ String.format("Place: Kinabantangan River\n")
											+ String.format("Quantity: " + txtQuantity.getText() + "\n")				
											+ String.format("Name: " + txtName.getText() + "\n")
											+ String.format("Membership: No\n")
											+ String.format("Membership ID: -\n")
											+ String.format("Contact Number: " + txtPhoneNo.getText() + "\n")
											+ String.format("Total Price: RM " + totalPriceF + "\n");
								}
								JOptionPane.showMessageDialog(null, message);
							}
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Error");		
						}
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		
		txtMemID = new JTextField();
		txtMemID.setBounds(698, 140, 156, 26);
		txtMemID.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtMemID.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Membership ID");
		lblNewLabel_1_1_1_1_2_1_1.setBounds(549, 142, 139, 24);
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblNewLabel_1_1_1_1_2_1_2 = new JLabel("Membership");
		lblNewLabel_1_1_1_1_2_1_2.setBounds(330, 142, 115, 24);
		lblNewLabel_1_1_1_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "No")
					txtMemID.setText("-");	
				else
					txtMemID.setText("");
			}
		});
		comboBox.setBounds(445, 140, 65, 26);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "Yes", "No"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(470, 201, 50, 26);
		txtQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtQuantity.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(txtDate);
		panel_1.add(lblNewLabel_1_1_1_1_2);
		panel_1.add(lblNewLabel_1_1_1_1_2_1_2);
		panel_1.add(comboBox);
		panel_1.add(lblNewLabel_1_1_1_1_2_1_1);
		panel_1.add(txtMemID);
		panel_1.add(lblNewLabel_1);
		panel_1.add(rdbtnPetronas);
		panel_1.add(rdbtnStadthuys);
		panel_1.add(rdbtnKinabatangan);
		panel_1.add(lblNewLabel_1_1);
		panel_1.add(txtQuantity);
		panel_1.add(lblNewLabel_1_1_1_2);
		panel_1.add(txtBookingNo);
		panel_1.add(txtName);
		panel_1.add(lblNewLabel_1_1_1);
		panel_1.add(lblPhone);
		panel_1.add(txtPhoneNo);
		panel_1.add(txtTPrice);
		panel_1.add(lblTPrice);
		panel_1.add(btnNewButton);
		panel_1.add(btnNewButton_1);
		panel_1.add(btnNewButton_1_2);
		
		JLabel lblPriceRM = new JLabel(" Price  RM");
		lblPriceRM.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblPriceRM.setBounds(121, 201, 105, 24);
		panel_1.add(lblPriceRM);
		
		txtPrice = new JTextField();
		txtPrice.setBorder(null);
		txtPrice.setBackground(Color.LIGHT_GRAY);
		txtPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtPrice.setColumns(10);
		txtPrice.setBounds(220, 201, 115, 24);
		panel_1.add(txtPrice);
		
		btnNewButton_3 = new JButton("Total Price");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				q = Integer.parseInt(txtQuantity.getText());
				
				if (rdbtnPetronas.isSelected()) {//petronas twin towers
					double pricePTT = Double.parseDouble(pricePTTF);
					
					if (comboBox.getSelectedItem() == "Yes") {//got membership
						Member pBM = new MemberPriceRate();
						double m = pBM.pBMemPrice();
						totalPrice = pricePTT * (1 - m) * q;
					}
					else {//no membership
						totalPrice = pricePTT * q;
					}
					//2 decimal points
					totalPriceF = String.format("%.2f", totalPrice);
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
					double priceS = Double.parseDouble(priceSF);
					
					if (comboBox.getSelectedItem() == "Yes") {//got membership
						Member hBM = new MemberPriceRate();
						double m = hBM.hMemPrice();
						totalPrice = priceS * (1 - m) * q;
					}
					else {//no memberhip
						totalPrice = priceS * q;
					}
					//2 decimal points
					totalPriceF = String.format("%.2f", totalPrice);
				}
				else if (rdbtnKinabatangan.isSelected()) {//kinabatangan river
					double priceKR = Double.parseDouble(priceKRF);
					
					if (comboBox.getSelectedItem() == "Yes") {//got membership
						Member nBM = new MemberPriceRate();
						double m = nBM.nMemPrice();
						totalPrice = priceKR * (1 - m) * q;
					}
					else {//no membership
						totalPrice = priceKR * q;
					}
					//2 decimal points
					totalPriceF = String.format("%.2f", totalPrice);
				}
				txtTPrice.setText(totalPriceF);	
			}
		});
		btnNewButton_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(557, 259, 148, 30);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 10, 889, 79);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 47, 869, 21);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		panel_4.setBounds(10, 10, 286, 28);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Petronas Twin Towers");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(39, 0, 214, 26);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.ORANGE);
		panel_4_1.setBounds(301, 9, 286, 28);
		panel_2.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Stadthuys");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(103, 0, 97, 26);
		panel_4_1.add(lblNewLabel_2_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(Color.CYAN);
		panel_4_1_1.setBounds(593, 9, 286, 28);
		panel_2.add(panel_4_1_1);
		panel_4_1_1.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Kinabatangan River");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_2.setBounds(51, 0, 198, 26);
		panel_4_1_1.add(lblNewLabel_2_2);
		
		txtTemp = new JTextField();
		txtTemp.setBorder(null);
		txtTemp.setBackground(Color.LIGHT_GRAY);
		txtTemp.setForeground(Color.LIGHT_GRAY);
		txtTemp.setBounds(888, 146, 24, 21);
		panel_1.add(txtTemp);
		txtTemp.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBackground(Color.LIGHT_GRAY);
		scrollPane_2.setForeground(Color.WHITE);
		scrollPane_2.setBounds(757, 140, 0, 0);
		panel_1.add(scrollPane_2);
		
		tableT = new JTable();
		tableT.setForeground(Color.LIGHT_GRAY);
		tableT.setBorder(null);
		tableT.setBackground(Color.LIGHT_GRAY);
		tableT.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column"
			}
		));
		scrollPane_2.setViewportView(tableT);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(386, 99, 166, 26);
		panel_1.add(btnRefresh);
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//import price of tickets
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
		btnRefresh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnRefresh.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRefresh.setBackground(Color.DARK_GRAY);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 917, 129);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Booking No.", "Membership", "Member ID", "Place", "Quantity", "Contact Number", "Name", "Total Price"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, false, true, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(101);
		table.getColumnModel().getColumn(5).setPreferredWidth(65);
		table.getColumnModel().getColumn(6).setPreferredWidth(104);
		table.getColumnModel().getColumn(7).setPreferredWidth(122);
		table.getColumnModel().getColumn(8).setPreferredWidth(104);
		scrollPane.setViewportView(table);
		
		JButton btnDelete = new JButton("Remove");
		btnDelete.setBounds(20, 149, 279, 33);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null,"No data to remove",
								"GK Visitor Attraction System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"GK Visitor Attraction System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDelete.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton_1_1 = new JButton("Export");
		btnNewButton_1_1.setBounds(634, 149, 279, 33);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declaration
				double sum = 0;
				//calculate total ticket income
				for(int i = 0; i < table.getRowCount(); i++){//For each row
				    sum += Double.parseDouble(table.getValueAt(i, 8).toString());
				    
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
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Customer Details.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("Customers' Records");
					bw.write("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
					for (int i = 0; i < table.getRowCount(); i++) {
						bw.write((i+1) + ".     ");
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "\t  ");
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
				//export total ticket income
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\TicketsIncome.txt");
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
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		panel_3.add(scrollPane);
		panel_3.add(btnDelete);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Edit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRowCount() == 1) {
					if (rdbtnPetronas.isSelected()) {//petronas twin towers
					uDate = txtDate.getText();
					uBookingNo = txtBookingNo.getText();
					uCombo = (String) comboBox.getSelectedItem();
					uMemID = txtMemID.getText();
					uPlace = "Petronas Twin Towers";
					uQuantity = txtQuantity.getText();
					uPhone1 = txtPhoneNo.getText();
					uName = txtName.getText();
					uTotalPrice = totalPriceF;
					
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
						uDate = txtDate.getText();
						uBookingNo = txtBookingNo.getText();
						uCombo = (String) comboBox.getSelectedItem();
						uMemID = txtMemID.getText();
						uPlace = "Stadthuys           ";
						uQuantity = txtQuantity.getText();
						uPhone1 = txtPhoneNo.getText();
						uName = txtName.getText();
						uTotalPrice = totalPriceF;
				}
				else if (rdbtnKinabatangan.isSelected()) {//kinabatangan river
						uDate = txtDate.getText();
						uBookingNo = txtBookingNo.getText();
						uCombo = (String) comboBox.getSelectedItem();
						uMemID = txtMemID.getText();
						uPlace = "Kinabatangan River  ";
						uQuantity = txtQuantity.getText();
						uPhone1 = txtPhoneNo.getText();
						uName = txtName.getText();
						uTotalPrice = totalPriceF;
				}
					model.setValueAt(uDate, table.getSelectedRow(), 0);				
					model.setValueAt(uBookingNo, table.getSelectedRow(), 1);
					model.setValueAt(uCombo, table.getSelectedRow(), 2);
					model.setValueAt(uMemID, table.getSelectedRow(), 3);
					model.setValueAt(uPlace, table.getSelectedRow(), 4);
					model.setValueAt(uQuantity, table.getSelectedRow(), 5);
					model.setValueAt(uPhone1, table.getSelectedRow(), 6);
					model.setValueAt(uName, table.getSelectedRow(), 7);
					model.setValueAt(uTotalPrice, table.getSelectedRow(), 8);
					
					JOptionPane.showMessageDialog(null, "Edit Successful") ;
				} else {
					if(table.getRowCount() == 0) 
						JOptionPane.showMessageDialog(null, "Table is empty") ;
					else 
						JOptionPane.showMessageDialog(null, "Please select a single row to edit") ;	
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(327, 149, 279, 33);
		panel_3.add(btnNewButton_1_1_1);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Center");
		lblNewLabel.setBounds(367, 0, 258, 51);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		//back to main page
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Tickets.class.getResource("back.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					MainPage frame = new MainPage();
					frame.setVisible(true);
					dispose();
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(0, 0, 51, 41);
		panel.add(btnNewButton_2);

		contentPane.setLayout(gl_contentPane);
	}
}
