package VisitorAttractions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuVA extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuVA frame = new MenuVA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MenuVA() {		
		initComponents();
	}
	private void initComponents() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuVA.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 206);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(34, 25, 115, 80);
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBorder(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MenuVA.class.getResource("employee icon.png")));
		
		JButton btnNewButton_2_1 = new JButton("EMPLOYEE");
		btnNewButton_2_1.setBounds(34, 115, 115, 34);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(323, 25, 123, 80);
		panel_2_1_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_1.setBorder(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MenuVA.class.getResource("finance icon.png")));
		
		JButton btnNewButton_2_1_1 = new JButton("FINANCE");
		btnNewButton_2_1_1.setBounds(323, 115, 123, 34);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JButton btnNewButton_2_1_1_2 = new JButton("");
		btnNewButton_2_1_1_2.setBounds(5, 5, 41, 34);
		btnNewButton_2_1_1_2.setIcon(new ImageIcon(MenuVA.class.getResource("back.png")));
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin frame = new AdminLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2_1_1_2.setBorder(null);
		btnNewButton_2_1_1_2.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_2_1_1 = new GroupLayout(panel_2_1_1);
		gl_panel_2_1_1.setHorizontalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(31))
		);
		gl_panel_2_1_1.setVerticalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
		);
		panel_2_1_1.setLayout(gl_panel_2_1_1);
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(20))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_2_1_1_2);
		contentPane.add(panel_2_1);
		contentPane.add(panel_2_1_1);
		contentPane.add(btnNewButton_2_1);
		contentPane.add(btnNewButton_2_1_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(null);
		panel_2_1_2.setBackground(Color.LIGHT_GRAY);
		panel_2_1_2.setBounds(179, 25, 115, 80);
		contentPane.add(panel_2_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(MenuVA.class.getResource("details icon.png")));
		GroupLayout gl_panel_2_1_2 = new GroupLayout(panel_2_1_2);
		gl_panel_2_1_2.setHorizontalGroup(
			gl_panel_2_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 115, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1_2.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addGap(20))
		);
		gl_panel_2_1_2.setVerticalGroup(
			gl_panel_2_1_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 80, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1_2.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_2_1_2.setLayout(gl_panel_2_1_2);
		
		JButton btnNewButton_2_1_2 = new JButton("SET PRICE");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditPrice frame = new EditPrice();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_2_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2_1_2.setBounds(179, 115, 115, 34);
		contentPane.add(btnNewButton_2_1_2);
	}
}
