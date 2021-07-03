package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MenuMWFUser extends JFrame {

	private JFrame frmTheAmazingMalaysia;
	private JButton btnNewButton;
	private JLabel lblfood1;
	private JLabel lblfood2;
	private JLabel lblfood3;
	private JLabel lblfood4;
	private JLabel lblfood5;
	private JLabel lblfood6;
	private JTextField textFieldfood1;
	private JTextField textFieldfood2;
	private JTextField textFieldfood3;
	private JTextField textFieldfood4;
	private JTextField textFieldfood5;
	private JTextField textFieldfood6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMWFUser window = new MenuMWFUser();
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
	public MenuMWFUser() {
		initialize();
	}
//
	MenuMWFUser(String food1, String food2){
		this();
		lblfood1.setText(food1);
		lblfood2.setText(food2);
	}
//	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("The Amazing Malaysia");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuMWFAdmin.class.getResource("icon.png")));
		setBounds(100, 100, 764, 636);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Amazing Malaysia");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(68, 0, 587, 56);
		getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnNewButton = new JButton("Show!");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				textFieldfood1.setText(MenuMWFAdmin.food1);
				textFieldfood2.setText(MenuMWFAdmin.food2);
				textFieldfood3.setText(MenuMWFAdmin.food3);
				textFieldfood4.setText(MenuMWFAdmin.food4);
				textFieldfood5.setText(MenuMWFAdmin.food5);
				textFieldfood6.setText(MenuMWFAdmin.food6);
				//
			}
		});
		btnNewButton.setBounds(324, 516, 145, 60);
		getContentPane().add(btnNewButton);
		btnExit.setIcon(new ImageIcon(MenuMWFAdmin.class.getResource("e1.png")));
		btnExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(608, 0, 138, 60);
		getContentPane().add(btnExit);
		
		JLabel lblHighlightDishes = new JLabel("Highlight dishes: ");
		lblHighlightDishes.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighlightDishes.setForeground(Color.WHITE);
		lblHighlightDishes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblHighlightDishes.setBounds(236, 46, 233, 56);
		getContentPane().add(lblHighlightDishes);
		
		textFieldfood1 = new JTextField();
		textFieldfood1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood1.setBounds(34, 189, 172, 59);
		getContentPane().add(textFieldfood1);
		textFieldfood1.setColumns(10);
		
		textFieldfood2 = new JTextField();
		textFieldfood2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood2.setColumns(10);
		textFieldfood2.setBounds(483, 128, 172, 59);
		getContentPane().add(textFieldfood2);
		
		textFieldfood3 = new JTextField();
		textFieldfood3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood3.setColumns(10);
		textFieldfood3.setBounds(301, 236, 172, 59);
		getContentPane().add(textFieldfood3);
		
		textFieldfood4 = new JTextField();
		textFieldfood4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood4.setColumns(10);
		textFieldfood4.setBounds(68, 338, 172, 59);
		getContentPane().add(textFieldfood4);
		
		textFieldfood5 = new JTextField();
		textFieldfood5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood5.setColumns(10);
		textFieldfood5.setBounds(324, 374, 172, 59);
		getContentPane().add(textFieldfood5);
		
		textFieldfood6 = new JTextField();
		textFieldfood6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldfood6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textFieldfood6.setColumns(10);
		textFieldfood6.setBounds(545, 283, 172, 59);
		getContentPane().add(textFieldfood6);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MenuMWFAdmin.class.getResource("m2.png")));
		lblNewLabel_3.setBounds(0, 0, 746, 589);
		getContentPane().add(lblNewLabel_3);
	}
}
