package practice;
/*
 * @author Abdsaleh
 */
public class Rectangle 
{
	private double width;
	private double height;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double width, double height)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	@Override
	public String toString()
	{
		return "width: " + width + "\nheigth: " + height; 
	}
	
	public double area()
	{
		double area = getWidth() * getHeight();
		return area;
	}
	
	
}
