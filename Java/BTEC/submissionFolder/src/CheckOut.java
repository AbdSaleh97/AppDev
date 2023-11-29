/*
 * @author Abdsaleh
 */
public class CheckOut 
{
	CheckOut()
	{
		
	}
	
	public boolean check(Book book, Borrower borrower)
	{
		if (book.getBookAvailability())
		{
			borrower.getBorrowedBooks().add(book);
			book.setBookAvailability(false);
			return true;
		}
		else
			return false;
	}
}
