package practice;
/*
 * @author Abdsaleh
 */
public class Student 
{
	private String name;
	private int age;
	private String major;
	
	public Student()
	{
		
	}
	
	public Student(String name, int age, String major)
	{
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void steName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\nAge: " + age + "\nMajor: " + major;
	}
	
	
	public void prntStdInfo()
	{
		System.out.println(name + " is a " + age + "-yers-old " + major + " major.");
	}
	
	
}
