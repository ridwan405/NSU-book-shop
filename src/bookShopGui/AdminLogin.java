package bookShopGui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import dataManagement.LoginInfo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField textFieldPassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setResizable(false);
		setTitle("ADMIN LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 654, 63);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 255, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Algerian", Font.BOLD, 35));
		lblAdminLogin.setBounds(10, 11, 634, 41);
		panel.add(lblAdminLogin);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(37, 102, 115, 26);
		lblUserName.setBackground(new Color(255, 153, 0));
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(37, 139, 115, 26);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(lblPassword);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(162, 106, 184, 20);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBounds(10, 85, 654, 275);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 95, 664, 2);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		panel_1.add(separator);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(20, 125, 165, 42);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*File file = new File("Login.txt");
				FileReader fr= null;
				BufferedReader br= null;
				
				try {
					fr= new FileReader(file);
					br= new BufferedReader(fr);
					
					String line= null;
					
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}*/
				//Boolean isWrong= true;
				
				String userName= textFieldUserName.getText();
				String passWord= textFieldPassWord.getText();
				
				LoginInfo userInput= new LoginInfo(userName, passWord);
				LoginInfo adminTxt= null;
				
				try {
				FileInputStream fi= new FileInputStream(new File("admin.txt"));
				ObjectInputStream oi= new ObjectInputStream(fi);
				adminTxt= (LoginInfo) oi.readObject();
				fi.close();
				oi.close();
				
				}
				catch (FileNotFoundException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				catch (IOException e2) {
					// TODO: handle exception
					//e2.printStackTrace();
						/*
						 * dispose(); ResetPassword reset= new ResetPassword(); reset.setVisible(true);
						 */
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				/*
				 * if(adminTxt.isNotSet()) { dispose(); ResetPassword rp= new ResetPassword();
				 * rp.setVisible(true); }
				 */
				try {
				if(adminTxt.getPassWord().equals(userInput.getPassWord()) && adminTxt.getUserName().equals(userInput.getUserName())) {
					dispose();
					AdminPanel ap= new AdminPanel();
					ap.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect password or username.");
				}
				catch(NullPointerException e2) {
					e2.printStackTrace();
					dispose();
					ResetPassword rp= new ResetPassword();
					rp.setVisible(true);
				}
				
				textFieldUserName.setText(null);
				textFieldPassWord.setText(null);
				
				
				
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET LOGIN");
		btnReset.setBounds(230, 125, 178, 42);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginInfo adminTxt= null;
				try {
					FileInputStream fi= new FileInputStream(new File("admin.txt"));
					ObjectInputStream oi= new ObjectInputStream(fi);
					 adminTxt = (LoginInfo) oi.readObject();
					
					fi.close();
					oi.close();
					
					}
					catch (FileNotFoundException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
					catch (IOException e2) {
						// TODO: handle exception
						//e2.printStackTrace();
							/*
							 * dispose(); ResetPassword reset= new ResetPassword(); reset.setVisible(true);
							 */
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				if(adminTxt==null) {
					dispose();
					ResetPassword rp= new ResetPassword();
					rp.setVisible(true);
				}
				else {
				//dispose();
				ConfirmOldLogin confirm= new ConfirmOldLogin();
				confirm.setVisible(true);
				}
				
			}
		});
		btnReset.setBackground(Color.ORANGE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(465, 125, 165, 42);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", 2);
				if(n==0) {
				System.exit(0);
				}
			}
		});
		btnExit.setBackground(Color.ORANGE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 188, 654, 2);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		panel_1.add(separator_1);
		
		JButton btnGoBackTo = new JButton("GO BACK TO WELCOME PAGE");
		btnGoBackTo.setBounds(86, 210, 470, 42);
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage hp= new HomePage();
				hp.setVisible(true);
			}
		});
		btnGoBackTo.setForeground(Color.WHITE);
		btnGoBackTo.setBackground(new Color(255, 0, 0));
		btnGoBackTo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel_1.add(btnGoBackTo);
		
		textFieldPassWord = new JPasswordField();
		textFieldPassWord.setBounds(153, 56, 184, 20);
		panel_1.add(textFieldPassWord);
	}
}
