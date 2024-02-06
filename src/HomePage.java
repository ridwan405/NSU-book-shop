import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("HOMEPAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 654, 77);
		panel.setBackground(new Color(255, 255, 51));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNsuBookShop = new JLabel("NSU BOOK SHOP");
		lblNsuBookShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblNsuBookShop.setFont(new Font("Algerian", Font.BOLD, 35));
		lblNsuBookShop.setBounds(10, 11, 634, 55);
		panel.add(lblNsuBookShop);
		
		JButton btnCashierLogin = new JButton("CASHIER LOGIN");
		btnCashierLogin.setBounds(222, 215, 222, 51);
		btnCashierLogin.setBackground(new Color(255, 102, 102));
		btnCashierLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(btnCashierLogin);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin adminLogin= new AdminLogin();
				adminLogin.setVisible(true);
			}
		});
		btnAdminLogin.setBounds(222, 132, 222, 51);
		contentPane.add(btnAdminLogin);
		btnAdminLogin.setBackground(Color.ORANGE);
		btnAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBounds(10, 99, 654, 261);
		contentPane.add(panel_1);
	}
}
