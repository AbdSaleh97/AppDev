package practice;

/*
 * @author Abdsaleh
 */
public class Person 
{
	private String name;
	private int age;
	private char gender;
	
	
	public Person()
	{
		
	}
	
	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName()
	{
		return  name;
	}
	
	public void setName(String name)
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
	
	public char getGender()
	{
		return gender;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	@Override
	public String toString()
	{
		return "age :" + age  + "\nname :" + name + "\ngender :" + gender; 
	}
	
//	public void prnt()
//	{
//		System.out.println();
//	}
}
