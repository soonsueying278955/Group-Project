package TravelAndTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Customer_bookTravel extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField ageText;
	private JTextField followerText;
	private JTextField totalPrice;
	private JTextField contactNo;
	private JTextField surnameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_bookTravel frame = new Customer_bookTravel();
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
	public Customer_bookTravel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("small-axe.png")));
		setTitle("Book Travel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 491);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About Company");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackGround_Guest frame = new CompanyBackGround_Guest();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Home");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuestHome home = new GuestHome();
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		panel.setBounds(0, 0, 770, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(22, 25, 295, 374);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 22, 75, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(10, 110, 75, 26);
		panel_1.add(lblAge);
		
		JLabel lblSelectPackage = new JLabel("Select Package:");
		lblSelectPackage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelectPackage.setBounds(10, 202, 152, 26);
		panel_1.add(lblSelectPackage);
		
		JLabel lblNoFollowers = new JLabel("No. followers:");
		lblNoFollowers.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNoFollowers.setBounds(10, 289, 152, 26);
		panel_1.add(lblNoFollowers);
		
		nameText = new JTextField();
		nameText.setBounds(95, 22, 163, 26);
		panel_1.add(nameText);
		nameText.setColumns(10);
		
		ageText = new JTextField();
		ageText.setColumns(10);
		ageText.setBounds(95, 117, 163, 26);
		panel_1.add(ageText);
		
		followerText = new JTextField();
		followerText.setColumns(10);
		followerText.setBounds(147, 289, 111, 26);
		panel_1.add(followerText);
		
		JComboBox cbPackage = new JComboBox();
		cbPackage.setFont(new Font("Tahoma", Font.BOLD, 16));
		cbPackage.setModel(new DefaultComboBoxModel(new String[] {"Select:", "1", "2", "3"}));
		cbPackage.setBounds(172, 208, 86, 21);
		panel_1.add(cbPackage);
		
		JLabel lblSur = new JLabel("Sur:");
		lblSur.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSur.setBounds(10, 58, 75, 26);
		panel_1.add(lblSur);
		
		surnameText = new JTextField();
		surnameText.setColumns(10);
		surnameText.setBounds(95, 65, 163, 26);
		panel_1.add(surnameText);
		
		JButton btnCustomer = new JButton("Book Travel");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(followerText.getText());
				double price, discount;
				if(cbPackage.getSelectedItem() == "1") {
					Payment p1 = new PriceRateOne();
					if(num1 <=4) {
						price = p1.Price() * num1;
                        totalPrice.setText(Double.toString(price));
					}else {
						Discount d = new DiscountRate();
						discount = d.discountRate();
						price = p1.totalPrice(discount)*num1;
                        totalPrice.setText(Double.toString(price));
					}
					contactNo.setText("+60123456789");
				}else if(cbPackage.getSelectedItem() == "2") {
					Payment p1 = new PriceRateTwo();
					if(num1 <=4) {
						price = p1.Price() * num1;
						totalPrice.setText(Double.toString(price));
					}else {
						Discount d = new DiscountRate();
						discount = d.discountRate();
						price = p1.totalPrice(discount)*num1;
                        totalPrice.setText(Double.toString(price));
					}
					contactNo.setText("+60195511278");
				}else if(cbPackage.getSelectedItem() == "3") {
					Payment p1 = new PriceRateThree();
					if(num1 <=4) {
						price = p1.Price() * num1;
						totalPrice.setText(Double.toString(price));
					}else {
						Discount d = new DiscountRate();
						discount = d.discountRate();
						price = p1.totalPrice(discount)*num1;
                        totalPrice.setText(Double.toString(price));
					}
					contactNo.setText("+60125082177");
				}
				
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnCustomer.setBounds(345, 347, 165, 52);
		panel.add(btnCustomer);
		
		JButton btnViewPackage = new JButton("Print");
		btnViewPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printRecord(panel);
			}
		});
		btnViewPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnViewPackage.setBounds(542, 347, 179, 52);
		panel.add(btnViewPackage);
		
		JLabel lblTotalPricerm = new JLabel("Total Price (RM):");
		lblTotalPricerm.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalPricerm.setBounds(374, 73, 158, 26);
		panel.add(lblTotalPricerm);
		
		JLabel lblContactNo = new JLabel("Contact no:");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContactNo.setBounds(374, 159, 119, 26);
		panel.add(lblContactNo);
		
		JLabel lblTourGuide = new JLabel("Tour Guide");
		lblTourGuide.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTourGuide.setBounds(374, 134, 119, 26);
		panel.add(lblTourGuide);
		
		totalPrice = new JTextField();
		totalPrice.setEditable(false);
		totalPrice.setBounds(542, 72, 179, 36);
		panel.add(totalPrice);
		totalPrice.setColumns(10);
		
		contactNo = new JTextField();
		contactNo.setEditable(false);
		contactNo.setColumns(10);
		contactNo.setBounds(542, 141, 179, 36);
		panel.add(contactNo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 203, 399, 116);
		panel.add(scrollPane);
		
		JTextArea txtrNoteTheContact = new JTextArea();
		txtrNoteTheContact.setText("Note:\r\nThe contact number given is from the tour guide \r\nwhich will accompany you during your trip!\r\nContact this number to arrange your departure \r\nvenue and time!\r\n\r\nRemember to follow SOP during your trip, STAY SAFE!");
		txtrNoteTheContact.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrNoteTheContact.setEditable(false);
		scrollPane.setViewportView(txtrNoteTheContact);
		
		
	}
	private void printRecord(JPanel panel) {
		PrinterJob printerjob = PrinterJob.getPrinterJob();
		printerjob.setJobName("Print Record");
		printerjob.setPrintable(new Printable() {
			public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
				if(pageIndex > 0) {
					return Printable.NO_SUCH_PAGE;
				}
				Graphics2D graphics2D = (Graphics2D)graphics;
				graphics2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
				graphics2D.scale(0.5, 0.5);
				
				panel.print(graphics2D);
				
				return Printable.PAGE_EXISTS;
			}
		});
		
		boolean returningResult = printerjob.printDialog();
		if(returningResult) {
			try {
				printerjob.print();
			}catch (PrinterException printerException){
				JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
			}
			
		}
	}
	
}
