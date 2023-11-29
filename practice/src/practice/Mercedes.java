package practice;
/*
 * @author Abdsaleh
 */
public class Mercedes extends Car0
{	
	private boolean durability;
	
	public Mercedes()
	{
		
	}
	
	public Mercedes(String type,int year,String color,boolean durability)
	{
		super(type,year,color);
		this.durability = durability;
	}

	public boolean isDurability() {
		return durability;
	}

	public void setDurability(boolean durability) {
		this.durability = durability;
	}

	@Override
	public String toString() {
		return super.toString() + "Mercedes{" + "durability=" + durability + '}';
	}
	
	public void park()
	{
		System.out.println(super.getType() + " is parking");
	}
	
	
}
