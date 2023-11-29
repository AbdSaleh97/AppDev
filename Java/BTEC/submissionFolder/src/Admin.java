/*
 * @author Abdsaleh
 */
public class Admin extends Person
{
	private int salary;
	//the starting time of the working hours
	private int startTime;
	//the end time of the working hours
	private int endTime;
	
	//default constructor 
	public Admin()
	{
		
	}
	//parametrized constructor
	public Admin(int salary, int startTime, int endTime ,String name , Contact contactInfo)
	{
		super(name ,contactInfo);
		this.salary = salary;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public int getStartTime()
	{
		return startTime;
	}
	
	public void setStartTime(int startTime)
	{
		this.startTime = startTime;
	}
	
	public int getEndTime()
	{
		return endTime;
	}
	
	public void setEndTime(int endTime)
	{
		this.endTime = endTime;
	}
	
	public String getWorkingHours()
	{
		return startTime + "-" + endTime;
	}
	
	public void setWorkingHours(int startTime, int endTime)
	{
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "Admin{" + "salary=" + salary + ", startTime=" + startTime + ", endTime=" + endTime + '}';
	}	
}
