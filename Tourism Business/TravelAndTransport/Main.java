package TravelAndTransport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("small-axe.png")));
		setTitle("TY Travel Agency");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel.setBounds(0, 0, 805, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.ORANGE));
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(32, 28, 732, 70);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to TY Travel Agency!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 695, 50);
		panel_1.add(lblNewLabel);
		
		JButton LoginButton = new JButton("Admin");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admin frame = new Admin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		LoginButton.setBounds(93, 377, 170, 48);
		panel.add(LoginButton);
		
		JButton btnReset = new JButton("Guest");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuestHome frm = new GuestHome();
				frm.setModalExclusionType(null);
				frm.setVisible(true);
				dispose();
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBounds(533, 377, 154, 48);
		panel.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("admin.png")));
		lblNewLabel_1.setBounds(75, 167, 213, 184);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setIcon(new ImageIcon(Main.class.getResource("Customer.jpg")));
		lblNewLabel_1_1.setBounds(506, 167, 213, 184);
		panel.add(lblNewLabel_1_1);
	}
}
