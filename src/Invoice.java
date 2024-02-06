import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Invoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 654, 349);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 278, 188);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER");
		lblNewLabel.setBounds(25, 13, 206, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 36, 206, 2);
		panel_1.add(separator);
		
		JButton btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddToCart.setBounds(60, 64, 152, 23);
		panel_1.add(btnAddToCart);
		
		JButton btnRemoveFromCart = new JButton("Remove Book");
		btnRemoveFromCart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRemoveFromCart.setBounds(60, 98, 152, 23);
		panel_1.add(btnRemoveFromCart);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCheckOut.setBounds(60, 132, 152, 23);
		panel_1.add(btnCheckOut);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(298, 11, 346, 327);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 326, 305);
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 210, 278, 128);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGoBack.setBounds(55, 29, 155, 27);
		panel_3.add(btnGoBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(55, 72, 155, 27);
		panel_3.add(btnExit);
	}
}
