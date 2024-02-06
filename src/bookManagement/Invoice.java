package bookManagement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Invoice {
	
	LocalDateTime date= LocalDateTime.now();
	DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss") ;
	String formatDateTime= date.format(format);
	
	/*----------------------------------------------*/
	
	private static ArrayList<Book> book= new ArrayList<Book>();
	private static int numberOfBooks= 0;
	private static int index= 0;
	public static String [] tempName;
	private static int countDup= 0;
	public Invoice(){
		
	}
	
	public static Book getBook() {
		
		if(index>=numberOfBooks) {
			resetBooks();
		}
		return book.get(index++);
			
	}
	public static void removeBook(int index) throws ArrayIndexOutOfBoundsException, NullPointerException, IndexOutOfBoundsException{
		/*
		 * for(int i= index-1; i<numberOfBooks-1; i++) { book[i]= book[i+1]; }
		 * book[numberOfBooks-1]= null;
		 */
		
		book.remove(index);
		
		numberOfBooks--;
	}
	
	public static void resetBooks() {
		index= 0;
	}
	
	public static void clearInvoice() {
		book.clear();
	}
	
	public static void addBook(Book b) {
		book.add(b);
		numberOfBooks++;
	}

	public String getFormatDateTime() {
		return formatDateTime;
	}

	public static int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	private static boolean isAuthorDiscountEligable() {
		tempName= new String [numberOfBooks];
		int countArr= 0,  i, j, k;
		for(i= 0; i<numberOfBooks; i++) {
			for(j= i+1; j<numberOfBooks; j++) {
				if(book.get(i).getWriter().getName().equals(book.get(j).getWriter().getName()) && i!=j) {
					countArr++;
				}
			}
			if(countArr>=2) {
				for(k= 0; k<countDup; k++) {
					if(book.get(i).getWriter().getName().equals(tempName[k])) {
						break;
					}
				}
				if(k==countDup) {
				tempName[countDup++]= book.get(i).getWriter().getName();
				}
			}
			countArr= 0;
		}
		if(countDup>0)
			return true;
		else
			return false;
		
	}
	
	private static double calculateAuthorDiscountPrice() {//change
		int i;
		double sum= 0;
		
		for(i= 0; i<countDup; i++) {
			for(int j= 0; j<numberOfBooks; j++) {
				if(tempName[i].equals(book.get(j).getWriter().getName())) {
					sum+= book.get(j).getPrice(); 
				}
			}
		}
		double remainingBooks= calculatePrice()- sum;
		//return sum;
		//return remainingBooks;
		sum-= sum*(45.0/100.0);
		return sum+remainingBooks;
		
	}
	
	private static double bookDiscountPrice() {//change
		 double sum= 0;
		
		for(int i= 0; i<numberOfBooks; i++) {
			sum+= book.get(i).getPrice()-book.get(i).getPrice()*(book.get(i).getPercentageDiscount()/100);
		}
		return sum;
	}
	/*private double sum(){
		double sum= 0;
		for(int i= 0; i<numberOfBooks; i++) {
			sum+= book[i].getPrice();
		}
		return sum;
	}*/
	
	private static double genreDiscount() {//change
		double sum= 0;
		for(int i= 0; i<numberOfBooks; i++) {
			if(book.get(i).getGenre().equals("fiction")==true /*&& book[i].getPercentageDiscount()<9*/)
				sum+= book.get(i).getPrice()-book.get(i).getPrice()*(9/100);
			else {
				
					sum+= book.get(i).getPrice()-book.get(i).getPrice()*(10/100);
			}
		}
		return sum;
	}
	
	public static double calculatePrice() {
		double sum= 0;
		for(int i= 0; i<numberOfBooks; i++) {
			sum+= book.get(i).getPrice();
		}
		return sum;
	}
	
	public static double finalPrice(){
		
		if(isAuthorDiscountEligable()==true) {
			/*if(calculateAuthorDiscountPrice()<genreDiscount()) {
				if(calculateAuthorDiscountPrice()<bookDiscountPrice())
					return calculateAuthorDiscountPrice();
				else
					return bookDiscountPrice();
			
			}
			else
				if(genreDiscount()<bookDiscountPrice())
					return genreDiscount();
				else
					return bookDiscountPrice();*/
			return calculateAuthorDiscountPrice();
		}
		else
			if(genreDiscount()<bookDiscountPrice())
				return genreDiscount();
			else
				return bookDiscountPrice();
	}
	
	public String toString() {
		System.out.println(getFormatDateTime());
		
		for(int i= 0; i<numberOfBooks; i++) {
			System.out.println("name: "+book.get(i).getName()+", price: "+book.get(i).getPrice());
		}
		
		System.out.println("Total price: "+calculatePrice());
		return "Price After Discount :"+finalPrice();
	}
}
