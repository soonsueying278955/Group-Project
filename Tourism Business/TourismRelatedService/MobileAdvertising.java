package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MobileAdvertising extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MobileAdvertising frame = new MobileAdvertising();
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
	public MobileAdvertising() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1181, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(221, 160, 221));
		panel_1.setBounds(10, 10, 371, 511);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMobileAdvertising = new JLabel("Mobile Advertising");
		lblMobileAdvertising.setForeground(new Color(0, 0, 0));
		lblMobileAdvertising.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		lblMobileAdvertising.setBounds(20, 137, 328, 123);
		panel_1.add(lblMobileAdvertising);
		
		JLabel Label = new JLabel("");
		Image c = new ImageIcon(this.getClass().getResource("computer1.jpg")).getImage();
		Label.setIcon(new ImageIcon(c));
		Label.setBounds(10, 10, 351, 491);
		panel_1.add(Label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(391, 10, 780, 512);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textAreaMobileAdvertising = new JTextArea();
		textAreaMobileAdvertising.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textAreaMobileAdvertising.setText("We posted our information on Facebook to promote the activity."
										+ "\n\n=========================LUCKY DRAW========================="
										+ "\nLUCKY DRAW IS HERE FOR YOU !!"
										+ "\nThe price for 4 days 3 nights is ONLY RM8000!! Hurry up!!"
										+ "\nPrice Packs included: "
										+ "\n- Herbal Bath Ticket"
										+ "\n- Check in five-star hotel : Sangerilla Hotel"
									    + "\n- Dive and shark interaction"
										+ "\n- Experience kayaking"
									    + "\n\nRules : "
									    + "\nStep 1 : Like our page"
									    + "\nStep 2 : Follow us" 
										+ "\nStep 3 : Tag 3 friends in comment section" 
									    + "\nStep 4 : Share this story and tag us in your story.");
		textAreaMobileAdvertising.setBackground(new Color(230, 230, 250));
		textAreaMobileAdvertising.setBounds(10, 10, 759, 448);
		panel_2.add(textAreaMobileAdvertising);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementNMarketing marketing = new AdvertisementNMarketing();
				marketing.setModalExclusionType(null);
				marketing.setVisible(true);
	            dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(638, 474, 112, 28);
		panel_2.add(btnBack);
		
		
	}
}
