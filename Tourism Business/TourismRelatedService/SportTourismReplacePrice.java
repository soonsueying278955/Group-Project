package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SportTourismReplacePrice extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSnorkeling;
	private JTextField textFieldKayaking;
	private JTextField textFieldGym;
	static double Snorkeling;
	static double Kayaking;
	static double Gym;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SportTourismReplacePrice frame = new SportTourismReplacePrice();
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
	public SportTourismReplacePrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 1063, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblReplacePrice = new JLabel("Replace Price In Sport Tourism");
		lblReplacePrice.setFont(new Font("Tempus Sans ITC", Font.BOLD, 55));
		lblReplacePrice.setBounds(142, 26, 753, 72);
		panel.add(lblReplacePrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setBounds(0, 138, 343, 295);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSnorkeling = new JLabel("Snorkeling");
		lblSnorkeling.setFont(new Font("STLiti", Font.BOLD, 45));
		lblSnorkeling.setBounds(72, 46, 196, 57);
		panel_1.add(lblSnorkeling);
		
		JLabel lblPriceSnorkeling = new JLabel("Price Per Peson");
		lblPriceSnorkeling.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblPriceSnorkeling.setBounds(83, 131, 167, 39);
		panel_1.add(lblPriceSnorkeling);
		
		textFieldSnorkeling = new JTextField();
		textFieldSnorkeling.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldSnorkeling.setBounds(83, 180, 167, 39);
		panel_1.add(textFieldSnorkeling);
		textFieldSnorkeling.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(240, 255, 240));
		panel_1_1.setBounds(353, 138, 357, 295);
		contentPane.add(panel_1_1);
		
		JLabel lblKayaking = new JLabel("Kayaking");
		lblKayaking.setFont(new Font("STLiti", Font.BOLD, 45));
		lblKayaking.setBounds(98, 45, 178, 57);
		panel_1_1.add(lblKayaking);
		
		JLabel lblPriceKayaking = new JLabel("Price Per Peson");
		lblPriceKayaking.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblPriceKayaking.setBounds(98, 129, 167, 39);
		panel_1_1.add(lblPriceKayaking);
		
		textFieldKayaking = new JTextField();
		textFieldKayaking.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldKayaking.setColumns(10);
		textFieldKayaking.setBounds(98, 173, 167, 39);
		panel_1_1.add(textFieldKayaking);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(240, 255, 240));
		panel_1_2.setBounds(720, 138, 343, 295);
		contentPane.add(panel_1_2);
		
		JLabel lblGym = new JLabel("Gym");
		lblGym.setFont(new Font("STLiti", Font.BOLD, 45));
		lblGym.setBounds(124, 45, 93, 57);
		panel_1_2.add(lblGym);
		
		JLabel lblPriceGym = new JLabel("Price Per Peson");
		lblPriceGym.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblPriceGym.setBounds(87, 126, 167, 39);
		panel_1_2.add(lblPriceGym);
		
		textFieldGym = new JTextField();
		textFieldGym.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldGym.setColumns(10);
		textFieldGym.setBounds(87, 175, 167, 39);
		panel_1_2.add(textFieldGym);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(0, 443, 1063, 132);
		contentPane.add(panel_2);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Snorkeling =Double.parseDouble(textFieldSnorkeling.getText());
				Kayaking = Double.parseDouble(textFieldKayaking.getText());
				Gym = Double.parseDouble(textFieldGym.getText());
			}
		});
		btnRecord.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnRecord.setBounds(452, 41, 184, 43);
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
		btnBack.setBounds(968, 95, 85, 27);
		panel_2.add(btnBack);
	}
}
