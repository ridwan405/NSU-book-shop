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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
		textFieldUserName.setBounds(162, 106, 186, 20);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		textFieldPassWord = new JTextField();
		textFieldPassWord.setBounds(162, 143, 186, 20);
		textFieldPassWord.setColumns(10);
		contentPane.add(textFieldPassWord);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("Login.txt");
				FileReader fr= null;
				BufferedReader br= null;
				
				try {
					fr= new FileReader(file);
					br= new BufferedReader(fr);
					
					String line= null;
					
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				
				dispose();
				AdminPanel ap= new AdminPanel();
				ap.setVisible(true);
			}
		});
		btnNewButton.setBounds(20, 125, 165, 42);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUserName.setText(null);
				textFieldPassWord.setText(null);
			}
		});
		btnReset.setBounds(243, 125, 165, 42);
		btnReset.setBackground(Color.ORANGE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", 2);
				if(n==0) {
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(465, 125, 165, 42);
		btnExit.setBackground(Color.ORANGE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 188, 654, 2);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		panel_1.add(separator_1);
		
		JButton btnGoBackTo = new JButton("GO BACK TO WELCOME PAGE");
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
		btnGoBackTo.setBounds(86, 210, 470, 42);
		panel_1.add(btnGoBackTo);
	}
}
