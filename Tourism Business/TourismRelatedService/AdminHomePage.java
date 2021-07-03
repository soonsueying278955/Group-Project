package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1419, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(0, 0, 1405, 729);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(245, 255, 250), 3));
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(10, 10, 1385, 103);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel companyName = new JLabel("Meti Travel");
		Image image = new ImageIcon(this.getClass().getResource("homepage.png")).getImage();
		companyName.setIcon(new ImageIcon(image));
		companyName.setFont(new Font("Bodoni MT Poster Compressed", Font.ITALIC, 65));
		companyName.setBounds(79, 9, 608, 84);
		panel_1.add(companyName);
		
		JButton btnEmployee = new JButton("Employee Management");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement employee = new EmployeeManagement(); //calling another frame/window
				employee.setModalExclusionType(null);
				employee.setVisible(true);
				dispose();
			}
		});
		Image s = new ImageIcon(this.getClass().getResource("setting.png")).getImage();
		btnEmployee.setIcon(new ImageIcon(s));
		btnEmployee.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnEmployee.setBounds(220, 266, 416, 61);
		panel.add(btnEmployee);
		
		JButton btnAdvertisement = new JButton("Advertisement & Marketing");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementNMarketing marketing = new AdvertisementNMarketing(); //calling another frame/window
				marketing.setModalExclusionType(null);
				marketing.setVisible(true);
				dispose();
			}
		});
		Image m = new ImageIcon(this.getClass().getResource("Marketing.png")).getImage();
		btnAdvertisement.setIcon(new ImageIcon(m));
		btnAdvertisement.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnAdvertisement.setBounds(220, 354, 416, 61);
		panel.add(btnAdvertisement);
		
		JButton btnReplacePrice = new JButton("Replace Price");
		btnReplacePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PriceReplace p = new PriceReplace(); //calling another frame/window
				p.setModalExclusionType(null);
				p.setVisible(true);
				dispose();
			}
		});
		Image p = new ImageIcon(this.getClass().getResource("price-icon.png")).getImage();
		btnReplacePrice.setIcon(new ImageIcon(p));
		btnReplacePrice.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReplacePrice.setBounds(220, 439, 416, 61);
		panel.add(btnReplacePrice);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance(); //calling another frame/window
				finance.setModalExclusionType(null);
				finance.setVisible(true);
				dispose();
			}
		});
		Image f = new ImageIcon(this.getClass().getResource("Finance Cash.png")).getImage();
		btnFinance.setIcon(new ImageIcon(f));
		btnFinance.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnFinance.setBounds(220, 530, 416, 61);
		panel.add(btnFinance);
		
		
		JLabel Label1 = new JLabel("");
		Image office = new ImageIcon(this.getClass().getResource("office.jpg")).getImage();
		Label1.setIcon(new ImageIcon(office));
		Label1.setBounds(975, 439, 430, 290);
		panel.add(Label1);
		
		JLabel Label2 = new JLabel("");
		Image e = new ImageIcon(this.getClass().getResource("employee.jpg")).getImage();
		Label2.setIcon(new ImageIcon(e));
		Label2.setBounds(865, 101, 530, 400);
		panel.add(Label2);
		
		JLabel welcome = new JLabel("Hi, welcome back");
		welcome.setBounds(58, 123, 300, 83);
		panel.add(welcome);
		welcome.setFont(new Font("Monotype Corsiva", Font.PLAIN, 45));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logout Successful");
				Login login = new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
	            dispose();
			}
		});
		Image logout = new ImageIcon(this.getClass().getResource("logout.png")).getImage();
		btnLogout.setIcon(new ImageIcon(logout));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogout.setBounds(29, 668, 139, 29);
		panel.add(btnLogout);
		
	}
}
