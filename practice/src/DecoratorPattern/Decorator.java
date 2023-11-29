package DecoratorPattern;
/*
 * @author Abdsaleh
 */
public abstract class Decorator extends Beverage{
	Beverage beverage;
	
	Decorator(Beverage beverage)
	{
		this.beverage = beverage;
	}
	@Override
	public String getDescription()
	{
		return beverage.getDescription();
	}
	
	@Override
	public double getCost()
	{
		return beverage.getCost();
	}
	
}
