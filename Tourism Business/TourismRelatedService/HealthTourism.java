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
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class HealthTourism extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthTourism frame = new HealthTourism();
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
	public HealthTourism() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1244, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1229, 623);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(10, 10, 423, 603);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHealthTourism = new JLabel("Health Tourism");
		lblHealthTourism.setBounds(27, 128, 365, 85);
		panel_1.add(lblHealthTourism);
		lblHealthTourism.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		
		JComboBox comboBoxService = new JComboBox();
		comboBoxService.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBoxService.setModel(new DefaultComboBoxModel(new String[] {"Please select type of service you want", "Cosmetic Surgery", "Dentistry", "Cardiac Surgery"}));
		comboBoxService.setBounds(27, 261, 365, 42);
		panel_1.add(comboBoxService);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 240, 245));
		panel_2.setBounds(443, 10, 776, 603);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblServiceName = new JLabel("");
		lblServiceName.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 60));
		lblServiceName.setBounds(10, 10, 452, 96);
		panel_2.add(lblServiceName);
		
		JLabel Image1 = new JLabel("");
		Image d = new ImageIcon(this.getClass().getResource("dentistry.jpg")).getImage();
		Image1.setIcon(new ImageIcon(d));
		Image1.setBounds(327, 386, 242, 207);
		panel_2.add(Image1);
		
		JLabel Image = new JLabel("");
		Image i = new ImageIcon(this.getClass().getResource("cosmetic.jpg")).getImage();
		Image.setIcon(new ImageIcon(i));
		Image.setBounds(524, 302, 242, 277);
		panel_2.add(Image);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 23));
		textArea.setBackground(new Color(255, 240, 245));
		textArea.setBounds(10, 142, 705, 154);
		panel_2.add(textArea);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxService.getSelectedItem().equals("Cosmetic Surgery")) {
					lblServiceName.setText("Cosmetic Surgery");
					textArea.setText("\n1. Price per person : " + "RM 3000"  
					               + "\n2. Professional quality : " + "Professional, enthusiasm, politeness"
							       + "\n3. Rating : " + "5 stars"
					               + "\n4. ***If hour is more than 5 hours, you will get 20% discount");
				
				}
				else if (comboBoxService.getSelectedItem().equals("Dentistry")) {
					lblServiceName.setText("Dentistry");
					textArea.setText("\n1. Price per person : " + "RM 1000"  
				                   + "\n2. Professional quality : " + "Good, enthusiasm, politeness"
				                   + "\n3. Rating : " + "4 stars"
				                   + "\n4. ***If hour is more than 5 hours, you will get 20% discount");
					
				}
				
				else if (comboBoxService.getSelectedItem().equals("Cardiac Surgery")) {
					lblServiceName.setText("Cardiac Surgery");
					textArea.setText("\n1. Price per person : " + "RM 4500"  
			                       + "\n2. Professional quality : " + "Responsibility, professional, politeness"
			                       + "\n3. Rating : " + "4 stars"
			                       + "\n4. ***If hour is more than 5 hours, you will get 20% discount");
					
				}
			}
		});
		btnDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDetails.setBounds(170, 411, 102, 33);
		panel_1.add(btnDetails);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription pd = new ProductDescription();
				pd.setModalExclusionType(null);
		        pd.setVisible(true);
	            dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(311, 411, 102, 33);
		panel_1.add(btnExit);
		
	}
}
