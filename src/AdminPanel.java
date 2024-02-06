import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		setTitle("ADMIN PANEL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 654, 63);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(Color.YELLOW);
		contentPane.add(panel);
		
		JLabel label = new JLabel("ADMIN LOGIN");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Algerian", Font.BOLD, 35));
		label.setBounds(10, 11, 634, 41);
		panel.add(label);
		
		JButton btnNewButton = new JButton("ADD NEW BOOK");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 153, 51));
		btnNewButton.setBounds(214, 102, 258, 48);
		contentPane.add(btnNewButton);
		
		JButton btnManageMyStore = new JButton("MANAGE MY STORE");
		btnManageMyStore.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnManageMyStore.setBackground(new Color(255, 153, 51));
		btnManageMyStore.setBounds(214, 161, 258, 48);
		contentPane.add(btnManageMyStore);
		
		JButton btnBooksInformation = new JButton("BOOKS INFORMATION");
		btnBooksInformation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBooksInformation.setBackground(new Color(255, 153, 51));
		btnBooksInformation.setBounds(214, 220, 258, 48);
		contentPane.add(btnBooksInformation);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogOut.setBackground(new Color(255, 153, 51));
		btnLogOut.setBounds(214, 279, 258, 48);
		contentPane.add(btnLogOut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBounds(10, 85, 654, 275);
		contentPane.add(panel_1);
	}

}
