import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class Test
{	
	public static void main(String[] args)
	{
		ArrayList<String> authors = new ArrayList<>();
		authors.add("The Chronicles of Narnia");
		Book b1 = new Book("The Great Gatsby",authors,"9780743273565",true);
		
		authors = new ArrayList<>();
		authors.add("Harper Lee");
		Book b2 = new Book("To kill a Mockingbird",authors,"9780061120084",true);
		
		authors = new ArrayList<>();
		authors.add("Harper Lee");
		Book b3 = new Book("Harry potter and the philosophe's stone",authors,"97814988556552",true);
		
		authors = new ArrayList<>();
		authors.add("J.R.R");
		Book b4 = new Book("The Lord of the rings",authors,"9780618640157",true);
		
		Admin admin = new Admin(750,9,5,"Ahmed",new Contact("@yahoo.com","0777777777"));
		
		System.out.println(admin);
		
		admin.setEndTime(4);
		
		System.out.println(admin.getEndTime());
		
		admin.setWorkingHours(10,3);
		
		System.out.println(admin);
		
		admin.setSalary(1000);
		
		System.out.println(admin.getSalary());
		
		Borrower a =  new Borrower("action","Abdelrahamn",new Contact("@gmail.com","0788888888"));
		
		//intialize the array list in the Borrowed class so we dont get a null pointer exception
		a.setBorrowedBooks(new ArrayList<>());
		a.addToBookCollection(b3);
		
		System.out.println(b3.getBookAvailability());
		
		a.removeFromBookCollection(b3);
		
		System.out.println(b3.getBookAvailability());
		
		System.out.println(a.findBook(b4));

		a.addToBookCollection(b2);
		a.addToBookCollection(b1);

		System.out.println(a.getBorrowedBooks());
		
		a.removeFromBookCollection(b1);
		a.removeFromBookCollection(b2);
		
		CheckOut c = new CheckOut();
		
		c.check(b1,a);
		
		LibrarySystem l1 = new LibrarySystem(new ArrayList<>(),admin,a);
		
		l1.addToAllBooks(b1);
		l1.addToAllBooks(b2);
		l1.addToAllBooks(b3);
		l1.addToAllBooks(b4);
		
		System.out.println(l1.getAdmin());
		
		System.out.println(l1.getBorrower());
		
		System.out.println(l1.getAllBooks());

		System.out.println(b1.getBookAvailability());
		
		System.out.println(a.getBorrowedBooks());
		
		System.out.println(l1.getAllBooks().get(l1.getAllBooks().indexOf(b1)).getBookAvailability());
		
		System.out.println(c.check(b1, a));
		
		l1.removeFromAllBooks(b4);
		
		System.out.println(l1.getAllBooks());
		
		
		
		a.addToBookCollection(b4);
		
		System.out.println(a.getBorrowedBooks());
		
		a.addToBookCollection(b4);
		
		System.out.println(b4.getBookAvailability());
		
		a.removeFromBookCollection(b4);
		
		System.out.println(b4.getBookAvailability());
		
		l1.addToAllBooks(b4);
				
		System.out.println(l1.getAllBooks());
		System.out.println(l1.getAllBooks().get(l1.getAllBooks().indexOf(b4)).getBookAvailability());
		a.addToBookCollection(b4);
		System.out.println(l1.getAllBooks().get(l1.getAllBooks().indexOf(b4)).getBookAvailability());
		
		System.out.println(l1.removeFromAllBooks(b4));
		System.out.println(l1.removeFromAllBooks(b4));
		
		l1.addToAllBooks(b4);
	}	
}

	
