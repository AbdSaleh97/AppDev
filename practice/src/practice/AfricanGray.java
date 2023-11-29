package practice;

/*
 * @author Abdsaleh
 */
public class AfricanGray extends Bird implements Talkable
{
	private boolean canFly;
	
	public AfricanGray()
	{
		
	}
	
	public AfricanGray(String name, int age,boolean canFly)
	{
		super(name,age);
		this.canFly = canFly;
	}

	@Override
	public String toString() {
		return super.toString() + " AfricanGray{" + "canFly=" + canFly + '}';
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public void canTalk()
	{
		System.out.println(super.getName() + " is talkable");
	}
	
	
}
