package bookShopGui;
import java.awt.BorderLayout;
import bookManagement.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class BookInformationNonEditable extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAuthorGender;
	private JTextField textFieldAuthorName;
	private JTextField textFieldAuthorEmail;
	private JTextField textFieldAuthorAge;
	private JTextField textFieldBookName;
	private JTextField textFieldBookPrice;
	private JTextField textFieldBookDiscount;
	private JTextField textFieldBookGenre;
	private JTextField textFieldBookSubGenre;
	private JTextField textFieldBookIsbn;
	private JTextField textFieldYearOfPublish;
	BookCollection bc= new BookCollection();
	


	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewBook frame = new AddNewBook();
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
	

	public BookInformationNonEditable() {
		setResizable(false);
		
		//text input start
		
		//text input
		
		    FileInputStream fi= null;
			ObjectInputStream oi= null;
			
			try {
			fi= new FileInputStream(new File("BookCollection.txt"));
			oi= new ObjectInputStream(fi);
			bc= (BookCollection) oi.readObject();
			bc.setNumberOfBooks();
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
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			
			
			
			try {
			fi.close();
			oi.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
		
		//text input end
		
		
		setTitle("Book Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 11, 312, 215);
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
		
		textFieldAuthorGender = new JTextField();
		textFieldAuthorGender.setEditable(false);
		textFieldAuthorGender.setBounds(87, 132, 67, 20);
		panel.add(textFieldAuthorGender);
		textFieldAuthorGender.setColumns(10);
		
		
		textFieldAuthorName = new JTextField();
		textFieldAuthorName.setEditable(false);
		textFieldAuthorName.setColumns(10);
		textFieldAuthorName.setBounds(87, 69, 161, 20);
		panel.add(textFieldAuthorName);
		
		textFieldAuthorEmail = new JTextField();
		textFieldAuthorEmail.setEditable(false);
		textFieldAuthorEmail.setColumns(10);
		textFieldAuthorEmail.setBounds(87, 101, 161, 20);
		panel.add(textFieldAuthorEmail);
		
		textFieldAuthorAge = new JTextField();
		textFieldAuthorAge.setEditable(false);
		textFieldAuthorAge.setColumns(10);
		textFieldAuthorAge.setBounds(87, 165, 67, 20);
		panel.add(textFieldAuthorAge);
		
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
		
		textFieldBookName = new JTextField();
		textFieldBookName.setEditable(false);
		textFieldBookName.setBounds(87, 69, 174, 20);
		panel_1.add(textFieldBookName);
		textFieldBookName.setColumns(10);
		
		textFieldBookPrice = new JTextField();
		textFieldBookPrice.setEditable(false);
		textFieldBookPrice.setColumns(10);
		textFieldBookPrice.setBounds(87, 105, 96, 20);
		panel_1.add(textFieldBookPrice);
		
		textFieldBookDiscount = new JTextField();
		textFieldBookDiscount.setEditable(false);
		textFieldBookDiscount.setColumns(10);
		textFieldBookDiscount.setBounds(114, 143, 96, 20);
		panel_1.add(textFieldBookDiscount);
		
		textFieldBookGenre = new JTextField();
		textFieldBookGenre.setEditable(false);
		textFieldBookGenre.setColumns(10);
		textFieldBookGenre.setBounds(87, 182, 96, 20);
		panel_1.add(textFieldBookGenre);
		
		textFieldBookSubGenre = new JTextField();
		textFieldBookSubGenre.setEditable(false);
		textFieldBookSubGenre.setColumns(10);
		textFieldBookSubGenre.setBounds(114, 229, 96, 20);
		panel_1.add(textFieldBookSubGenre);
		
		textFieldBookIsbn = new JTextField();
		textFieldBookIsbn.setEditable(false);
		textFieldBookIsbn.setColumns(10);
		textFieldBookIsbn.setBounds(87, 276, 96, 20);
		panel_1.add(textFieldBookIsbn);
		
		textFieldYearOfPublish = new JTextField();
		textFieldYearOfPublish.setEditable(false);
		textFieldYearOfPublish.setColumns(10);
		textFieldYearOfPublish.setBounds(194, 318, 67, 20);
		panel_1.add(textFieldYearOfPublish);
		
		
		Book temp= bc.findBook(StoreManagement.serialNumber);
		
		
		textFieldAuthorAge.setText(Integer.toString(temp.getWriter().getAge()));
		textFieldAuthorEmail.setText(temp.getWriter().getEmailId());
		textFieldAuthorGender.setText(temp.getWriter().getGender());
		textFieldAuthorName.setText(temp.getWriter().getName());
		textFieldBookDiscount.setText(Double.toString(temp.getPercentageDiscount()));
		textFieldBookGenre.setText(temp.getGenre().getGenre());
		textFieldBookIsbn.setText(temp.getIsbn());
		textFieldBookName.setText(temp.getName());
		textFieldBookPrice.setText(Double.toString(temp.getPrice()));
		textFieldBookSubGenre.setText(temp.getGenre().getSubGenre());
		textFieldYearOfPublish.setText(Integer.toString(temp.getYearOfPublish()));
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				
				 StoreManagement sm= new StoreManagement(); sm.setVisible(true);
				 
				/*
				 * Tester t= new Tester(); t.setVisible(true);
				 */
			}
		});
		btnGoBack.setBackground(Color.ORANGE);
		btnGoBack.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnGoBack.setBounds(35, 287, 248, 45);
		contentPane.add(btnGoBack);
	}
}
