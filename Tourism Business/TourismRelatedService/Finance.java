package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHealthTourism;
	private JLabel lblSportTourism;
	private JTextField textFieldSportTourism;
	private JTextField textFieldCulturalTourism;
	private JTextField textFieldUtilities;
	private JTextField textFieldAdvertisement;
	private JTextField textFieldRepair;
	private JTextField textFieldComunication;
	private JTextField textFieldRent;
	private JTextField textFieldOthers;
	private JTextField textFieldEmployeeSalary;
	private JTextField textFieldEmployeeWages;
	private JTextField textFieldEmployeeBenefits;
	private JTextField textFieldInsurans;
	private JTextField textFieldTotalIncome;
	private JTextField textFieldTotalExpenses;
	private JTextField textFieldNetIncome;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1261, 835);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(0, 0, 379, 798);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Label = new JLabel("");
		Image f = new ImageIcon(this.getClass().getResource("finance.jpg")).getImage();
		Label.setIcon(new ImageIcon(f));
		Label.setBounds(10, 259, 355, 378);
		panel.add(Label);
		
		JLabel lblFinance = new JLabel("Finance");
		lblFinance.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 60));
		lblFinance.setBounds(105, 137, 169, 79);
		panel.add(lblFinance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBounds(389, 0, 858, 798);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 235, 205));
		panel_2.setBounds(10, 20, 147, 48);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblIncome = new JLabel("Income");
		lblIncome.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblIncome.setBounds(24, 0, 98, 48);
		panel_2.add(lblIncome);
		
		JLabel lblHealthTourism = new JLabel("Health Tourism");
		lblHealthTourism.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblHealthTourism.setBounds(10, 78, 135, 38);
		panel_1.add(lblHealthTourism);
		
		textFieldHealthTourism = new JTextField();
		textFieldHealthTourism.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldHealthTourism.setBounds(207, 81, 122, 28);
		panel_1.add(textFieldHealthTourism);
		textFieldHealthTourism.setColumns(10);
		
		lblSportTourism = new JLabel("Sport Tourism");
		lblSportTourism.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSportTourism.setBounds(10, 111, 135, 38);
		panel_1.add(lblSportTourism);
		
		textFieldSportTourism = new JTextField();
		textFieldSportTourism.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldSportTourism.setColumns(10);
		textFieldSportTourism.setBounds(207, 119, 122, 28);
		panel_1.add(textFieldSportTourism);
		
		JLabel lblCulturalTourism = new JLabel("Cultural Tourism");
		lblCulturalTourism.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCulturalTourism.setBounds(10, 149, 147, 38);
		panel_1.add(lblCulturalTourism);
		
		textFieldCulturalTourism = new JTextField();
		textFieldCulturalTourism.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCulturalTourism.setColumns(10);
		textFieldCulturalTourism.setBounds(207, 157, 122, 28);
		panel_1.add(textFieldCulturalTourism);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(255, 235, 205));
		panel_2_1.setBounds(10, 205, 147, 48);
		panel_1.add(panel_2_1);
		
		JLabel lblExpenses = new JLabel("Expenses");
		lblExpenses.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblExpenses.setBounds(14, 0, 123, 48);
		panel_2_1.add(lblExpenses);
		
		JLabel lblUtilities = new JLabel("Utilities");
		lblUtilities.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUtilities.setBounds(10, 263, 147, 28);
		panel_1.add(lblUtilities);
		
		textFieldUtilities = new JTextField();
		textFieldUtilities.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldUtilities.setColumns(10);
		textFieldUtilities.setBounds(241, 264, 122, 28);
		panel_1.add(textFieldUtilities);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAdvertisement.setBounds(10, 301, 147, 28);
		panel_1.add(lblAdvertisement);
		
		textFieldAdvertisement = new JTextField();
		textFieldAdvertisement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldAdvertisement.setColumns(10);
		textFieldAdvertisement.setBounds(241, 301, 122, 28);
		panel_1.add(textFieldAdvertisement);
		
		JLabel lblRepairNmaintenance = new JLabel("Repair & Maintenance");
		lblRepairNmaintenance.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRepairNmaintenance.setBounds(10, 339, 187, 28);
		panel_1.add(lblRepairNmaintenance);
		
		textFieldRepair = new JTextField();
		textFieldRepair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldRepair.setColumns(10);
		textFieldRepair.setBounds(241, 339, 122, 28);
		panel_1.add(textFieldRepair);
		
		JLabel lblComunication = new JLabel("Comunication");
		lblComunication.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblComunication.setBounds(10, 377, 187, 28);
		panel_1.add(lblComunication);
		
		textFieldComunication = new JTextField();
		textFieldComunication.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldComunication.setColumns(10);
		textFieldComunication.setBounds(241, 377, 122, 28);
		panel_1.add(textFieldComunication);
		
		JLabel lblRent = new JLabel("Rent");
		lblRent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRent.setBounds(10, 415, 187, 28);
		panel_1.add(lblRent);
		
		textFieldRent = new JTextField();
		textFieldRent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldRent.setColumns(10);
		textFieldRent.setBounds(241, 415, 122, 28);
		panel_1.add(textFieldRent);
		
		JLabel lblOthers = new JLabel("Others");
		lblOthers.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOthers.setBounds(10, 453, 187, 28);
		panel_1.add(lblOthers);
		
		textFieldOthers = new JTextField();
		textFieldOthers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldOthers.setColumns(10);
		textFieldOthers.setBounds(241, 453, 122, 28);
		panel_1.add(textFieldOthers);
		
		JLabel lblEmployeeSalary = new JLabel("Employee salaries");
		lblEmployeeSalary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeSalary.setBounds(10, 491, 187, 28);
		panel_1.add(lblEmployeeSalary);
		
		textFieldEmployeeSalary = new JTextField();
		textFieldEmployeeSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmployeeSalary.setColumns(10);
		textFieldEmployeeSalary.setBounds(241, 491, 122, 28);
		panel_1.add(textFieldEmployeeSalary);
		
		JLabel lblEmployeeWages = new JLabel("Employee wages");
		lblEmployeeWages.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeWages.setBounds(10, 529, 187, 28);
		panel_1.add(lblEmployeeWages);
		
		textFieldEmployeeWages = new JTextField();
		textFieldEmployeeWages.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmployeeWages.setColumns(10);
		textFieldEmployeeWages.setBounds(241, 529, 122, 28);
		panel_1.add(textFieldEmployeeWages);
		
		JLabel lblEmployeeBenefits = new JLabel("Employee benefits");
		lblEmployeeBenefits.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeBenefits.setBounds(10, 567, 187, 28);
		panel_1.add(lblEmployeeBenefits);
		
		textFieldEmployeeBenefits = new JTextField();
		textFieldEmployeeBenefits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEmployeeBenefits.setColumns(10);
		textFieldEmployeeBenefits.setBounds(241, 567, 122, 28);
		panel_1.add(textFieldEmployeeBenefits);
		
		JLabel lblInsurans = new JLabel("Insurans");
		lblInsurans.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblInsurans.setBounds(10, 605, 187, 28);
		panel_1.add(lblInsurans);
		
		textFieldInsurans = new JTextField();
		textFieldInsurans.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldInsurans.setColumns(10);
		textFieldInsurans.setBounds(241, 605, 122, 28);
		panel_1.add(textFieldInsurans);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTotalIncome.setBounds(433, 159, 135, 28);
		panel_1.add(lblTotalIncome);
		
		textFieldTotalIncome = new JTextField();
		textFieldTotalIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTotalIncome.setColumns(10);
		textFieldTotalIncome.setBounds(588, 159, 122, 28);
		panel_1.add(textFieldTotalIncome);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses");
		lblTotalExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTotalExpenses.setBounds(420, 605, 135, 28);
		panel_1.add(lblTotalExpenses);
		
		textFieldTotalExpenses = new JTextField();
		textFieldTotalExpenses.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTotalExpenses.setColumns(10);
		textFieldTotalExpenses.setBounds(605, 606, 122, 28);
		panel_1.add(textFieldTotalExpenses);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(255, 235, 205));
		panel_2_1_1.setBounds(10, 649, 159, 48);
		panel_1.add(panel_2_1_1);
		
		JLabel lblNetIncome = new JLabel("Net Income");
		lblNetIncome.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNetIncome.setBounds(10, 0, 139, 48);
		panel_2_1_1.add(lblNetIncome);
		
		JLabel lblYearNetIncome = new JLabel("Total net income for one year");
		lblYearNetIncome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblYearNetIncome.setBounds(10, 707, 243, 28);
		panel_1.add(lblYearNetIncome);
		
		textFieldNetIncome = new JTextField();
		textFieldNetIncome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldNetIncome.setColumns(10);
		textFieldNetIncome.setBounds(299, 707, 122, 28);
		panel_1.add(textFieldNetIncome);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double HealthTourism = Double.parseDouble(textFieldHealthTourism.getText());
					double SportTourism = Double.parseDouble(textFieldSportTourism.getText());
					double CulturalTourism = Double.parseDouble(textFieldCulturalTourism.getText());
					
					double TotalIncome = HealthTourism + SportTourism + CulturalTourism;
					textFieldTotalIncome.setText(Double.toString(TotalIncome));
					
					int Utilities = Integer.parseInt(textFieldUtilities.getText());
					int Advertisement = Integer.parseInt(textFieldAdvertisement.getText());
					int RepairNmaintenance = Integer.parseInt(textFieldRepair.getText());
					int Comunication =Integer.parseInt(textFieldComunication.getText());
					int Rent = Integer.parseInt(textFieldRent.getText());
					int Others = Integer.parseInt(textFieldOthers.getText());
					double EmployeeSalary = Double.parseDouble(textFieldEmployeeSalary.getText());
					int EmployeeWages = Integer.parseInt(textFieldEmployeeWages.getText());
					int EmployeeBenefits = Integer.parseInt(textFieldEmployeeBenefits.getText());
					int Insurans =Integer.parseInt(textFieldInsurans.getText());
					
					double TotalExpenses = Utilities + Advertisement + RepairNmaintenance + Comunication + Rent + Others + EmployeeSalary + EmployeeWages + EmployeeBenefits + Insurans;
					textFieldTotalExpenses.setText(Double.toString(TotalExpenses));
					
					double lblYearNetIncome = TotalIncome - TotalExpenses;
					textFieldNetIncome.setText(Double.toString(lblYearNetIncome));
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCalculate.setBounds(485, 760, 121, 28);
		panel_1.add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldHealthTourism.setText("");
				textFieldSportTourism.setText("");
				textFieldCulturalTourism.setText("");
				textFieldTotalIncome.setText("");
				textFieldUtilities.setText("");
				textFieldAdvertisement.setText("");
				textFieldRepair.setText("");
				textFieldComunication.setText("");
				textFieldRent.setText("");
				textFieldOthers.setText("");
				textFieldEmployeeSalary.setText("");
				textFieldEmployeeWages.setText("");
				textFieldEmployeeBenefits.setText("");
				textFieldInsurans.setText("");
				textFieldTotalExpenses.setText("");
				textFieldNetIncome.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(616, 760, 111, 28);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage home = new AdminHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(737, 760, 111, 28);
		panel_1.add(btnExit);
		
		JLabel lblRM = new JLabel("RM");
		lblRM.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM.setBounds(172, 81, 35, 28);
		panel_1.add(lblRM);
		
		JLabel lblRM1 = new JLabel("RM");
		lblRM1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM1.setBounds(172, 119, 35, 28);
		panel_1.add(lblRM1);
		
		JLabel lblRM2 = new JLabel("RM");
		lblRM2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM2.setBounds(172, 157, 35, 28);
		panel_1.add(lblRM2);
		
		JLabel lblRM3 = new JLabel("RM");
		lblRM3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM3.setBounds(554, 160, 35, 28);
		panel_1.add(lblRM3);
		
		JLabel lblRM4 = new JLabel("RM");
		lblRM4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM4.setBounds(207, 263, 35, 28);
		panel_1.add(lblRM4);
		
		JLabel lblRM5 = new JLabel("RM");
		lblRM5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM5.setBounds(207, 302, 35, 28);
		panel_1.add(lblRM5);
		
		JLabel lblRM6 = new JLabel("RM");
		lblRM6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM6.setBounds(207, 339, 35, 28);
		panel_1.add(lblRM6);
		
		JLabel lblRM7 = new JLabel("RM");
		lblRM7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM7.setBounds(207, 377, 35, 28);
		panel_1.add(lblRM7);
		
		JLabel lblRM8 = new JLabel("RM");
		lblRM8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM8.setBounds(207, 415, 35, 28);
		panel_1.add(lblRM8);
		
		JLabel lblRM9 = new JLabel("RM");
		lblRM9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM9.setBounds(207, 453, 35, 28);
		panel_1.add(lblRM9);
		
		JLabel lblRM10 = new JLabel("RM");
		lblRM10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM10.setBounds(207, 491, 35, 28);
		panel_1.add(lblRM10);
		
		JLabel lblRM11 = new JLabel("RM");
		lblRM11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM11.setBounds(207, 529, 35, 28);
		panel_1.add(lblRM11);
		
		JLabel lblRM12 = new JLabel("RM");
		lblRM12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM12.setBounds(207, 567, 35, 28);
		panel_1.add(lblRM12);
		
		JLabel lblRM13 = new JLabel("RM");
		lblRM13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM13.setBounds(207, 605, 35, 28);
		panel_1.add(lblRM13);
		
		JLabel lblRM14 = new JLabel("RM");
		lblRM14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM14.setBounds(571, 605, 35, 28);
		panel_1.add(lblRM14);
		
		JLabel lblRM15 = new JLabel("RM");
		lblRM15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRM15.setBounds(263, 707, 35, 28);
		panel_1.add(lblRM15);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTotalIncome.setText(String.format("%.2f", BookingSystem.TotalIncome));
				textFieldEmployeeSalary.setText(String.format("%.2f", EmployeeManagement.TotalSalary));
			}
		});
		btnShow.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnShow.setBounds(354, 760, 121, 28);
		panel_1.add(btnShow);
	}
}
