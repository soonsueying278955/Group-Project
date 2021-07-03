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
import java.util.Scanner;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField utility;
	private JTextField advertise;
	private JTextField prize;
	private JTextField transport;
	private JTextField wage;
	private JTextField travelIncome;
	private JTextField merch;
	private JTextField textField_9;
	
	double totalincome, totalexpense, netincome;
	private JTextField totalIncome;
	private JTextField totalExpense;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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

	public Finance() {
		setTitle("Finance Tab");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("small-axe.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1053, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.RED));
		panel.setBounds(0, 18, 1039, 525);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(21, 27, 983, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Monthly Finance Tab");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 11, 963, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(Color.YELLOW);
		panel_1_1.setBounds(21, 110, 252, 256);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Utility Fee");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 49, 62, 14);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ads Fee");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(20, 73, 62, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("PrizeBudget");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(20, 97, 72, 14);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TravelIncome");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 180, 82, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Merchsale");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 206, 82, 23);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Transportation");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(10, 127, 82, 14);
		panel_1_1.add(lblNewLabel_1_1_2);
		
		utility = new JTextField();
		utility.setFont(new Font("Tahoma", Font.BOLD, 11));
		utility.setBounds(100, 46, 127, 20);
		panel_1_1.add(utility);
		utility.setColumns(10);
		
		advertise = new JTextField();
		advertise.setFont(new Font("Tahoma", Font.BOLD, 11));
		advertise.setColumns(10);
		advertise.setBounds(100, 70, 127, 20);
		panel_1_1.add(advertise);
		
		prize = new JTextField();
		prize.setFont(new Font("Tahoma", Font.BOLD, 11));
		prize.setColumns(10);
		prize.setBounds(100, 94, 127, 20);
		panel_1_1.add(prize);
		
		transport = new JTextField();
		transport.setFont(new Font("Tahoma", Font.BOLD, 11));
		transport.setColumns(10);
		transport.setBounds(100, 124, 127, 20);
		panel_1_1.add(transport);
		
		travelIncome = new JTextField();
		travelIncome.setText(String.format("%.2f", Customer.totalIncome)); //calling value from other class
		travelIncome.setEditable(false);
		travelIncome.setFont(new Font("Tahoma", Font.BOLD, 11));
		travelIncome.setColumns(10);
		travelIncome.setBounds(100, 177, 127, 20);
		panel_1_1.add(travelIncome);
		
		merch = new JTextField();
		merch.setFont(new Font("Tahoma", Font.BOLD, 11));
		merch.setColumns(10);
		merch.setBounds(100, 207, 127, 20);
		panel_1_1.add(merch);
		
		wage = new JTextField();
		wage.setText(String.format("%.2f", Employee.totalSalary)); //calling value from other class
		wage.setEditable(false);
		wage.setFont(new Font("Tahoma", Font.BOLD, 11));
		wage.setColumns(10);
		wage.setBounds(100, 154, 127, 20);
		panel_1_1.add(wage);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Wages");
		lblNewLabel_1_2_2.setBounds(20, 156, 62, 14);
		panel_1_1.add(lblNewLabel_1_2_2);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_1_4 = new JLabel("Month");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(20, 20, 62, 14);
		panel_1_1.add(lblNewLabel_1_4);
		
		JComboBox cbMonth = new JComboBox();
		cbMonth.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov ", "Dec"}));
		cbMonth.setBounds(100, 17, 127, 23);
		panel_1_1.add(cbMonth);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(Color.YELLOW);
		panel_1_2.setBounds(21, 426, 983, 87);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			    double num1 = Double.parseDouble(utility.getText());
			    double num2 = Double.parseDouble(advertise.getText());
			    double num3 = Double.parseDouble(prize.getText());
			    double num4 = Double.parseDouble(transport.getText());
			    double num5 = Double.parseDouble(wage.getText());
			    double num6 = Double.parseDouble(travelIncome.getText());
			    double num7 = Double.parseDouble(merch.getText());
			    
			    totalexpense = num1 + num2 + num3 + num4 + num5;
			    totalincome = num6 + num7;
			    
			    String s1 = String.valueOf(totalexpense);
			    String s2 = String.valueOf(totalincome);
			    
			    textField_2.setText((String) cbMonth.getSelectedItem());
				totalIncome.setText(s2);
				totalExpense.setText(s1);
				}catch(Exception ee){
					ee.printStackTrace();
				}
				}
			}
		);
				
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(66, 23, 146, 38);
		panel_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("CLEAR");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utility.setText("");
				advertise.setText("");
				prize.setText("");
				transport.setText("");
				travelIncome.setText("");
				wage.setText("");				
				merch.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(276, 23, 130, 38);
		panel_1_2.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home frame = new Home();
					frame.setModalExclusionType(null);
		            frame.setVisible(true);
		            dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(698, 23, 146, 38);
		panel_1_2.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printRecord(panel);
			}});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(474, 23, 146, 38);
		panel_1_2.add(btnPrint);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_3.setBackground(new Color(176, 224, 230));
		panel_1_3.setBounds(283, 110, 732, 256);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 2, 2);
		panel_1_3.add(scrollPane);
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("totalIncome");
		lblNewLabel_1_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2_1_3.setBounds(61, 99, 161, 40);
		panel_1_3.add(lblNewLabel_1_2_1_3);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("totalExpense");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2_1_1_1.setBounds(61, 173, 161, 45);
		panel_1_3.add(lblNewLabel_1_2_1_1_1);
		
		totalIncome = new JTextField();
		totalIncome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		totalIncome.setEditable(false);
		totalIncome.setColumns(10);
		totalIncome.setBounds(294, 101, 208, 40);
		panel_1_3.add(totalIncome);
		
		totalExpense = new JTextField();
		totalExpense.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		totalExpense.setEditable(false);
		totalExpense.setColumns(10);
		totalExpense.setBounds(294, 174, 208, 45);
		panel_1_3.add(totalExpense);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Month");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4_1.setBounds(61, 28, 161, 40);
		panel_1_3.add(lblNewLabel_1_4_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(294, 28, 208, 40);
		panel_1_3.add(textField_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("NetIncome");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1_2.setBounds(283, 376, 110, 38);
		panel.add(lblNewLabel_1_2_1_2);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(383, 376, 167, 38);
		panel.add(textField_9);
		
		JButton btnCalNet = new JButton("Cal Net");
		btnCalNet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    
			        totalincome = Double.parseDouble(totalIncome.getText()); 
			        totalexpense = Double.parseDouble(totalExpense.getText());
			        
			        netincome = totalincome - totalexpense;
			        String ni = String.valueOf(netincome);
			        textField_9.setText(ni);
			    }
		});
		btnCalNet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalNet.setBounds(587, 376, 146, 38);
		panel.add(btnCalNet);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1039, 22);
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

