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

public class CulturalTourismReplacePrice extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMuseums;
	private JTextField textFieldHistoricSites;
	private JTextField textFieldHandicrafts;
	static double Museums;
	static double HistoricSites;
	static double Handicrafts;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CulturalTourismReplacePrice frame = new CulturalTourismReplacePrice();
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
	public CulturalTourismReplacePrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1077, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setBounds(0, 0, 1063, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblReplacePrice = new JLabel("Replace Price In Cultural Tourism");
		lblReplacePrice.setFont(new Font("Tempus Sans ITC", Font.BOLD, 45));
		lblReplacePrice.setBounds(181, 45, 700, 60);
		panel.add(lblReplacePrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBounds(0, 146, 341, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMuseums = new JLabel("Museums");
		lblMuseums.setFont(new Font("STLiti", Font.BOLD, 45));
		lblMuseums.setBounds(87, 41, 174, 56);
		panel_1.add(lblMuseums);
		
		JLabel lblPriceMuseums = new JLabel("Price Per Person");
		lblPriceMuseums.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPriceMuseums.setBounds(75, 123, 189, 35);
		panel_1.add(lblPriceMuseums);
		
		textFieldMuseums = new JTextField();
		textFieldMuseums.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldMuseums.setBounds(75, 169, 186, 35);
		panel_1.add(textFieldMuseums);
		textFieldMuseums.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 248, 220));
		panel_1_1.setBounds(345, 146, 360, 261);
		contentPane.add(panel_1_1);
		
		JLabel lblHistoricSites = new JLabel("Historic Sites");
		lblHistoricSites.setFont(new Font("STLiti", Font.BOLD, 45));
		lblHistoricSites.setBounds(65, 40, 247, 56);
		panel_1_1.add(lblHistoricSites);
		
		JLabel lblPriceHistoricSites = new JLabel("Price Per Person");
		lblPriceHistoricSites.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPriceHistoricSites.setBounds(90, 122, 189, 35);
		panel_1_1.add(lblPriceHistoricSites);
		
		textFieldHistoricSites = new JTextField();
		textFieldHistoricSites.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldHistoricSites.setColumns(10);
		textFieldHistoricSites.setBounds(90, 167, 186, 35);
		panel_1_1.add(textFieldHistoricSites);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(255, 248, 220));
		panel_1_2.setBounds(709, 146, 354, 261);
		contentPane.add(panel_1_2);
		
		JLabel lblHandicrafts = new JLabel("Handicrafts");
		lblHandicrafts.setFont(new Font("STLiti", Font.BOLD, 45));
		lblHandicrafts.setBounds(64, 39, 220, 56);
		panel_1_2.add(lblHandicrafts);
		
		JLabel lblPriceHandicrafts = new JLabel("Price Per Person");
		lblPriceHandicrafts.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPriceHandicrafts.setBounds(74, 122, 189, 35);
		panel_1_2.add(lblPriceHandicrafts);
		
		textFieldHandicrafts = new JTextField();
		textFieldHandicrafts.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldHandicrafts.setColumns(10);
		textFieldHandicrafts.setBounds(77, 167, 186, 35);
		panel_1_2.add(textFieldHandicrafts);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 228, 196));
		panel_2.setBounds(0, 410, 1063, 143);
		contentPane.add(panel_2);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Museums =Double.parseDouble(textFieldMuseums.getText());
				HistoricSites = Double.parseDouble(textFieldHistoricSites.getText());
				Handicrafts = Double.parseDouble(textFieldHandicrafts.getText());
			}
		});
		btnRecord.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnRecord.setBounds(436, 40, 166, 43);
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
		btnBack.setBounds(960, 107, 93, 26);
		panel_2.add(btnBack);
	}
}
