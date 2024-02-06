package bookManagement;
import java.io.Serializable;
import java.util.*;
public class Book implements Comparable<Book>,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, isbn;
	private double price, percentageDiscount;
	private int yearOfPublish;
	private Author writer;
	private Genre genre;
	
	/**
	 * @param name
	 * @param isbn
	 * @param price
	 * @param percentageDiscount
	 * @param yearOfPublish
	 * @param writer
	 * @param genre
	 */
	public Book(String name, double price, Author writer,  double percentageDiscount,
			Genre genre, String isbn, int yearOfPublish) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.percentageDiscount = percentageDiscount;
		this.yearOfPublish = yearOfPublish;
		this.writer = writer;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public Author getWriter() {
		return writer;
	}
	public void setWriter(Author writer) {
		this.writer = writer;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int compareTo(Book b) {
		return isbn.compareTo(b.getIsbn());
	}
	/*Comparator<Book> compareByPrice= (Book b1, Book b2) ->
		String.valueOf(b1.getPrice()).compareTo(String.valueOf(b2.getPrice()));
	Comparator<Book> compareByYearOfPublish= (Book b1, Book b2) ->
		String.valueOf(b1.getYearOfPublish()).compareTo(String.valueOf(b2.getYearOfPublish()));*/
	
	public String toString() {
		return "name: "+name+", Price: "+price+", isbn: "+isbn+", year: "+yearOfPublish+", Author: "+writer.toString();//more stuff to be added, but lazy
	}
}
