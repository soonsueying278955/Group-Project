package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PriceReplace extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PriceReplace frame = new PriceReplace();
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
	public PriceReplace() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 239, 213));
		panel.setBounds(0, 0, 674, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(0, 0, 674, 110);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblReplacePrice = new JLabel("Replace The Price");
		lblReplacePrice.setBounds(149, 22, 388, 66);
		panel_1.add(lblReplacePrice);
		lblReplacePrice.setFont(new Font("Tempus Sans ITC", Font.BOLD, 50));

		JButton btnHealthTourism = new JButton("Health Tourism");
		btnHealthTourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HealthTourismReplacePrice h = new HealthTourismReplacePrice();
				h.setModalExclusionType(null);
		        h.setVisible(true);
	            dispose();
			}
		});
		btnHealthTourism.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnHealthTourism.setBounds(45, 149, 231, 39);
		panel.add(btnHealthTourism);
		
		JButton btnSportTourism = new JButton("Sport Tourism");
		btnSportTourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SportTourismReplacePrice s = new SportTourismReplacePrice();
				s.setModalExclusionType(null);
		        s.setVisible(true);
	            dispose();
			}
		});
		btnSportTourism.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSportTourism.setBounds(378, 149, 231, 39);
		panel.add(btnSportTourism);
		
		JButton btnCulturalTourism = new JButton("Cultural Tourism");
		btnCulturalTourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CulturalTourismReplacePrice c = new CulturalTourismReplacePrice();
				c.setModalExclusionType(null);
		        c.setVisible(true);
	            dispose();
			}
		});
		btnCulturalTourism.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCulturalTourism.setBounds(208, 233, 240, 39);
		panel.add(btnCulturalTourism);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage p = new AdminHomePage();
				p.setModalExclusionType(null);
		        p.setVisible(true);
	            dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(563, 313, 85, 27);
		panel.add(btnBack);
			}
}
