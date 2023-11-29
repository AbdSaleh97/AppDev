package practice;

/*
 * @author Abdsaleh
 */
public class Car
{
	private String make;
	private String model;
	private int year;
	private String color;
	
	public Car()
	{
		
	}
	
	public Car(String make,String model,int year,String color)
	{
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void steYear(int year)
	{
		this.year = year;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "Make: " + make + "\nModel: " + "\nYear: " + year + "\nColor: " + color;
	}
	
	public void prnt()
	{
		System.out.println("The car is a " + color + " " + year + " " + make + " " + model);
	}
}
