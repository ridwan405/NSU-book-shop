package bookShopGui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bookManagement.Book;
import bookManagement.Invoice;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		setResizable(false);
		setTitle("RECIEPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 968, 503);
		panel.setBackground(new Color(255, 255, 153));
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("PRINT RECEIPT");
		btnNewButton.setBounds(302, 392, 363, 57);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//actions must be taken before clear invoice
				Invoice.clearInvoice();
				dispose();
				bookShopGui.Invoice invoice= new bookShopGui.Invoice();
				invoice.setVisible(true);
			}
		});
		panel.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 948, 194);
		panel.add(scrollPane);
		
		JTextArea textAreaBooks = new JTextArea();
		scrollPane.setViewportView(textAreaBooks);
		textAreaBooks.setFont(new Font("Serif", Font.ITALIC, 15));
		textAreaBooks.setEditable(false);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 223, 948, 128);
		panel.add(scrollPane_1);
		
		JTextArea textAreaPrice = new JTextArea();
		scrollPane_1.setViewportView(textAreaPrice);
		textAreaPrice.setFont(new Font("MS Gothic", Font.BOLD, 20));
		textAreaPrice.setEditable(false);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(946, 11, 12, 194);
		panel.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar_1.setBounds(10, 195, 948, 10);
		panel.add(scrollBar_1);
		
		textAreaPrice.append("\nTotal Price: "+Invoice.calculatePrice()+"\n");
		textAreaPrice.append("Discounted Price: "+Invoice.finalPrice());
		
		for(int i= 0; i<bookManagement.Invoice.getNumberOfBooks(); i++) {
			int number= i+1;
			Book tempBook= bookManagement.Invoice.getBook();
			String str= number+". NAME: ["+tempBook.getName()+"] Author: ["+tempBook.getWriter().getName()+"] Genre: ["+tempBook.getGenre()+"] ISBN: ["+tempBook.getIsbn()+"] PRICE: ["+tempBook.getPrice()+
				"] DISCOUNT: ["+tempBook.getPercentageDiscount()+"]\n";
			textAreaBooks.append(str);
		}
		bookManagement.Invoice.resetBooks();
	}
}
