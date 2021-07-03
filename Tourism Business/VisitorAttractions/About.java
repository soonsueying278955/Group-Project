package VisitorAttractions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;
	private JTextField txtDeveloperGinveree_1;
	private JTextField txtLocationUsj;
	private JTextField txtContactNumber;
	private JTextField txtEmailGinvereegmailcom;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	public About() {
		initComponents();
	}
	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 307);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 494, 53);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("About us");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 27));
		panel.add(lblNewLabel);
		
		txtDeveloperGinveree_1 = new JTextField();
		txtDeveloperGinveree_1.setBorder(null);
		txtDeveloperGinveree_1.setBackground(Color.LIGHT_GRAY);
		txtDeveloperGinveree_1.setText("Developer            : Ginveree Kong May Cheng");
		txtDeveloperGinveree_1.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		txtDeveloperGinveree_1.setBounds(10, 73, 512, 39);
		contentPane.add(txtDeveloperGinveree_1);
		txtDeveloperGinveree_1.setColumns(10);
		
		txtLocationUsj = new JTextField();
		txtLocationUsj.setBorder(null);
		txtLocationUsj.setBackground(Color.LIGHT_GRAY);
		txtLocationUsj.setText("Location              : USJ 11, Subang Jaya, Selangor");
		txtLocationUsj.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		txtLocationUsj.setColumns(10);
		txtLocationUsj.setBounds(10, 110, 512, 39);
		contentPane.add(txtLocationUsj);
		
		txtContactNumber = new JTextField();
		txtContactNumber.setBorder(null);
		txtContactNumber.setBackground(Color.LIGHT_GRAY);
		txtContactNumber.setText("Contact Number   : 016 3359938");
		txtContactNumber.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(10, 146, 512, 39);
		contentPane.add(txtContactNumber);
		
		txtEmailGinvereegmailcom = new JTextField();
		txtEmailGinvereegmailcom.setBorder(null);
		txtEmailGinvereegmailcom.setBackground(Color.LIGHT_GRAY);
		txtEmailGinvereegmailcom.setText("Email                 : ginveree@gmail.com");
		txtEmailGinvereegmailcom.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		txtEmailGinvereegmailcom.setColumns(10);
		txtEmailGinvereegmailcom.setBounds(10, 182, 485, 39);
		contentPane.add(txtEmailGinvereegmailcom);
		
		//back button to main page
		btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame = new MainPage();
				frame.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(130, 231, 260, 29);
		contentPane.add(btnNewButton);
		
	}
}
