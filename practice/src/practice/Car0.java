package practice;
/*
 * @author Abdsaleh
 */
public class Car0
{
	private String type;
	private int year;
	private String color;
	
	public Car0()
	{
		
	}
	
	public Car0(String type,int year,String color)
	{
		this.type = type;
		this.year = year;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car0{" + "type=" + type + ", year=" + year + ", color=" + color + '}';
	}

	public String getType() {
		return type;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void park()
	{
		System.out.println(type + " is parking");
	}


	public final void drive()
	{
		System.out.println(type + " is driving");
	}
	
}
