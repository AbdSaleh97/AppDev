package practice;
/*
 * @author Abdsaleh
 */
public class Bmw extends Car0
{
	private boolean fast;
	
	public Bmw()
	{
		
	}
	
	public Bmw(String type,int year,String color,boolean fast)
	{
		super(type,year,color);
		this.fast = fast;
	}

	public boolean isFast() {
		return fast;
	}

	public void setFast(boolean fast) {
		this.fast = fast;
	}

	@Override
	public String toString() {
		return  super.toString() + "Bmw{" + "fast=" + fast + '}';
	}
	@Override
	public void park()
	{
		System.out.println(super.getType() + " is parking");
	}
	
	
}
