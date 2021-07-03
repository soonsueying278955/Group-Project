package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdCost;
	private JTextField txtTotalR;
	private JTextField txtTotalC;
	private JTextField txtTotalP;
	private JTextField txtDate;
	private JTextField reportDate;
	private JTable table;
	private JTable tableImportTickets;
	private String tIncome, empCostFromColumn, ticketIncomeFromColumn;
	private double income;
	private String[] columnIncome;
	private String [] columnSalary;
	private String [] columnPromotion;
	private JTable tableImportSalary;
	private JTable tableProIncome;

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
	public Finance() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 785);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Finance");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(223)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(218))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.PINK));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.ORANGE));
		
		JLabel lblExpenses = new JLabel("EXPENSES");
		lblExpenses.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.GREEN));
		
		JLabel lblEmpCost = new JLabel("Employee Cost");
		lblEmpCost.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblAdCost = new JLabel("Advertising Cost");
		lblAdCost.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblKR = new JLabel("Ticket Income");
		lblKR.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		
		JLabel lblTotalRevenue = new JLabel("Total Revenue");
		lblTotalRevenue.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblTotalProfit = new JLabel("Total Profit");
		lblTotalProfit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_1_2 = new JLabel("FINANCIAL REPORT");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(154)
					.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
					.addGap(152))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblRm = new JLabel("RM");
		lblRm.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		txtTotalR = new JTextField();
		txtTotalR.setBorder(null);
		txtTotalR.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtTotalR.setColumns(10);
		
		txtTotalC = new JTextField();
		txtTotalC.setBorder(null);
		txtTotalC.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtTotalC.setColumns(10);
		
		txtTotalP = new JTextField();
		txtTotalP.setBorder(null);
		txtTotalP.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtTotalP.setColumns(10);
		
		JLabel lblRm_2 = new JLabel("RM");
		lblRm_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblRm_1 = new JLabel("RM");
		lblRm_1.setFont(new Font("Times New Roman", Font.BOLD, 22));

		reportDate = new JTextField();
		reportDate.setBackground(Color.WHITE);
		reportDate.setBorder(null);
		reportDate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		reportDate.setColumns(10);
		
		//"Exit" button back to menuVA
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
		        if (cmd.equals("Exit")) {
		            dispose();
		            new MenuVA().setVisible(true);
		        }
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		//"ccalculate" button
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declaration
				double one, two, totalRevenue, eC, aC, totalCost, totalP;	
				
				//get ticket income and promotion income from array
				one = Double.parseDouble(columnIncome[0]);
				two = Double.parseDouble(columnPromotion[0]);
				
				//calculate total revenue
				totalRevenue = one + two;
				
				//get total salary from array
				eC = Double.parseDouble(columnSalary[0]);
				
				//user input 
				aC = Double.parseDouble(txtAdCost.getText());
				
				//calculate total cost
				totalCost = eC + aC;
				
				//calculate total profit
				totalP = totalRevenue - totalCost;
				
				reportDate.setText(txtDate.getText());
				
				//set to 2 decimal place
				String totalRevenueF = String.format("%.2f", totalRevenue);
				String totalCostF = String.format("%.2f", totalCost);
				String totalPF = String.format("%.2f", totalP);
				
				txtTotalR.setText(totalRevenueF);
				txtTotalC.setText(totalCostF);
				txtTotalP.setText(totalPF);
			}
		});
		btnCalculate.setBackground(Color.LIGHT_GRAY);
		btnCalculate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCalculate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtDate.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Total Revenue", "Total Cost", "Total Profit"
			}
		));
		scrollPane.setViewportView(table);
		
		//"Upload" button export financial report
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\FinancialReport.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i = 0; i < table.getRowCount(); i++) {
					for (int j = 0; j < table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n_________________________________________\n");
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
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnUpload.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnUpload.setBackground(Color.LIGHT_GRAY);
		
		//"Add" button
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						txtDate.getText(),
						txtTotalR.getText(),
						txtTotalC.getText(),
						txtTotalP.getText()
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnAdd.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
					.addGap(11))
		);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTotalRevenue, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(reportDate, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
					.addGap(77)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(62)
							.addComponent(lblRm, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addGap(60))
						.addComponent(txtTotalR, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
					.addGap(54))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(52)
					.addComponent(lblTotalCost, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(132)
					.addComponent(txtTotalC, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
					.addGap(54))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(52)
					.addComponent(lblTotalProfit, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(172)
					.addComponent(txtTotalP, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
					.addGap(54))
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2_2.createSequentialGroup()
									.addGap(22)
									.addComponent(lblTotalRevenue, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addComponent(reportDate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addComponent(lblRm, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtTotalR, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTotalCost, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTotalC, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTotalProfit, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTotalP, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2_2.setLayout(gl_panel_2_2);
		
		JLabel lblIncome = new JLabel("INCOME");
		lblIncome.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		JLabel lblKR_1 = new JLabel("Promotion Income");
		lblKR_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(Color.WHITE);
		
		tableImportTickets = new JTable();
		tableImportTickets.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tableImportTickets.setForeground(Color.GRAY);
		tableImportTickets.setBorder(null);
		tableImportTickets.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(tableImportTickets);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		tableProIncome = new JTable();
		scrollPane_2.setViewportView(tableProIncome);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		tableImportSalary = new JTable();
		scrollPane_3.setViewportView(tableImportSalary);
		
		txtAdCost = new JTextField();
		txtAdCost.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtAdCost.setColumns(10);
		
		//"Refresh" button
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//import total salary
					String filePath = "C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\TotalSalary.txt";
					File file = new File(filePath);
					try {
						BufferedReader br = new BufferedReader(new FileReader(file));
						String firstLine = br.readLine().trim();
						columnSalary = firstLine.split("   ");
						DefaultTableModel model = (DefaultTableModel)tableImportSalary.getModel();
						model.setColumnIdentifiers(columnSalary);
						
						Object [] tableLines = br.lines().toArray();
						
						for(int i = 0; i < tableLines.length; i++) {
							String line = tableLines[i].toString().trim();
							String [] dataRow = line.split(" ");
							model.addRow(dataRow);	
						}
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				//import ticket income
				String filePath2 = "C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\TicketsIncome.txt";
				File file2 = new File(filePath2);
				try {
					BufferedReader br = new BufferedReader(new FileReader(file2));
					String firstLine = br.readLine().trim();
					columnIncome = firstLine.split("   ");
					DefaultTableModel model = (DefaultTableModel)tableImportTickets.getModel();
					model.setColumnIdentifiers(columnIncome);
					
					Object [] tableLines = br.lines().toArray();
					
					for(int i = 0; i < tableLines.length; i++) {
						String line = tableLines[i].toString().trim();
						String [] dataRow = line.split(" ");
						model.addRow(dataRow);	
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//import promotion income
				String filePath3 = "C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\PromotionIncome.txt";
				File file3 = new File(filePath3);
				try {
					BufferedReader br = new BufferedReader(new FileReader(file3));
					String firstLine = br.readLine().trim();
					columnPromotion = firstLine.split("   ");
					DefaultTableModel model = (DefaultTableModel)tableProIncome.getModel();
					model.setColumnIdentifiers(columnPromotion);
					
					Object [] tableLines = br.lines().toArray();
					
					for(int i = 0; i < tableLines.length; i++) {
						String line = tableLines[i].toString().trim();
						String [] dataRow = line.split(" ");
						model.addRow(dataRow);	
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(200)
					.addComponent(lblDate, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addComponent(txtDate, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addGap(181))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(189)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addGap(188))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(189)
					.addComponent(btnCalculate, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addGap(188))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(60)
					.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnUpload, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(16))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
					.addGap(12))
		);
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2_1.createSequentialGroup()
									.addComponent(lblExpenses, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(87))
								.addComponent(lblEmpCost, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
							.addGap(33)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2_1.createSequentialGroup()
									.addGap(66)
									.addComponent(lblRm_1, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
									.addGap(56))
								.addComponent(scrollPane_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addComponent(lblAdCost, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(88)
							.addComponent(txtAdCost, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
					.addGap(67))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblExpenses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(26)
							.addComponent(lblEmpCost, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblRm_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(26)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblAdCost, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtAdCost, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(85)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblIncome, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
							.addGap(181)
							.addComponent(lblRm_2, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addGap(60))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblKR, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
							.addGap(54)
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addComponent(lblKR_1, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
							.addGap(54)
							.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
					.addGap(66))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIncome, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRm_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKR, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKR_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2.setLayout(gl_panel_2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
	}
	
}
