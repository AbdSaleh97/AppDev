package practice;
/*
* @author Abdsaleh
 */
public abstract class  Bird extends Animal
{
	private String name;
	private int age;
	
	Bird()
	{
		
	}
	
	Bird(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	

	public String getName()
	{
		return name;
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

	@Override
	public String toString() {
		return "Bird{" + "name=" + name + ", age=" + age + '}';
	}
	
	public void birdEats()
	{
		System.out.println(name + " is eating");
	}
	
	public void birdSings()
	{
		System.out.println(name + " is singing");
	}
	
//	@Override
	public void canTalk(){
		
	}
}

