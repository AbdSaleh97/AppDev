package ObserverPattern;

import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class WeatherData implements Subject{
	
	private ArrayList<Observer> observer = new ArrayList<>();
	
	private float temp;
	private float pressure;
	private float humid;
	
	@Override
	public void registerObserver(Observer obs)
	{
		observer.add(obs);
	}
	
	@Override
	public void removeObserver(Observer obs)
	{
		if (observer.contains(obs)) 
		{	
			observer.remove(obs);
		}
		else
			System.out.println("Observer is not subscribed.");
	}
	
	@Override
	public void notifiyObserver()
	{
		for (int i = 0; i < observer.size(); i++)
		{
			observer.get(i).update(temp,humid,pressure);
		}
	}
	
	public void setMeasurment(float temp, float humid, float pressure)
	{
		this.temp = temp;
		this.humid = humid;
		this.pressure = pressure;
		
		notifiyObserver();
	}
	
	public float getTemp() {
		return temp;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumid() {
		return humid;
	}	
}
