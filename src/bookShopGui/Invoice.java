package bookShopGui;
import java.awt.BorderLayout;
//import bookManagement.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookManagement.Book;
import bookManagement.BookCollection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Invoice extends JFrame {

	private JPanel contentPane;
	BookCollection bc= new BookCollection();

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
		setResizable(false);
		setTitle("Invoice");
		
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
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Serif", Font.ITALIC, 15));
		textArea.setEditable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1244, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(10, 11, 1208, 349);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBackground(new Color(255, 255, 204));
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
		btnAddToCart.setBounds(60, 64, 152, 23);
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String isbn= JOptionPane.showInputDialog("ISBN");
			//	bookManagement.Invoice newInvoice;//= new bookManagement.Invoice();
				
				try {
					Book findBook= bc.getBook(isbn);
					
				bookManagement.Invoice.addBook(findBook);
				textArea.setText(null);
				for(int i= 0; i<bookManagement.Invoice.getNumberOfBooks(); i++) {
					int number= i+1;
					Book tempBook= bookManagement.Invoice.getBook();
					String str= number+". NAME: ["+tempBook.getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+tempBook.getPrice()+
						"] DISCOUNT: ["+tempBook.getPercentageDiscount()+"] \n";
					textArea.append(str);
				}
				bookManagement.Invoice.resetBooks();
				
				JOptionPane.showMessageDialog(null, "Added to cart");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Book Not Found");
				}
				
				
			}
		});
		btnAddToCart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnAddToCart);
		
		JButton btnRemoveFromCart = new JButton("Remove Book");
		btnRemoveFromCart.setBounds(60, 98, 152, 23);
		btnRemoveFromCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int index= Integer.parseInt(JOptionPane.showInputDialog("Please enter the serial number of the book."));
				index--;
				if(index<0 || index>bc.getNumberOfBooks())
					throw new Exception();
				bookManagement.Invoice.removeBook(index);
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Invalid Input :(");
					e1.printStackTrace();
					
				}
				
				
				
				textArea.setText(null);
				
				for(int i= 0; i<bookManagement.Invoice.getNumberOfBooks(); i++) {
					int number= i+1;
					Book tempBook= bookManagement.Invoice.getBook();
					String str= number+". NAME: ["+tempBook.getName()+"] Author: ["+tempBook.getWriter().getName()+"] Genre: ["+tempBook.getGenre()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+tempBook.getPrice()+
						"] DISCOUNT: ["+tempBook.getPercentageDiscount()+"]\n";
					textArea.append(str);
				}
				bookManagement.Invoice.resetBooks();
				
			}
		});
		btnRemoveFromCart.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnRemoveFromCart);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.setBounds(60, 132, 152, 23);
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Receipt receipt= new Receipt();
				receipt.setVisible(true);
			}
		});
		btnCheckOut.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(btnCheckOut);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(298, 11, 900, 327);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		textArea.setBounds(10, 11, 880, 305);
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_3.setBackground(new Color(255, 255, 204));
		panel_3.setBounds(10, 210, 278, 128);
		panel.add(panel_3);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(55, 52, 155, 27);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CashierLogin cashierLogin= new CashierLogin();
				cashierLogin.setVisible(true);
			}
		});
		panel_3.setLayout(null);
		btnGoBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_3.add(btnGoBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(55, 90, 155, 27);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", 2);
				if(n==0) {
				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_3.add(btnExit);
		
		JButton btnShowCollection = new JButton("Show Collection");
		btnShowCollection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BookList bl= new BookList();
				bl.setVisible(true);
				
			}
		});
		btnShowCollection.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnShowCollection.setBounds(38, 11, 188, 27);
		panel_3.add(btnShowCollection);
	}
}
