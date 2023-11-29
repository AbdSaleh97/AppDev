package DecoratorPattern;
/*
 * @author Abdsaleh
 */
public class Mocha extends Decorator{
	
	public Mocha(Beverage beverage)
	{
		super(beverage);
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " and mocha";
	}
	
	@Override
	public double getCost()
	{
		return super.getCost() + 1.2;
	}
	
}
