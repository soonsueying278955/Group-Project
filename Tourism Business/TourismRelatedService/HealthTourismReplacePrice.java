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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HealthTourismReplacePrice extends JFrame {

	private JPanel contentPane;
	private JLabel lblPriceComesticSurgery;
	private JTextField textFieldComesticSurgery;
	private JTextField textFieldDentistry;
	private JTextField textFieldCardiacSurgery;
	static double PriceComesticSurgery;
	static double PriceDentistry;
	static double PriceCardiacSurgery;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthTourismReplacePrice frame = new HealthTourismReplacePrice();
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
	public HealthTourismReplacePrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1031, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1017, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblReplacePrice = new JLabel("Replace Price In Health Tourism");
		lblReplacePrice.setFont(new Font("Tempus Sans ITC", Font.BOLD, 55));
		lblReplacePrice.setBounds(127, 21, 830, 88);
		panel.add(lblReplacePrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBounds(0, 137, 328, 293);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblComesticSurgery = new JLabel("Comestic Surgery");
		lblComesticSurgery.setFont(new Font("STLiti", Font.BOLD, 45));
		lblComesticSurgery.setBounds(10, 37, 308, 64);
		panel_1.add(lblComesticSurgery);
		
		lblPriceComesticSurgery = new JLabel("Price Per Person");
		lblPriceComesticSurgery.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPriceComesticSurgery.setBounds(62, 139, 205, 33);
		panel_1.add(lblPriceComesticSurgery);
		
		textFieldComesticSurgery = new JTextField();
		textFieldComesticSurgery.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldComesticSurgery.setBounds(62, 179, 205, 33);
		panel_1.add(textFieldComesticSurgery);
		textFieldComesticSurgery.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 240, 245));
		panel_1_1.setBounds(332, 137, 346, 293);
		contentPane.add(panel_1_1);
		
		JLabel lblDentistry = new JLabel("Dentistry");
		lblDentistry.setFont(new Font("STLiti", Font.BOLD, 45));
		lblDentistry.setBounds(89, 37, 174, 64);
		panel_1_1.add(lblDentistry);
		
		JLabel lblPriceDentistry = new JLabel("Price Per Person");
		lblPriceDentistry.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPriceDentistry.setBounds(76, 139, 205, 33);
		panel_1_1.add(lblPriceDentistry);
		
		textFieldDentistry = new JTextField();
		textFieldDentistry.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldDentistry.setColumns(10);
		textFieldDentistry.setBounds(76, 180, 205, 33);
		panel_1_1.add(textFieldDentistry);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(255, 240, 245));
		panel_1_2.setBounds(683, 137, 334, 293);
		contentPane.add(panel_1_2);
		
		JLabel lblCardiacSurgery = new JLabel("Cardiac Surgery");
		lblCardiacSurgery.setFont(new Font("STLiti", Font.BOLD, 45));
		lblCardiacSurgery.setBounds(27, 37, 283, 64);
		panel_1_2.add(lblCardiacSurgery);
		
		JLabel lblPriceCardiacSurgery = new JLabel("Price Per Person");
		lblPriceCardiacSurgery.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPriceCardiacSurgery.setBounds(65, 137, 205, 33);
		panel_1_2.add(lblPriceCardiacSurgery);
		
		textFieldCardiacSurgery = new JTextField();
		textFieldCardiacSurgery.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldCardiacSurgery.setColumns(10);
		textFieldCardiacSurgery.setBounds(65, 180, 205, 33);
		panel_1_2.add(textFieldCardiacSurgery);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(0, 433, 1017, 133);
		contentPane.add(panel_2);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PriceComesticSurgery = Double.parseDouble(textFieldComesticSurgery.getText());
					PriceDentistry = Double.parseDouble(textFieldDentistry.getText());
					PriceCardiacSurgery = Double.parseDouble(textFieldCardiacSurgery.getText());
			}
		});
		btnRecord.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		btnRecord.setBounds(426, 42, 172, 41);
		panel_2.add(btnRecord);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PriceReplace p = new PriceReplace();
				p.setModalExclusionType(null);
		        p.setVisible(true);
	            dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(892, 84, 96, 27);
		panel_2.add(btnBack);
	}
}
