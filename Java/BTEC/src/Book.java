import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class Book
{
	private String title;
	private ArrayList<String> listOfAuthors;
	private String ISBN ;
	private boolean bookAvailability;
	
	Book()
	{
		
	}
	
	Book(String title , ArrayList<String> listOfAuthors, String ISBN , boolean bookAvailability)
	{
		this.title = title;
		this.listOfAuthors = listOfAuthors;
		this.ISBN = ISBN;
		this.bookAvailability = bookAvailability;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getListOfAuthors() {
		return listOfAuthors;
	}

	public void setListOfAuthors(ArrayList<String> listOfAuthors) {
		this.listOfAuthors = listOfAuthors;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public boolean getBookAvailability() {
		return bookAvailability;
	}

	public void setBookAvailability(boolean bookAvailability) {
		this.bookAvailability = bookAvailability;
	}
	
	// a method to add the author name to the authors list.
	public void addAuthor(String name)
	{
		listOfAuthors.add(name);
	}

	@Override
	public String toString() {
		return "Book{" + "title=" + title + ", listOfAuthors=" + listOfAuthors + ", ISBN=" + ISBN + ", bookAvailability=" + bookAvailability + '}';
	}
}
