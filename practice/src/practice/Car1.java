package practice;
/*
 * @author Abdsaleh
 */
public class Car1 
{
	private String carType;
	private int year;
	private Engine carEngine;
	
	public Car1()
	{
		
	}
	
	public Car1(String carType, int year, Engine carEngine)
	{
		this.carEngine = carEngine;
		this.year = year;
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	public int getYear() {
		return year;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car1{" + "carType=" + carType + ", year=" + year + ", carEngine=" + carEngine + '}';
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	
}
