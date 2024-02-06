package bookManagement;

import java.io.Serializable;
import java.util.*;

public class BookCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	 int MAX_SIZE = 10000;
	//private  Book[] books= new Book[MAX_SIZE];
	private  ArrayList<Book> books= new ArrayList<Book>();
	private  Book[] temp;
	// ArrayList<Book> books;
	private  int nextIndex = 0;
	private  int numberOfBooks = 0;

	public BookCollection() {
		
		//books = new Book[MAX_SIZE];
		// books= new Book[n];
		// numberOfBooks= n;
	}
	
	public BookCollection(ArrayList<Book> b) {
		Collections.copy(books,b);
	}
	
	public   ArrayList<Book> getCollection(){
		return books;
	}

	/*
	 * public int getNextIndex() { return nextIndex; }
	 */

	public  boolean addBook(Book b) {
		/*if (numberOfBooks == MAX_SIZE) {
			/*
			 * temp = new Book[MAX_SIZE + 1]; temp = Arrays.copyOf(books, MAX_SIZE); books =
			 * new Book[MAX_SIZE + 1]; books= Arrays.copyOf(temp, MAX_SIZE); MAX_SIZE++;
			 
			
			temp= new Book[MAX_SIZE+1];
			System.arraycopy(books, 0, temp, 0, books.length);
			books= temp;
			MAX_SIZE++;
		}*/
		try {
			//books[numberOfBooks++] = b;
			books.add(b);
			numberOfBooks++;

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return true;
	}

	public  void resetsetBooks() {
	//	Book[] reset = new Book[MAX_SIZE];

		//books = reset;
		nextIndex= 0;
		
	}

	public void setNumberOfBooks() {
		numberOfBooks= books.size();
	}
	
	public  void removeBook(int index) {
		/*
		 * for(int i= index-1; i<numberOfBooks-1; i++) { books[i]= books[i+1]; }
		 * books[--numberOfBooks]= null; //numberOfBooks--;
		 */
		books.remove(index);
		numberOfBooks--;
		}

	/*
	 * public  void removeBook(int index) { for (int i = index-1;
	 * i<numberOfBooks-1; i++) { books[i] = books[i + 1]; } books[numberOfBooks-1] =
	 * null; numberOfBooks--; }
	 */

	/*
	 * public void setNextIndex(int nextIndex) { this.nextIndex = nextIndex; }
	 */

	public  Book getBook(String isbn) {
		int i;
		Book temp = null;
		for (i = 0; i < numberOfBooks; i++) {
			if (isbn.equals(books.get(i).getIsbn())) {
				System.out.println("successful");
				temp = books.get(i);
				//removeBook(i);
				break;
			}
		}
		if(i==numberOfBooks)
			throw new NullPointerException();
		return temp;
	}

	public  Book getNext() {
		/*
		 * if(nextIndex==numberOfBooks) resetBooks();
		 */
		return books.get(nextIndex++);
	}

	public boolean hasNext() {
		if (nextIndex == numberOfBooks) {
			return false;
		}
		return true;
	}

	public void resetBooks() {
		nextIndex = 0;
	}

	public  int searchBook(String isbn) {
		for (int i = 0; i < numberOfBooks; i++) {
			if (isbn.compareTo(books.get(i).getIsbn()) == 0) {
				return i;
			}
		}
		return -1;
	}

	public  int getNumberOfBooks() {
		return books.size();
	}
	/*
	 * public Book getBookByIndex(int i) { return books[i]; }
	 */
	public Book findBook(int i) {
		return books.get(i);
	}

	public  void sortByIsbn() {
		
		/*
		 * temp= new Book[numberOfBooks]; System.arraycopy(books, 0, temp, 0,
		 * numberOfBooks);
		 */
		
		try {
			Collections.sort(books);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		

		/*
		 * for(int i= 0; i<numberOfBooks; i++) {
		 * System.out.println(books[i].getName()+", "+books[i].getIsbn()); }
		 */
	}/*
		 * , new Comparator<Book>() { public int compare(Book b1, Book b2) { return
		 * b1.getIsbn().compareTo(b2.getIsbn()); } });
		 */
	// }

	public  void sortByPrice() {// using comparator
			try {
		  Collections.sort(books, new Comparator<Book>() {
		 
		 @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
		  return (int)o1.getPrice()-(int)o2.getPrice(); }
		 
		  });
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
		 
		// using sorting algorithm
		/*
		 * double [] temp= new double [numberOfBooks]; temp[0]= books[0].getPrice();
		 * 
		 * int countPrice= 1; for(int i= 1; i<numberOfBooks; i++) {//sorting out
		 * duplicates int flag= 0; for(int j= 0; j<countPrice; j++) {
		 * if(temp[j]==books[i].getPrice()) flag= 1; } if(flag==0) { temp[countPrice++]=
		 * books[i].getPrice(); } }
		 * 
		 * 
		 * 
		 * //int jCounter= 0;
		 * 
		 * for(int i= 0; i<countPrice; i++) { //sorting the price double tempMin=
		 * temp[i]; int jCounter= 0; for(int j= i+1; j<countPrice; j++) {
		 * if(tempMin>temp[j]) { tempMin= temp[j]; jCounter= j; } } if(i!=countPrice-1
		 * && jCounter!=0) { temp[jCounter]= temp[i]; temp[i]= tempMin; } }
		 * 
		 * Book [] bookSorted= new Book[numberOfBooks]; int bookCounter= 0;
		 * 
		 * for(int i= 0; i<countPrice; i++) { //sorting books for(int j= 0;
		 * j<numberOfBooks; j++) { if(temp[i]==books[j].getPrice())
		 * bookSorted[bookCounter++]= books[j]; } }
		 * 
		 * books= bookSorted;
		 * 
		 * for(int i= 0; i<numberOfBooks; i++) {
		 * System.out.println(books[i].getName()+", "+books[i].getWriter().getName()
		 * +", "+books[i].getPrice()); }
		 * 
		 * for(int i= 0; i<countPrice; i++) { System.out.println(temp[i]); }
		 */

	}

	public  void sortByYearOfPublish() {// comparator
		
		  Collections.sort(books, new Comparator<Book>() {
		 
		 @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
		  return (int)o1.getYearOfPublish()-(int)o2.getYearOfPublish(); }
		 
		  });
		 

		// sorting algorithm

		/*
		 * System.out.println("\nbfore sorting\n"); for(int i= 0; i<numberOfBooks; i++)
		 * { System.out.println(books[i].getName()+", "+books[i].getWriter().getName()
		 * +", "+books[i].getIsbn()+", "+books[i].getYearOfPublish()); }
		 * System.out.println("\nafter sorting\n");
		 */

		/*
		 * int[] temp = new int[numberOfBooks]; temp[0] = books[0].getYearOfPublish();
		 * 
		 * int countPrice = 1; for (int i = 1; i < numberOfBooks; i++) {// sorting out
		 * duplicates int flag = 0; for (int j = 0; j < countPrice; j++) { if (temp[j]
		 * == books[i].getYearOfPublish()) flag = 1; } if (flag == 0) {
		 * temp[countPrice++] = books[i].getYearOfPublish(); } }
		 * 
		 * // int jCounter= 0;
		 * 
		 * for (int i = 0; i < countPrice; i++) { // sorting the price int tempMin =
		 * temp[i]; int jCounter = 0; for (int j = i + 1; j < countPrice; j++) { if
		 * (tempMin > temp[j]) { tempMin = temp[j]; jCounter = j; } } if (i !=
		 * countPrice - 1 && jCounter != 0) { temp[jCounter] = temp[i]; temp[i] =
		 * tempMin; } }
		 * 
		 * Book[] bookSorted = new Book[numberOfBooks]; int bookCounter = 0;
		 * 
		 * for (int i = 0; i < countPrice; i++) { // sorting books for (int j = 0; j <
		 * numberOfBooks; j++) { if (temp[i] == books[j].getYearOfPublish())
		 * bookSorted[bookCounter++] = books[j]; } }
		 * 
		 * books = bookSorted;
		 */

		/*
		 * for(int i= 0; i<numberOfBooks; i++) {
		 * System.out.println(books[i].getName()+", "+books[i].getWriter().getName()
		 * +", "+books[i].getIsbn()+", "+books[i].getYearOfPublish()); }
		 */

		/*
		 * for(int i= 0; i<countPrice; i++) { System.out.println(temp[i]); }
		 * 
		 * System.out.println(bookCounter);
		 */
	}

	public String toString() {

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println(books.get(i));
		}
		return "Number of books" + numberOfBooks + ", current index: " + nextIndex;
	}
}
