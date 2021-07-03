package VisitorAttractions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private String userName, passWord, Email;
	private JTextField txtEmail;
	private JButton btnNewButton;
	private int ln;
	File f = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Project\\txt files\\Visitor Attractions");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	void createFolder() {
		if(f.exists()) {
			f.mkdirs();
		}
	}
	void readFile(){
        try {
            FileReader fr = new FileReader(f + "\\Create User.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fw = new FileWriter(f + "\\Create User.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } 
    }
    void addData(String usr, String pswd, String mail){
        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\Create User.txt", "rw");
            for(int i = 0; i < ln; i++){
                raf.readLine();
            }
            if(ln > 0){
            raf.writeBytes("\r\n");
            raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:"+ usr + "\r\n");
            raf.writeBytes("Password:"+ pswd + "\r\n");
            raf.writeBytes("Email:"+mail);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    } 
    void CheckData(String usr, String pswd){
        try {
            RandomAccessFile raf = new RandomAccessFile(f + "\\Create User.txt", "rw");
            String line = raf.readLine();
            userName = line.substring(9);
            passWord = raf.readLine().substring(9);
            Email = raf.readLine().substring(6);
            if(usr.equals(userName) && pswd.equals(passWord)){
                JOptionPane.showMessageDialog(null, "Login Successful");
            } 
            else {
                JOptionPane.showMessageDialog(null, "No account recorded! Please create a new account");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }  
    void logic(String usr, String pswd){
        try {
        	RandomAccessFile raf = new RandomAccessFile(f+"\\Create User.txt", "rw");
        	
            for(int i = 0; i < ln; i += 4){
            	System.out.println("count " + i);
                String userName = raf.readLine().substring(9);
                String passWord = raf.readLine().substring(9);
                if(usr.equals(userName) & pswd.equals(passWord)){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    FreeForAccountUser frame = new FreeForAccountUser();
    				frame.setModalExclusionType(null);
    		        frame.setVisible(true);
    		        dispose();
                    break;
                }else if(i == (ln - 3) ){
                    JOptionPane.showMessageDialog(null, "No account recorded! Please create a new account");
                    break;
                }
                for(int k = 1; k <= 2; k++){
                    raf.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    void countLines(){
        try {
            ln = 0;
            RandomAccessFile raf = new RandomAccessFile(f + "\\Create User.txt", "rw");
            for(int i = 0; raf.readLine() != null; i++){
                ln++;
            }
            System.out.println("number of lines:" + ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
	public CustomerLogin() {
		initComponenets();
	}
	private void initComponenets() {
		/**
		 * Create the frame.
		 */
		setTitle("GK Visitor Attraction System");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CustomerLogin.class.getResource("window icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 419);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Login");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
		lblNewLabel.setBounds(61, 28, 176, 34);
		contentPane.add(lblNewLabel);
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBackground(Color.LIGHT_GRAY);
		panelUsername.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Username", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelUsername.setBounds(34, 63, 225, 63);
		contentPane.add(panelUsername);
		panelUsername.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.LIGHT_GRAY);
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtUsername.setBounds(10, 23, 205, 30);
		panelUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setLayout(null);
		panelPassword.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Password", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelPassword.setBackground(Color.LIGHT_GRAY);
		panelPassword.setBounds(34, 136, 225, 63);
		contentPane.add(panelPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.LIGHT_GRAY);
		txtPassword.setBounds(10, 23, 205, 30);
		panelPassword.add(txtPassword);
		
		//button "Create"
		JButton btnCreate = new JButton("Create");
		btnCreate.setForeground(Color.GREEN);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createFolder(); 
		    	readFile();
		    	countLines();
		    	addData(txtUsername.getText(),txtPassword.getText(), txtEmail.getText());  
		    	JOptionPane.showMessageDialog(null,"Account Created");  
			}
		});
		btnCreate.setBorder(null);
		btnCreate.setBackground(Color.LIGHT_GRAY);
		btnCreate.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCreate.setBounds(34, 343, 226, 29);
		contentPane.add(btnCreate);
		
		//button "Clear"
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
					txtUsername.setText("");
					txtPassword.setText("");
					txtEmail.setText("");
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(34, 308, 108, 29);
		contentPane.add(btnClear);
		
		//"button Login"
		JButton btnBackToLogin = new JButton("Login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	readFile();
		    	countLines();
		    	logic(txtUsername.getText(), txtPassword.getText());	
			}
		});
		btnBackToLogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnBackToLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBackToLogin.setBackground(Color.LIGHT_GRAY);
		btnBackToLogin.setBounds(151, 308, 108, 29);
		contentPane.add(btnBackToLogin);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setLayout(null);
		panelEmail.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelEmail.setBackground(Color.LIGHT_GRAY);
		panelEmail.setBounds(35, 235, 225, 63);
		contentPane.add(panelEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(Color.LIGHT_GRAY);
		txtEmail.setBounds(10, 23, 205, 30);
		panelEmail.add(txtEmail);
		
		//back button to main page
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame = new MainPage();
				frame.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(CustomerLogin.class.getResource("back.png")));
		btnNewButton.setBounds(10, 10, 48, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Please fill up email address to create an account");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(34, 209, 237, 13);
		contentPane.add(lblNewLabel_1);
		}
}
