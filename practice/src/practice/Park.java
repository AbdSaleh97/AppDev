package practice;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class Park 
{
	private String city;
	private int id;
	private double area;
	
	private ArrayList<Tree> plant = new ArrayList<>();
	
	public Park()
	{
		
	}

	public Park(String city,int id, double area,ArrayList<Tree> plant )
	{
		this.area = area;
		this.city = city;
		this.id = id;
		this.plant = plant;
	}

	@Override
	public String toString() {
		return "Park{" + "city=" + city + ", id=" + id + ", area=" + area + ", plant=" + plant + '}';
	}

	public void setPlant(ArrayList<Tree> plant) {
		this.plant = plant;
	}

	public ArrayList<Tree> getPlant() {
		return plant;
	}

	public String getCity() {
		return city;
	}

	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}
