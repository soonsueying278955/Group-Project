package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class AdvertisingMarketing extends JFrame {

	private JFrame frmAdvertisingAndMarketing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisingMarketing window = new AdvertisingMarketing();
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
	public AdvertisingMarketing() {
		setTitle("Advertising and Marketing");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdvertisingMarketing.class.getResource("icon.png")));
		setBounds(100, 100, 720, 589);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Advertising and Marketing ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(100, 2, 521, 47);
		getContentPane().add(lblNewLabel);
		//frmAdvertisingAndMarketing.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Instagram");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"\nAccount: Xymaxx_Restaurant"
						+ "\nWelcome to know more about us!","Official Instagram Account", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton.setIcon(new ImageIcon(AdvertisingMarketing.class.getResource("ig1.png")));
		btnNewButton.setBounds(87, 120, 155, 54);
		getContentPane().add(btnNewButton);
		//frmAdvertisingAndMarketing.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Xymaxx Restaurant's Marketing Method: Buffet Restaurant");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(89, 50, 532, 24);
		getContentPane().add(lblNewLabel_1);
		//frmAdvertisingAndMarketing.getContentPane().add(lblNewLabel_1);
		
		JLabel lblC = new JLabel("Check more about Xymaxx Restaurant on:");
		lblC.setForeground(Color.WHITE);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblC.setBounds(127, 87, 443, 24);
		getContentPane().add(lblC);
		//frmAdvertisingAndMarketing.getContentPane().add(lblC);
		
		JButton btnFacebook = new JButton("Facebook");
		btnFacebook.setForeground(Color.WHITE);
		btnFacebook.setBackground(Color.BLACK);
		btnFacebook.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"\nAccount: Xymaxx Restaurant"
						+ "\nWelcome to know more about us!","Official Facebook Account", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnFacebook.setIcon(new ImageIcon(AdvertisingMarketing.class.getResource("fb1.png")));
		btnFacebook.setHorizontalAlignment(SwingConstants.RIGHT);
		btnFacebook.setBounds(264, 120, 155, 54);
		getContentPane().add(btnFacebook);
		//frmAdvertisingAndMarketing.getContentPane().add(btnFacebook);
		
		JButton btnTwitter = new JButton("Twitter");
		btnTwitter.setForeground(Color.WHITE);
		btnTwitter.setBackground(Color.BLACK);
		btnTwitter.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTwitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"\nAccount: XymaxxRestaurant"
						+ "\nWelcome to know more about us!","Official Twitter Account", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnTwitter.setIcon(new ImageIcon(AdvertisingMarketing.class.getResource("twt1.png")));
		btnTwitter.setHorizontalAlignment(SwingConstants.RIGHT);
		btnTwitter.setBounds(439, 120, 155, 54);
		getContentPane().add(btnTwitter);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(AdvertisingMarketing.class.getResource("e1.png")));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		button.setBackground(Color.BLACK);
		button.setBounds(564, 484, 138, 58);
		getContentPane().add(button);
		
		JLabel lblOfficialWebsite = new JLabel("Official Website: www.xymaxxrestaurant.com");
		lblOfficialWebsite.setForeground(Color.WHITE);
		lblOfficialWebsite.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfficialWebsite.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblOfficialWebsite.setBounds(127, 300, 443, 16);
		getContentPane().add(lblOfficialWebsite);;
		
		JLabel lblOfficialEmailXymaxxgmailcom = new JLabel("Official Email: xymaxx123@gmail.com");
		lblOfficialEmailXymaxxgmailcom.setForeground(Color.WHITE);
		lblOfficialEmailXymaxxgmailcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfficialEmailXymaxxgmailcom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblOfficialEmailXymaxxgmailcom.setBounds(127, 329, 443, 24);
		getContentPane().add(lblOfficialEmailXymaxxgmailcom);
		
		JLabel lblC_1 = new JLabel("Contact Number: +60 12 345 6789");
		lblC_1.setForeground(Color.WHITE);
		lblC_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblC_1.setBounds(127, 368, 443, 16);
		getContentPane().add(lblC_1);
		
		JLabel lblFaxNumber = new JLabel("Fax Number: +604 234 5678");
		lblFaxNumber.setForeground(Color.WHITE);
		lblFaxNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaxNumber.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblFaxNumber.setBounds(127, 406, 443, 16);
		getContentPane().add(lblFaxNumber);
		
		JLabel lblAnyEnquiriesOr = new JLabel("For any enquiries or cooperation");
		lblAnyEnquiriesOr.setForeground(Color.WHITE);
		lblAnyEnquiriesOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnyEnquiriesOr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblAnyEnquiriesOr.setBounds(67, 217, 580, 36);
		getContentPane().add(lblAnyEnquiriesOr);
		
		JLabel lblPleaseContactVia = new JLabel("Please contact via:");
		lblPleaseContactVia.setForeground(Color.WHITE);
		lblPleaseContactVia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseContactVia.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblPleaseContactVia.setBounds(67, 253, 580, 36);
		getContentPane().add(lblPleaseContactVia);
		
		JLabel lblOnlyReservations = new JLabel("Only 50 reservations is accpeted for a day! Be Quick!");
		lblOnlyReservations.setForeground(Color.WHITE);
		lblOnlyReservations.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlyReservations.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblOnlyReservations.setBounds(54, 435, 580, 36);
		getContentPane().add(lblOnlyReservations);
		
		JLabel label = new JLabel("Address: 1235, Jalan Setia, 07000 Langkawi, Kedah");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(127, 187, 443, 28);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(AdvertisingMarketing.class.getResource("am4.png")));
		label_1.setBounds(0, 0, 702, 542);
		getContentPane().add(label_1);
	}
}
