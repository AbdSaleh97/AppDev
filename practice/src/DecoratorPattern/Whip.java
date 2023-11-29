package DecoratorPattern;
/*
 * @author Abdsaleh
 */
public class Whip extends Decorator{
	
	public Whip(Beverage beverage)
	{
		super(beverage);
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " and Whip";
	}
	
	@Override
	public double getCost()
	{
		return super.getCost() + .7;
	}
	
}
