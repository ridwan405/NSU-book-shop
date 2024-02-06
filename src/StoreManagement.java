import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollBar;

public class StoreManagement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreManagement frame = new StoreManagement();
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
	public StoreManagement() {
		setTitle("Store Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 412);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(10, 11, 654, 349);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 291, 327);
		panel_1.setBackground(new Color(255, 204, 153));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANAGE STORE");
		lblNewLabel.setBounds(70, 11, 133, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(53, 36, 155, 2);
		panel_1.add(separator);
		
		JButton btnNewButton = new JButton("SORT BY <PLACE HOLDER>");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(40, 72, 199, 23);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("SORT BY <PLACE HOLDER>");
		button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button.setBounds(40, 108, 199, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("SORT BY <PLACE HOLDER>");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		button_1.setBounds(40, 147, 199, 23);
		panel_1.add(button_1);
		
		JButton btnNewButton_1 = new JButton("<PLACE HOLDER>");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(53, 225, 150, 23);
		panel_1.add(btnNewButton_1);
		
		JButton button_2 = new JButton("<PLACE HOLDER>");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBounds(53, 259, 150, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("<PLACE HOLDER>");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBounds(53, 293, 150, 23);
		panel_1.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(311, 11, 333, 327);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 313, 305);
		panel_2.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(311, 11, 12, 305);
		panel_2.add(scrollBar);
	}
}
