package Restaurant;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class CustomerReview extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField textFieldbestdishes;
	private JTextField textFieldcomment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerReview frame = new CustomerReview();
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
	public CustomerReview() {
		setTitle("Customer Review");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SalesRecord.class.getResource("icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 950, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel.setBounds(0, 0, 932, 555);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(21, 27, 889, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Customer Review ");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(12, 13, 865, 51);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1.setBounds(21, 104, 278, 423);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("How do you know us?");
		lblNewLabel_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2_1_1.setBounds(32, 198, 217, 14);
		panel_1_1.add(lblNewLabel_1_2_1_1);
		
		JComboBox howCab = new JComboBox();
		howCab.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Online (Facebook etc.)", "Family", "Friend", "Colleague", "Coincidence"}));
		howCab.setFont(new Font("Tahoma", Font.BOLD, 11));
		howCab.setBounds(83, 218, 129, 20);
		panel_1_1.add(howCab);
		
		JComboBox knowBox = new JComboBox();
		knowBox.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Yes", "No", "Maybe", "Not Sure"}));
		knowBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		knowBox.setBounds(83, 63, 126, 35);
		panel_1_1.add(knowBox);
		
		textFieldbestdishes = new JTextField();
		textFieldbestdishes.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldbestdishes.setColumns(10);
		textFieldbestdishes.setBounds(135, 111, 126, 32);
		panel_1_1.add(textFieldbestdishes);
		//
		
		JLabel lblBestDishes = new JLabel("Best Dishes");
		lblBestDishes.setForeground(new Color(255, 255, 255));
		lblBestDishes.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBestDishes.setBounds(20, 124, 103, 14);
		panel_1_1.add(lblBestDishes);
		
		JSlider slider = new JSlider();
		slider.setForeground(new Color(255, 255, 255));
		slider.setBackground(new Color(0, 0, 0));
		slider.setFont(new Font("Times New Roman", Font.BOLD, 13));
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(10);
		slider.setBounds(20, 278, 241, 35);
		panel_1_1.add(slider);
		
		JLabel lblSatisfactoryLevel = new JLabel("Satisfactory Level");
		lblSatisfactoryLevel.setForeground(new Color(255, 255, 255));
		lblSatisfactoryLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSatisfactoryLevel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSatisfactoryLevel.setBounds(83, 251, 129, 14);
		panel_1_1.add(lblSatisfactoryLevel);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(65, 326, 146, 38);
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						knowBox.getSelectedItem(),
						textFieldbestdishes.getText(),
						textFieldcomment.getText(),
						howCab.getSelectedItem(),
						slider.getValue(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "User Comment System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 0, 0));
		btnUpdate.setBounds(65, 367, 146, 38);
		panel_1_1.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(knowBox.getSelectedItem(),i,0);
			    	model.setValueAt(textFieldbestdishes.getText(),i,1);
			    	model.setValueAt(textFieldcomment.getText(),i,2);
			    	model.setValueAt(howCab.getSelectedItem(),i,3);
			    	model.setValueAt(slider.getValue(),i,4);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblFeedback = new JLabel("Feedback From Customer");
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setForeground(Color.WHITE);
		lblFeedback.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFeedback.setBounds(20, 17, 241, 14);
		panel_1_1.add(lblFeedback);
		
		JLabel lblDoYouGet = new JLabel("Do you get to know better about Malaysia?");
		lblDoYouGet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouGet.setForeground(Color.WHITE);
		lblDoYouGet.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDoYouGet.setBounds(20, 38, 241, 14);
		panel_1_1.add(lblDoYouGet);
		
		textFieldcomment = new JTextField();
		textFieldcomment.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldcomment.setColumns(10);
		textFieldcomment.setBounds(135, 156, 126, 32);
		panel_1_1.add(textFieldcomment);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setForeground(Color.WHITE);
		lblComment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblComment.setBounds(20, 159, 103, 14);
		panel_1_1.add(lblComment);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel_1_2.setBounds(306, 461, 440, 66);
		panel.add(panel_1_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldcomment.setText("");
				textFieldbestdishes.setText("");
				knowBox.setSelectedItem("Make a selection");
				howCab.setSelectedItem("Make a selection");
				slider.setValue(0);
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(12, 13, 136, 40);
		panel_1_2.add(btnReset);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBackground(new Color(0, 0, 0));
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPrint.setBounds(292, 13, 136, 40);
		panel_1_2.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(0, 0, 0));
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBounds(153, 13, 136, 40);
		panel_1_2.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Sales Record System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Sales Record System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1_3.setBackground(new Color(255, 153, 255));
		panel_1_3.setBounds(306, 104, 604, 344);
		panel.add(panel_1_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 11, 580, 276);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Get to know Malaysia", "Best Dishes", "Comment", "Way to know us", "Satisfactory Level"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(228, 300, 146, 40);
		panel_1_3.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\RestaurantCustomerReview.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n_____________\n");
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
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpload.setBackground(Color.BLACK);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setIcon(new ImageIcon(SalesRecord.class.getResource("e1.png")));
		btnExit.setBounds(748, 472, 162, 55);
		panel.add(btnExit);
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
	}
}

