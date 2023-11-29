import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class LibrarySystem implements Search
{
	private ArrayList<Book> allBooks;
	private Admin admin;
	private Borrower borrower;
	
	LibrarySystem()
	{
		
	}
	
	LibrarySystem(ArrayList<Book> allBooks,Admin admin,Borrower borrower)
	{
		this.admin = admin;
		this.allBooks = allBooks;
		this.borrower = borrower;
	}

	@Override
	public String toString() {
		return "LibrarySystem{" + "allBooks=" + allBooks +  ", admin=" + admin + ", borrower=" + borrower + '}';
	}

	public ArrayList<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(ArrayList<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	@Override
	public String findBook(Book book)
	{
		if (allBooks.contains(book))
		{
			return "The book is at index " + allBooks.indexOf(book);
		}
		else
			return "The book is not present in the collection";
	}
	
	// A method to add a book to the library's collection
	public void addToAllBooks(Book book)
	{
			allBooks.add(book);
	}
	
	/*A method to remove a book from the list of books in the system*/
	public String removeFromAllBooks(Book book)
	{
		if (allBooks.contains(book)) 
		{
			allBooks.remove(book);
			return "Book Removed.";
		}
		else
			return "The Book is not within this collection right now.";
	}
}
