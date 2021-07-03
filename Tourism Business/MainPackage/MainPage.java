package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

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

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("icon.png")));
		setTitle("UUM Tourism Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 628);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPic = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("Background.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		panelPic.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(135, 206, 250)));
		panelPic.setBounds(0, 0, 302, 572);
		contentPane.add(panelPic);
		panelPic.setLayout(null);
		
		JPanel panelButton = new JPanel();
		panelButton.setBackground(new Color(224, 255, 255));
		panelButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(30, 144, 255)));
		panelButton.setLayout(null);
		panelButton.setBounds(302, 0, 498, 572);
		contentPane.add(panelButton);
		
		JLabel lblWelcome = new JLabel("Welcome to");
		lblWelcome.setFont(new Font("Constantia", Font.BOLD, 40));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(15, 16, 468, 99);
		panelButton.add(lblWelcome);
		
		JLabel lblUUM = new JLabel("UUM Tourism Business");
		lblUUM.setHorizontalAlignment(SwingConstants.CENTER);
		lblUUM.setFont(new Font("Constantia", Font.BOLD, 40));
		lblUUM.setBounds(15, 81, 468, 87);
		panelButton.add(lblUUM);
		
		JButton btnHotels = new JButton("Hotel Booking System");
		btnHotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hotels.HotelsLogin hl = new Hotels.HotelsLogin();
				hl.setVisible(true);
				dispose();
			}
		});
		btnHotels.setFont(new Font("Elephant", Font.PLAIN, 22));
		btnHotels.setBounds(100, 231, 317, 38);
		panelButton.add(btnHotels);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restaurant.Registration rl = new Restaurant.Registration();
				rl.setVisible(true);
				dispose();
			}
		});
		btnRestaurant.setFont(new Font("Elephant", Font.PLAIN, 22));
		btnRestaurant.setBounds(100, 285, 317, 38);
		panelButton.add(btnRestaurant);
		
		JButton btnTourismRelatedService = new JButton("Tourism Related Service");
		btnTourismRelatedService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TourismRelatedService.Login trsl = new TourismRelatedService.Login();
				trsl.setVisible(true);
				dispose();
			}
		});
		btnTourismRelatedService.setFont(new Font("Elephant", Font.PLAIN, 22));
		btnTourismRelatedService.setBounds(100, 339, 317, 38);
		panelButton.add(btnTourismRelatedService);
		
		JButton btnVisitorAttractions = new JButton("Visitor Attractions");
		btnVisitorAttractions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisitorAttractions.MainPage val = new VisitorAttractions.MainPage();
				val.setVisible(true);
				dispose();
			}
		});
		btnVisitorAttractions.setFont(new Font("Elephant", Font.PLAIN, 22));
		btnVisitorAttractions.setBounds(100, 393, 317, 38);
		panelButton.add(btnVisitorAttractions);
		
		JButton btnTravelTransport = new JButton("Travel & Transport");
		btnTravelTransport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TravelAndTransport.Main tntl = new TravelAndTransport.Main();
				tntl.setVisible(true);
				dispose();
			}
		});
		btnTravelTransport.setFont(new Font("Elephant", Font.PLAIN, 22));
		btnTravelTransport.setBounds(100, 447, 317, 38);
		panelButton.add(btnTravelTransport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "UUM Tourism Business", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Elephant", Font.PLAIN, 20));
		btnExit.setBounds(404, 527, 79, 29);
		panelButton.add(btnExit);
	}
}
