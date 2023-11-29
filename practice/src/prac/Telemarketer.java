package prac;
/*
 * @author Abdsaleh
 */
public class Telemarketer extends Person implements Nuisance{
	
	public Telemarketer(String name, int age)
	{
		super(name,age);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public String giveSalesPitch()
	{
		return super.getName() + " pressuers others to buy stuff";
	}
	
	@Override
	public String annoy()
	{
		return super.getName() + " annoys by giving a sales pitch";
	}
	
}
