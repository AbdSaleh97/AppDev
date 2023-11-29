package practice;

/*
 * @author Abdsaleh
 */
public class Animal 
{
	private String name;
	private String type;
	private int age;

	public void makeNoise()
	{
		System.out.println("noise");
	}
	
	
	Animal()
	{
		
	}
	
	Animal(String name,String type,int age)
	{
		this.age = age;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal{" + "name=" + name + ", type=" + type + ", age=" + age + '}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}
	
	
	

}
