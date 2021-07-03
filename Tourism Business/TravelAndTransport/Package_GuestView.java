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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Package_GuestView extends JFrame {

	private JPanel contentPane;
	private JTextField unitPrice;
	private JTextField discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package_GuestView frame = new Package_GuestView();
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
	public Package_GuestView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Package_GuestView.class.getResource("small-axe.png")));
		setTitle("Package View");
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
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOk.setBounds(537, 383, 110, 39);
		panel.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Select Package");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 50, 179, 39);
		panel.add(lblNewLabel);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnitPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUnitPrice.setBounds(45, 137, 179, 39);
		panel.add(lblUnitPrice);
		
		JLabel lblNewLabel_1_1 = new JLabel("Discount given (if 5 ppl above)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 212, 331, 39);
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()== "1") {
					unitPrice.setText(Package_Admin_SetPrice.price1);
					discount.setText(Package_Admin_SetPrice.discount);
				}else if(comboBox.getSelectedItem()== "2") {
					unitPrice.setText(Package_Admin_SetPrice.price2);
					discount.setText(Package_Admin_SetPrice.discount);
				}else if(comboBox.getSelectedItem()== "3") {
					unitPrice.setText(Package_Admin_SetPrice.price3);
					discount.setText(Package_Admin_SetPrice.discount);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Package", "1", "2", "3"}));
		comboBox.setBounds(455, 57, 192, 26);
		panel.add(comboBox);
		
		unitPrice = new JTextField();
		unitPrice.setEditable(false);
		unitPrice.setBounds(455, 148, 192, 26);
		panel.add(unitPrice);
		unitPrice.setColumns(10);
		
		discount = new JTextField();
		discount.setEditable(false);
		discount.setColumns(10);
		discount.setBounds(455, 226, 192, 26);
		panel.add(discount);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Package_GuestView.class.getResource("giveaway_a1.png")));
		lblNewLabel_1.setBounds(89, 226, 267, 195);
		panel.add(lblNewLabel_1);
	}
}
