package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1259, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1244, 784);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(10, 10, 1226, 110);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBackground = new JLabel("Company Background");
		lblBackground.setFont(new Font("Pristina", Font.BOLD, 65));
		lblBackground.setBounds(336, 0, 550, 110);
		panel_1.add(lblBackground);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 240));
		panel_2.setBounds(10, 130, 1226, 648);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("image.jpg")).getImage();
		Label.setIcon(new ImageIcon(img));
		Label.setBounds(30, 48, 440, 550);
		panel_2.add(Label);
		
		JLabel lblName = new JLabel("Name : Meti Travel");
		Image name = new ImageIcon(this.getClass().getResource("name.png")).getImage();
		lblName.setIcon(new ImageIcon(name));
		lblName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblName.setBounds(496, 24, 430, 54);
		panel_2.add(lblName);
		
		JLabel lblYear = new JLabel("Establish Year : 2007");
		Image year = new ImageIcon(this.getClass().getResource("calendar.png")).getImage();
		lblYear.setIcon(new ImageIcon(year));
		lblYear.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblYear.setBounds(496, 88, 430, 54);
		panel_2.add(lblYear);
		
		JLabel lblBusinessTime = new JLabel("Business Time : 9.00am - 9.00pm");
		Image time = new ImageIcon(this.getClass().getResource("Time.png")).getImage();
		lblBusinessTime.setIcon(new ImageIcon(time));
		lblBusinessTime.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblBusinessTime.setBounds(496, 152, 555, 54);
		panel_2.add(lblBusinessTime);
		
		JLabel lblWebsite = new JLabel("Website : www.metitravel.com.my");
		Image website = new ImageIcon(this.getClass().getResource("Website.png")).getImage();
		lblWebsite.setIcon(new ImageIcon(website));
		lblWebsite.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblWebsite.setBounds(496, 216, 563, 54);
		panel_2.add(lblWebsite);
		
		JLabel lblEmail = new JLabel("Email : metitravel@yahoo.com");
		Image mail = new ImageIcon(this.getClass().getResource("mail.png")).getImage();
		lblEmail.setIcon(new ImageIcon(mail));
		lblEmail.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblEmail.setBounds(496, 277, 652, 54);
		panel_2.add(lblEmail);
		
		JLabel lblFB = new JLabel("Facebook : Meti Travel");
		Image fb = new ImageIcon(this.getClass().getResource("fb.png")).getImage();
		lblFB.setIcon(new ImageIcon(fb));
		lblFB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblFB.setBounds(496, 337, 545, 54);
		panel_2.add(lblFB);
		
		JLabel lblInsta = new JLabel("Instagram : meti_travel07");
		Image insta = new ImageIcon(this.getClass().getResource("instagram.png")).getImage();
		lblInsta.setIcon(new ImageIcon(insta));
		lblInsta.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblInsta.setBounds(496, 401, 545, 54);
		panel_2.add(lblInsta);
		
		JLabel lblPhoneNum = new JLabel("No. Tel : 03-5879460");
		Image hp = new ImageIcon(this.getClass().getResource("Phone.png")).getImage();
		lblPhoneNum.setIcon(new ImageIcon(hp));
		lblPhoneNum.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblPhoneNum.setBounds(496, 459, 450, 54);
		panel_2.add(lblPhoneNum);
		
		JLabel lblAddress = new JLabel("Address : No.49, Jalan APP Yan, Tanah Biru");
		Image address = new ImageIcon(this.getClass().getResource("address.png")).getImage();
		lblAddress.setIcon(new ImageIcon(address));
		lblAddress.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblAddress.setBounds(496, 523, 690, 54);
		panel_2.add(lblAddress);
		
		JLabel lblAddress2 = new JLabel("43300, Petaling, Kuala Lumpur");
		lblAddress2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		lblAddress2.setBounds(687, 589, 471, 54);
		panel_2.add(lblAddress2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomePage home = new UserHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(30, 608, 102, 30);
		panel_2.add(btnExit);
	}
}
