package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ReservationSystem extends JFrame {

	private JTextField textFieldName;
	private JTextField textFieldCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationSystem window = new ReservationSystem();
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
	public ReservationSystem() {
		setTitle("Reservation System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReservationSystem.class.getResource("icon.png")));
		setBounds(100, 100, 616, 523);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reservation under name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 79, 281, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblReservationSystem = new JLabel("Reservation System");
		lblReservationSystem.setForeground(Color.BLACK);
		lblReservationSystem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblReservationSystem.setBounds(12, 13, 302, 53);
		getContentPane().add(lblReservationSystem);
		
		textFieldName = new JTextField();
		textFieldName.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textFieldName.setBounds(325, 79, 249, 53);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name;
				try {
					//
					name = textFieldName.getText();
					if(textFieldName.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Please enter a name.");
					}else {
						int min = 1;  
						int max = 50;   
						int code = (int)(Math.random()*(max-min+1)+min); 
						textFieldCode.setText(Integer.toString(code));
					} 
				//
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter a name.");
			}
		}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(ReservationSystem.class.getResource("d2.png")));
		btnNewButton.setBounds(234, 145, 150, 60);
		getContentPane().add(btnNewButton);
		
		textFieldCode = new JTextField();
		textFieldCode.setForeground(new Color(0, 153, 153));
		textFieldCode.setBackground(new Color(0, 0, 0));
		textFieldCode.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 65));
		textFieldCode.setBounds(158, 243, 289, 133);
		getContentPane().add(textFieldCode);
		textFieldCode.setColumns(10);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(ReservationSystem.class.getResource("e1.png")));
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		button.setBackground(Color.BLACK);
		button.setBounds(447, 418, 151, 58);
		getContentPane().add(button);
		
		JLabel lblYourReservationCode = new JLabel("Your reservation code is:");
		lblYourReservationCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourReservationCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblYourReservationCode.setBounds(65, 192, 228, 53);
		getContentPane().add(lblYourReservationCode);
		
		JLabel lblSnapThisCode = new JLabel("Snap this code and show it to counter if a reservation is made.");
		lblSnapThisCode.setForeground(new Color(255, 255, 255));
		lblSnapThisCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnapThisCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSnapThisCode.setBounds(29, 378, 545, 39);
		getContentPane().add(lblSnapThisCode);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ReservationSystem.class.getResource("rs1.png")));
		lblNewLabel_1.setBounds(0, 0, 598, 476);
		getContentPane().add(lblNewLabel_1);
	}
}
