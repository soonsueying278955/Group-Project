package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1407, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 1393, 707);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Label5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("hotel.jpg")).getImage();
		Label5.setIcon(new ImageIcon(img5));
		Label5.setBounds(675, 433, 273, 264);
		panel.add(Label5);
		
		JLabel Label4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("Massage room.jpg")).getImage();
		Label4.setIcon(new ImageIcon(img4));
		Label4.setBounds(1201, 36, 202, 200);
		panel.add(Label4);
		
		JLabel Label3 = new JLabel("");
		Label3.setVerticalAlignment(SwingConstants.BOTTOM);
		Image img3 = new ImageIcon(this.getClass().getResource("GYM.jpg")).getImage();
		Label3.setIcon(new ImageIcon(img3));
		Label3.setBounds(1013, 91, 200, 193);
		panel.add(Label3);
		
		JLabel Label2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("restaurant.jpg")).getImage();
		Label2.setIcon(new ImageIcon(img2));
		Label2.setBounds(938, 271, 273, 264);
		panel.add(Label2);
		
		JLabel Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("historic house.jpg")).getImage();
		Label.setIcon(new ImageIcon(img));
		Label.setBounds(948, 514, 251, 193);
		panel.add(Label);
		
		JLabel Label1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("sailing boat.jpg")).getImage();
		Label1.setIcon(new ImageIcon(img1));
		Label1.setBounds(1152, 236, 251, 500);
		panel.add(Label1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 191, 255), 3));
		panel_1.setBounds(124, 53, 665, 87);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel companyName = new JLabel("Meti Travel");
		Image image = new ImageIcon(this.getClass().getResource("homepage.png")).getImage();
		companyName.setIcon(new ImageIcon(image));
		companyName.setFont(new Font("Bodoni MT Poster Compressed", Font.ITALIC, 65));
		companyName.setBounds(182, 10, 315, 63);
		panel_1.add(companyName);
		
		JButton btnCustomerRegistration = new JButton("Customer Registration");
		btnCustomerRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration cr = new CustomerRegistration(); //calling another frame/window
				cr.setModalExclusionType(null);
	            cr.setVisible(true);
	            dispose();
			}
		});
		Image register = new ImageIcon(this.getClass().getResource("customer registration.png")).getImage();
		btnCustomerRegistration.setIcon(new ImageIcon(register));
		btnCustomerRegistration.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCustomerRegistration.setBounds(197, 228, 383, 57);
		panel.add(btnCustomerRegistration);
		
		JButton btnProduct = new JButton("Product Description");
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription product = new ProductDescription(); //calling another frame/window
				product.setModalExclusionType(null);
	            product.setVisible(true);
	            dispose();
			}
		});
		Image p = new ImageIcon(this.getClass().getResource("product.png")).getImage();
		btnProduct.setIcon(new ImageIcon(p));
		btnProduct.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnProduct.setBounds(197, 322, 383, 57);
		panel.add(btnProduct);
		
		JButton btnBooking = new JButton("Booking System");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingSystem booking = new BookingSystem(); //calling another frame/window
				booking.setModalExclusionType(null);
				booking.setVisible(true);
				dispose();
			}
		});
		Image b = new ImageIcon(this.getClass().getResource("booking.png")).getImage();
		btnBooking.setIcon(new ImageIcon(b));
		btnBooking.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBooking.setBounds(197, 414, 383, 57);
		panel.add(btnBooking);
		
		JButton btnCompanyBackground = new JButton("Company Background");
		btnCompanyBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground background = new CompanyBackground(); //calling another frame/window
				background.setModalExclusionType(null);
				background.setVisible(true);
				dispose();
			}
		});
		Image background = new ImageIcon(this.getClass().getResource("company background.png")).getImage();
		btnCompanyBackground.setIcon(new ImageIcon(background));
		btnCompanyBackground.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnCompanyBackground.setBounds(197, 508, 383, 57);
		panel.add(btnCompanyBackground);
		
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
		btnLogout.setBounds(21, 654, 139, 29);
		panel.add(btnLogout);
	}
}
