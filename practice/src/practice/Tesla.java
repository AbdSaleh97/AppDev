package practice;
/*
 * @author Abdsaleh
 */
public class Tesla extends Car0
{

	@Override
	public String toString() {
		return super.toString() + "Tesla{" + "autoDrive=" + autoDrive + '}';
	}

	public boolean isAutoDrive() {
		return autoDrive;
	}

	public void setAutoDrive(boolean autoDrive) {
		this.autoDrive = autoDrive;
	}
	private boolean autoDrive;
	
	public Tesla()
	{
		
	}

	public Tesla(String type,int year,String color,boolean autoDrive)
	{
		super(type,year,color);
		this.autoDrive = autoDrive;
	}
	
	public void park()
	{
		System.out.println(super.getType() + " is parking");
	}
	
	
	
}
