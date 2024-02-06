package bookShopGui;
import java.awt.BorderLayout;
import bookManagement.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class StoreManagement extends JFrame {

	private JPanel contentPane;
	BookCollection bc= new BookCollection();
	public static int serialNumber;

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
		setResizable(false);
		JTextArea textArea = new JTextArea();
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
		setTitle("Store Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(10, 11, 1167, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 291, 386);
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
		
		JButton btnNewButton = new JButton("SORT BY ISBN");
		btnNewButton.setBounds(40, 183, 199, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bc.sortByIsbn();
				
				textArea.setText(null);
				for(int i= 0; i<bc.getNumberOfBooks(); i++) {
					Book tempBook= bc.getNext();
					int number= i+1;
					String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
					+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
					textArea.append(str);

				}
				bc.resetsetBooks();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnNewButton);
		
		JButton btnSortByYear = new JButton("SORT BY YEAR");
		btnSortByYear.setBounds(40, 108, 199, 23);
		btnSortByYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bc.sortByYearOfPublish();
				
				textArea.setText(null);
				for(int i= 0; i<bc.getNumberOfBooks(); i++) {
					Book tempBook= bc.getNext();
					int number= i+1;
					String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
					+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
					textArea.append(str);

				}
				bc.resetsetBooks();
			}
		});
		btnSortByYear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnSortByYear);
		
		JButton btnSortByPrice = new JButton("SORT BY PRICE");
		btnSortByPrice.setBounds(40, 147, 199, 23);
		btnSortByPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bc.sortByPrice();
				
				textArea.setText(null);
				for(int i= 0; i<bc.getNumberOfBooks(); i++) {
					Book tempBook= bc.getNext();
					int number= i+1;
					String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
					+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
					textArea.append(str);

				}
				bc.resetsetBooks();
			}
		});
		btnSortByPrice.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnSortByPrice);
		
		JButton btnNewButton_1 = new JButton("DELETE BOOK");
		btnNewButton_1.setBounds(40, 285, 199, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index= -1;
				
				try {
					index= Integer.parseInt(JOptionPane.showInputDialog("Enter Book serial number please"));
					index--;
					if(index<0 || index>bc.getNumberOfBooks())
						throw new Exception();
					bc.removeBook(index);
					}
					catch (Exception e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Invalid Input :(");
						e1.printStackTrace();
					}
				
				
				textArea.setText(null);
				for(int i= 0; i<bc.getNumberOfBooks(); i++) {
					Book tempBook= bc.getNext();
					int number= i+1;
					String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
					+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
					textArea.append(str);

				}
				bc.resetsetBooks();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBounds(70, 319, 133, 35);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileOutputStream f= null;
				ObjectOutputStream o= null;
				/*
				 * ArrayList<Book> bc= BookCollection.getCollection();
				 * Collections.copy(bc,BookCollection.getCollection());
				 */
				//BookCollection bc= new BookCollection();
				try {
					f= new FileOutputStream(new File("BookCollection.txt"));
					o= new ObjectOutputStream(f);
					o.writeObject(bc);
					f.close();
					o.close();
				}
				catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				
				dispose();
				AdminPanel adminPanel= new AdminPanel();
				adminPanel.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(311, 11, 844, 386);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 823, 364);
		panel_2.add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		
		
		textArea.setEditable(false);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(815, 11, 17, 364);
		panel_2.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(10, 363, 824, 12);
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		panel_2.add(scrollBar_1);
		
		JButton btnDisplayBooks = new JButton("DISPLAY BOOKS");
		btnDisplayBooks.setBounds(40, 74, 199, 23);
		btnDisplayBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
				for(int i= 0; i<bc.getNumberOfBooks(); i++) {
					Book tempBook= bc.getNext();
					int number= i+1;
					String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
					+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
					textArea.append(str);

				}
				bc.resetsetBooks();
			}
		});
		btnDisplayBooks.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnDisplayBooks);
		
		JButton btnEditABook = new JButton("EDIT A BOOK");
		btnEditABook.setBounds(40, 251, 199, 23);
		btnEditABook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				serialNumber= Integer.parseInt(JOptionPane.showInputDialog("Enter Book serial number please"));
				serialNumber--;
				if(serialNumber<0 || serialNumber>bc.getNumberOfBooks()) {
					throw new Exception();
				}
				dispose();
				BookInformation bi= new BookInformation();
				bi.setVisible(true);
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Invalid Input :(");
					//e1.printStackTrace();
				}
				
				
				
			}
		});
		btnEditABook.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel_1.add(btnEditABook);
		
		JButton btnBookInformation = new JButton("Book Information");
		btnBookInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					serialNumber= Integer.parseInt(JOptionPane.showInputDialog("Enter Book serial number please"));
					serialNumber--;
					if(serialNumber<0 || serialNumber>bc.getNumberOfBooks()) {
						throw new Exception();
					}
					dispose();
					BookInformationNonEditable bi= new BookInformationNonEditable();
					bi.setVisible(true);
					}
					catch (Exception e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Invalid Input :(");
						//e1.printStackTrace();
					}
				
			}
		});
		btnBookInformation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBookInformation.setBounds(40, 217, 199, 23);
		panel_1.add(btnBookInformation);
	}
}
