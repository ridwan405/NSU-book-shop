package bookManagement;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("John Green", "green@example.com", 42, "male");
		Author a2 = new Author("JK Rowling", "rowling@exmaple.com", 54, "female");
		Author a3 = new Author("Nicholas Sparks", "sparks@exmaple.com", 53, "male");
		Author a4 = new Author("Rick Riordan", "riordan@exmaple.com", 55, "male");
		Author a5 = new Author("Stephen Hawking", "", -1, "male");
		Author a6 = new Author("Dan Brown", "brown@exmaple.com", 55, "male");
		Author a7 = new Author("Stephen King", "king@exmaple.com", 72, "male");
		Author a8 = new Author("Malcolm Gladwell", "gladwell@exmaple.com", 56, "male");
		Author a9 = new Author("Kyo Maclear", "maclear@exmaple.com", 49, "female");
		
		Book b0 = new Book("The Burning Maze", 250, a4, 10.6, new Fiction("fantasy"), "9123567891208", 2018);
		Book b1 = new Book("The Philosopher's Stone", 550, a2, 10.3, new Fiction("fantasy"), "9123567891201", 1997);
		Book b2 = new Book("The Chamber of Secrets", 450, a2, 10.2, new Fiction("fantasy"), "9123567891202", 1998);
		Book b3 = new Book("The Prisoner of Azkaban", 330, a2, 8.5, new Fiction("fantasy"), "9123567891203", 1999);
		Book b4 = new Book("The Goblet of Fire", 300, a2, 7.3, new Fiction("fantasy"), "9123567891205", 2000);
		Book b5 = new Book("Looking for Alaska", 500, a1, 10.8, new Fiction("Young adult fiction"), "9123567891206", 2005);
		Book b6 = new Book("Paper Towns", 250, a1, 8, new Fiction("mystry"), "9123567891207", 2008);
		Book b7 = new Book("A Walk to Remember", 350, a3, 9.5, new Fiction("drama"), "9123567891208", 2002);
		Book b8 = new Book("The Lightning Thief", 450, a4, 8.4, new Fiction("fantasy"), "9123567891208", 2005);
		Book b9 = new Book("The House of Hades", 150, a4, 10.5, new Fiction("fantasy"), "9123567891209", 2013);
		Book b10 = new Book("Inferno", 450, a6, 10.6, new Fiction("thriller"), "9123567891209", 2013);
		Book b11 = new Book("Deception point", 550, a6, 10.6, new Fiction("mystry"), "9123567891210", 2001);
		Book b12 = new Book("angels and demons", 430, a6, 10.5, new Fiction("crime"), "9123567891211", 2000);
		Book b13 = new Book("Da Vinci Code", 470, a6, 11.5, new Fiction("crime"), "9123567891212", 2000);
		Book b14 = new Book("Origin", 370, a6, 11.5, new Fiction("crime"), "9123567891212", 2017);
		Book b15 = new Book("A Brief History of Time", 330, a5, 5.5, new NonFiction("science"), "9123567891213", 1998);
		Book b16 = new Book("The Theory of Everything", 420, a5, 6.3, new NonFiction("science"), "9123567891214", 2004);
		Book b17 = new Book("God Created the Integers", 423, a5, 7.2, new NonFiction("biography"), "9123567891215", 2005);
		Book b18 = new Book("The Green Mile", 270, a7, 11.5, new Fiction("fantasy"), "9123567891216", 1996);
		Book b19 = new Book("Blink", 423, a8, 7.2, new NonFiction("self-help"), "9123567891217", 2005);
		Book b20 = new Book("Birds Art Life", 403, a9, 3.0, new NonFiction("biography"), "9123567891218", 2017);
		
		BookCollection c = new BookCollection();
			c.addBook(b0); c.addBook(b15); c.addBook(b1); c.addBook(b3); c.addBook(b4); c.addBook(b2); 
			c.addBook(b6); c.addBook(b18); c.addBook(b17); c.addBook(b11); c.addBook(b10); c.addBook(b19);
			c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b5); c.addBook(b16); c.addBook(b7);
			c.addBook(b8); c.addBook(b9); c.addBook(b20);
			
			c.toString();
			System.out.println("\n\n");
			c.removeBook(3);
			c.toString();
			c.removeBook(21);
			System.out.println("\n\n");
			c.toString();
			
		}
	}
		
		
		/*{
		BookCollection c = new BookCollection();
		
		c.addBook(b0); 
		c.addBook(b5); 
		c.addBook(b1); 
		c.addBook(b3); 
		c.addBook(b4); 
		c.addBook(b2);
		//System.out.println(c.getNumberOfBooks());
		System.out.println("Task1: sorted by isbn\n");												//task 1
		c.sortByIsbn();
		while(c.hasNext()) {
			System.out.println(c.getNext().toString());
		}
		}
		
		System.out.println("\n\nsorted by year of publish\n"); //task 2
		BookCollection c = new BookCollection();
		c.addBook(b0); 
		c.addBook(b5); 
		c.addBook(b1); 
		c.addBook(b3); 
		c.addBook(b4); 
		c.addBook(b2);
		c.sortByYearOfPublish(); 
		while(c.hasNext()) {
			System.out.println(c.getNext().toString());
		}
		
		c.resetBooks();
		 c = new BookCollection();
		c.addBook(b0); c.addBook(b15); c.addBook(b1); c.addBook(b3); c.addBook(b4); c.addBook(b2); 
		c.addBook(b6); c.addBook(b18); c.addBook(b17); c.addBook(b11); c.addBook(b10); c.addBook(b19);
		c.addBook(b12); c.addBook(b13); c.addBook(b14); c.addBook(b5); c.addBook(b16); c.addBook(b7);
		c.addBook(b8); c.addBook(b9); c.addBook(b20);
		
		//System.out.println(c.getNumberOfBooks()); 
		
		String [] nameCollector= new String [21];										//start of task 3
		int j, counter= 0;
		System.out.println("\ntask 3: Filter age");
		
		while(c.hasNext()) {
			
			int flag= 0;
			Book tempBook= c.getNext();
			int tempAge= tempBook.getWriter().getAge();
			String tempName= tempBook.getWriter().getName();
			//c.setNextIndex(c.getNextIndex()-1);
			
			if(tempAge>50 && tempAge<55) {
				
				for(j= 0; j<counter; j++) {
					if(nameCollector[j].compareTo(tempName)==0) {
						flag= 1;
						break;
					}		
				}
				//System.out.println("index: "+c.getNextIndex());
				if(flag==1)
					continue;
				System.out.println(tempName+", "+tempAge);
				
				nameCollector[counter++]= tempName;
			}
		}
		c.resetBooks();//end of task 3
		
																								//start of task 4
		
		Invoice check = new Invoice(1);
		
		check.addBook(c.getNext());
		
		double min= check.getBook().getPrice();
		String minBook= check.getBook().getName();
		
		while(c.hasNext()) {
			check = new Invoice(1);
			check.addBook(c.getNext());
			
			if(min>check.getBook().getPrice()) {
				min= check.getBook().getPrice();
				minBook= check.getBook().getName();
			}
			else
				continue;
		}
		c.resetBooks();
		System.out.println("\n\ntask 4: Find lowest Priced Book\n"+minBook+", "+min);
		System.out.println("\n\n");																	//start of task 5
		
		
		Book maxBook= c.getNext();
		double max= maxBook.getPercentageDiscount();
		
		while(c.hasNext()) {
			Book tempBook= c.getNext();
			double temp= tempBook.getPercentageDiscount();
			if(max<temp) {
				max= temp;
				maxBook= tempBook; 
			}
		}
		c.resetBooks();
		Book [] temp= new Book[21];
		int count= 0;
		
		for(int i= 0; i<20; i++) {
			maxBook= c.getNext();
			if(max==maxBook.getPercentageDiscount()) {
				
				temp[count++]= maxBook;
			}
		}
		
		System.out.println("task 5\n");
		
		for(int i = 0; i<count; i++) {
			System.out.println(" "+temp[i].getName()+", "+temp[i].getPrice()+", "+temp[i].getPercentageDiscount());
		}
		
		
		System.out.println("\n\n");	            c.resetBooks();                                           //start of task 6
		
		
		System.out.println("Task 6: Books published after 2010 and of Crime subgenre");
		while(c.hasNext()) {
			Book tempBook= c.getNext();
			if(tempBook.getYearOfPublish()>2010 && tempBook.getGenre().getSubGenre().equals("crime"))
				System.out.println(tempBook.getName()+", "+tempBook.getWriter().getName());
		}
		System.out.println("\n\nTask 7\n"); c.resetBooks(); 													//start of Task 7
		

		Invoice i = new Invoice(4);
		i.addBook(b1);
		i.addBook(b2);
		i.addBook(b3);
		i.addBook(b8);

		System.out.println(i+"\n\ntask 8\n");
		//System.out.println(i.sum());
		//System.out.println(i.tempName[1]);
		Invoice n= new Invoice(2);
		n.addBook(c.getBook("9123567891201"));
		n.addBook(c.getBook("9123567891208"));
		System.out.println("\n");
		System.out.println(n);
		
		System.out.println("\ntesting sort by price\n\n");    //testing sort by price
		
		c.sortByPrice();
		
		
		}
		
	}


*/
		
		