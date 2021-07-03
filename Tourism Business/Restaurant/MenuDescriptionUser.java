package Restaurant;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class MenuDescriptionUser extends JFrame {

	private JFrame frmMenuAndTheme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDescriptionUser window = new MenuDescriptionUser();
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
	public MenuDescriptionUser() {
		setTitle("Menu and Theme Description");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuDescription.class.getResource("icon.png")));
		setBounds(100, 100, 775, 529);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Xymaxx Restaurant Menu Description");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(100, 13, 593, 54);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(100, 144, 308, 188);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Mon/Wed/Fri \t: The Amazing Malaysia");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(12, 43, 284, 31);
		panel.add(lblNewLabel_4);
		
		JLabel lblTuethursatThe = new JLabel("Tue/Thur/Sat \t: The Uniqueness of Malaysia");
		lblTuethursatThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuethursatThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblTuethursatThe.setBounds(12, 88, 284, 31);
		panel.add(lblTuethursatThe);
		
		JLabel lblSunThe = new JLabel("Sun \t\t: The best out of the best in Malaysia");
		lblSunThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblSunThe.setBounds(12, 132, 284, 31);
		panel.add(lblSunThe);
		
		JLabel lblTheme = new JLabel("Theme: ");
		lblTheme.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheme.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblTheme.setBounds(12, 13, 284, 31);
		panel.add(lblTheme);
		
		JLabel lblNewLabel_1 = new JLabel("Xymaxx Restaurant serves Malaysian Tradisional dishes without occasional excursions into other countries' ingredients and style!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(12, 63, 739, 41);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Xymaxx Restaurants have different themes everyday as shown below:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(81, 105, 593, 26);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Mon/Wed/Fri");
		btnNewButton_1.setBounds(447, 169, 126, 44);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				MenuMWFUser mu1 = new MenuMWFUser();
				mu1.setModalExclusionType(null);
				mu1.setVisible(true);
				//
			}
		});
		btnNewButton_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnTuethursat = new JButton("Tue/Thur/Sat");
		btnTuethursat.setBounds(601, 220, 126, 44);
		getContentPane().add(btnTuethursat);
		btnTuethursat.setBackground(new Color(255, 218, 185));
		btnTuethursat.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTuethursat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				MenuTTSUser m2 = new MenuTTSUser();
				m2.setModalExclusionType(null);
				m2.setVisible(true);
				//
			}
		});
		
		JButton btnSunday = new JButton("Sunday");
		btnSunday.setBounds(447, 271, 126, 44);
		getContentPane().add(btnSunday);
		btnSunday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Xymaxx Restaurants will have the top ranked Malaysian Tradisional Dishes of the week on every Sunday."
						+ "\nDon't forget to rate the best Malaysian Tradisional dishes you think at Customer Review! "
						, "Highlight dishes for Sunday", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnSunday.setBackground(new Color(255, 218, 185));
		btnSunday.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon(MenuDescription.class.getResource("e1.png")));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(601, 424, 156, 58);
		getContentPane().add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(279, 345, 180, 119);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRank = new JButton("Review!");
		btnRank.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CustomerReview CR = new CustomerReview();
				CR.setModalExclusionType(null);
				CR.setVisible(true);
				//
			}
		});
		btnRank.setBounds(19, 52, 149, 54);
		panel_1.add(btnRank);
		btnRank.setForeground(Color.BLACK);
		btnRank.setBackground(new Color(255, 204, 255));
		
		JLabel lblNewLabel_6 = new JLabel("Customer Review");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(19, 13, 149, 26);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(MenuDescription.class.getResource("mn1.png")));
		lblNewLabel_5.setBounds(0, 0, 760, 482);
		getContentPane().add(lblNewLabel_5);
		
	}
}
