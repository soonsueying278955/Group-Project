package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductDescription extends JFrame {

	private JPanel contentPane;
	private JLabel Label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDescription frame = new ProductDescription();
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
	public ProductDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1153, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1137, 726);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 10, 1118, 120);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblProductDescription = new JLabel("Product Description");
		lblProductDescription.setFont(new Font("Pristina", Font.BOLD, 70));
		lblProductDescription.setBounds(288, 10, 493, 100);
		panel_1.add(lblProductDescription);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 140, 1118, 586);
		panel.add(panel_2);
		panel_2.setLayout(null);
			
		JLabel lblCaption = new JLabel("May Every Day Bring A New Adventure");
		lblCaption.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		lblCaption.setBounds(60, 25, 478, 47);
		panel_2.add(lblCaption);
		
		JLabel Label4 = new JLabel("");
		Image e = new ImageIcon(this.getClass().getResource("exercise.jpg")).getImage();
		Label4.setIcon(new ImageIcon(e));
		Label4.setBounds(91, 363, 290, 200);
		panel_2.add(Label4);
		
		JLabel Label3 = new JLabel("");
		Image m = new ImageIcon(this.getClass().getResource("medical.jpg")).getImage();
		Label3.setIcon(new ImageIcon(m));
		Label3.setBounds(234, 95, 290, 179);
		panel_2.add(Label3);
		
		JLabel Label2 = new JLabel("");
		Image h = new ImageIcon(this.getClass().getResource("historical museum.jpg")).getImage();
		Label2.setIcon(new ImageIcon(h));
		Label2.setBounds(10, 72, 270, 345);
		panel_2.add(Label2);
		
		JLabel Label1 = new JLabel("");
		Image c = new ImageIcon(this.getClass().getResource("cycling.jpg")).getImage();
		Label1.setIcon(new ImageIcon(c));
		Label1.setBounds(289, 180, 296, 340);
		panel_2.add(Label1);
	
		JLabel lblLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("gray background.jpg")).getImage();
		lblLabel.setIcon(new ImageIcon(img));
		lblLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblLabel.setBounds(49, 10, 500, 566);
		panel_2.add(lblLabel);
		
		JButton btnHealth = new JButton("Health Tourism");
		btnHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HealthTourism health = new HealthTourism(); //calling another frame/window
				health.setModalExclusionType(null);
	            health.setVisible(true);
	            dispose();
			}
		});
		Image health = new ImageIcon(this.getClass().getResource("health icon.png")).getImage();
		btnHealth.setIcon(new ImageIcon(health));
		btnHealth.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnHealth.setBounds(724, 132, 305, 57);
		panel_2.add(btnHealth);
		
		JButton btnSport = new JButton("Sport Tourism");
		btnSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SportTourism sport = new SportTourism(); //calling another frame/window
				sport.setModalExclusionType(null);
	            sport.setVisible(true);
	            dispose();
			}
		});
		Image sport = new ImageIcon(this.getClass().getResource("sports icon.png")).getImage();
		btnSport.setIcon(new ImageIcon(sport));
		btnSport.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSport.setBounds(724, 232, 305, 57);
		panel_2.add(btnSport);
		
		JButton btnCultural = new JButton("Cultural Tourism");
		btnCultural.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CulturalTourism cultural = new CulturalTourism(); //calling another frame/window
				cultural.setModalExclusionType(null);
	            cultural.setVisible(true);
	            dispose();
			}
		});
		Image cultural = new ImageIcon(this.getClass().getResource("museum icon.png")).getImage();
		btnCultural.setIcon(new ImageIcon(cultural));
		btnCultural.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCultural.setBounds(724, 337, 305, 57);
		panel_2.add(btnCultural);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage home = new UserHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
				}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(959, 497, 128, 30);
		panel_2.add(btnExit);
	}
}
