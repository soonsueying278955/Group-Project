package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FreeForAccountUser extends JFrame {

	private JPanel contentPane;
	private JButton btnRedeem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FreeForAccountUser frame = new FreeForAccountUser();
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
	public FreeForAccountUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FreeForAccountUser.class.getResource("window icon.png")));
		initComponents();
	}
	private void initComponents() {
		setTitle("GK Visitor Attraction System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.CYAN));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 35));
		lblNewLabel.setBounds(20, 22, 186, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thank you for being part of us! We have prepared ");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 67, 535, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("a gift for you. Please CLICK the button below to redeem!");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 103, 583, 37);
		contentPane.add(lblNewLabel_2);
		
		//"Redeem" button
		btnRedeem = new JButton("redeem");
		btnRedeem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRedeem.setEnabled(false);
				String message = String.format("Congratulation! You've got a free ticket to Stadthuys!\n") 
						+ String.format("Please screenshot this page and show it to the counter");
				JOptionPane.showMessageDialog(null, message);
				
			}
		});
		btnRedeem.setBorder(new BevelBorder(BevelBorder.RAISED, Color.CYAN, null, null, null));
		btnRedeem.setBackground(Color.PINK);
		btnRedeem.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnRedeem.setBounds(168, 252, 122, 37);
		contentPane.add(btnRedeem);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FreeForAccountUser.class.getResource("bigBear.png")));
		lblNewLabel_3.setBounds(260, 163, 239, 242);
		contentPane.add(lblNewLabel_3);
		
		//"Logout" button back to customer login
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin frame = new CustomerLogin();
				frame.setModalExclusionType(null);
		        frame.setVisible(true);
		        dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setBounds(529, 10, 82, 29);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FreeForAccountUser.class.getResource("redeem balloon.png")));
		lblNewLabel_4.setBounds(116, 10, 228, 262);
		contentPane.add(lblNewLabel_4);
		
		JButton btnContinueTo = new JButton("<< continue to registration center");
		btnContinueTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tickets frame = new Tickets();
				frame.setModalExclusionType(null);
		        frame.setVisible(true);
		        dispose();
			}
		});
		btnContinueTo.setForeground(Color.YELLOW);
		btnContinueTo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnContinueTo.setBorder(null);
		btnContinueTo.setBackground(Color.LIGHT_GRAY);
		btnContinueTo.setBounds(10, 376, 270, 29);
		contentPane.add(btnContinueTo);
		
	}
}
