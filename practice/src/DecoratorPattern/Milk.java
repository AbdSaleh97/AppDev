package DecoratorPattern;
/*
 * @author Abdsaleh
 */
public class Milk extends Decorator{	
	public Milk(Beverage beverage)
	{
		super(beverage);
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " and milk";
	}
	
	@Override
	public double getCost()
	{
		return super.getCost() + .5;
	}
	
}
