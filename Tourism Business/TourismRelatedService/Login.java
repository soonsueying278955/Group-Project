package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private final ButtonGroup button = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1408, 746);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1394, 709);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome To Meti Travel");
		welcome.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 60));
		welcome.setBounds(386, 26, 675, 90);
		panel.add(welcome);
		
		JRadioButton clientButton = new JRadioButton("Client");
		button.add(clientButton);
		clientButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		clientButton.setBounds(970, 195, 124, 38);
		panel.add(clientButton);
		
		JRadioButton adminButton = new JRadioButton("Admin");
		button.add(adminButton);
		adminButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		adminButton.setBounds(1161, 197, 124, 38);
		panel.add(adminButton);
		
		JLabel username = new JLabel("Username");
		username.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		username.setBounds(767, 258, 162, 38);
		panel.add(username);
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameTextField.setBounds(970, 258, 315, 38);
		panel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel pwsd = new JLabel("Password");
		pwsd.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 35));
		pwsd.setBounds(767, 331, 162, 38);
		panel.add(pwsd);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(970, 331, 315, 35);
		panel.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxShowPassword.setBounds(970, 372, 162, 29);
		panel.add(chckbxShowPassword);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBackground(UIManager.getColor("Button.background"));
		cancelButton.setForeground(Color.RED);
		cancelButton.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		cancelButton.setBounds(962, 420, 142, 35);
		panel.add(cancelButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(UIManager.getColor("Button.background"));
		loginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (clientButton.isSelected()) {
						if(usernameTextField.getText().equals("user123") && passwordField.getText().equals("abc123")) {
							JOptionPane.showMessageDialog(null, "Login Successful");
							
							UserHomePage user = new UserHomePage(); //calling another frame/window
							user.setModalExclusionType(null);
							user.setVisible(true);
							dispose(); // login frame will disappear
						}else
							JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					}
					else if (adminButton.isSelected()) {
						if(usernameTextField.getText().equals("admin456") && passwordField.getText().equals("xyz456")) {
							JOptionPane.showMessageDialog(null, "Login Successful");
							
							AdminHomePage admin = new AdminHomePage(); //calling another frame/window
							admin.setModalExclusionType(null);
							admin.setVisible(true);
							dispose(); // login frame will disappear
						}else
							JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					}else {
						JOptionPane.showMessageDialog(null, "Please enter the right username and password");
					}
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password.");
				}
			}
		});
		loginButton.setForeground(Color.BLUE);
		loginButton.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		loginButton.setBounds(1187, 420, 142, 35);
		panel.add(loginButton);
		
		
		JButton newAcc = new JButton("Click here to create a new account");
		newAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterForm form = new RegisterForm();
				form.setModalExclusionType(null);
				form.setVisible(true);
			}
		});
		Image image = new ImageIcon(this.getClass().getResource("click icon.png")).getImage();
		newAcc.setIcon(new ImageIcon(image));
		newAcc.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		newAcc.setBounds(962, 481, 367, 41);
		panel.add(newAcc);
		
		JLabel Label2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("surfing.jpg")).getImage();
		Label2.setIcon(new ImageIcon(img2));
		Label2.setBounds(386, 404, 300, 282);
		panel.add(Label2);
		
		JLabel Label1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("Camping.jpg")).getImage();
		Label1.setIcon(new ImageIcon(img1));
		Label1.setBounds(39, 432, 367, 267);
		panel.add(Label1);
		
		JLabel Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("map.jpg")).getImage();
		Label.setIcon(new ImageIcon(img));
		Label.setBounds(121, 111, 500, 334);
		panel.add(Label);
	}

}
