package VisitorAttractions;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdminLogin() {
		initComponents();	
	}

	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLogin.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 308);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.GRAY));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(30, 79, 280, 42);
		panel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_2.setBackground(Color.GRAY);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.GRAY);
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = "Ginveree";
				txtUsername.setText(username);
			}
		});
		txtUsername.setColumns(10);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(30, 135, 280, 42);
		panel_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_3.setBackground(Color.GRAY);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.GRAY);
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "ginveree123";
				txtPassword.setText(password);
			}
		});
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(182, 195, 128, 36);
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(txtUsername.getText().equals("Ginveree") && txtPassword.getText().equals("ginveree123")) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						MenuVA frame = new MenuVA();
						frame.setModalExclusionType(null);
				        frame.setVisible(true);
				        dispose(); 
					}
					else if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty())
						JOptionPane.showMessageDialog(null, "Please enter username and password!");
					else {
						JOptionPane.showMessageDialog(null, "Wrong password. Please try again!");
						txtUsername.setText("");
						txtPassword.setText("");
					}
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong password. Please try again!");
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		//button "Clear"
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(30, 195, 134, 36);
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtPassword.setText("");
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel TitleLabel = new JLabel("Admin Login");
		TitleLabel.setBounds(90, 27, 163, 42);
		TitleLabel.setForeground(Color.DARK_GRAY);
		TitleLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
		);
		GroupLayout gl_panel_1_3 = new GroupLayout(panel_1_3);
		gl_panel_1_3.setHorizontalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addGap(8)
					.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1_3.setVerticalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addGroup(gl_panel_1_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1_3.createSequentialGroup()
							.addGap(7)
							.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_1_3.setLayout(gl_panel_1_3);
		GroupLayout gl_panel_1_2 = new GroupLayout(panel_1_2);
		gl_panel_1_2.setHorizontalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addGap(8)
					.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addGap(169))
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addGap(106)
					.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_panel_1_2.setVerticalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addGap(5)
					.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
		);
		panel_1_2.setLayout(gl_panel_1_2);
		
		//back button to main page
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 10, 46, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame = new MainPage();
				frame.setVisible(true);
				dispose(); 
			}
		});
		panel.setLayout(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(AdminLogin.class.getResource("back.png")));
		panel.add(btnNewButton);
		panel.add(TitleLabel);
		panel.add(panel_1_2);
		panel.add(panel_1_3);
		panel.add(btnClear);
		panel.add(btnLogin);
		contentPane.setLayout(gl_contentPane);	
	}
}
