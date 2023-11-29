package practice;
/*
 * @author Abdsaleh
 */
public class Human implements Talkable
{
	private String name;
	private int id;
	
	public Human()
	{
		
	}
	
	public Human(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human{" + "name=" + name + ", id=" + id + '}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void canTalk()
	{
		System.out.println(name + " is talking");
	}
}
