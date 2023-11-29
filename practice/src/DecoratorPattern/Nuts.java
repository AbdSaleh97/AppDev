package DecoratorPattern;
/*
 * @author Abdsaleh
 */
public class Nuts extends Decorator {
	
	public Nuts(Beverage beverage)
	{
		super(beverage);
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " and Nuts";
	}
	
	@Override
	public double getCost()
	{
		return super.getCost() + 1.9;
	}
}
