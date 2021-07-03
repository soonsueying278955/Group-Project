package TravelAndTransport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class GuestHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestHome frame = new GuestHome();
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
	public GuestHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("small-axe.png")));
		setTitle("Guest Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 491);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About Company");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackGround_Guest frame = new CompanyBackGround_Guest();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Home");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main home = new Main();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		panel.setBounds(0, 0, 770, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(73, 27, 633, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TY Travel Agency welcomes You! ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 613, 40);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("travel_icon1.jpg")));
		lblNewLabel_1.setBounds(239, 97, 209, 188);
		panel.add(lblNewLabel_1);
		
		JButton btnCustomer = new JButton("Book Travel");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_bookTravel frame = new Customer_bookTravel();
				frame.setModalExclusionType(null);
	            frame.setVisible(true);
	            dispose();
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnCustomer.setBounds(32, 339, 165, 52);
		panel.add(btnCustomer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.RED));
		panel_2.setBounds(551, 111, 189, 280);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnFinance = new JButton("Click HERE!");
		btnFinance.setBounds(10, 218, 169, 52);
		panel_2.add(btnFinance);
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertising_Guest frame = new Advertising_Guest();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		btnFinance.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		
		JLabel lblNewLabel_2 = new JLabel("HEADS UP! ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(10, 116, 169, 41);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Promotion EVENT!");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 136, 169, 72);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(49, 10, 101, 100);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(GuestHome.class.getResource("giveaway_a1.png")));
		
		JButton btnViewPackage = new JButton("View Package");
		btnViewPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Package_GuestView frm = new Package_GuestView();
				frm.setModalExclusionType(null);
				frm.setVisible(true);
			}
		});
		btnViewPackage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		btnViewPackage.setBounds(283, 339, 179, 52);
		panel.add(btnViewPackage);
		
		
	}
}
