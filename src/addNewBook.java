import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addNewBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewBook frame = new addNewBook();
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
	public addNewBook() {
		setTitle("ADD NEW BOOK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 11, 312, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAuthorInformation = new JLabel("AUTHOR INFORMATION");
		lblAuthorInformation.setBounds(50, 11, 198, 14);
		lblAuthorInformation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAuthorInformation.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblAuthorInformation);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 36, 198, 2);
		panel.add(separator);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 68, 67, 21);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(10, 100, 67, 21);
		panel.add(lblEmail);
		
		JLabel lblGender = new JLabel("GENDER\r\n");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGender.setBounds(10, 132, 67, 21);
		panel.add(lblGender);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAge.setBounds(10, 164, 67, 21);
		panel.add(lblAge);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\tMALE", "\tFEMALE", "\tOTHER"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(184, 132, 80, 21);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(87, 132, 67, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 69, 161, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 101, 161, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(87, 165, 67, 20);
		panel.add(textField_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(332, 11, 332, 349);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBookInfromation = new JLabel("BOOK INFROMATION");
		lblBookInfromation.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookInfromation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBookInfromation.setBounds(63, 11, 198, 14);
		panel_1.add(lblBookInfromation);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(63, 36, 198, 2);
		panel_1.add(separator_1);
		
		JLabel label = new JLabel("NAME");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(10, 68, 67, 21);
		panel_1.add(label);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPrice.setBounds(10, 104, 67, 21);
		panel_1.add(lblPrice);
		
		JLabel lblDiscount = new JLabel("DISCOUNT");
		lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDiscount.setBounds(10, 142, 94, 21);
		panel_1.add(lblDiscount);
		
		JLabel lblGenre = new JLabel("GENRE");
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGenre.setBounds(10, 181, 67, 21);
		panel_1.add(lblGenre);
		
		JLabel lblSubGenre = new JLabel("SUB GENRE");
		lblSubGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGenre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSubGenre.setBounds(10, 228, 94, 21);
		panel_1.add(lblSubGenre);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIsbn.setBounds(10, 275, 67, 21);
		panel_1.add(lblIsbn);
		
		JLabel lblYearOfPublish = new JLabel("YEAR OF PUBLISH");
		lblYearOfPublish.setHorizontalAlignment(SwingConstants.CENTER);
		lblYearOfPublish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblYearOfPublish.setBounds(10, 317, 173, 21);
		panel_1.add(lblYearOfPublish);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fiction", "Non Fiction"}));
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(210, 181, 94, 21);
		panel_1.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(87, 69, 174, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(87, 105, 96, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(114, 143, 96, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(87, 182, 96, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(114, 229, 96, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(87, 276, 96, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(194, 318, 67, 20);
		panel_1.add(textField_10);
		
		JButton btnAddBookTo = new JButton("ADD BOOK TO COLLECTION");
		btnAddBookTo.setBackground(Color.ORANGE);
		btnAddBookTo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAddBookTo.setBounds(35, 264, 248, 23);
		contentPane.add(btnAddBookTo);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminPanel ap= new AdminPanel();
				ap.setVisible(true);
			}
		});
		btnGoBack.setBackground(Color.ORANGE);
		btnGoBack.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnGoBack.setBounds(35, 309, 248, 23);
		contentPane.add(btnGoBack);
	}
}
