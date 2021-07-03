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

public class SalesRecord extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	JTextField textField;
	JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTextField textField_2;
	JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesRecord frame = new SalesRecord();
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
	public SalesRecord() {
		setTitle("Sales Record");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SalesRecord.class.getResource("icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 950, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel.setBounds(0, 0, 932, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 153, 255)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(21, 27, 889, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Xymaxx Restaurant Sales Record");
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
		panel_1_1.setBounds(21, 105, 278, 422);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Number");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 16, 103, 22);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total Price (RM)");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(20, 65, 103, 22);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Additional Fees");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(20, 98, 103, 14);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Reason");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(20, 149, 62, 14);
		panel_1_1.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBounds(135, 17, 126, 20);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(135, 68, 126, 20);
		panel_1_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(135, 124, 126, 20);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(135, 149, 126, 20);
		panel_1_1.add(textField_4);
		
		JComboBox PTBox = new JComboBox();
		PTBox.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Cash", "Card", "Mobile Payment", "Bank Transfer", "Checks"}));
		PTBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		PTBox.setBounds(135, 176, 126, 20);
		panel_1_1.add(PTBox);
		
		JLabel label = new JLabel("Tips");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(20, 204, 62, 14);
		panel_1_1.add(label);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(135, 201, 126, 20);
		panel_1_1.add(textField_2);
		
		JCheckBox chckbxYes = new JCheckBox("Yes");
		chckbxYes.setBounds(30, 290, 110, 25);
		panel_1_1.add(chckbxYes);
		//
		chckbxYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (chckbxYes.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "The price is reasonable.");
                } 
            }
        });
		//
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBounds(151, 290, 110, 25);
		panel_1_1.add(chckbxNo);
		//
		chckbxNo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
            if (chckbxNo.isSelected()) {
                JOptionPane.showMessageDialog(frame, "The price is not reasonable.");
            	} 
			}
		});
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(68, 330, 146, 38);
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField.getText(),
						textField_5.getText(),
						textField_1.getText(),
						textField_3.getText(),
						textField_4.getText(),
						PTBox.getSelectedItem(),
						textField_2.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "System Update confirmed", "Sales Record System",
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
		btnUpdate.setBounds(68, 371, 146, 38);
		panel_1_1.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textField.getText(),i,0);
			    	model.setValueAt(textField_5.getText(),i,1);
			    	model.setValueAt(textField_1.getText(),i,2);
			    	model.setValueAt(textField_3.getText(),i,3);
			    	model.setValueAt(textField_4.getText(),i,4);
			    	model.setValueAt(PTBox.getSelectedItem(),i,5);
			    	model.setValueAt(textField_2.getText(),i,6);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		
		JLabel lblPaymentType = new JLabel("Payment Type");
		lblPaymentType.setForeground(Color.WHITE);
		lblPaymentType.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPaymentType.setBounds(20, 180, 103, 14);
		panel_1_1.add(lblPaymentType);
		
		
		JRadioButton YesRadioButton = new JRadioButton("Yes");
		YesRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		YesRadioButton.setBounds(135, 95, 49, 25);
		panel_1_1.add(YesRadioButton);
		//
		YesRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (e.getSource()==YesRadioButton) {
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);
				}
			}
		});
		//
		
		JRadioButton NoRadioButton = new JRadioButton("No");
		NoRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		NoRadioButton.setBounds(212, 95, 49, 25);
		panel_1_1.add(NoRadioButton);
		//
		NoRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if (e.getSource()==NoRadioButton) {
					textField_3.setEnabled(false);
					textField_3.setText("");
					textField_4.setEnabled(false);
					textField_4.setText("");
				}
			}
		});
		//
		
		JLabel lblAmount = new JLabel("Amount (RM)");
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount.setBounds(20, 124, 103, 14);
		panel_1_1.add(lblAmount);
		
		JLabel lblDoYouGet = new JLabel("Do you think the price is reasonable?");
		lblDoYouGet.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouGet.setForeground(Color.WHITE);
		lblDoYouGet.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDoYouGet.setBounds(25, 260, 241, 14);
		panel_1_1.add(lblDoYouGet);
		
		textField_5 = new JTextField();
		textField_5.setBounds(135, 43, 126, 20);
		panel_1_1.add(textField_5);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Time Spent");
		lblNewLabel_1_1_1_1.setBounds(20, 45, 103, 14);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblInsertIf = new JLabel("Insert \"-\" if no extra tips");
		lblInsertIf.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertIf.setForeground(Color.WHITE);
		lblInsertIf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblInsertIf.setBounds(20, 232, 241, 14);
		panel_1_1.add(lblInsertIf);
		
		
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
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				PTBox.setSelectedItem("Make a selection");
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
		scrollPane_1.setBounds(12, 11, 580, 285);
		panel_1_3.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 9));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer Number", "Time Spent", "Total Price", "Additional fee", "Reason", "Payment Type", "Tips"
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
				File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Restaurant\\SalesRecord.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
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

