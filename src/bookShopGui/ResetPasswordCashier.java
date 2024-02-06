package bookShopGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dataManagement.LoginInfo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ResetPasswordCashier extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JTextField textFieldPassWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPasswordCashier frame = new ResetPasswordCashier();
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
	public ResetPasswordCashier() {
		setResizable(false);
		setTitle("RESET");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 29, 99, 28);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(10, 68, 99, 28);
		panel.add(lblPassword);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(119, 34, 114, 20);
		panel.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		textFieldPassWord = new JTextField();
		textFieldPassWord.setBounds(119, 73, 114, 20);
		panel.add(textFieldPassWord);
		textFieldPassWord.setColumns(10);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName= textFieldUserName.getText();
				String passWord= textFieldPassWord.getText();
				
				LoginInfo admin= new LoginInfo(userName, passWord);
				
				try {
				FileOutputStream fo= new FileOutputStream(new File("cashier.txt"));
				ObjectOutputStream o= new ObjectOutputStream(fo);
				o.writeObject(admin);
				fo.close();
				o.close();
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
				
				
				// Tester test= new Tester(); test.setVisible(true);
				 
				
				  dispose(); CashierLogin cl= new CashierLogin(); cl.setVisible(true);
				 
			}
		});
		btnNewButton.setBounds(119, 127, 114, 28);
		panel.add(btnNewButton);
	}
}
