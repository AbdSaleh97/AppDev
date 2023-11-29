package practice;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class Zoo 
{
	private String name;
	private int id;
	private ArrayList<Animal> animalList = new ArrayList<>();

	
	@Override
	public String toString() {
		return "Zoo{" + "name=" + name + ", id=" + id + ", animalList=" + animalList + '}';
	}

	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}
	
	
	public Zoo()
	{
		
	}
	
	public Zoo(String name, int id, ArrayList<Animal> animalList)
	{
		this.animalList = animalList;
		this.id = id;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}
	
	public Animal age()
	{
		int index = 0;
		int bigger = animalList.get(0).getAge();
		for (int i = 1; i < animalList.size(); i++)
		{
			if (animalList.get(i).getAge() > bigger)
			{
				bigger = animalList.get(i).getAge();
				index = i;
			}
		}
		return animalList.get(index);
	}
	
}
