package practice;
/*
 * @author Abdsaleh
 */
public class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public Duck()
	{
		
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public void swim()
	{
		System.out.println("swimming");
	}
	
	public void display()
	{
		
	}
	
	public void performQuack()
	{
		quackBehaviour.quack();
	}
	
	public void performFly()
	{
		flyBehaviour.fly();
	}
	
	
}
