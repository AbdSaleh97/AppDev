package DecoratorPattern;

/*
 * @author Abdsaleh
 */
public class DarkRoast extends Beverage{
	
	@Override
	public double getCost()
	{
		return 1.2;
	}
	
	@Override
	public String getDescription()
	{
		return "Drak Roast";
	}
}
