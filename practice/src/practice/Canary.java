package practice;
/*
 * @author Abdsaleh
 */
public class Canary extends Bird
{
	private String color;
	
	public Canary()
	{
		
	}
	
	public Canary(String name, int age,String color)
	{
		super(name,age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + " Canary{" + "color=" + color + '}';
	}
	
	
}
