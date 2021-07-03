package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JTextField textFieldIncome;
	private JTextField textFieldSpending;
//	private JTextField textFieldProfit;
	JTextField textFieldProfit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance window = new Finance();
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
	public Finance() {
		setTitle("Financial Status and Management");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("icon.png")));
		setBounds(100, 100, 596, 505);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnRecord = new JButton("Record");
		btnRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				String profitText = textFieldProfit.getText();				
				FinancialStatus FS = new FinancialStatus(); //calling another frame/window
				FS.textField_1.setText(profitText);
				FS.setModalExclusionType(null);
				FS.setVisible(true);
				//
			}
		});
		btnRecord.setForeground(Color.WHITE);
		btnRecord.setBackground(Color.BLACK);
		btnRecord.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRecord.setHorizontalAlignment(SwingConstants.RIGHT);
		btnRecord.setIcon(new ImageIcon(Finance.class.getResource("f5.png")));
		btnRecord.setBounds(205, 339, 164, 70);
		getContentPane().add(btnRecord);
		
		JLabel lblNewLabel = new JLabel("Financial Management");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(38, 5, 498, 47);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTotalIncomeFor = new JLabel("Total Income for the month (RM)");
		lblTotalIncomeFor.setForeground(Color.WHITE);
		lblTotalIncomeFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalIncomeFor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTotalIncomeFor.setBounds(12, 63, 309, 47);
		getContentPane().add(lblTotalIncomeFor);
		
		JLabel lblTotalSpendingFor = new JLabel("Total Spending for the month (RM)");
		lblTotalSpendingFor.setForeground(Color.WHITE);
		lblTotalSpendingFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalSpendingFor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTotalSpendingFor.setBounds(12, 133, 309, 47);
		getContentPane().add(lblTotalSpendingFor);
		
		JButton button = new JButton("EXIT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Finance.class.getResource("e1.png")));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.setBackground(Color.BLACK);
		button.setBounds(432, 405, 146, 54);
		getContentPane().add(button);
		
		textFieldIncome = new JTextField();
		textFieldIncome.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIncome.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldIncome.setBounds(324, 58, 212, 59);
		getContentPane().add(textFieldIncome);
		textFieldIncome.setColumns(10);
		
		textFieldSpending = new JTextField();
		textFieldSpending.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSpending.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldSpending.setColumns(10);
		textFieldSpending.setBounds(324, 130, 212, 59);
		getContentPane().add(textFieldSpending);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(12, 243, 554, 83);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTotalProfitFor = new JLabel("Total Profit for the month (RM)");
		lblTotalProfitFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalProfitFor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTotalProfitFor.setBounds(12, 15, 290, 47);
		panel.add(lblTotalProfitFor);
		
		textFieldProfit = new JTextField();
		textFieldProfit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldProfit.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldProfit.setColumns(10);
		textFieldProfit.setBounds(310, 13, 216, 59);
		panel.add(textFieldProfit);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n1, n2, ans;
				try {
					n1 = Integer.parseInt(textFieldIncome.getText());
					n2 = Integer.parseInt(textFieldSpending.getText());
					
					ans = n1-n2;
					textFieldProfit.setText(Integer.toString(ans));
					if(ans>0) {
						JOptionPane.showMessageDialog(null, "Xymaxx Restaurant is making profit this month."
								+ "\nKeep on the great work!");
					}else if (ans==0) {
						JOptionPane.showMessageDialog(null,"Xymaxx Restaurant do not have net income for this month."
								+ "\nMaybe there are some problems in our restaurant management and operation.");
					}else if (ans<0) {
						JOptionPane.showMessageDialog(null,"Xymaxx Restaurant is facing loss this month."
								+ "\nSome changes or upgrade is needed.");
					}
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnCount.setBackground(new Color(0, 0, 0));
		btnCount.setForeground(new Color(255, 255, 255));
		btnCount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnCount.setBounds(224, 190, 97, 40);
		getContentPane().add(btnCount);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Finance.class.getResource("am1.png")));
		lblNewLabel_1.setBounds(0, 0, 578, 459);
		getContentPane().add(lblNewLabel_1);
		
	}
}
