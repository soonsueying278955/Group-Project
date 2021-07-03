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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class ElderlyPlay extends JFrame {

	private JPanel contentPane;
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
	private JLabel lblNewLabel_5_5;
	private JTextField txtPhoneNo2;
	private JButton btnClear;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnUpload;
	private JLabel lblNewLabel;
	private JButton btnReceipt;
	private double q;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElderlyPlay frame = new ElderlyPlay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ElderlyPlay() {
		initComponents();
	}
	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElderlyPlay.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 646);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 128, 128)));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.ORANGE);
		
		lblNewLabel = new JLabel("SENIORS PLAY");
		lblNewLabel.setIcon(new ImageIcon(ElderlyPlay.class.getResource("elderly.png")));
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 22));
		lblNewLabel.setBorder(null);
		
		//back button to advertise page
		btnNewButton = new JButton("");
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
		btnNewButton.setIcon(new ImageIcon(ElderlyPlay.class.getResource("back.png")));
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_1 = new JLabel("Please select");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel_5_2 = new JLabel("Quantity");
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnPTT = new JRadioButton("Petronas Twin Towers");
		buttonGroup.add(rdbtnPTT);
		rdbtnPTT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnStadthuys = new JRadioButton("Stadthuys");
		buttonGroup.add(rdbtnStadthuys);
		rdbtnStadthuys.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JRadioButton rdbtnKinabatanganRiver = new JRadioButton("Kinabatangan River");
		buttonGroup.add(rdbtnKinabatanganRiver);
		rdbtnKinabatanganRiver.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtQuantity = new JTextField();
		txtQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtQuantity.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtDate.setColumns(10);
		
		lblNewLabel_5_3 = new JLabel("Name");
		lblNewLabel_5_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtName.setColumns(10);
		
		lblNewLabel_5_4 = new JLabel("Phone No.1");
		lblNewLabel_5_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtPhoneNo1 = new JTextField();
		txtPhoneNo1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPhoneNo1.setColumns(10);
		
		lblNewLabel_5_5 = new JLabel("Phone No.2");
		lblNewLabel_5_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		txtPhoneNo2 = new JTextField();
		txtPhoneNo2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtPhoneNo2.setColumns(10);
		
		//button "Clear"
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDate.setText("");
				rdbtnPTT.setSelected(false);
				rdbtnStadthuys.setSelected(false);
				rdbtnKinabatanganRiver.setSelected(false);
				txtQuantity.setText("");
				txtPhoneNo1.setText("");
				txtPhoneNo2.setText("");
				txtName.setText("");
			}
		});
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				if (rdbtnPTT.isSelected()) {//petronas twin towers
					model.addRow(new Object[]{
							txtDate.getText(),
							"Petronas Twin Towers",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtPhoneNo2.getText(),
							txtName.getText(),
					});
				}
				else if (rdbtnStadthuys.isSelected()) {//stadthuys
					model.addRow(new Object[]{
							txtDate.getText(),
							"Stadthuys",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtPhoneNo2.getText(),
							txtName.getText(),
					});
				}
				else if (rdbtnKinabatanganRiver.isSelected()) {//kinabatangan river
					model.addRow(new Object[]{
							txtDate.getText(),
							"Kinabatangan River",
							txtQuantity.getText(),
							txtPhoneNo1.getText(),
							txtPhoneNo2.getText(),
							txtName.getText(),
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
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.LIGHT_GRAY);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Place", "Quantity", "Phone No.1", "Phone No.2", "Name"
			}
		));
		scrollPane.setViewportView(table);
		
		//button "Remove"
		btnRemove = new JButton("Remove");
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
		
		//export details
		btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Promotions Details(Elderly).txt");
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
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnUpload.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpload.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnRemove, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
							.addGap(14)
							.addComponent(btnUpload, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
					.addGap(8)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRemove, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		panel_2.setLayout(gl_panel_2);
		
		//button "Reciept"
		btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					q = Double.parseDouble(txtQuantity.getText());
					
					if (rdbtnPTT.isSelected()) {//petronas twin towers
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: "+ txtDate.getText()+ "\n") 
								+ String.format("Place: Petronas Twin Towers\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Phone No.(2): " + txtPhoneNo2.getText() +"\n")
								+ String.format("Total Price: Free");
						
						JOptionPane.showMessageDialog(null,message);
					}
					else if (rdbtnStadthuys.isSelected()) {//stadthuys
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: " + txtDate.getText() + "\n") 
								+ String.format("Place: Stadthuys\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Phone No.(2): " + txtPhoneNo2.getText() + "\n")
								+ String.format("Total Price: Free");
						
						JOptionPane.showMessageDialog(null,message);
					}
					else if (rdbtnKinabatanganRiver.isSelected()) {//kinabatangan river
						String message = String.format("\t\tReciept\n") 
								+ String.format("Date: " + txtDate.getText() + "\n") 
								+ String.format("Place: Kinabatangan River\n")
								+ String.format("Quantity: " + txtQuantity.getText() + "\n")
								+ String.format("Name: " + txtName.getText() + "\n")
								+ String.format("Phone No.(1): " + txtPhoneNo1.getText() + "\n")
								+ String.format("Phone No.(2): " + txtPhoneNo2.getText() + "\n")
								+ String.format("Total Price: Free");
						
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(47)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
					.addGap(49))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(68)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(rdbtnPTT, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(117)
					.addComponent(rdbtnStadthuys, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(117)
					.addComponent(rdbtnKinabatanganRiver, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(lblNewLabel_5_2)
					.addGap(6)
					.addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(58)
					.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNewLabel_5_4)
					.addGap(6)
					.addComponent(txtPhoneNo1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNewLabel_5_5)
					.addGap(6)
					.addComponent(txtPhoneNo2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnPTT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addComponent(rdbtnStadthuys, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(rdbtnKinabatanganRiver, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtPhoneNo1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPhoneNo2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(btnReceipt, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addGap(114))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btnReceipt, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}
