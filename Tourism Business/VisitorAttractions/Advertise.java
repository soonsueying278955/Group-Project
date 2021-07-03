package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Advertise extends JFrame {

	private JPanel contentPane;
	private JTextField txtBestPromotionsEver;
	private JTextField txtBirthdaySpecial;
	private JTextField txtSpecial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertise frame = new Advertise();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	public Advertise() {
		initComponenets();	
	}
	private void initComponenets() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Advertise.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 465);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 38, 480, 51);
		panel.setBackground(Color.LIGHT_GRAY);
		
		txtBestPromotionsEver = new JTextField();
		txtBestPromotionsEver.setBorder(null);
		txtBestPromotionsEver.setForeground(Color.YELLOW);
		txtBestPromotionsEver.setBackground(Color.LIGHT_GRAY);
		txtBestPromotionsEver.setFont(new Font("Engravers MT", Font.BOLD | Font.ITALIC, 25));
		txtBestPromotionsEver.setText("BEST PROMOTIONS EVER");
		txtBestPromotionsEver.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 99, 217, 73);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);
		
		txtBirthdaySpecial = new JTextField();
		txtBirthdaySpecial.setBackground(Color.PINK);
		txtBirthdaySpecial.setBorder(null);
		txtBirthdaySpecial.setForeground(Color.MAGENTA);
		txtBirthdaySpecial.setFont(new Font("DengXian Light", Font.ITALIC, 28));
		txtBirthdaySpecial.setText("birthday");
		txtBirthdaySpecial.setBounds(22, 0, 108, 44);
		panel_1.add(txtBirthdaySpecial);
		txtBirthdaySpecial.setColumns(10);
		
		txtSpecial = new JTextField();
		txtSpecial.setBackground(Color.PINK);
		txtSpecial.setBorder(null);
		txtSpecial.setForeground(Color.MAGENTA);
		txtSpecial.setText("special!");
		txtSpecial.setFont(new Font("DengXian Light", Font.ITALIC, 28));
		txtSpecial.setColumns(10);
		txtSpecial.setBounds(104, 36, 103, 35);
		panel_1.add(txtSpecial);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Advertise.class.getResource("balloon.png")));
		lblNewLabel.setBounds(66, 36, 37, 44);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Advertise.class.getResource("normalB.png")));
		lblNewLabel_1.setBounds(154, 0, 48, 44);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(263, 99, 217, 73);
		panel_1_1.setBackground(Color.ORANGE);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SENIORS PLAY");
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		lblNewLabel_2.setIcon(new ImageIcon(Advertise.class.getResource("elderly.png")));
		lblNewLabel_2.setBounds(10, 0, 197, 73);
		panel_1_1.add(lblNewLabel_2);
		
		JTextArea txtrCelebrateYourBirthday = new JTextArea();
		txtrCelebrateYourBirthday.setBounds(20, 176, 217, 172);
		txtrCelebrateYourBirthday.setBackground(Color.GRAY);
		txtrCelebrateYourBirthday.setForeground(Color.WHITE);
		txtrCelebrateYourBirthday.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtrCelebrateYourBirthday.setText("Celebrate your birthday with us\r\nand bring FIVE people to share \r\nin the joy with our \r\nONLINE Birthday Special \r\n              \u2018Buy 5 FREE 1'!!\r\n\r\nTicket(s) Validity: \r\nValid during birthday month\r\n");
		
		JTextArea txtrJustBecauseWe = new JTextArea();
		txtrJustBecauseWe.setBounds(263, 178, 217, 110);
		txtrJustBecauseWe.setText("Just Because we are getting \r\nolder, it doesn\u2019t mean we stop \r\nhaving fun! Seniors which are \r\n65 years old above get to play \r\nfor FREE!!\r\n");
		txtrJustBecauseWe.setForeground(Color.WHITE);
		txtrJustBecauseWe.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtrJustBecauseWe.setBackground(Color.GRAY);
		
		//button "buy now" and move to birthday promotion page
		JButton btnNewButton = new JButton("BUY NOW");
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setBounds(20, 372, 217, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BirthdayPrice frame = new BirthdayPrice();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		//button "buy now" and move to elderly play page
		JButton btnNewButton_1 = new JButton("BUY NOW");
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBounds(263, 372, 217, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElderlyPlay frame = new ElderlyPlay();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(10, 0, 48, 35);
		btnNewButton_2.setBackground(Color.GRAY);
		//back button to main page
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame = new MainPage();
				frame.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Advertise.class.getResource("back.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(txtBestPromotionsEver, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
					.addGap(21))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(txtBestPromotionsEver, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2);
		contentPane.add(panel);
		contentPane.add(panel_1);
		contentPane.add(panel_1_1);
		contentPane.add(txtrCelebrateYourBirthday);
		contentPane.add(txtrJustBecauseWe);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
	}
}
