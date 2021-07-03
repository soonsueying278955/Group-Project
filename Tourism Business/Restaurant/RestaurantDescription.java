package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class RestaurantDescription extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantDescription window = new RestaurantDescription();
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
	public RestaurantDescription() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RestaurantDescription.class.getResource("icon.png")));
		setTitle("Restaurant Description");
		getContentPane().setBackground(new Color(204, 153, 255));
		setBounds(100, 100, 698, 554);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Xymaxx Restaurant Description");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(37, 45, 619, 53);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Xymaxx Restaurant is welcoming you to Malaysia!");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel_1.setBounds(49, 97, 574, 29);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type of operation \t: Buffet");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(237, 124, 223, 40);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblLocationPulau = new JLabel("Location \t\t: Pulau Langkawi");
		lblLocationPulau.setBackground(new Color(0, 0, 0));
		lblLocationPulau.setForeground(new Color(255, 255, 255));
		lblLocationPulau.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocationPulau.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblLocationPulau.setBounds(249, 203, 223, 40);
		getContentPane().add(lblLocationPulau);
		
		JLabel lblContactNumber = new JLabel("Contact number \t\t: 0123456789");
		lblContactNumber.setBackground(new Color(0, 0, 0));
		lblContactNumber.setForeground(new Color(255, 255, 255));
		lblContactNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblContactNumber.setBounds(218, 163, 265, 40);
		getContentPane().add(lblContactNumber);
		
		JLabel lblMustTryFood = new JLabel("Must try food \t\t: Nasi Lemak");
		lblMustTryFood.setBackground(new Color(0, 0, 0));
		lblMustTryFood.setForeground(new Color(255, 255, 255));
		lblMustTryFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblMustTryFood.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMustTryFood.setBounds(237, 241, 223, 40);
		getContentPane().add(lblMustTryFood);
		
		JLabel lblMustTryBeverage = new JLabel("Must try beverage \t: Teh Tarik");
		lblMustTryBeverage.setBackground(new Color(0, 0, 0));
		lblMustTryBeverage.setForeground(new Color(255, 255, 255));
		lblMustTryBeverage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMustTryBeverage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMustTryBeverage.setBounds(237, 282, 248, 40);
		getContentPane().add(lblMustTryBeverage);
		
		JLabel lblMustTryDesserts = new JLabel("Must try desserts \t: Ais Kacang");
		lblMustTryDesserts.setBackground(new Color(0, 0, 0));
		lblMustTryDesserts.setForeground(new Color(255, 255, 255));
		lblMustTryDesserts.setHorizontalAlignment(SwingConstants.CENTER);
		lblMustTryDesserts.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMustTryDesserts.setBounds(233, 321, 265, 40);
		getContentPane().add(lblMustTryDesserts);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setIcon(new ImageIcon(RestaurantDescription.class.getResource("e1.png")));
		btnExit.setHorizontalAlignment(SwingConstants.RIGHT);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 10));
		btnExit.setBackground(Color.BLACK);
		btnExit.setBounds(529, 447, 151, 60);
		getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("About our restaurant");
		btnNewButton.setIcon(new ImageIcon(RestaurantDescription.class.getResource("ab2.png")));
		btnNewButton.setBounds(373, 374, 213, 60);
		getContentPane().add(btnNewButton);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"	Xymaxx Restaurant provides Malaysian Tradisional dishes such as:\r\n" + 
						"		 \tRendang from the Malay\r\n" + 
						"		 \tChar Kway Teow from the Chinese\r\n" + 
						"		 \tRoti Canai from the Indian\r\n" + 
						"	#Menu change according to theme everyday, let's taste Malaysia!\r\n" + 
						"	Xymaxx Restaurant only serves Malaysian traditional dishes and foods such as NASI LEMAK which is wellknown all around the world!\r\n" + 
						"	Xymaxx Restaurant also serves Malaysian traditional drinks and desserts such as \r\n" + 
						"		TEH TARIK which known as Malaysia's national drinks and \r\n" + 
						"		AIS KACANG which is one of the classic street food snack in Malaysia!","About Xymaxx Restaurant",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		JButton btnMoreDetails = new JButton("More Details");
		btnMoreDetails.setForeground(Color.WHITE);
		btnMoreDetails.setIcon(new ImageIcon(RestaurantDescription.class.getResource("dt2.png")));
		btnMoreDetails.setBounds(122, 374, 213, 60);
		getContentPane().add(btnMoreDetails);
		btnMoreDetails.setBackground(Color.BLACK);
		btnMoreDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnMoreDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,  
						"	1. Xymaxx Restaurant mainly use the ingredients sourced from locally and trusted suppliers to the extent possible!\r\n" + 
						"	2. Xymaxx Restaurant brings a brilliant taste of Malaysian traditional culinary and beverage to offer a quality brunch, food, desserts and drinks to the customers!\r\n" + 
						"	3. Xymaxx Restaurants accepts American Express, Mastercard, Visa, credit card and mobile payment.","More details about Xymaxx Restaurant",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(RestaurantDescription.class.getResource("rd3.png")));
		lblNewLabel_4.setBounds(0, 0, 680, 507);
		getContentPane().add(lblNewLabel_4);
	}
}
