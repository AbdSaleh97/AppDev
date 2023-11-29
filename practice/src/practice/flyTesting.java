package practice;
/*
 * @author Abdsaleh
 */
public class flyTesting {
	public static void main(String []args)
	{
		Duck d = new DecoyDuck();
		d.display();
		
		d.performFly();
		d.performQuack();
		
		d.setFlyBehaviour(new FlyNoWay());
		d.performFly();
		d.setQuackBehaviour(new Quack());	
		d.performQuack();
		d.swim();
		
		System.out.println("---------------------------");
		
		Duck d1 = new RubberDuck();
		d1.display();
		
		d1.performFly();
		d1.performQuack();
		
		d1.setFlyBehaviour(new FlyNoWay());
		d1.performFly();
		d1.setQuackBehaviour(new Quack());
		d1.performQuack();
	}
}
