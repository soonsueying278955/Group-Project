package Restaurant;

import java.awt.BorderLayout; 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField UserNametextField;
	private JTextField PasswordtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setTitle("Log In System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 564);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//

		//
		JLabel lblNewLabel = new JLabel("Xymaxx Restaurant Login System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(27, 13, 585, 72);
		contentPane.add(lblNewLabel);
		
		JLabel UsernameLabel = new JLabel("User Name");
		UsernameLabel.setForeground(Color.WHITE);
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		UsernameLabel.setBounds(66, 169, 184, 72);
		contentPane.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setForeground(Color.WHITE);
		PasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setBounds(66, 263, 184, 72);
		contentPane.add(PasswordLabel);
		
		UserNametextField = new JTextField();
		UserNametextField.setHorizontalAlignment(SwingConstants.CENTER);
		UserNametextField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		UserNametextField.setBounds(311, 172, 246, 66);
		contentPane.add(UserNametextField);
		UserNametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordtextField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		PasswordtextField.setColumns(10);
		PasswordtextField.setBounds(311, 266, 246, 66);
		contentPane.add(PasswordtextField);
		
		JComboBox idencomboBox = new JComboBox();
		idencomboBox.setModel(new DefaultComboBoxModel(new String[] {"Selection", "Admin", "User"}));
		idencomboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		idencomboBox.setBounds(311, 108, 146, 28);
		contentPane.add(idencomboBox);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserNametextField.setText("");
				PasswordtextField.setText("");
			}
		});
		ResetButton.setBounds(195, 445, 194, 59);
		contentPane.add(ResetButton);
		
		JButton LogInButton = new JButton("Log In");
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(idencomboBox.getSelectedItem().equals("Admin")) {
						if(UserNametextField.getText().equals("Xymaxx") && PasswordtextField.getText().equals("xr0000")) {
							JOptionPane.showMessageDialog(null, "Log In Successful!");
						//
							Service se = new Service(); //calling another frame/window
							se.setModalExclusionType(null);
							se.setVisible(true);
						//
						}else
							JOptionPane.showMessageDialog(null, "Enter the correct username and password!");
					
					}else if (idencomboBox.getSelectedItem().equals("User")) {
						if(UserNametextField.getText().equals("User") && PasswordtextField.getText().equals("user9999")){
							JOptionPane.showMessageDialog(null, "Log In Successful!");
						//
							ServiceUser su = new ServiceUser();
							su.setModalExclusionType(null);
							su.setVisible(true);
						//	
					}else 
						JOptionPane.showMessageDialog(null, "Log In Unsuccessful!");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter the correct username and password!");
				}
			}
		});
		LogInButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		LogInButton.setBounds(195, 373, 194, 59);
		contentPane.add(LogInButton);
		
		JLabel lblLoginAs = new JLabel("Login As:");
		lblLoginAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginAs.setForeground(Color.WHITE);
		lblLoginAs.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblLoginAs.setBounds(125, 85, 184, 72);
		contentPane.add(lblLoginAs);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Registration.class.getResource("eattttt.png")));
		lblNewLabel_1.setBounds(0, 0, 624, 517);
		contentPane.add(lblNewLabel_1);
	}
}
