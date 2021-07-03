package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MenuTTSUser extends JFrame {

	private JFrame frmTheUniquenessOf;
	private JTextField textFieldd1;
	private JTextField textFieldd2;
	private JTextField textFieldd6;
	private JTextField textFieldd3;
	private JTextField textFieldd5;
	private JTextField textFieldd4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTTSUser window = new MenuTTSUser();
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
	public MenuTTSUser() {

		setTitle("The Uniqueness of Malaysia");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuTTSAdmin.class.getResource("icon.png")));
		setBounds(100, 100, 747, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		//frmTheUniquenessOf.getContentPane().add(lblBakKutTeh);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(MenuTTSAdmin.class.getResource("e1.png")));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		button.setBackground(Color.BLACK);
		button.setBounds(591, 0, 138, 60);
		getContentPane().add(button);
		//frmTheUniquenessOf.getContentPane().add(lblHainaneseChickenRice);
		
		JLabel lblTheUniquenessOf = new JLabel("The Uniqueness of Malaysia");
		lblTheUniquenessOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheUniquenessOf.setForeground(Color.WHITE);
		lblTheUniquenessOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblTheUniquenessOf.setBounds(61, 0, 587, 56);
		getContentPane().add(lblTheUniquenessOf);
		//frmTheUniquenessOf.getContentPane().add(lblTheUniquenessOf);
		
		JLabel label_13 = new JLabel("Highlight dishes: ");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		label_13.setBounds(229, 46, 233, 56);
		getContentPane().add(label_13);
		
		textFieldd1 = new JTextField();
		textFieldd1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd1.setBounds(61, 163, 172, 59);
		getContentPane().add(textFieldd1);
		textFieldd1.setColumns(10);
		
		textFieldd2 = new JTextField();
		textFieldd2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd2.setColumns(10);
		textFieldd2.setBounds(490, 177, 172, 59);
		getContentPane().add(textFieldd2);
		
		textFieldd6 = new JTextField();
		textFieldd6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd6.setColumns(10);
		textFieldd6.setBounds(526, 300, 172, 59);
		getContentPane().add(textFieldd6);
		
		textFieldd3 = new JTextField();
		textFieldd3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd3.setColumns(10);
		textFieldd3.setBounds(246, 262, 172, 59);
		getContentPane().add(textFieldd3);
		
		textFieldd5 = new JTextField();
		textFieldd5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd5.setColumns(10);
		textFieldd5.setBounds(318, 374, 172, 59);
		getContentPane().add(textFieldd5);
		
		textFieldd4 = new JTextField();
		textFieldd4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldd4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldd4.setColumns(10);
		textFieldd4.setBounds(37, 361, 172, 59);
		getContentPane().add(textFieldd4);
		
		JButton btnNewButton = new JButton("Show!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				textFieldd1.setText(MenuTTSAdmin.dish1);
				textFieldd2.setText(MenuTTSAdmin.dish2);
				textFieldd3.setText(MenuTTSAdmin.dish3);
				textFieldd4.setText(MenuTTSAdmin.dish4);
				textFieldd5.setText(MenuTTSAdmin.dish5);
				textFieldd6.setText(MenuTTSAdmin.dish6);
				//
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(321, 524, 145, 60);
		getContentPane().add(btnNewButton);
		//frmTheUniquenessOf.getContentPane().add(label_13);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuTTSAdmin.class.getResource("m5.jpg")));
		lblNewLabel.setBounds(0, 0, 729, 593);
		getContentPane().add(lblNewLabel);
		//frmTheUniquenessOf.getContentPane().add(lblNewLabel);
	}
}
