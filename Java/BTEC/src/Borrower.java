import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class Borrower extends Person implements Search
{
	private String interestTopics;
	private ArrayList<Book> borrowedBooks;
	
	public Borrower()
	{
		
	}
	
	public Borrower(String intersteTopics,String name , Contact contactInfo)
	{
		super(name,contactInfo);
		this.interestTopics = intersteTopics;
	}

	public String getInterestTopics() 
	{
		return interestTopics;
	}

	public void setInterestTopics(String interestTopics) 
	{
		this.interestTopics = interestTopics;
	}

	public ArrayList<Book> getBorrowedBooks() 
	{
		return borrowedBooks;
	}

	public void setBorrowedBooks(ArrayList<Book> borrowedBooks) 
	{
		this.borrowedBooks = borrowedBooks;
	}
	
	// A method to add into the collection of the user that he had borrowed
	public void addToBookCollection(Book book )
	{
		if ((!borrowedBooks.contains(book))&&book.getBookAvailability()) 
		{
			borrowedBooks.add(book);
			book.setBookAvailability(false);	
		}
		
	}

	public void removeFromBookCollection(Book book)
	{
		if (borrowedBooks.contains(book)&&(!book.getBookAvailability())) 
		{
			borrowedBooks.remove(book);
			book.setBookAvailability(true);
		}
		
	}
	
	@Override
	public String findBook(Book book)
	{
		if (borrowedBooks.contains(book))
		{
			int i = borrowedBooks.indexOf(book);
		return "The " + borrowedBooks.get(i).getTitle() + " Book is at index " + i + " in the Borrowed collection";
		}
		else
			return "Book is not in this collection.";
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "Borrower{" + "intersteTotpics=" + interestTopics + ", borrowedBooks=" + borrowedBooks + '}';
	}
	
}
