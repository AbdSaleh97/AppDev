package practice;
/*
 * @author Abdsaleh
 */
public class Person1
{
	private String name;
	private int age;
	private Dob date;
	
	public Person1()
	{
		
	}
	
	public Person1(String name,int age,Dob date)
	{
		this.age = age;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person1{" + "name=" + name + ", age=" + age + ", date=" + date + '}';
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Dob getdate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setdate(Dob date) {
		this.date = date;
	}
	
	
	
}
