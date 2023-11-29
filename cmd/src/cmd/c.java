package cmd;

/*
 * @author Abdsaleh
 */
public class c
{  
	private int hours;
	private int minutes;
	private int seconds;
	
	c(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;	
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds)
	{
		this.seconds = seconds;
	}

	public int getHours()
	{
		return this.hours;
	}

	public int getMinutes()
	{
		return this.minutes;
	}
	
	public int getSeconds()
	{
		return this.seconds;
	}
	
	public void print()
	{
		System.out.println(hours +":"+minutes+":"+seconds);
	}
	
	
	
}
