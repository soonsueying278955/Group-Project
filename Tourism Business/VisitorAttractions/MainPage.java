package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JButton btnPTT;
	private JButton btnS;
	private JButton btnKR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainPage() {	
		initComponents();
	}
	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 716);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About");
		mnHome.add(mntmNewMenuItem_4);
		mnHome.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About frame = new About();
				frame.setVisible(true);
				dispose(); 
			}
		});
		
		JMenu mnPricing = new JMenu("Tickets");
		menuBar.add(mnPricing);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Booking");
		mnPricing.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tickets frame = new Tickets();
				frame.setVisible(true);
				dispose(); 
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Promotions");
		mnPricing.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertise frame = new Advertise();
				frame.setVisible(true);
				dispose(); 
			}
		});
		
		JMenu mnAdmin = new JMenu("Login");
		menuBar.add(mnAdmin);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Admin");
		mnAdmin.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin frame = new AdminLogin();
				frame.setVisible(true);
				dispose(); 
			}
		});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Customer ");
		mnAdmin.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin frame = new CustomerLogin();
				frame.setVisible(true);
				dispose(); 
			}
		});
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 831, 53);
		panel_1.setBackground(Color.GRAY);
		
		JLabel lblWelcome = new JLabel("welcome to");
		lblWelcome.setForeground(Color.YELLOW);
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		
		JLabel lblGK = new JLabel("GK Visitor Attraction System");
		lblGK.setForeground(Color.PINK);
		lblGK.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 39));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(22)
					.addComponent(lblWelcome, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGK, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
					.addGap(70))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWelcome)
						.addComponent(lblGK, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(74, 126, 320, 220);
		panel_2.setBackground(Color.LIGHT_GRAY);
		
		btnPTT = new JButton("");
		btnPTT.setBackground(Color.LIGHT_GRAY);
		btnPTT.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPTT.setIcon(new ImageIcon(MainPage.class.getResource("ptt3.jpg")));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(441, 220, 320, 220);
		panel_3.setBackground(Color.LIGHT_GRAY);
		
		btnS = new JButton("");
		btnS.setIcon(new ImageIcon(MainPage.class.getResource("stadthuys.jpg")));
		btnS.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnS.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
					.addGap(11))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 202, Short.MAX_VALUE)
					.addGap(9))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(66, 403, 320, 179);
		panel_4.setBackground(Color.LIGHT_GRAY);
		
		btnKR = new JButton("");
		btnKR.setIcon(new ImageIcon(MainPage.class.getResource("river.jpg")));
		btnKR.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnKR.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnKR, GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
					.addGap(11))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnKR, GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE)
					.addGap(12))
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel lblPETRONAS = new JLabel("PETRONAS TWIN TOWERS");
		lblPETRONAS.setBounds(38, 88, 400, 37);
		lblPETRONAS.setForeground(Color.WHITE);
		lblPETRONAS.setFont(new Font("Segoe Print", Font.BOLD, 29));
		
		JLabel lblRIVER = new JLabel("KINABATANGAN RIVER");
		lblRIVER.setBounds(49, 366, 354, 37);
		lblRIVER.setForeground(Color.WHITE);
		lblRIVER.setFont(new Font("Segoe Print", Font.BOLD, 29));
		
		JLabel lblSTADTHUYS = new JLabel("STADTHUYS");
		lblSTADTHUYS.setBounds(515, 185, 192, 37);
		lblSTADTHUYS.setForeground(Color.WHITE);
		lblSTADTHUYS.setFont(new Font("Segoe Print", Font.BOLD, 29));
		contentPane.setLayout(gl_contentPane);
		panel.setLayout(null);
		panel.add(panel_1);
		panel.add(panel_2);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(btnPTT, GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addComponent(btnPTT, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_2.setLayout(gl_panel_2);
		panel.add(lblPETRONAS);
		panel.add(lblSTADTHUYS);
		panel.add(panel_3);
		panel.add(panel_4);
		panel.add(lblRIVER);
		
		
			
	}
}
