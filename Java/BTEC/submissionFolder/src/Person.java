/*
 * @author Abdsaleh
 */
public abstract class Person
{
	private String name;
	private Contact contacInfo;
	
	Person()
	{
		
	}
	
	Person(String name , Contact contactInfo)
	{
		this.name = name;
		this.contacInfo = contactInfo;
	}

	public String getName() {
		return name;
	}

	public Contact getContacInfo() {
		return contacInfo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContacInfo(Contact contacInfo) {
		this.contacInfo = contacInfo;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", contacInfo=" + contacInfo + '}';
	}
	
}
