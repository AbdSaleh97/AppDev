package practice;
/*
 * @author Abdsaleh
 */
public class Dob 
{
	private int day;
	private int month;
	private int year;
	
	public Dob()
	{
		
	}

	@Override
	public String toString() {
		return "Dob{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Dob(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	
}
