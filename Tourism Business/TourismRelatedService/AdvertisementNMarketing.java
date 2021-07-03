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

public class AdvertisementNMarketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementNMarketing frame = new AdvertisementNMarketing();
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
	public AdvertisementNMarketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1128, 719);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 205));
		panel_1.setBounds(10, 10, 1108, 118);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdvertisement = new JLabel("Advertisement & Marketing");
		lblAdvertisement.setFont(new Font("Pristina", Font.BOLD, 70));
		lblAdvertisement.setBounds(180, 0, 769, 118);
		panel_1.add(lblAdvertisement);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 240));
		panel_2.setBounds(10, 138, 1108, 571);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Label2 = new JLabel("");
		Image c = new ImageIcon(this.getClass().getResource("computer.jpg")).getImage();
		Label2.setIcon(new ImageIcon(c));
		Label2.setBounds(236, 208, 321, 315);
		panel_2.add(Label2);
		
		JLabel Label = new JLabel("");
		Image n = new ImageIcon(this.getClass().getResource("newspaper.jpg")).getImage();
		Label.setIcon(new ImageIcon(n));
		Label.setBounds(39, 36, 330, 470);
		panel_2.add(Label);
		
		JButton btnMobileAdvertising = new JButton("Mobile Advertising");
		btnMobileAdvertising.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MobileAdvertising mobile = new MobileAdvertising(); //calling another frame/window
				mobile.setModalExclusionType(null);
				mobile.setVisible(true);
			}
		});
		Image mobile = new ImageIcon(this.getClass().getResource("mobile.png")).getImage();
		btnMobileAdvertising.setIcon(new ImageIcon(mobile));
		btnMobileAdvertising.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMobileAdvertising.setBounds(647, 208, 355, 57);
		panel_2.add(btnMobileAdvertising);
		
		JButton btnPrintAdvertising = new JButton("Print Advertising");
		btnPrintAdvertising.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintAdvertising print = new PrintAdvertising(); //calling another frame/window
				print.setModalExclusionType(null);
				print.setVisible(true);
			}
		});
		Image print = new ImageIcon(this.getClass().getResource("text.png")).getImage();
		btnPrintAdvertising.setIcon(new ImageIcon(print));
		btnPrintAdvertising.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnPrintAdvertising.setBounds(647, 307, 355, 57);
		panel_2.add(btnPrintAdvertising);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminHomePage home = new AdminHomePage();
				home.setModalExclusionType(null);
	            home.setVisible(true);
	            dispose();
				}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnExit.setBounds(959, 497, 128, 30);
		panel_2.add(btnExit);
		
	}

}
