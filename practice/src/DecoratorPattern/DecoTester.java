package DecoratorPattern;

/**
 *
 * @author Abdsaleh
 */
public class DecoTester {
	
	public static void main(String []args)
	{
		Beverage b1 = new Milk(new Espresso());
		System.out.println(b1.getCost());
		System.out.println(b1.getDescription());
		
		
		Beverage b2 = new Whip(new Mocha(new Milk(new Espresso())));
		System.out.println(b2.getCost());
		System.out.println(b2.getDescription());
		
		
		
		Beverage b3 = new Whip(new Nuts(new Mocha(new Milk(new Decaf()))));
		System.out.println(b3.getDescription());
		System.out.println(b3.getCost());

	}
	
	
	
}
