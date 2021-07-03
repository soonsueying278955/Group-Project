package TravelAndTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Admin extends JFrame {
	private JPanel contentPane;
	private JTextField UsernameText;
	private JTextField PasswordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("small-axe.png")));
		setTitle("TY Travel Agency");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel.setBounds(0, 0, 805, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(32, 28, 732, 70);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("TY Travel Agency Admin Panel");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 695, 50);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1_1.setBackground(Color.RED);
		panel_1_1.setBounds(32, 159, 204, 70);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 10, 184, 50);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		panel_1_1.add(lblUsername);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1_2.setBackground(Color.RED);
		panel_1_2.setBounds(32, 276, 204, 70);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 10, 184, 50);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		panel_1_2.add(lblPassword);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(UsernameText.getText().equals("leetzongying") && PasswordText.getText().equals("abc123")) { 
						JOptionPane.showMessageDialog(null, "Login Successful!");
						Home frame = new Home();
						frame.setModalExclusionType(null);
			            frame.setVisible(true);
			            dispose();
				}else
						JOptionPane.showMessageDialog(null, "Login not Successful.");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		LoginButton.setBounds(58, 413, 170, 48);
		panel.add(LoginButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameText.setText(null);
				PasswordText.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBounds(288, 413, 154, 48);
		panel.add(btnReset);
		
		UsernameText = new JTextField();
		UsernameText.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		UsernameText.setBounds(264, 159, 239, 70);
		panel.add(UsernameText);
		UsernameText.setColumns(10);
		
		PasswordText = new JTextField();
		PasswordText.setFont(new Font("Wingdings", Font.BOLD, 20));
		PasswordText.setColumns(10);
		PasswordText.setBounds(264, 276, 239, 70);
		panel.add(PasswordText);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Admin.class.getResource("small-axe.png")));
		lblNewLabel_1.setBounds(532, 127, 232, 263);
		panel.add(lblNewLabel_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();	
			}
		});
		btnReturn.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReturn.setBounds(542, 413, 154, 48);
		panel.add(btnReturn);
	}
}