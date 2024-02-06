package bookShopGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dataManagement.LoginInfo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ConfirmOldLoginCashier extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmOldLoginCashier frame = new ConfirmOldLoginCashier();
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
	public ConfirmOldLoginCashier() {
		setResizable(false);
		setTitle("Confrim Old Password");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 43, 89, 14);
		contentPane.add(lblNewLabel);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(138, 40, 121, 20);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 71, 121, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(39, 74, 89, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginInfo cashierTxt= null;
				try {
					FileInputStream fi= new FileInputStream(new File("cashier.txt"));
					ObjectInputStream oi= new ObjectInputStream(fi);
					 cashierTxt = (LoginInfo) oi.readObject();
					
					fi.close();
					oi.close();
					if(cashierTxt==null) {
						throw new NullPointerException();
					}
					
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
				
				if(cashierTxt.getUserName().equals(textFieldUserName.getText()) && cashierTxt.getPassWord().equals(passwordField.getText())) {
					dispose();
					ResetPasswordCashier rpc= new ResetPasswordCashier();
					rpc.setVisible(true);
				}
				else {
				JOptionPane.showMessageDialog(null, "Incorrect Username or password");
				textFieldUserName.setText(null);
				passwordField.setText(null);
				}
			}
		});
		btnNewButton.setBounds(102, 132, 214, 32);
		contentPane.add(btnNewButton);
	}
}
