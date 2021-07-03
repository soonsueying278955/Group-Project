package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Service extends JFrame {

	private JFrame frmServices;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Service window = new Service();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Service() {
		setTitle("Services");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Service.class.getResource("icon.png")));
		setBounds(100, 100, 625, 531);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Xymaxx Restaurant!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 13, 362, 40);
		getContentPane().add(lblNewLabel);
		
		JLabel lblServices = new JLabel("Services");
		lblServices.setForeground(Color.WHITE);
		lblServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblServices.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblServices.setBounds(124, 51, 362, 40);
		getContentPane().add(lblServices);
		
		JButton button = new JButton("Employee\r \r\nRegistration");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				EmployeeRegistration ER = new EmployeeRegistration();
				ER.setModalExclusionType(null);
				ER.setVisible(true);
				//
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(315, 245, 185, 60);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("Advertising and Marketing");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				AdvertisingMarketing AM = new AdvertisingMarketing();
				AM.setModalExclusionType(null);
				AM.setVisible(true);
				//
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(96, 315, 185, 60);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Sales");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				Sales S = new Sales();
				S.setModalExclusionType(null);
				S.setVisible(true);
				//
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(315, 135, 185, 60);
		getContentPane().add(button_2);
		
		JButton button_4 = new JButton("Finance");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				Finance F = new Finance(); //calling another frame/window
				F.setModalExclusionType(null);
				F.setVisible(true);
				//
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_4.setBackground(Color.BLACK);
		button_4.setBounds(315, 355, 185, 60);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Menu Description");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				MenuDescription MD = new MenuDescription();
				MD.setModalExclusionType(null);
				MD.setVisible(true);
				//
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(96, 205, 185, 60);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Log Out");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JButton btnRestaurantDescription = new JButton("Restaurant Description");
		btnRestaurantDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				RestaurantDescription RD = new RestaurantDescription();
				RD.setModalExclusionType(null);
				RD.setVisible(true);
				//
			}
		});
		btnRestaurantDescription.setForeground(Color.WHITE);
		btnRestaurantDescription.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnRestaurantDescription.setBackground(Color.BLACK);
		btnRestaurantDescription.setBounds(96, 95, 185, 60);
		getContentPane().add(btnRestaurantDescription);
		
		button_6.setIcon(new ImageIcon(Service.class.getResource("e1.png")));
		button_6.setHorizontalAlignment(SwingConstants.RIGHT);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(465, 424, 142, 60);
		getContentPane().add(button_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Service.class.getResource("rs2.png")));
		lblNewLabel_1.setBounds(0, 0, 607, 484);
		getContentPane().add(lblNewLabel_1);
	}
}
