package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class PrintAdvertising extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintAdvertising frame = new PrintAdvertising();
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
	public PrintAdvertising() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1181, 532);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 371, 511);
		panel_1.setBackground(new Color(224, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPrintAdvertising = new JLabel("Print Advertising");
		lblPrintAdvertising.setForeground(new Color(0, 0, 0));
		lblPrintAdvertising.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblPrintAdvertising.setBounds(21, 175, 328, 123);
		panel_1.add(lblPrintAdvertising);
		
		JLabel Label = new JLabel("");
		Image n = new ImageIcon(this.getClass().getResource("newspaper1.jpg")).getImage();
		Label.setIcon(new ImageIcon(n));
		Label.setBounds(10, 10, 351, 491);
		panel_1.add(Label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(391, 10, 780, 512);
		panel_2.setBackground(new Color(245, 255, 250));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textAreaMobileAdvertising = new JTextArea();
		textAreaMobileAdvertising.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textAreaMobileAdvertising.setText("We posted our information on brochure to promote the activity."
										+ "\n\n====================CONSULTATION TIME======================"
										+ "\nOur company will make a consultation time to everyone."
										+ "\nThe date will held on 15 June 2021 until 30 June 2021."
										+ "\nJust come to our website and put down your question."
										+ "\n\nHow to consult :"
								        + "\nOption 1 : Visit our website. -> www.metitravel.com.my" 
								        + "\nOption 2 : Email to us. -> metitravel@yahoo.com" 
								        + "\nOption 3 : Call us at the appointment time. -> 03-5879460"
								        + "\n\nWe will make sure our treatment is good and the best."
								        + "\nWelcome to all of you to make a consult and we will give you a "
								        + "\nsatisfactory answer. "
								        + "\nThank You.");
		textAreaMobileAdvertising.setBackground(new Color(245, 255, 250));
		textAreaMobileAdvertising.setBounds(10, 10, 759, 446);
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
