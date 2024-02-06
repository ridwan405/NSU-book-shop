package bookShopGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookManagement.Book;
import bookManagement.BookCollection;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class BookList extends JFrame {

	private JPanel contentPane;
	BookCollection bc= new BookCollection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookList frame = new BookList();
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
	public BookList() {
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
		
		setTitle("List Of Books");
		setBounds(100, 100, 1084, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 11, 775, 402);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		textArea.setEditable(false);
		
		textArea.setText(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1049, 11, 9, 402);
		contentPane.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(283, 401, 775, 12);
		contentPane.add(scrollBar_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(10, 11, 258, 402);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Sort by ISBN");
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
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(33, 54, 197, 33);
		panel.add(btnNewButton);
		
		JButton btnSortByPrice = new JButton("Sort by Price");
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
		btnSortByPrice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSortByPrice.setBounds(33, 110, 197, 33);
		panel.add(btnSortByPrice);
		
		JButton btnSortByYear = new JButton("Sort by Year");
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
		btnSortByYear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSortByYear.setBounds(33, 171, 197, 33);
		panel.add(btnSortByYear);
		for(int i= 0; i<bc.getNumberOfBooks(); i++) {
			Book tempBook= bc.getNext();
			int number= i+1;
			String str= "\n"+number+". NAME: ["+tempBook.getName()+"] AUTHOR: ["+tempBook.getWriter().getName()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+Double.toString(tempBook.getPrice())+"] GENRE: ["
			+tempBook.getGenre()+"] SUB-GENRE: ["+tempBook.getGenre().getSubGenre()+"] YEAR OF PUBLISH: ["+Integer.toString(tempBook.getYearOfPublish())+"] "+"\n";
			textArea.append(str);

		}
		bc.resetsetBooks();
		
		
	}
}
