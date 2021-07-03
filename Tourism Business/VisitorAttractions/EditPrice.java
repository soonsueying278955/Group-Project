package VisitorAttractions;

import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class EditPrice extends JFrame {

	private JPanel contentPane;
	private JTextField txtPTTPrice;
	private JButton btnSetPTT;
	private JPanel panel_1;
	private JTable table;
	private JTextField txtSPrice;
	private JTextField txtKRPrice;
	private JLabel lblStadthuys;
	private JLabel lblKR;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditPrice frame = new EditPrice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public EditPrice() {
		initComponenets();
	}

	private void initComponenets() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EditPrice.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.GRAY));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.GRAY));
		panel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblPTTPrice = new JLabel("Price: RM");
		lblPTTPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtPTTPrice = new JTextField();
		txtPTTPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtPTTPrice.setColumns(10);
		
		//button "Set"
		btnSetPTT = new JButton("Set");
		btnSetPTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							txtPTTPrice.getText(),
							txtSPrice.getText(),
							txtKRPrice.getText(),							
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Details Update confirmed", "Thank you",
								JOptionPane.OK_OPTION);
					}
				}
				//export price of tickets
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions\\Price.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					for (int i = 0; i < table.getRowCount(); i++) {
						for (int  j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "   ");
							}
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
						}
					catch(Exception ex) {
						ex.printStackTrace();
					}	
			}
		});
		btnSetPTT.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSetPTT.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSetPTT.setBackground(Color.LIGHT_GRAY);
		
		//button "Clear"
		JButton btnClearPTT = new JButton("Clear");
		btnClearPTT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPTTPrice.setText("");
				txtSPrice.setText("");
				txtKRPrice.setText("");
			}
		});
		btnClearPTT.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnClearPTT.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClearPTT.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblSPrice = new JLabel("Price: RM");
		lblSPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtSPrice = new JTextField();
		txtSPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtSPrice.setColumns(10);
		
		JLabel lblKRPrice = new JLabel("Price: RM");
		lblKRPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		txtKRPrice = new JTextField();
		txtKRPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtKRPrice.setColumns(10);
		
		JLabel lblPTT = new JLabel("Petronas Twin Towers");
		lblPTT.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		lblStadthuys = new JLabel("Stadthuys");
		lblStadthuys.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		lblKR = new JLabel("Kinabatangan River");
		lblKR.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		//button "Exit" back to menuVA page
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuVA frame = new MenuVA();
				frame.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExit.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblPTT))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addComponent(lblPTTPrice)
					.addGap(6)
					.addComponent(txtPTTPrice, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblStadthuys, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addComponent(lblSPrice)
					.addGap(6)
					.addComponent(txtSPrice, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblKR, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addComponent(lblKRPrice)
					.addGap(6)
					.addComponent(txtKRPrice, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(btnClearPTT, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnSetPTT, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(8))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblPTT, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPTTPrice, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPTTPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(lblStadthuys, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSPrice, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(lblKR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblKRPrice, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtKRPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnClearPTT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSetPTT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Petronas Twin Towers", "Stadthuys", "Kinabatangan River"
			}
		));
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("PRICE");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(121)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(118))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addGap(10))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
					.addGap(6))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
