package TravelAndTransport;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Advertising_Admin extends JFrame {

	private JPanel contentPane;
	private JTextField endDateTField;
	static String date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertising_Admin frame = new Advertising_Admin();
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
	public Advertising_Admin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Advertising_Admin.class.getResource("small-axe.png")));
		setTitle("Ads");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.RED));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 765, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 745, 291);
		panel.add(scrollPane);
		
		JTextArea txtronlineAdvertisementgiveaway = new JTextArea();
		txtronlineAdvertisementgiveaway.setText("======================ONLINE ADVERTISEMENT=========================\r\n\r\n*****************************************GIVEAWAY EVENT*********************************************\r\n\r\nOur company is helding a GIVEAWAY event!!!\r\n\r\nYou will have the chance to win one of our travel package ticket for free by following these 3 steps:\r\n\r\n1. Give a Like and turn on special notification our page! \r\n2. Like & share this post on public!\r\n3. Tag 3 of your friends in comment and say why you want to win this giveaway!\r\n\r\nOur prize of giveaway worth around RM500, including flight ticket to any Europe countries, TY Travel Exclusive T-shirts, TY Travel Exclusive Giftcards and much more! Visit tytravel.com to find out more prizes!\r\n\r\nThis event will end in given date above, time is running up! Hurry up so that you dont miss your chance of winning prizes!");
		txtronlineAdvertisementgiveaway.setEditable(false);
		scrollPane.setViewportView(txtronlineAdvertisementgiveaway);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(537, 383, 110, 39);
		panel.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("End Date:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(79, 22, 110, 39);
		panel.add(lblNewLabel);
		
		endDateTField = new JTextField();
		endDateTField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		endDateTField.setText("23th August 2021");
		endDateTField.setBounds(415, 22, 210, 31);
		panel.add(endDateTField);
		endDateTField.setColumns(10);
			
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				date = endDateTField.getText();
				JOptionPane.showMessageDialog(null, "Update successful");
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(79, 383, 110, 39);
		panel.add(btnUpdate);
	}
	
}
