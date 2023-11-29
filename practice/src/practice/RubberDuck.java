package practice;

/**
 *
 * @author Abdsaleh
 */
public class RubberDuck extends Duck{
	
	public RubberDuck()
	{
		super.setFlyBehaviour(new FlyNoWay());
		super.setQuackBehaviour(new Quack());


	}
	@Override
	public void display()
	{
		System.out.println("looks like a rubber duck");
	}
	
}
