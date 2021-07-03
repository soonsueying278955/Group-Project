package TourismRelatedService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CulturalTourism extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CulturalTourism frame = new CulturalTourism();
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
	public CulturalTourism() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1244, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1230, 625);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setBounds(10, 10, 423, 605);
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		JLabel lblCulturalTourism = new JLabel("Cultural Tourism");
		lblCulturalTourism.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 60));
		lblCulturalTourism.setBounds(15, 151, 420, 81);
		panel_1.add(lblCulturalTourism);
		
		JComboBox comboBoxService = new JComboBox();
		comboBoxService.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBoxService.setModel(new DefaultComboBoxModel(new String[] {"Please select type of service you want", "Museums", "Historic sites", "Handicrafts"}));
		comboBoxService.setBounds(42, 265, 344, 37);
		panel_1.add(comboBoxService);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 250, 210));
		panel_2.setBounds(443, 10, 777, 605);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblServiceName = new JLabel("");
		lblServiceName.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 60));
		lblServiceName.setBounds(10, 10, 452, 96);
		panel_2.add(lblServiceName);
		
		JLabel Image1 = new JLabel("");
		Image h2 = new ImageIcon(this.getClass().getResource("historic2.jpg")).getImage();
		Image1.setIcon(new ImageIcon(h2));
		Image1.setBounds(340, 342, 229, 251);
		panel_2.add(Image1);
		
		JLabel Image = new JLabel("");
		Image h1 = new ImageIcon(this.getClass().getResource("historic1.jpg")).getImage();
		Image.setIcon(new ImageIcon(h1));
		Image.setBounds(525, 293, 242, 300);
		panel_2.add(Image);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 23));
		textArea.setBackground(new Color(250, 250, 210));
		textArea.setBounds(10, 116, 718, 167);
		panel_2.add(textArea);
		
		JButton btnDeatails = new JButton("Details");
		btnDeatails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxService.getSelectedItem().equals("Museums")) {
					lblServiceName.setText("Museums");
					textArea.setText("\n1. Experience different cultures and beliefs"
					               + "\n2. Learn about various custom"
					               + "\n3. Enjoy tradisional food from all over the world"
					               + "\n4. Price per person : " + "RM 5000"
					               + "\n5. ***If hour is more than 5 hours, you will get 20% discount");
				
				}
				else if (comboBoxService.getSelectedItem().equals("Historic sites")) {
					lblServiceName.setText("Historic sites");
					textArea.setText("\n1. Experience different cultures and beliefs"
					               + "\n2. Learn about various custom"
					               + "\n3. Price per person : " + "RM 5000"
					               + "\n4. ***If hour is more than 5 hours, you will get 20% discount");
					
				}
				
				else if (comboBoxService.getSelectedItem().equals("Handicrafts")) {
					lblServiceName.setText("Handicrafts");
					textArea.setText("\n1. Passengers can hand make their souvenirs"
					               + "\n2. Learn about various custom"
					               + "\n3. Price per person : " + "RM 1200"
					               + "\n4. ***If hour is more than 5 hours, you will get 20% discount");
					
				}
			}
		});
		btnDeatails.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDeatails.setBounds(168, 404, 101, 33);
		panel_1.add(btnDeatails);
		
		JButton btnBExit = new JButton("Exit");
		btnBExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductDescription pd = new ProductDescription();
				pd.setModalExclusionType(null);
		        pd.setVisible(true);
	            dispose();			
	        }
		});
		btnBExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBExit.setBounds(312, 404, 101, 33);
		panel_1.add(btnBExit);
		
	}
}
